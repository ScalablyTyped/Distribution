package typings.blockingProxy

import typings.blockingProxy.angularWaitBarrierMod.AngularWaitBarrier
import typings.blockingProxy.highlightDelayBarrierMod.HighlightDelayBarrier
import typings.blockingProxy.webdriverLoggerMod.WebDriverLogger
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockingproxyMod {
  
  @JSImport("blocking-proxy/built/lib/blockingproxy", "BP_PREFIX")
  @js.native
  val BP_PREFIX: /* "bpproxy" */ String = js.native
  
  @JSImport("blocking-proxy/built/lib/blockingproxy", "BlockingProxy")
  @js.native
  class BlockingProxy protected () extends StObject {
    def this(seleniumAddress: String) = this()
    def this(seleniumAddress: String, highlightDelay: Double) = this()
    
    /**
      * Turn on WebDriver logging.
      *
      * @param logDir The directory to create logs in.
      */
    def enableLogging(logDir: String): Unit = js.native
    
    def handleProxyCommand(message: js.Any, data: js.Any, response: js.Any): Unit = js.native
    
    var highlightBarrier: HighlightDelayBarrier = js.native
    
    def listen(port: Double): Double = js.native
    
    var logger: WebDriverLogger = js.native
    
    var proxy: js.Any = js.native
    
    def quit(): js.Promise[js.Object] = js.native
    
    def requestListener(originalRequest: IncomingMessage, response: ServerResponse): Unit = js.native
    
    var server: Server = js.native
    
    /**
      * Override the logger instance. Only used for testing.
      */
    def setLogger(logger: WebDriverLogger): Unit = js.native
    
    /**
      * Change the parameters used by the wait function.
      */
    def setWaitParams(rootEl: js.Any): Unit = js.native
    
    var waitBarrier: AngularWaitBarrier = js.native
  }
  /* static members */
  object BlockingProxy {
    
    @JSImport("blocking-proxy/built/lib/blockingproxy", "BlockingProxy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This command is for the proxy server, not to be forwarded to Selenium.
      */
    @scala.inline
    def isProxyCommand(commandPath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProxyCommand")(commandPath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
