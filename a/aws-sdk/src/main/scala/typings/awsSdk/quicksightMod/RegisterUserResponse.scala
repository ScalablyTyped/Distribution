package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterUserResponse extends js.Object {
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  /**
    * The user name.
    */
  var User: js.UndefOr[typings.awsSdk.quicksightMod.User] = js.native
  /**
    * The URL the user visits to complete registration and provide a password. This is returned only for users with an identity type of QUICKSIGHT.
    */
  var UserInvitationUrl: js.UndefOr[String] = js.native
}

object RegisterUserResponse {
  @scala.inline
  def apply(): RegisterUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterUserResponse]
  }
  @scala.inline
  implicit class RegisterUserResponseOps[Self <: RegisterUserResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    @scala.inline
    def setStatus(value: StatusCode): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setUser(value: User): Self = this.set("User", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("User", js.undefined)
    @scala.inline
    def setUserInvitationUrl(value: String): Self = this.set("UserInvitationUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserInvitationUrl: Self = this.set("UserInvitationUrl", js.undefined)
  }
  
}

