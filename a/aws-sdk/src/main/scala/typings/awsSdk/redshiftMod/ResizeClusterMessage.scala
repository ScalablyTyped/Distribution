package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeClusterMessage extends js.Object {
  
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
  implicit class ResizeClusterMessageOps[Self <: ResizeClusterMessage] (val x: Self) extends AnyVal {
    
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
    def setClusterIdentifier(value: String): Self = this.set("ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassic(value: BooleanOptional): Self = this.set("Classic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassic: Self = this.set("Classic", js.undefined)
    
    @scala.inline
    def setClusterType(value: String): Self = this.set("ClusterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterType: Self = this.set("ClusterType", js.undefined)
    
    @scala.inline
    def setNodeType(value: String): Self = this.set("NodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeType: Self = this.set("NodeType", js.undefined)
    
    @scala.inline
    def setNumberOfNodes(value: Integer): Self = this.set("NumberOfNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfNodes: Self = this.set("NumberOfNodes", js.undefined)
  }
}
