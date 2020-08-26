package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGroupRequest extends js.Object {
  /**
    * The name of the group.
    */
  var Name: GroupName = js.native
  /**
    * The organization under which the group is to be created.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
}

object CreateGroupRequest {
  @scala.inline
  def apply(Name: GroupName, OrganizationId: OrganizationId): CreateGroupRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupRequest]
  }
  @scala.inline
  implicit class CreateGroupRequestOps[Self <: CreateGroupRequest] (val x: Self) extends AnyVal {
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
    def setName(value: GroupName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
  }
  
}

