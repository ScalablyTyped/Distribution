package typings.blockingProxy

import org.scalablytyped.runtime.Instantiable1
import typings.blockingProxy.builtLibAngularWaitBarrierMod.AngularWaitBarrier
import typings.blockingProxy.builtLibHighlightDelayBarrierMod.HighlightDelayBarrier
import typings.blockingProxy.builtLibWebdriverLoggerMod.WebDriverLogger
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtLibBlockingproxyMod {
  
  @JSImport("blocking-proxy/built/lib/blockingproxy", "BP_PREFIX")
  @js.native
  val BP_PREFIX: /* "bpproxy" */ String = js.native
  
  @JSImport("blocking-proxy/built/lib/blockingproxy", "BlockingProxy")
  @js.native
  open class BlockingProxy protected () extends StObject {
    def this(seleniumAddress: String) = this()
    def this(seleniumAddress: String, highlightDelay: Double) = this()
    
    /**
      * Turn on WebDriver logging.
      *
      * @param logDir The directory to create logs in.
      */
    def enableLogging(logDir: String): Unit = js.native
    
    def handleProxyCommand(message: Any, data: Any, response: Any): Unit = js.native
    
    var highlightBarrier: HighlightDelayBarrier = js.native
    
    def listen(port: Double): Double = js.native
    
    var logger: WebDriverLogger = js.native
    
    /* private */ var proxy: Any = js.native
    
    def quit(): js.Promise[js.Object] = js.native
    
    def requestListener(originalRequest: IncomingMessage, response: ServerResponse[IncomingMessage]): Unit = js.native
    
    var server: Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ] = js.native
    
    /**
      * Override the logger instance. Only used for testing.
      */
    def setLogger(logger: WebDriverLogger): Unit = js.native
    
    /**
      * Change the parameters used by the wait function.
      */
    def setWaitParams(rootEl: Any): Unit = js.native
    
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
    inline def isProxyCommand(commandPath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProxyCommand")(commandPath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
