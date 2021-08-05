package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNodeInput extends StObject {
  
  /**
    * Configuration properties for publishing to Amazon CloudWatch Logs.
    */
  var LogPublishingConfiguration: js.UndefOr[NodeLogPublishingConfiguration] = js.undefined
  
  /**
    * The unique ID of the member that owns the node.
    */
  var MemberId: ResourceIdString
  
  /**
    * The unique ID of the Managed Blockchain network to which the node belongs.
    */
  var NetworkId: ResourceIdString
  
  /**
    * The unique ID of the node.
    */
  var NodeId: ResourceIdString
}
object UpdateNodeInput {
  
  inline def apply(MemberId: ResourceIdString, NetworkId: ResourceIdString, NodeId: ResourceIdString): UpdateNodeInput = {
    val __obj = js.Dynamic.literal(MemberId = MemberId.asInstanceOf[js.Any], NetworkId = NetworkId.asInstanceOf[js.Any], NodeId = NodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNodeInput]
  }
  
  extension [Self <: UpdateNodeInput](x: Self) {
    
    inline def setLogPublishingConfiguration(value: NodeLogPublishingConfiguration): Self = StObject.set(x, "LogPublishingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLogPublishingConfigurationUndefined: Self = StObject.set(x, "LogPublishingConfiguration", js.undefined)
    
    inline def setMemberId(value: ResourceIdString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    inline def setNetworkId(value: ResourceIdString): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: ResourceIdString): Self = StObject.set(x, "NodeId", value.asInstanceOf[js.Any])
  }
}
