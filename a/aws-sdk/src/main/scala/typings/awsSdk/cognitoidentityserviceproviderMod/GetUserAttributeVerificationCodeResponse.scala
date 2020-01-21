package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUserAttributeVerificationCodeResponse extends js.Object {
  /**
    * The code delivery details returned by the server in response to the request to get the user attribute verification code.
    */
  var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.native
}

object GetUserAttributeVerificationCodeResponse {
  @scala.inline
  def apply(CodeDeliveryDetails: CodeDeliveryDetailsType = null): GetUserAttributeVerificationCodeResponse = {
    val __obj = js.Dynamic.literal()
    if (CodeDeliveryDetails != null) __obj.updateDynamic("CodeDeliveryDetails")(CodeDeliveryDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserAttributeVerificationCodeResponse]
  }
}

