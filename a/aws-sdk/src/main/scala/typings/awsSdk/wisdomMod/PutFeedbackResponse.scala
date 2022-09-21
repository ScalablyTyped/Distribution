package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutFeedbackResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Wisdom assistant.
    */
  var assistantArn: UuidOrArn
  
  /**
    * The identifier of the Wisdom assistant.
    */
  var assistantId: Uuid
  
  /**
    * The feedback.
    */
  var feedback: FeedbackData
  
  /**
    * The identifier of a recommendation. or The identifier of the result data.
    */
  var targetId: Uuid
  
  /**
    * The type of the targetId for which The feedback. is targeted.
    */
  var targetType: TargetType
}
object PutFeedbackResponse {
  
  inline def apply(
    assistantArn: UuidOrArn,
    assistantId: Uuid,
    feedback: FeedbackData,
    targetId: Uuid,
    targetType: TargetType
  ): PutFeedbackResponse = {
    val __obj = js.Dynamic.literal(assistantArn = assistantArn.asInstanceOf[js.Any], assistantId = assistantId.asInstanceOf[js.Any], feedback = feedback.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutFeedbackResponse]
  }
  
  extension [Self <: PutFeedbackResponse](x: Self) {
    
    inline def setAssistantArn(value: UuidOrArn): Self = StObject.set(x, "assistantArn", value.asInstanceOf[js.Any])
    
    inline def setAssistantId(value: Uuid): Self = StObject.set(x, "assistantId", value.asInstanceOf[js.Any])
    
    inline def setFeedback(value: FeedbackData): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    inline def setTargetId(value: Uuid): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTargetType(value: TargetType): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
  }
}
