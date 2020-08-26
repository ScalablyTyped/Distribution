package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRoleResponse extends js.Object {
  /**
    * A structure containing details about the IAM role.
    */
  var Role: typings.awsSdk.iamMod.Role = js.native
}

object GetRoleResponse {
  @scala.inline
  def apply(Role: Role): GetRoleResponse = {
    val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRoleResponse]
  }
  @scala.inline
  implicit class GetRoleResponseOps[Self <: GetRoleResponse] (val x: Self) extends AnyVal {
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
    def setRole(value: Role): Self = this.set("Role", value.asInstanceOf[js.Any])
  }
  
}

