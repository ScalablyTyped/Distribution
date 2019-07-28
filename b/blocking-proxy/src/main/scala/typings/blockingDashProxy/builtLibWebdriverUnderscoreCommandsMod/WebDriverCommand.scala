package typings.blockingDashProxy.builtLibWebdriverUnderscoreCommandsMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blocking-proxy/built/lib/webdriver_commands", "WebDriverCommand")
@js.native
class WebDriverCommand protected () extends EventEmitter {
  def this(commandName: CommandName, url: String, method: HttpMethod) = this()
  def this(commandName: CommandName, url: String, method: HttpMethod, params: js.Any) = this()
  var commandName: CommandName = js.native
  var data: js.Any = js.native
  val method: HttpMethod = js.native
  var params: js.Any = js.native
  var responseData: js.Any = js.native
  var responseStatus: Double = js.native
  val sessionId: String = js.native
  val url: String = js.native
  def getParam(key: paramKey): String = js.native
  def handleData(): Unit = js.native
  def handleData(data: js.Any): Unit = js.native
  def handleResponse(statusCode: Double): Unit = js.native
  def handleResponse(statusCode: Double, data: js.Any): Unit = js.native
}

