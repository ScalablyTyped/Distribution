package typings.blockingProxy

import typings.blockingProxy.builtLibSimpleWebdriverClientMod.SimpleWebDriverClient
import typings.blockingProxy.builtLibWebdriverCommandsMod.WebDriverCommand
import typings.blockingProxy.builtLibWebdriverLoggerMod.WebDriverLogger
import typings.blockingProxy.builtLibWebdriverProxyMod.WebDriverBarrier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtLibAngularWaitBarrierMod {
  
  @JSImport("blocking-proxy/built/lib/angular_wait_barrier", "AngularWaitBarrier")
  @js.native
  open class AngularWaitBarrier protected ()
    extends StObject
       with WebDriverBarrier {
    def this(client: SimpleWebDriverClient) = this()
    
    /* private */ var client: Any = js.native
    
    /**
      * Turn on WebDriver logging.
      *
      * @param logDir The directory to create logs in.
      */
    def enableLogging(logDir: String): Unit = js.native
    
    var enabled: Boolean = js.native
    
    var logger: WebDriverLogger = js.native
    
    /* CompleteClass */
    override def onCommand(command: WebDriverCommand): js.Promise[Unit] = js.native
    
    var rootSelector: String = js.native
    
    /* private */ def sendRequestToStabilize(command: Any): Any = js.native
    
    /**
      * Override the logger instance. Only used for testing.
      */
    def setLogger(logger: WebDriverLogger): Unit = js.native
    
    /**
      * A CSS Selector for a DOM element within your Angular application.
      * BlockingProxy will attempt to automatically find your application, but it is
      * necessary to set rootElement in certain cases.
      *
      * In Angular 1, BlockingProxy will use the element your app bootstrapped to by
      * default.  If that doesn't work, it will then search for hooks in `body` or
      * `ng-app` elements (details here: https://git.io/v1b2r).
      *
      * In later versions of Angular, BlockingProxy will try to hook into all angular
      * apps on the page. Use rootElement to limit the scope of which apps
      * BlockingProxy waits for and searches within.
      *
      * @param rootSelector A selector for the root element of the Angular app.
      */
    def setRootSelector(selector: String): Unit = js.native
    
    /* private */ def shouldStabilize(command: Any): Any = js.native
    
    /* private */ def waitForAngularData(): Any = js.native
  }
}
