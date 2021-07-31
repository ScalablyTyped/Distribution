package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectExplorerFindNodesResponse extends StObject {
  
  var nodes: js.Array[NodeInfo]
}
object ObjectExplorerFindNodesResponse {
  
  @scala.inline
  def apply(nodes: js.Array[NodeInfo]): ObjectExplorerFindNodesResponse = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExplorerFindNodesResponse]
  }
  
  @scala.inline
  implicit class ObjectExplorerFindNodesResponseMutableBuilder[Self <: ObjectExplorerFindNodesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodes(value: js.Array[NodeInfo]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: NodeInfo*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
