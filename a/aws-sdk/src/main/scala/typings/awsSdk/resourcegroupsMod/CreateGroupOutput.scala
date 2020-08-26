package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGroupOutput extends js.Object {
  /**
    * The description of the resource group.
    */
  var Group: js.UndefOr[typings.awsSdk.resourcegroupsMod.Group] = js.native
  /**
    * The service configuration associated with the resource group. AWS Resource Groups supports adding service configurations for the following resource group types:    AWS::EC2::CapacityReservationPool - Amazon EC2 capacity reservation pools. For more information, see Working with capacity reservation groups in the EC2 Users Guide.  
    */
  var GroupConfiguration: js.UndefOr[typings.awsSdk.resourcegroupsMod.GroupConfiguration] = js.native
  /**
    * The resource query associated with the group.
    */
  var ResourceQuery: js.UndefOr[typings.awsSdk.resourcegroupsMod.ResourceQuery] = js.native
  /**
    * The tags associated with the group.
    */
  var Tags: js.UndefOr[typings.awsSdk.resourcegroupsMod.Tags] = js.native
}

object CreateGroupOutput {
  @scala.inline
  def apply(): CreateGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGroupOutput]
  }
  @scala.inline
  implicit class CreateGroupOutputOps[Self <: CreateGroupOutput] (val x: Self) extends AnyVal {
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
    def setGroup(value: Group): Self = this.set("Group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("Group", js.undefined)
    @scala.inline
    def setGroupConfiguration(value: GroupConfiguration): Self = this.set("GroupConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupConfiguration: Self = this.set("GroupConfiguration", js.undefined)
    @scala.inline
    def setResourceQuery(value: ResourceQuery): Self = this.set("ResourceQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceQuery: Self = this.set("ResourceQuery", js.undefined)
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

