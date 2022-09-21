package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimPhoneNumberResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the phone number.
    */
  var PhoneNumberArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * A unique identifier for the phone number.
    */
  var PhoneNumberId: js.UndefOr[typings.awsSdk.connectMod.PhoneNumberId] = js.undefined
}
object ClaimPhoneNumberResponse {
  
  inline def apply(): ClaimPhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimPhoneNumberResponse]
  }
  
  extension [Self <: ClaimPhoneNumberResponse](x: Self) {
    
    inline def setPhoneNumberArn(value: ARN): Self = StObject.set(x, "PhoneNumberArn", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberArnUndefined: Self = StObject.set(x, "PhoneNumberArn", js.undefined)
    
    inline def setPhoneNumberId(value: PhoneNumberId): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberIdUndefined: Self = StObject.set(x, "PhoneNumberId", js.undefined)
  }
}
