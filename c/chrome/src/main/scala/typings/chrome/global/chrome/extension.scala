package typings.chrome.global.chrome

import typings.chrome.Window
import typings.chrome.chrome.extension.FetchProperties
import typings.chrome.chrome.extension.LastError
import typings.chrome.chrome.extension.OnRequestEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Extension
////////////////////
/**
  * The chrome.extension API has utilities that can be used by any extension page. It includes support for exchanging messages between an extension and its content scripts or between extensions, as described in detail in Message Passing.
  * Availability: Since Chrome 5.
  */
object extension {
  
  @JSGlobal("chrome.extension")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.extension.getBackgroundPage")
  @js.native
  def getBackgroundPage(): Window | Null = js.native
  
  @JSGlobal("chrome.extension.getExtensionTabs")
  @js.native
  def getExtensionTabs(): js.Array[Window] = js.native
  @JSGlobal("chrome.extension.getExtensionTabs")
  @js.native
  def getExtensionTabs(windowId: Double): js.Array[Window] = js.native
  
  @JSGlobal("chrome.extension.getURL")
  @js.native
  def getURL(path: String): String = js.native
  
  @JSGlobal("chrome.extension.getViews")
  @js.native
  def getViews(): js.Array[Window] = js.native
  @JSGlobal("chrome.extension.getViews")
  @js.native
  def getViews(fetchProperties: FetchProperties): js.Array[Window] = js.native
  
  @JSGlobal("chrome.extension.inIncognitoContext")
  @js.native
  def inIncognitoContext: Boolean = js.native
  @scala.inline
  def inIncognitoContext_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inIncognitoContext")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.extension.isAllowedFileSchemeAccess")
  @js.native
  def isAllowedFileSchemeAccess(callback: js.Function1[/* isAllowedAccess */ Boolean, Unit]): Unit = js.native
  
  @JSGlobal("chrome.extension.isAllowedIncognitoAccess")
  @js.native
  def isAllowedIncognitoAccess(callback: js.Function1[/* isAllowedAccess */ Boolean, Unit]): Unit = js.native
  
  @JSGlobal("chrome.extension.lastError")
  @js.native
  def lastError: LastError = js.native
  @scala.inline
  def lastError_=(x: LastError): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lastError")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.extension.onRequest")
  @js.native
  def onRequest: OnRequestEvent = js.native
  
  @JSGlobal("chrome.extension.onRequestExternal")
  @js.native
  def onRequestExternal: OnRequestEvent = js.native
  @scala.inline
  def onRequestExternal_=(x: OnRequestEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRequestExternal")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def onRequest_=(x: OnRequestEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRequest")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.extension.sendRequest")
  @js.native
  def sendRequest(extensionId: String, request: js.Any): Unit = js.native
  @JSGlobal("chrome.extension.sendRequest")
  @js.native
  def sendRequest(extensionId: String, request: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  @JSGlobal("chrome.extension.sendRequest")
  @js.native
  def sendRequest(request: js.Any): Unit = js.native
  @JSGlobal("chrome.extension.sendRequest")
  @js.native
  def sendRequest(request: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  
  @JSGlobal("chrome.extension.setUpdateUrlData")
  @js.native
  def setUpdateUrlData(data: String): Unit = js.native
}
