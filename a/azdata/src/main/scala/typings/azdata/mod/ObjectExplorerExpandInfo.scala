package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectExplorerExpandInfo extends StObject {
  
  var errorMessage: String
  
  var nodePath: String
  
  var nodes: js.Array[NodeInfo]
  
  var sessionId: String
}
object ObjectExplorerExpandInfo {
  
  inline def apply(errorMessage: String, nodePath: String, nodes: js.Array[NodeInfo], sessionId: String): ObjectExplorerExpandInfo = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], nodePath = nodePath.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExplorerExpandInfo]
  }
  
  extension [Self <: ObjectExplorerExpandInfo](x: Self) {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setNodePath(value: String): Self = StObject.set(x, "nodePath", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: js.Array[NodeInfo]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: NodeInfo*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
