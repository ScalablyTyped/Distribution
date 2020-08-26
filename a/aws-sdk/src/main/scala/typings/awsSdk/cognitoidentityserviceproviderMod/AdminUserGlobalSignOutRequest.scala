package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminUserGlobalSignOutRequest extends js.Object {
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
  /**
    * The user name.
    */
  var Username: UsernameType = js.native
}

object AdminUserGlobalSignOutRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType, Username: UsernameType): AdminUserGlobalSignOutRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminUserGlobalSignOutRequest]
  }
  @scala.inline
  implicit class AdminUserGlobalSignOutRequestOps[Self <: AdminUserGlobalSignOutRequest] (val x: Self) extends AnyVal {
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
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: UsernameType): Self = this.set("Username", value.asInstanceOf[js.Any])
  }
  
}

