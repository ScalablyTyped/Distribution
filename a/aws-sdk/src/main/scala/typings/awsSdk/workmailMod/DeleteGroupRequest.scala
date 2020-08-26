package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGroupRequest extends js.Object {
  /**
    * The identifier of the group to be deleted.
    */
  var GroupId: WorkMailIdentifier = js.native
  /**
    * The organization that contains the group.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
}

object DeleteGroupRequest {
  @scala.inline
  def apply(GroupId: WorkMailIdentifier, OrganizationId: OrganizationId): DeleteGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGroupRequest]
  }
  @scala.inline
  implicit class DeleteGroupRequestOps[Self <: DeleteGroupRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGroupId(value: WorkMailIdentifier): Self = this.set("GroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
  }
  
}

