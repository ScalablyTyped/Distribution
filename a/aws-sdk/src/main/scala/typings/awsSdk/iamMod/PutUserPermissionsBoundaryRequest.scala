package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutUserPermissionsBoundaryRequest extends js.Object {
  /**
    * The ARN of the policy that is used to set the permissions boundary for the user.
    */
  var PermissionsBoundary: arnType = js.native
  /**
    * The name (friendly name, not ARN) of the IAM user for which you want to set the permissions boundary.
    */
  var UserName: userNameType = js.native
}

object PutUserPermissionsBoundaryRequest {
  @scala.inline
  def apply(PermissionsBoundary: arnType, UserName: userNameType): PutUserPermissionsBoundaryRequest = {
    val __obj = js.Dynamic.literal(PermissionsBoundary = PermissionsBoundary.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutUserPermissionsBoundaryRequest]
  }
  @scala.inline
  implicit class PutUserPermissionsBoundaryRequestOps[Self <: PutUserPermissionsBoundaryRequest] (val x: Self) extends AnyVal {
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
    def setPermissionsBoundary(value: arnType): Self = this.set("PermissionsBoundary", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserName(value: userNameType): Self = this.set("UserName", value.asInstanceOf[js.Any])
  }
  
}

