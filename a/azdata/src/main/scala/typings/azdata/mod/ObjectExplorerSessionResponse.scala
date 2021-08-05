package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectExplorerSessionResponse extends StObject {
  
  var sessionId: String
}
object ObjectExplorerSessionResponse {
  
  inline def apply(sessionId: String): ObjectExplorerSessionResponse = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExplorerSessionResponse]
  }
  
  extension [Self <: ObjectExplorerSessionResponse](x: Self) {
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
