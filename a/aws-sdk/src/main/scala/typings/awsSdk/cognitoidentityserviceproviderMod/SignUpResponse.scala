package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignUpResponse extends js.Object {
  /**
    * The code delivery details returned by the server response to the user registration request.
    */
  var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.native
  /**
    * A response from the server indicating that a user registration has been confirmed.
    */
  var UserConfirmed: BooleanType = js.native
  /**
    * The UUID of the authenticated user. This is not the same as username.
    */
  var UserSub: StringType = js.native
}

object SignUpResponse {
  @scala.inline
  def apply(
    UserConfirmed: BooleanType,
    UserSub: StringType,
    CodeDeliveryDetails: CodeDeliveryDetailsType = null
  ): SignUpResponse = {
    val __obj = js.Dynamic.literal(UserConfirmed = UserConfirmed.asInstanceOf[js.Any], UserSub = UserSub.asInstanceOf[js.Any])
    if (CodeDeliveryDetails != null) __obj.updateDynamic("CodeDeliveryDetails")(CodeDeliveryDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignUpResponse]
  }
}

