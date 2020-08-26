package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteServiceLinkedRoleRequest extends js.Object {
  /**
    * The name of the service-linked role to be deleted.
    */
  var RoleName: roleNameType = js.native
}

object DeleteServiceLinkedRoleRequest {
  @scala.inline
  def apply(RoleName: roleNameType): DeleteServiceLinkedRoleRequest = {
    val __obj = js.Dynamic.literal(RoleName = RoleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServiceLinkedRoleRequest]
  }
  @scala.inline
  implicit class DeleteServiceLinkedRoleRequestOps[Self <: DeleteServiceLinkedRoleRequest] (val x: Self) extends AnyVal {
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

