package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForgotPasswordResponse extends js.Object {
  /**
    * The code delivery details returned by the server in response to the request to reset a password.
    */
  var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.native
}

object ForgotPasswordResponse {
  @scala.inline
  def apply(CodeDeliveryDetails: CodeDeliveryDetailsType = null): ForgotPasswordResponse = {
    val __obj = js.Dynamic.literal()
    if (CodeDeliveryDetails != null) __obj.updateDynamic("CodeDeliveryDetails")(CodeDeliveryDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForgotPasswordResponse]
  }
}

