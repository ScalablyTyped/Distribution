package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNodeInput extends StObject {
  
  /**
    * The unique identifier of the member that owns this node.
    */
  var MemberId: ResourceIdString
  
  /**
    * The unique identifier of the network that the node belongs to.
    */
  var NetworkId: ResourceIdString
  
  /**
    * The unique identifier of the node.
    */
  var NodeId: ResourceIdString
}
object DeleteNodeInput {
  
  inline def apply(MemberId: ResourceIdString, NetworkId: ResourceIdString, NodeId: ResourceIdString): DeleteNodeInput = {
    val __obj = js.Dynamic.literal(MemberId = MemberId.asInstanceOf[js.Any], NetworkId = NetworkId.asInstanceOf[js.Any], NodeId = NodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNodeInput]
  }
  
  extension [Self <: DeleteNodeInput](x: Self) {
    
    inline def setMemberId(value: ResourceIdString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    inline def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: ResourceIdString): Self = StObject.set(x, "NodeId", value.asInstanceOf[js.Any])
  }
}
