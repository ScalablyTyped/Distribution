package typings
package blockingDashProxyLib.builtLibWebdriverUnderscoreProxyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blocking-proxy/built/lib/webdriver_proxy", "WebDriverProxy")
@js.native
class WebDriverProxy protected () extends js.Object {
  def this(seleniumAddress: java.lang.String) = this()
  var barriers: js.Array[WebDriverBarrier] = js.native
  var seleniumAddress: java.lang.String = js.native
  def addBarrier(barrier: WebDriverBarrier): scala.Unit = js.native
  def handleRequest(originalRequest: nodeLib.httpMod.IncomingMessage, response: nodeLib.httpMod.ServerResponse): stdLib.Promise[scala.Unit] = js.native
}

