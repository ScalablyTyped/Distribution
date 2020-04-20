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
}

