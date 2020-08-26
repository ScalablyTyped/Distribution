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
  def apply(): PolicyRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyRole]
  }
  @scala.inline
  implicit class PolicyRoleOps[Self <: PolicyRole] (val x: Self) extends AnyVal {
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
    def setRoleId(value: idType): Self = this.set("RoleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleId: Self = this.set("RoleId", js.undefined)
    @scala.inline
    def setRoleName(value: roleNameType): Self = this.set("RoleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleName: Self = this.set("RoleName", js.undefined)
  }
  
}

