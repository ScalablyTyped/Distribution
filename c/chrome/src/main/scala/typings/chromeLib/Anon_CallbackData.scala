package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackData extends js.Object {
  var inIncognitoContext: scala.Boolean = js.native
  var lastError: chromeLib.chromeNs.extensionNs.LastError = js.native
  var onRequest: chromeLib.chromeNs.extensionNs.OnRequestEvent = js.native
  var onRequestExternal: chromeLib.chromeNs.extensionNs.OnRequestEvent = js.native
  def getBackgroundPage(): Window | scala.Null = js.native
  def getExtensionTabs(): js.Array[Window] = js.native
  def getExtensionTabs(windowId: scala.Double): js.Array[Window] = js.native
  def getURL(path: java.lang.String): java.lang.String = js.native
  def getViews(): js.Array[Window] = js.native
  def getViews(fetchProperties: chromeLib.chromeNs.extensionNs.FetchProperties): js.Array[Window] = js.native
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

