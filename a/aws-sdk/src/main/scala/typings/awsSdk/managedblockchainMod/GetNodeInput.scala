package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNodeInput extends js.Object {
  /**
    * The unique identifier of the member that owns the node.
    */
  var MemberId: ResourceIdString = js.native
  /**
    * The unique identifier of the network to which the node belongs.
    */
  var NetworkId: ResourceIdString = js.native
  /**
    * The unique identifier of the node.
    */
  var NodeId: ResourceIdString = js.native
}

object GetNodeInput {
  @scala.inline
  def apply(MemberId: ResourceIdString, NetworkId: ResourceIdString, NodeId: ResourceIdString): GetNodeInput = {
    val __obj = js.Dynamic.literal(MemberId = MemberId.asInstanceOf[js.Any], NetworkId = NetworkId.asInstanceOf[js.Any], NodeId = NodeId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetNodeInput]
  }
}

