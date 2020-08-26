package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRoleDescriptionResponse extends js.Object {
  /**
    * A structure that contains details about the modified role.
    */
  var Role: js.UndefOr[typings.awsSdk.iamMod.Role] = js.native
}

object UpdateRoleDescriptionResponse {
  @scala.inline
  def apply(): UpdateRoleDescriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRoleDescriptionResponse]
  }
  @scala.inline
  implicit class UpdateRoleDescriptionResponseOps[Self <: UpdateRoleDescriptionResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteRole: Self = this.set("Role", js.undefined)
  }
  
}

