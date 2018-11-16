package typings
package chromeLib.chromeNs.extensionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.extension")
@js.native
object extensionNsMembers extends js.Object {
  var inIncognitoContext: scala.Boolean = js.native
  var lastError: LastError = js.native
  var onRequest: OnRequestEvent = js.native
  var onRequestExternal: OnRequestEvent = js.native
  def getBackgroundPage(): chromeLib.Window | scala.Null = js.native
  def getExtensionTabs(): js.Array[chromeLib.Window] = js.native
  def getExtensionTabs(windowId: scala.Double): js.Array[chromeLib.Window] = js.native
  def getURL(path: java.lang.String): java.lang.String = js.native
  def getViews(): js.Array[chromeLib.Window] = js.native
  def getViews(fetchProperties: FetchProperties): js.Array[chromeLib.Window] = js.native
  def isAllowedFileSchemeAccess(callback: js.Function1[/* isAllowedAccess */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def isAllowedIncognitoAccess(callback: js.Function1[/* isAllowedAccess */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def sendRequest(extensionId: java.lang.String, request: js.Any): scala.Unit = js.native
  def sendRequest(
    extensionId: java.lang.String,
    request: js.Any,
    responseCallback: js.Function1[/* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def sendRequest(request: js.Any): scala.Unit = js.native
  def sendRequest(request: js.Any, responseCallback: js.Function1[/* response */ js.Any, scala.Unit]): scala.Unit = js.native
  def setUpdateUrlData(data: java.lang.String): scala.Unit = js.native
}

