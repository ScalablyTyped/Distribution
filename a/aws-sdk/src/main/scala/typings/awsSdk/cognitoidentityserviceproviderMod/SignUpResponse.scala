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
  def apply(UserConfirmed: BooleanType, UserSub: StringType): SignUpResponse = {
    val __obj = js.Dynamic.literal(UserConfirmed = UserConfirmed.asInstanceOf[js.Any], UserSub = UserSub.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignUpResponse]
  }
  @scala.inline
  implicit class SignUpResponseOps[Self <: SignUpResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUserConfirmed(value: BooleanType): Self = this.set("UserConfirmed", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserSub(value: StringType): Self = this.set("UserSub", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodeDeliveryDetails(value: CodeDeliveryDetailsType): Self = this.set("CodeDeliveryDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeDeliveryDetails: Self = this.set("CodeDeliveryDetails", js.undefined)
  }
  
}

