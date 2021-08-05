package typings.chrome.global.chrome

import typings.chrome.chrome.declarativeWebRequest.RequestedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Declarative Web Request
////////////////////
object declarativeWebRequest {
  
  @JSGlobal("chrome.declarativeWebRequest")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.declarativeWebRequest.onRequest")
  @js.native
  def onRequest: RequestedEvent = js.native
  inline def onRequest_=(x: RequestedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRequest")(x.asInstanceOf[js.Any])
}
