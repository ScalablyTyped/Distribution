package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveUserFromGroupRequest extends js.Object {
  /**
    * The name of the group to update. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var GroupName: groupNameType = js.native
  /**
    * The name of the user to remove. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: existingUserNameType = js.native
}

object RemoveUserFromGroupRequest {
  @scala.inline
  def apply(GroupName: groupNameType, UserName: existingUserNameType): RemoveUserFromGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveUserFromGroupRequest]
  }
  @scala.inline
  implicit class RemoveUserFromGroupRequestOps[Self <: RemoveUserFromGroupRequest] (val x: Self) extends AnyVal {
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
    def setGroupName(value: groupNameType): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserName(value: existingUserNameType): Self = this.set("UserName", value.asInstanceOf[js.Any])
  }
  
}

