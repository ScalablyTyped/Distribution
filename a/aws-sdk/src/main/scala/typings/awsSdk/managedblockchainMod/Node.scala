package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  /**
    * The Availability Zone in which the node exists.
    */
  var AvailabilityZone: js.UndefOr[AvailabilityZoneString] = js.native
  /**
    * The date and time that the node was created.
    */
  var CreationDate: js.UndefOr[Timestamp] = js.native
  /**
    * Attributes of the blockchain framework being used.
    */
  var FrameworkAttributes: js.UndefOr[NodeFrameworkAttributes] = js.native
  /**
    * The unique identifier of the node.
    */
  var Id: js.UndefOr[ResourceIdString] = js.native
  /**
    * The instance type of the node.
    */
  var InstanceType: js.UndefOr[InstanceTypeString] = js.native
  /**
    * 
    */
  var LogPublishingConfiguration: js.UndefOr[NodeLogPublishingConfiguration] = js.native
  /**
    * The unique identifier of the member to which the node belongs.
    */
  var MemberId: js.UndefOr[ResourceIdString] = js.native
  /**
    * The unique identifier of the network that the node is in.
    */
  var NetworkId: js.UndefOr[ResourceIdString] = js.native
  /**
    * The status of the node.
    */
  var Status: js.UndefOr[NodeStatus] = js.native
}

object Node {
  @scala.inline
  def apply(): Node = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
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
    def setFrameworkAttributes(value: NodeFrameworkAttributes): Self = this.set("FrameworkAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameworkAttributes: Self = this.set("FrameworkAttributes", js.undefined)
    @scala.inline
    def setId(value: ResourceIdString): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setInstanceType(value: InstanceTypeString): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    @scala.inline
    def setLogPublishingConfiguration(value: NodeLogPublishingConfiguration): Self = this.set("LogPublishingConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogPublishingConfiguration: Self = this.set("LogPublishingConfiguration", js.undefined)
    @scala.inline
    def setMemberId(value: ResourceIdString): Self = this.set("MemberId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberId: Self = this.set("MemberId", js.undefined)
    @scala.inline
    def setNetworkId(value: ResourceIdString): Self = this.set("NetworkId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkId: Self = this.set("NetworkId", js.undefined)
    @scala.inline
    def setStatus(value: NodeStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

