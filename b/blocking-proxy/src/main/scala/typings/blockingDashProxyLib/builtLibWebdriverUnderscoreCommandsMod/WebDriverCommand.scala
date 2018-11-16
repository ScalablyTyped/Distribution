package typings
package blockingDashProxyLib.builtLibWebdriverUnderscoreCommandsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blocking-proxy/built/lib/webdriver_commands", "WebDriverCommand")
@js.native
class WebDriverCommand protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(commandName: CommandName, url: java.lang.String, method: HttpMethod) = this()
  def this(commandName: CommandName, url: java.lang.String, method: HttpMethod, params: js.Any) = this()
  var commandName: CommandName = js.native
  var data: js.Any = js.native
  val method: HttpMethod = js.native
  var params: js.Any = js.native
  var responseData: js.Any = js.native
  var responseStatus: scala.Double = js.native
  val sessionId: java.lang.String = js.native
  val url: java.lang.String = js.native
  def getParam(key: paramKey): java.lang.String = js.native
  def handleData(): scala.Unit = js.native
  def handleData(data: js.Any): scala.Unit = js.native
  def handleResponse(statusCode: scala.Double): scala.Unit = js.native
  def handleResponse(statusCode: scala.Double, data: js.Any): scala.Unit = js.native
}

