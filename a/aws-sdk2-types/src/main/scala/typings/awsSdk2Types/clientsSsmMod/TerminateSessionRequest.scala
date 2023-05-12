package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateSessionRequest extends StObject {
  
  /**
    * The ID of the session to terminate.
    */
  var SessionId: typings.awsSdk2Types.clientsSsmMod.SessionId
}
object TerminateSessionRequest {
  
  inline def apply(SessionId: SessionId): TerminateSessionRequest = {
    val __obj = js.Dynamic.literal(SessionId = SessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateSessionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TerminateSessionRequest] (val x: Self) extends AnyVal {
    
    inline def setSessionId(value: SessionId): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
  }
}
