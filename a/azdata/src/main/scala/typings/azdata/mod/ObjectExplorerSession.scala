package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectExplorerSession extends StObject {
  
  var errorMessage: String = js.native
  
  var rootNode: NodeInfo = js.native
  
  var sessionId: String = js.native
  
  var success: Boolean = js.native
}
object ObjectExplorerSession {
  
  @scala.inline
  def apply(errorMessage: String, rootNode: NodeInfo, sessionId: String, success: Boolean): ObjectExplorerSession = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], rootNode = rootNode.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExplorerSession]
  }
  
  @scala.inline
  implicit class ObjectExplorerSessionMutableBuilder[Self <: ObjectExplorerSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNode(value: NodeInfo): Self = StObject.set(x, "rootNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
