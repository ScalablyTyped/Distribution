package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNodeInput extends js.Object {
  /**
    * The unique identifier of the member that owns this node.
    */
  var MemberId: ResourceIdString = js.native
  /**
    * The unique identifier of the network that the node belongs to.
    */
  var NetworkId: ResourceIdString = js.native
  /**
    * The unique identifier of the node.
    */
  var NodeId: ResourceIdString = js.native
}

object DeleteNodeInput {
  @scala.inline
  def apply(MemberId: ResourceIdString, NetworkId: ResourceIdString, NodeId: ResourceIdString): DeleteNodeInput = {
    val __obj = js.Dynamic.literal(MemberId = MemberId.asInstanceOf[js.Any], NetworkId = NetworkId.asInstanceOf[js.Any], NodeId = NodeId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteNodeInput]
  }
}

