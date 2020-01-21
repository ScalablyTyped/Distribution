package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyRole extends js.Object {
  /**
    * The stable and unique string identifying the role. For more information about IDs, see IAM Identifiers in the IAM User Guide.
    */
  var RoleId: js.UndefOr[idType] = js.native
  /**
    * The name (friendly name, not ARN) identifying the role.
    */
  var RoleName: js.UndefOr[roleNameType] = js.native
}

object PolicyRole {
  @scala.inline
  def apply(RoleId: idType = null, RoleName: roleNameType = null): PolicyRole = {
    val __obj = js.Dynamic.literal()
    if (RoleId != null) __obj.updateDynamic("RoleId")(RoleId.asInstanceOf[js.Any])
    if (RoleName != null) __obj.updateDynamic("RoleName")(RoleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyRole]
  }
}

