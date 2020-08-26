package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminDisableProviderForUserRequest extends js.Object {
  /**
    * The user to be disabled.
    */
  var User: ProviderUserIdentifierType = js.native
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: StringType = js.native
}

object AdminDisableProviderForUserRequest {
  @scala.inline
  def apply(User: ProviderUserIdentifierType, UserPoolId: StringType): AdminDisableProviderForUserRequest = {
    val __obj = js.Dynamic.literal(User = User.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminDisableProviderForUserRequest]
  }
  @scala.inline
  implicit class AdminDisableProviderForUserRequestOps[Self <: AdminDisableProviderForUserRequest] (val x: Self) extends AnyVal {
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
    def setUser(value: ProviderUserIdentifierType): Self = this.set("User", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserPoolId(value: StringType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
  }
  
}

