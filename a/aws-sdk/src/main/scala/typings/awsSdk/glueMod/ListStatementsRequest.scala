package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStatementsRequest extends StObject {
  
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[OrchestrationToken] = js.undefined
  
  /**
    * The origin of the request to list statements.
    */
  var RequestOrigin: js.UndefOr[OrchestrationNameString] = js.undefined
  
  /**
    * The Session ID of the statements.
    */
  var SessionId: NameString
}
object ListStatementsRequest {
  
  inline def apply(SessionId: NameString): ListStatementsRequest = {
    val __obj = js.Dynamic.literal(SessionId = SessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStatementsRequest]
  }
  
  extension [Self <: ListStatementsRequest](x: Self) {
    
    inline def setNextToken(value: OrchestrationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRequestOrigin(value: OrchestrationNameString): Self = StObject.set(x, "RequestOrigin", value.asInstanceOf[js.Any])
    
    inline def setRequestOriginUndefined: Self = StObject.set(x, "RequestOrigin", js.undefined)
    
    inline def setSessionId(value: NameString): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
  }
}
