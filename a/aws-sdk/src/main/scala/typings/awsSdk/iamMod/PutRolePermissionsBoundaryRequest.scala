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
}

