package typings
package blockingDashProxyLib.builtLibBlockingproxyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blocking-proxy/built/lib/blockingproxy", "BlockingProxy")
@js.native
class BlockingProxy protected () extends js.Object {
  def this(seleniumAddress: java.lang.String) = this()
  def this(seleniumAddress: java.lang.String, highlightDelay: scala.Double) = this()
  var highlightBarrier: blockingDashProxyLib.builtLibHighlightUnderscoreDelayUnderscoreBarrierMod.HighlightDelayBarrier = js.native
  var logger: blockingDashProxyLib.builtLibWebdriverUnderscoreLoggerMod.WebDriverLogger = js.native
  var proxy: js.Any = js.native
  var server: nodeLib.httpMod.Server = js.native
  var waitBarrier: blockingDashProxyLib.builtLibAngularUnderscoreWaitUnderscoreBarrierMod.AngularWaitBarrier = js.native
  /**
    * Turn on WebDriver logging.
    *
    * @param logDir The directory to create logs in.
    */
  def enableLogging(logDir: java.lang.String): scala.Unit = js.native
  def handleProxyCommand(message: js.Any, data: js.Any, response: js.Any): scala.Unit = js.native
  def listen(port: scala.Double): scala.Double = js.native
  def quit(): js.Promise[js.Object] = js.native
  def requestListener(originalRequest: nodeLib.httpMod.IncomingMessage, response: nodeLib.httpMod.ServerResponse): scala.Unit = js.native
  /**
    * Override the logger instance. Only used for testing.
    */
  def setLogger(logger: blockingDashProxyLib.builtLibWebdriverUnderscoreLoggerMod.WebDriverLogger): scala.Unit = js.native
  /**
    * Change the parameters used by the wait function.
    */
  def setWaitParams(rootEl: js.Any): scala.Unit = js.native
}

/* static members */
@JSImport("blocking-proxy/built/lib/blockingproxy", "BlockingProxy")
@js.native
object BlockingProxy extends js.Object {
  /**
    * This command is for the proxy server, not to be forwarded to Selenium.
    */
  def isProxyCommand(commandPath: java.lang.String): scala.Boolean = js.native
}

