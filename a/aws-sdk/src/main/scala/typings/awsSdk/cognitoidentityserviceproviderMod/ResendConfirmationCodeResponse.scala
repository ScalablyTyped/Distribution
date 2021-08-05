package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResendConfirmationCodeResponse extends StObject {
  
  /**
    * The code delivery details returned by the server in response to the request to resend the confirmation code.
    */
  var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.undefined
}
object ResendConfirmationCodeResponse {
  
  inline def apply(): ResendConfirmationCodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResendConfirmationCodeResponse]
  }
  
  extension [Self <: ResendConfirmationCodeResponse](x: Self) {
    
    inline def setCodeDeliveryDetails(value: CodeDeliveryDetailsType): Self = StObject.set(x, "CodeDeliveryDetails", value.asInstanceOf[js.Any])
    
    inline def setCodeDeliveryDetailsUndefined: Self = StObject.set(x, "CodeDeliveryDetails", js.undefined)
  }
}
