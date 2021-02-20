package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForgotPasswordResponse extends StObject {
  
  /**
    * The code delivery details returned by the server in response to the request to reset a password.
    */
  var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.native
}
object ForgotPasswordResponse {
  
  @scala.inline
  def apply(): ForgotPasswordResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForgotPasswordResponse]
  }
  
  @scala.inline
  implicit class ForgotPasswordResponseMutableBuilder[Self <: ForgotPasswordResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeDeliveryDetails(value: CodeDeliveryDetailsType): Self = StObject.set(x, "CodeDeliveryDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeDeliveryDetailsUndefined: Self = StObject.set(x, "CodeDeliveryDetails", js.undefined)
  }
}
