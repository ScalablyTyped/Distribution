package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteNodeInput extends StObject {
  
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
  
  @scala.inline
  implicit class DeleteNodeInputMutableBuilder[Self <: DeleteNodeInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemberId(value: ResourceIdString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeId(value: ResourceIdString): Self = StObject.set(x, "NodeId", value.asInstanceOf[js.Any])
  }
}
