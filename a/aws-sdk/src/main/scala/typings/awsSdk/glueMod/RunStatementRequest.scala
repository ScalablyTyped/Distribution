package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunStatementRequest extends StObject {
  
  /**
    * The statement code to be run.
    */
  var Code: OrchestrationStatementCodeString
  
  /**
    * The origin of the request.
    */
  var RequestOrigin: js.UndefOr[OrchestrationNameString] = js.undefined
  
  /**
    * The Session Id of the statement to be run.
    */
  var SessionId: NameString
}
object RunStatementRequest {
  
  inline def apply(Code: OrchestrationStatementCodeString, SessionId: NameString): RunStatementRequest = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], SessionId = SessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunStatementRequest]
  }
  
  extension [Self <: RunStatementRequest](x: Self) {
    
    inline def setCode(value: OrchestrationStatementCodeString): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setRequestOrigin(value: OrchestrationNameString): Self = StObject.set(x, "RequestOrigin", value.asInstanceOf[js.Any])
    
    inline def setRequestOriginUndefined: Self = StObject.set(x, "RequestOrigin", js.undefined)
    
    inline def setSessionId(value: NameString): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
  }
}
