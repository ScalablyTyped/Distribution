package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNodeInput extends StObject {
  
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
  
  @scala.inline
  implicit class GetNodeInputMutableBuilder[Self <: GetNodeInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemberId(value: ResourceIdString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeId(value: ResourceIdString): Self = StObject.set(x, "NodeId", value.asInstanceOf[js.Any])
  }
}
