package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRolePermissionsBoundaryRequest extends js.Object {
  /**
    * The ARN of the policy that is used to set the permissions boundary for the role.
    */
  var PermissionsBoundary: arnType = js.native
  /**
    * The name (friendly name, not ARN) of the IAM role for which you want to set the permissions boundary.
    */
  var RoleName: roleNameType = js.native
}

object PutRolePermissionsBoundaryRequest {
  @scala.inline
  def apply(PermissionsBoundary: arnType, RoleName: roleNameType): PutRolePermissionsBoundaryRequest = {
    val __obj = js.Dynamic.literal(PermissionsBoundary = PermissionsBoundary.asInstanceOf[js.Any], RoleName = RoleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRolePermissionsBoundaryRequest]
  }
  @scala.inline
  implicit class PutRolePermissionsBoundaryRequestOps[Self <: PutRolePermissionsBoundaryRequest] (val x: Self) extends AnyVal {
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
    def setRoleName(value: roleNameType): Self = this.set("RoleName", value.asInstanceOf[js.Any])
  }
  
}

