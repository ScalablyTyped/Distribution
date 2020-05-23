package typings.chrome.global.chrome

import typings.chrome.Window
import typings.chrome.chrome.extension.FetchProperties
import typings.chrome.chrome.extension.LastError
import typings.chrome.chrome.extension.OnRequestEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Extension
////////////////////
/**
  * The chrome.extension API has utilities that can be used by any extension page. It includes support for exchanging messages between an extension and its content scripts or between extensions, as described in detail in Message Passing.
  * Availability: Since Chrome 5.
  */
@JSGlobal("chrome.extension")
@js.native
object extension extends js.Object {
  var inIncognitoContext: Boolean = js.native
  var lastError: LastError = js.native
  var onRequest: OnRequestEvent = js.native
  var onRequestExternal: OnRequestEvent = js.native
  def getBackgroundPage(): Window | Null = js.native
  def getExtensionTabs(): js.Array[Window] = js.native
  def getExtensionTabs(windowId: Double): js.Array[Window] = js.native
  def getURL(path: String): String = js.native
  def getViews(): js.Array[Window] = js.native
  def getViews(fetchProperties: FetchProperties): js.Array[Window] = js.native
  def isAllowedFileSchemeAccess(callback: js.Function1[/* isAllowedAccess */ Boolean, Unit]): Unit = js.native
  def isAllowedIncognitoAccess(callback: js.Function1[/* isAllowedAccess */ Boolean, Unit]): Unit = js.native
  def sendRequest(extensionId: String, request: js.Any): Unit = js.native
  def sendRequest(extensionId: String, request: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  def sendRequest(request: js.Any): Unit = js.native
  def sendRequest(request: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  def setUpdateUrlData(data: String): Unit = js.native
}

