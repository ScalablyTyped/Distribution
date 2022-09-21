package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutFeedbackRequest extends StObject {
  
  /**
    * The identifier of the Wisdom assistant. Can be either the ID or the ARN. URLs cannot contain the ARN.
    */
  var assistantId: UuidOrArn
  
  /**
    * The feedback.
    */
  var feedback: FeedbackData
  
  /**
    * The identifier of a recommendation. or The identifier of the result data.
    */
  var targetId: String
  
  /**
    * The type of the targetId for which The feedback. is targeted.
    */
  var targetType: TargetType
}
object PutFeedbackRequest {
  
  inline def apply(assistantId: UuidOrArn, feedback: FeedbackData, targetId: String, targetType: TargetType): PutFeedbackRequest = {
    val __obj = js.Dynamic.literal(assistantId = assistantId.asInstanceOf[js.Any], feedback = feedback.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutFeedbackRequest]
  }
  
  extension [Self <: PutFeedbackRequest](x: Self) {
    
    inline def setAssistantId(value: UuidOrArn): Self = StObject.set(x, "assistantId", value.asInstanceOf[js.Any])
    
    inline def setFeedback(value: FeedbackData): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTargetType(value: TargetType): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
  }
}
