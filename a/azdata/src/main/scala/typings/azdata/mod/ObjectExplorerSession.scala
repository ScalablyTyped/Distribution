package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectExplorerSession extends StObject {
  
  var errorMessage: js.UndefOr[String] = js.undefined
  
  var rootNode: NodeInfo
  
  var sessionId: js.UndefOr[String] = js.undefined
  
  var success: Boolean
}
object ObjectExplorerSession {
  
  inline def apply(rootNode: NodeInfo, success: Boolean): ObjectExplorerSession = {
    val __obj = js.Dynamic.literal(rootNode = rootNode.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExplorerSession]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectExplorerSession] (val x: Self) extends AnyVal {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setRootNode(value: NodeInfo): Self = StObject.set(x, "rootNode", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
