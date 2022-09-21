package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectExplorerExpandInfo extends StObject {
  
  var errorMessage: js.UndefOr[String] = js.undefined
  
  var nodePath: String
  
  var nodes: js.Array[NodeInfo]
  
  var sessionId: js.UndefOr[String] = js.undefined
}
object ObjectExplorerExpandInfo {
  
  inline def apply(nodePath: String, nodes: js.Array[NodeInfo]): ObjectExplorerExpandInfo = {
    val __obj = js.Dynamic.literal(nodePath = nodePath.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExplorerExpandInfo]
  }
  
  extension [Self <: ObjectExplorerExpandInfo](x: Self) {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setNodePath(value: String): Self = StObject.set(x, "nodePath", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: js.Array[NodeInfo]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: NodeInfo*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
  }
}
