package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeSummary extends js.Object {
  /**
    * The Availability Zone in which the node exists.
    */
  var AvailabilityZone: js.UndefOr[AvailabilityZoneString] = js.native
  /**
    * The date and time that the node was created.
    */
  var CreationDate: js.UndefOr[Timestamp] = js.native
  /**
    * The unique identifier of the node.
    */
  var Id: js.UndefOr[ResourceIdString] = js.native
  /**
    * The EC2 instance type for the node.
    */
  var InstanceType: js.UndefOr[InstanceTypeString] = js.native
  /**
    * The status of the node.
    */
  var Status: js.UndefOr[NodeStatus] = js.native
}

object NodeSummary {
  @scala.inline
  def apply(): NodeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeSummary]
  }
  @scala.inline
  implicit class NodeSummaryOps[Self <: NodeSummary] (val x: Self) extends AnyVal {
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
    def setAvailabilityZone(value: AvailabilityZoneString): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    @scala.inline
    def setCreationDate(value: Timestamp): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setId(value: ResourceIdString): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setInstanceType(value: InstanceTypeString): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    @scala.inline
    def setStatus(value: NodeStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

