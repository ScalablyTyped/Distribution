package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateRoleToGroupResponse extends js.Object {
  /**
    * The time, in milliseconds since the epoch, when the role ARN was associated with the group.
    */
  var AssociatedAt: js.UndefOr[string] = js.native
}

object AssociateRoleToGroupResponse {
  @scala.inline
  def apply(): AssociateRoleToGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateRoleToGroupResponse]
  }
  @scala.inline
  implicit class AssociateRoleToGroupResponseOps[Self <: AssociateRoleToGroupResponse] (val x: Self) extends AnyVal {
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
    def setAssociatedAt(value: string): Self = this.set("AssociatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociatedAt: Self = this.set("AssociatedAt", js.undefined)
  }
  
}

