package typings.chrome.anon

import typings.chrome.Window
import typings.chrome.chrome.extension.FetchProperties
import typings.chrome.chrome.extension.LastError
import typings.chrome.chrome.extension.OnRequestEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofextension extends js.Object {
  
  def getBackgroundPage(): Window | Null = js.native
  
  def getExtensionTabs(): js.Array[Window] = js.native
  def getExtensionTabs(windowId: Double): js.Array[Window] = js.native
  
  def getURL(path: String): String = js.native
  
  def getViews(): js.Array[Window] = js.native
  def getViews(fetchProperties: FetchProperties): js.Array[Window] = js.native
  
  var inIncognitoContext: Boolean = js.native
  
  def isAllowedFileSchemeAccess(callback: js.Function1[/* isAllowedAccess */ Boolean, Unit]): Unit = js.native
  
  def isAllowedIncognitoAccess(callback: js.Function1[/* isAllowedAccess */ Boolean, Unit]): Unit = js.native
  
  var lastError: LastError = js.native
  
  var onRequest: OnRequestEvent = js.native
  
  var onRequestExternal: OnRequestEvent = js.native
  
  def sendRequest(extensionId: String, request: js.Any): Unit = js.native
  def sendRequest(extensionId: String, request: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  def sendRequest(request: js.Any): Unit = js.native
  def sendRequest(request: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  
  def setUpdateUrlData(data: String): Unit = js.native
}
