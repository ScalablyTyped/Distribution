package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelStatementRequest extends StObject {
  
  /**
    * The ID of the statement to be cancelled.
    */
  var Id: IntegerValue
  
  /**
    * The origin of the request to cancel the statement.
    */
  var RequestOrigin: js.UndefOr[OrchestrationNameString] = js.undefined
  
  /**
    * The Session ID of the statement to be cancelled.
    */
  var SessionId: NameString
}
object CancelStatementRequest {
  
  inline def apply(Id: IntegerValue, SessionId: NameString): CancelStatementRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], SessionId = SessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelStatementRequest]
  }
  
  extension [Self <: CancelStatementRequest](x: Self) {
    
    inline def setId(value: IntegerValue): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setRequestOrigin(value: OrchestrationNameString): Self = StObject.set(x, "RequestOrigin", value.asInstanceOf[js.Any])
    
    inline def setRequestOriginUndefined: Self = StObject.set(x, "RequestOrigin", js.undefined)
    
    inline def setSessionId(value: NameString): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
  }
}
