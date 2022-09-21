package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeClusterMessage extends StObject {
  
  /**
    * A boolean value indicating whether the resize operation is using the classic resize process. If you don't provide this parameter or set the value to false, the resize type is elastic. 
    */
  var Classic: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The unique identifier for the cluster to resize.
    */
  var ClusterIdentifier: String
  
  /**
    * The new cluster type for the specified cluster.
    */
  var ClusterType: js.UndefOr[String] = js.undefined
  
  /**
    * The new node type for the nodes you are adding. If not specified, the cluster's current node type is used.
    */
  var NodeType: js.UndefOr[String] = js.undefined
  
  /**
    * The new number of nodes for the cluster. If not specified, the cluster's current number of nodes is used.
    */
  var NumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The identifier of the reserved node.
    */
  var ReservedNodeId: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the target reserved node offering.
    */
  var TargetReservedNodeOfferingId: js.UndefOr[String] = js.undefined
}
object ResizeClusterMessage {
  
  inline def apply(ClusterIdentifier: String): ResizeClusterMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeClusterMessage]
  }
  
  extension [Self <: ResizeClusterMessage](x: Self) {
    
    inline def setClassic(value: BooleanOptional): Self = StObject.set(x, "Classic", value.asInstanceOf[js.Any])
    
    inline def setClassicUndefined: Self = StObject.set(x, "Classic", js.undefined)
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setClusterType(value: String): Self = StObject.set(x, "ClusterType", value.asInstanceOf[js.Any])
    
    inline def setClusterTypeUndefined: Self = StObject.set(x, "ClusterType", js.undefined)
    
    inline def setNodeType(value: String): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
    
    inline def setNumberOfNodes(value: IntegerOptional): Self = StObject.set(x, "NumberOfNodes", value.asInstanceOf[js.Any])
    
    inline def setNumberOfNodesUndefined: Self = StObject.set(x, "NumberOfNodes", js.undefined)
    
    inline def setReservedNodeId(value: String): Self = StObject.set(x, "ReservedNodeId", value.asInstanceOf[js.Any])
    
    inline def setReservedNodeIdUndefined: Self = StObject.set(x, "ReservedNodeId", js.undefined)
    
    inline def setTargetReservedNodeOfferingId(value: String): Self = StObject.set(x, "TargetReservedNodeOfferingId", value.asInstanceOf[js.Any])
    
    inline def setTargetReservedNodeOfferingIdUndefined: Self = StObject.set(x, "TargetReservedNodeOfferingId", js.undefined)
  }
}
