package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResendConfirmationCodeResponse extends StObject {
  
  /**
    * The code delivery details returned by the server in response to the request to resend the confirmation code.
    */
  var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.native
}
object ResendConfirmationCodeResponse {
  
  @scala.inline
  def apply(): ResendConfirmationCodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResendConfirmationCodeResponse]
  }
  
  @scala.inline
  implicit class ResendConfirmationCodeResponseMutableBuilder[Self <: ResendConfirmationCodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeDeliveryDetails(value: CodeDeliveryDetailsType): Self = StObject.set(x, "CodeDeliveryDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeDeliveryDetailsUndefined: Self = StObject.set(x, "CodeDeliveryDetails", js.undefined)
  }
}
