package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectExplorerCloseSessionResponse extends StObject {
  
  var sessionId: String = js.native
  
  var success: Boolean = js.native
}
object ObjectExplorerCloseSessionResponse {
  
  @scala.inline
  def apply(sessionId: String, success: Boolean): ObjectExplorerCloseSessionResponse = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExplorerCloseSessionResponse]
  }
  
  @scala.inline
  implicit class ObjectExplorerCloseSessionResponseMutableBuilder[Self <: ObjectExplorerCloseSessionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
