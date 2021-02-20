package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeClusterMessage extends StObject {
  
  /**
    * A boolean value indicating whether the resize operation is using the classic resize process. If you don't provide this parameter or set the value to false, the resize type is elastic. 
    */
  var Classic: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The unique identifier for the cluster to resize.
    */
  var ClusterIdentifier: String = js.native
  
  /**
    * The new cluster type for the specified cluster.
    */
  var ClusterType: js.UndefOr[String] = js.native
  
  /**
    * The new node type for the nodes you are adding. If not specified, the cluster's current node type is used.
    */
  var NodeType: js.UndefOr[String] = js.native
  
  /**
    * The new number of nodes for the cluster. If not specified, the cluster's current number of nodes is used.
    */
  var NumberOfNodes: js.UndefOr[Integer] = js.native
}
object ResizeClusterMessage {
  
  @scala.inline
  def apply(ClusterIdentifier: String): ResizeClusterMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeClusterMessage]
  }
  
  @scala.inline
  implicit class ResizeClusterMessageMutableBuilder[Self <: ResizeClusterMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassic(value: BooleanOptional): Self = StObject.set(x, "Classic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassicUndefined: Self = StObject.set(x, "Classic", js.undefined)
    
    @scala.inline
    def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterType(value: String): Self = StObject.set(x, "ClusterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterTypeUndefined: Self = StObject.set(x, "ClusterType", js.undefined)
    
    @scala.inline
    def setNodeType(value: String): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
    
    @scala.inline
    def setNumberOfNodes(value: Integer): Self = StObject.set(x, "NumberOfNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfNodesUndefined: Self = StObject.set(x, "NumberOfNodes", js.undefined)
  }
}
