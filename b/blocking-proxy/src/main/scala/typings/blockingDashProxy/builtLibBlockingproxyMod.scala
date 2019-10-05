package typings.blockingDashProxy

import typings.blockingDashProxy.blockingDashProxyStrings.bpproxy
import typings.blockingDashProxy.builtLibAngularUnderscoreWaitUnderscoreBarrierMod.AngularWaitBarrier
import typings.blockingDashProxy.builtLibHighlightUnderscoreDelayUnderscoreBarrierMod.HighlightDelayBarrier
import typings.blockingDashProxy.builtLibWebdriverUnderscoreLoggerMod.WebDriverLogger
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blocking-proxy/built/lib/blockingproxy", JSImport.Namespace)
@js.native
object builtLibBlockingproxyMod extends js.Object {
  @js.native
  class BlockingProxy protected () extends js.Object {
    def this(seleniumAddress: String) = this()
    def this(seleniumAddress: String, highlightDelay: Double) = this()
    var highlightBarrier: HighlightDelayBarrier = js.native
    var logger: WebDriverLogger = js.native
    var proxy: js.Any = js.native
    var server: Server = js.native
    var waitBarrier: AngularWaitBarrier = js.native
    /**
      * Turn on WebDriver logging.
      *
      * @param logDir The directory to create logs in.
      */
    def enableLogging(logDir: String): Unit = js.native
    def handleProxyCommand(message: js.Any, data: js.Any, response: js.Any): Unit = js.native
    def listen(port: Double): Double = js.native
    def quit(): js.Promise[js.Object] = js.native
    def requestListener(originalRequest: IncomingMessage, response: ServerResponse): Unit = js.native
    /**
      * Override the logger instance. Only used for testing.
      */
    def setLogger(logger: WebDriverLogger): Unit = js.native
    /**
      * Change the parameters used by the wait function.
      */
    def setWaitParams(rootEl: js.Any): Unit = js.native
  }
  
  val BP_PREFIX: bpproxy = js.native
  /* static members */
  @js.native
  object BlockingProxy extends js.Object {
    /**
      * This command is for the proxy server, not to be forwarded to Selenium.
      */
    def isProxyCommand(commandPath: String): Boolean = js.native
  }
  
}

