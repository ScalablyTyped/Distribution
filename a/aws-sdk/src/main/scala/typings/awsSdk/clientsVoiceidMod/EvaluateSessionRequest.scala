package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluateSessionRequest extends StObject {
  
  /**
    * The identifier of the domain where the session started.
    */
  var DomainId: typings.awsSdk.clientsVoiceidMod.DomainId
  
  /**
    * The session identifier, or name of the session, that you want to evaluate. In Voice ID integration, this is the Contact-Id.
    */
  var SessionNameOrId: typings.awsSdk.clientsVoiceidMod.SessionNameOrId
}
object EvaluateSessionRequest {
  
  inline def apply(DomainId: DomainId, SessionNameOrId: SessionNameOrId): EvaluateSessionRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], SessionNameOrId = SessionNameOrId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateSessionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluateSessionRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setSessionNameOrId(value: SessionNameOrId): Self = StObject.set(x, "SessionNameOrId", value.asInstanceOf[js.Any])
  }
}
