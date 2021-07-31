package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserAttributeVerificationCodeResponse extends StObject {
  
  /**
    * The code delivery details returned by the server in response to the request to get the user attribute verification code.
    */
  var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.undefined
}
object GetUserAttributeVerificationCodeResponse {
  
  @scala.inline
  def apply(): GetUserAttributeVerificationCodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserAttributeVerificationCodeResponse]
  }
  
  @scala.inline
  implicit class GetUserAttributeVerificationCodeResponseMutableBuilder[Self <: GetUserAttributeVerificationCodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeDeliveryDetails(value: CodeDeliveryDetailsType): Self = StObject.set(x, "CodeDeliveryDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeDeliveryDetailsUndefined: Self = StObject.set(x, "CodeDeliveryDetails", js.undefined)
  }
}
