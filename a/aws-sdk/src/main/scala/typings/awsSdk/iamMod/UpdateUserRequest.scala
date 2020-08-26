package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserRequest extends js.Object {
  /**
    * New path for the IAM user. Include this parameter only if you're changing the user's path. This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
    */
  var NewPath: js.UndefOr[pathType] = js.native
  /**
    * New name for the user. Include this parameter only if you're changing the user's name. IAM user, group, role, and policy names must be unique within the account. Names are not distinguished by case. For example, you cannot create resources named both "MyResource" and "myresource".
    */
  var NewUserName: js.UndefOr[userNameType] = js.native
  /**
    * Name of the user to update. If you're changing the name of the user, this is the original user name. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: existingUserNameType = js.native
}

object UpdateUserRequest {
  @scala.inline
  def apply(UserName: existingUserNameType): UpdateUserRequest = {
    val __obj = js.Dynamic.literal(UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserRequest]
  }
  @scala.inline
  implicit class UpdateUserRequestOps[Self <: UpdateUserRequest] (val x: Self) extends AnyVal {
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
    def setUserName(value: existingUserNameType): Self = this.set("UserName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewPath(value: pathType): Self = this.set("NewPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewPath: Self = this.set("NewPath", js.undefined)
    @scala.inline
    def setNewUserName(value: userNameType): Self = this.set("NewUserName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewUserName: Self = this.set("NewUserName", js.undefined)
  }
  
}

