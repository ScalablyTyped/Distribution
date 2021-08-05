package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectExplorerCloseSessionInfo extends StObject {
  
  var sessionId: String
}
object ObjectExplorerCloseSessionInfo {
  
  inline def apply(sessionId: String): ObjectExplorerCloseSessionInfo = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExplorerCloseSessionInfo]
  }
  
  extension [Self <: ObjectExplorerCloseSessionInfo](x: Self) {
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
