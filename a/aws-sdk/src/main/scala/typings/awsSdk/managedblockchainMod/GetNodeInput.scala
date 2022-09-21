package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNodeInput extends StObject {
  
  /**
    * The unique identifier of the member that owns the node. Applies only to Hyperledger Fabric and is required for Hyperledger Fabric.
    */
  var MemberId: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    * The unique identifier of the network that the node is on.
    */
  var NetworkId: ResourceIdString
  
  /**
    * The unique identifier of the node.
    */
  var NodeId: ResourceIdString
}
object GetNodeInput {
  
  inline def apply(NetworkId: ResourceIdString, NodeId: ResourceIdString): GetNodeInput = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId.asInstanceOf[js.Any], NodeId = NodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNodeInput]
  }
  
  extension [Self <: GetNodeInput](x: Self) {
    
    inline def setMemberId(value: ResourceIdString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    inline def setMemberIdUndefined: Self = StObject.set(x, "MemberId", js.undefined)
    
    inline def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: ResourceIdString): Self = StObject.set(x, "NodeId", value.asInstanceOf[js.Any])
  }
}
