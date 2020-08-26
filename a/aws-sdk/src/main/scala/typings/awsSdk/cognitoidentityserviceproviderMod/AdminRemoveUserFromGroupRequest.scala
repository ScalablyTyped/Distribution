package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminRemoveUserFromGroupRequest extends js.Object {
  /**
    * The group name.
    */
  var GroupName: GroupNameType = js.native
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType = js.native
  /**
    * The username for the user.
    */
  var Username: UsernameType = js.native
}

object AdminRemoveUserFromGroupRequest {
  @scala.inline
  def apply(GroupName: GroupNameType, UserPoolId: UserPoolIdType, Username: UsernameType): AdminRemoveUserFromGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminRemoveUserFromGroupRequest]
  }
  @scala.inline
  implicit class AdminRemoveUserFromGroupRequestOps[Self <: AdminRemoveUserFromGroupRequest] (val x: Self) extends AnyVal {
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
    def setGroupName(value: GroupNameType): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: UsernameType): Self = this.set("Username", value.asInstanceOf[js.Any])
  }
  
}

