package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetUserPasswordRequest extends js.Object {
  /**
    * Identifier of the AWS Managed Microsoft AD or Simple AD directory in which the user resides.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * The new password that will be reset.
    */
  var NewPassword: UserPassword = js.native
  /**
    * The user name of the user whose password will be reset.
    */
  var UserName: CustomerUserName = js.native
}

object ResetUserPasswordRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, NewPassword: UserPassword, UserName: CustomerUserName): ResetUserPasswordRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], NewPassword = NewPassword.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetUserPasswordRequest]
  }
  @scala.inline
  implicit class ResetUserPasswordRequestOps[Self <: ResetUserPasswordRequest] (val x: Self) extends AnyVal {
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
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewPassword(value: UserPassword): Self = this.set("NewPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserName(value: CustomerUserName): Self = this.set("UserName", value.asInstanceOf[js.Any])
  }
  
}

