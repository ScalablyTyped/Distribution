package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNodeInput extends js.Object {
  /**
    * Configuration properties for publishing to Amazon CloudWatch Logs.
    */
  var LogPublishingConfiguration: js.UndefOr[NodeLogPublishingConfiguration] = js.native
  /**
    * The unique ID of the member that owns the node.
    */
  var MemberId: ResourceIdString = js.native
  /**
    * The unique ID of the Managed Blockchain network to which the node belongs.
    */
  var NetworkId: ResourceIdString = js.native
  /**
    * The unique ID of the node.
    */
  var NodeId: ResourceIdString = js.native
}

object UpdateNodeInput {
  @scala.inline
  def apply(MemberId: ResourceIdString, NetworkId: ResourceIdString, NodeId: ResourceIdString): UpdateNodeInput = {
    val __obj = js.Dynamic.literal(MemberId = MemberId.asInstanceOf[js.Any], NetworkId = NetworkId.asInstanceOf[js.Any], NodeId = NodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNodeInput]
  }
  @scala.inline
  implicit class UpdateNodeInputOps[Self <: UpdateNodeInput] (val x: Self) extends AnyVal {
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
    def setMemberId(value: ResourceIdString): Self = this.set("MemberId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkId(value: ResourceIdString): Self = this.set("NetworkId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeId(value: ResourceIdString): Self = this.set("NodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogPublishingConfiguration(value: NodeLogPublishingConfiguration): Self = this.set("LogPublishingConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogPublishingConfiguration: Self = this.set("LogPublishingConfiguration", js.undefined)
  }
  
}

