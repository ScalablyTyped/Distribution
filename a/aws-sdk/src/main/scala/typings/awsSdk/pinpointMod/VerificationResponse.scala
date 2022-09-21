package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerificationResponse extends StObject {
  
  /**
    * Specifies whether the OTP is valid or not.
    */
  var Valid: js.UndefOr[boolean] = js.undefined
}
object VerificationResponse {
  
  inline def apply(): VerificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerificationResponse]
  }
  
  extension [Self <: VerificationResponse](x: Self) {
    
    inline def setValid(value: boolean): Self = StObject.set(x, "Valid", value.asInstanceOf[js.Any])
    
    inline def setValidUndefined: Self = StObject.set(x, "Valid", js.undefined)
  }
}
