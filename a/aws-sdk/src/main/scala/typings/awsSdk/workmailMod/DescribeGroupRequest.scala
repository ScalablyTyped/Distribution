package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGroupRequest extends js.Object {
  /**
    * The identifier for the group to be described.
    */
  var GroupId: WorkMailIdentifier = js.native
  /**
    * The identifier for the organization under which the group exists.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
}

object DescribeGroupRequest {
  @scala.inline
  def apply(GroupId: WorkMailIdentifier, OrganizationId: OrganizationId): DescribeGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGroupRequest]
  }
  @scala.inline
  implicit class DescribeGroupRequestOps[Self <: DescribeGroupRequest] (val x: Self) extends AnyVal {
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

