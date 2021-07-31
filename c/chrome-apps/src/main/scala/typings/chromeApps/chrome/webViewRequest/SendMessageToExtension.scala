package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Triggers the webviewWebRequest.*OnMessageEvent* event which are used in webviews.
  */
trait SendMessageToExtension
  extends StObject
     with OnRequestActions {
  
  val instanceType: String
  
  val typeGuard: typings.chromeApps.chromeAppsStrings.SendMessageToExtension
}
object SendMessageToExtension {
  
  @scala.inline
  def apply(instanceType: String): SendMessageToExtension = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any], typeGuard = "SendMessageToExtension")
    __obj.asInstanceOf[SendMessageToExtension]
  }
  
  @scala.inline
  implicit class SendMessageToExtensionMutableBuilder[Self <: SendMessageToExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeGuard(value: typings.chromeApps.chromeAppsStrings.SendMessageToExtension): Self = StObject.set(x, "typeGuard", value.asInstanceOf[js.Any])
  }
}
