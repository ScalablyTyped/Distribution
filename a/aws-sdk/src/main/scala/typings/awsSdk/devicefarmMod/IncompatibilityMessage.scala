package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncompatibilityMessage extends StObject {
  
  /**
    * A message about the incompatibility.
    */
  var message: js.UndefOr[Message] = js.undefined
  
  /**
    * The type of incompatibility. Allowed values include:   ARN   FORM_FACTOR (for example, phone or tablet)   MANUFACTURER   PLATFORM (for example, Android or iOS)   REMOTE_ACCESS_ENABLED   APPIUM_VERSION  
    */
  var `type`: js.UndefOr[DeviceAttribute] = js.undefined
}
object IncompatibilityMessage {
  
  inline def apply(): IncompatibilityMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncompatibilityMessage]
  }
  
  extension [Self <: IncompatibilityMessage](x: Self) {
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setType(value: DeviceAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
