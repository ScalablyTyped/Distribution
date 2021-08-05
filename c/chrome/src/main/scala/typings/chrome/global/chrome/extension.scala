package typings.chrome.global.chrome

import typings.chrome.Window
import typings.chrome.chrome.`extension`.FetchProperties
import typings.chrome.chrome.`extension`.LastError
import typings.chrome.chrome.`extension`.OnRequestEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Extension
////////////////////
/**
  * The chrome.extension API has utilities that can be used by any extension page. It includes support for exchanging messages between an extension and its content scripts or between extensions, as described in detail in Message Passing.
  * Availability: Since Chrome 5.
  */
object `extension` {
  
  @JSGlobal("chrome.extension")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBackgroundPage(): Window | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBackgroundPage")().asInstanceOf[Window | Null]
  
  inline def getExtensionTabs(): js.Array[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtensionTabs")().asInstanceOf[js.Array[Window]]
  inline def getExtensionTabs(windowId: Double): js.Array[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtensionTabs")(windowId.asInstanceOf[js.Any]).asInstanceOf[js.Array[Window]]
  
  inline def getURL(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getURL")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getViews(): js.Array[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getViews")().asInstanceOf[js.Array[Window]]
  inline def getViews(fetchProperties: FetchProperties): js.Array[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getViews")(fetchProperties.asInstanceOf[js.Any]).asInstanceOf[js.Array[Window]]
  
  @JSGlobal("chrome.extension.inIncognitoContext")
  @js.native
  def inIncognitoContext: Boolean = js.native
  inline def inIncognitoContext_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inIncognitoContext")(x.asInstanceOf[js.Any])
  
  inline def isAllowedFileSchemeAccess(callback: js.Function1[/* isAllowedAccess */ Boolean, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isAllowedFileSchemeAccess")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isAllowedIncognitoAccess(callback: js.Function1[/* isAllowedAccess */ Boolean, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isAllowedIncognitoAccess")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSGlobal("chrome.extension.lastError")
  @js.native
  def lastError: LastError = js.native
  inline def lastError_=(x: LastError): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lastError")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.extension.onRequest")
  @js.native
  def onRequest: OnRequestEvent = js.native
  
  @JSGlobal("chrome.extension.onRequestExternal")
  @js.native
  def onRequestExternal: OnRequestEvent = js.native
  inline def onRequestExternal_=(x: OnRequestEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRequestExternal")(x.asInstanceOf[js.Any])
  
  inline def onRequest_=(x: OnRequestEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRequest")(x.asInstanceOf[js.Any])
  
  inline def sendRequest(extensionId: String, request: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendRequest")(extensionId.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sendRequest(extensionId: String, request: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendRequest")(extensionId.asInstanceOf[js.Any], request.asInstanceOf[js.Any], responseCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sendRequest(request: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendRequest")(request.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def sendRequest(request: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendRequest")(request.asInstanceOf[js.Any], responseCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setUpdateUrlData(data: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUpdateUrlData")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
