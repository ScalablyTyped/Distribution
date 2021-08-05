package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectExplorerSession extends StObject {
  
  var errorMessage: String
  
  var rootNode: NodeInfo
  
  var sessionId: String
  
  var success: Boolean
}
object ObjectExplorerSession {
  
  inline def apply(errorMessage: String, rootNode: NodeInfo, sessionId: String, success: Boolean): ObjectExplorerSession = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], rootNode = rootNode.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExplorerSession]
  }
  
  extension [Self <: ObjectExplorerSession](x: Self) {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setRootNode(value: NodeInfo): Self = StObject.set(x, "rootNode", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
