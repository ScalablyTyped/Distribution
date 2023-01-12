package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Wisdom assistant.
    */
  var assistantArn: Arn
  
  /**
    * The identifier of the Wisdom assistant.
    */
  var assistantId: Uuid
  
  /**
    * The Amazon Resource Name (ARN) of the session.
    */
  var sessionArn: Arn
  
  /**
    * The identifier of the session.
    */
  var sessionId: Uuid
}
object SessionSummary {
  
  inline def apply(assistantArn: Arn, assistantId: Uuid, sessionArn: Arn, sessionId: Uuid): SessionSummary = {
    val __obj = js.Dynamic.literal(assistantArn = assistantArn.asInstanceOf[js.Any], assistantId = assistantId.asInstanceOf[js.Any], sessionArn = sessionArn.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SessionSummary] (val x: Self) extends AnyVal {
    
    inline def setAssistantArn(value: Arn): Self = StObject.set(x, "assistantArn", value.asInstanceOf[js.Any])
    
    inline def setAssistantId(value: Uuid): Self = StObject.set(x, "assistantId", value.asInstanceOf[js.Any])
    
    inline def setSessionArn(value: Arn): Self = StObject.set(x, "sessionArn", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: Uuid): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
