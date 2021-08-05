package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectExplorerCloseSessionResponse extends StObject {
  
  var sessionId: String
  
  var success: Boolean
}
object ObjectExplorerCloseSessionResponse {
  
  inline def apply(sessionId: String, success: Boolean): ObjectExplorerCloseSessionResponse = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExplorerCloseSessionResponse]
  }
  
  extension [Self <: ObjectExplorerCloseSessionResponse](x: Self) {
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
