package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayRegistrationStateReason extends StObject {
  
  /**
    * The code for the state reason.
    */
  var Code: js.UndefOr[TransitGatewayRegistrationState] = js.undefined
  
  /**
    * The message for the state reason.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object TransitGatewayRegistrationStateReason {
  
  inline def apply(): TransitGatewayRegistrationStateReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayRegistrationStateReason]
  }
  
  extension [Self <: TransitGatewayRegistrationStateReason](x: Self) {
    
    inline def setCode(value: TransitGatewayRegistrationState): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
