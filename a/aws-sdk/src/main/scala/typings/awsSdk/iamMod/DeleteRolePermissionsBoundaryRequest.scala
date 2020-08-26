package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRolePermissionsBoundaryRequest extends js.Object {
  /**
    * The name (friendly name, not ARN) of the IAM role from which you want to remove the permissions boundary.
    */
  var RoleName: roleNameType = js.native
}

object DeleteRolePermissionsBoundaryRequest {
  @scala.inline
  def apply(RoleName: roleNameType): DeleteRolePermissionsBoundaryRequest = {
    val __obj = js.Dynamic.literal(RoleName = RoleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRolePermissionsBoundaryRequest]
  }
  @scala.inline
  implicit class DeleteRolePermissionsBoundaryRequestOps[Self <: DeleteRolePermissionsBoundaryRequest] (val x: Self) extends AnyVal {
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
    def setRoleName(value: roleNameType): Self = this.set("RoleName", value.asInstanceOf[js.Any])
  }
  
}

