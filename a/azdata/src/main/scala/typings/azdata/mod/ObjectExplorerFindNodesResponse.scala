package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectExplorerFindNodesResponse extends StObject {
  
  var nodes: js.Array[NodeInfo]
}
object ObjectExplorerFindNodesResponse {
  
  inline def apply(nodes: js.Array[NodeInfo]): ObjectExplorerFindNodesResponse = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExplorerFindNodesResponse]
  }
  
  extension [Self <: ObjectExplorerFindNodesResponse](x: Self) {
    
    inline def setNodes(value: js.Array[NodeInfo]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: NodeInfo*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
