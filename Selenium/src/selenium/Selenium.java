
package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {

    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver chrome = new ChromeDriver();      
        chrome.get("http://localhost:4200/etud");
        WebDriverWait wait = new WebDriverWait(chrome, 20);
        List<WebElement> elts =wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("test")));
        if (elts.isEmpty()) System.out.println("ECHEC");
        else {
            elts.forEach((e) -> {
                System.out.println(e.getText());
            });
            System.out.println("SUCCES");
        }
        chrome.quit();
        
        /*System.setProperty("webdriver.firefox.driver","geckodriver.exe");
        WebDriver firefox = new FirefoxDriver();
        firefox.get("http://localhost:4200/etud");
        WebDriverWait wait = new WebDriverWait(firefox, 20);
        List<WebElement> elts =wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("test")));
        if (elts.isEmpty()) System.out.println("ECHEC");
        else {
            elts.forEach((e) -> {
                System.out.println(e.getText());
            });
            System.out.println("SUCCES");
        }
        firefox.quit();*/
        
        /*System.setProperty("webdriver.internetexplorer.driver","IEDriverServer.exe");
        WebDriver ie = new InternetExplorerDriver();
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
        ie.get("http://localhost:4200/etud");
        WebDriverWait wait = new WebDriverWait(ie, 20);
        List<WebElement> elts =wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("test")));
        if (elts.isEmpty()) System.out.println("ECHEC");
        else {
            elts.forEach((e) -> {
                System.out.println(e.getText());
            });
            System.out.println("SUCCES");
        }
        ie.quit();*/
    }
    
}
