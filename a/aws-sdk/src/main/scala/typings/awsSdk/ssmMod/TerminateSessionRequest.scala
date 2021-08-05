package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateSessionRequest extends StObject {
  
  /**
    * The ID of the session to terminate.
    */
  var SessionId: typings.awsSdk.ssmMod.SessionId
}
object TerminateSessionRequest {
  
  inline def apply(SessionId: SessionId): TerminateSessionRequest = {
    val __obj = js.Dynamic.literal(SessionId = SessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateSessionRequest]
  }
  
  extension [Self <: TerminateSessionRequest](x: Self) {
    
    inline def setSessionId(value: SessionId): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
  }
}
