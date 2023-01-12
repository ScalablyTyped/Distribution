package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSessionRequest extends StObject {
  
  /**
    * The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
    */
  var assistantId: UuidOrArn
  
  /**
    * The identifier of the session. Can be either the ID or the ARN. URLs cannot contain the ARN.
    */
  var sessionId: UuidOrArn
}
object GetSessionRequest {
  
  inline def apply(assistantId: UuidOrArn, sessionId: UuidOrArn): GetSessionRequest = {
    val __obj = js.Dynamic.literal(assistantId = assistantId.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSessionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSessionRequest] (val x: Self) extends AnyVal {
    
    inline def setAssistantId(value: UuidOrArn): Self = StObject.set(x, "assistantId", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: UuidOrArn): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
