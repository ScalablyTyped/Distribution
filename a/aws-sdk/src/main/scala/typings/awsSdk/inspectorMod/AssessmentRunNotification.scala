package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssessmentRunNotification extends StObject {
  
  /**
    * The date of the notification.
    */
  var date: js.Date
  
  /**
    * The Boolean value that specifies whether the notification represents an error.
    */
  var error: Bool
  
  /**
    * The event for which a notification is sent.
    */
  var event: InspectorEvent
  
  /**
    * The message included in the notification.
    */
  var message: js.UndefOr[Message] = js.undefined
  
  /**
    * The status code of the SNS notification.
    */
  var snsPublishStatusCode: js.UndefOr[AssessmentRunNotificationSnsStatusCode] = js.undefined
  
  /**
    * The SNS topic to which the SNS notification is sent.
    */
  var snsTopicArn: js.UndefOr[Arn] = js.undefined
}
object AssessmentRunNotification {
  
  inline def apply(date: js.Date, error: Bool, event: InspectorEvent): AssessmentRunNotification = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentRunNotification]
  }
  
  extension [Self <: AssessmentRunNotification](x: Self) {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setError(value: Bool): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: InspectorEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setSnsPublishStatusCode(value: AssessmentRunNotificationSnsStatusCode): Self = StObject.set(x, "snsPublishStatusCode", value.asInstanceOf[js.Any])
    
    inline def setSnsPublishStatusCodeUndefined: Self = StObject.set(x, "snsPublishStatusCode", js.undefined)
    
    inline def setSnsTopicArn(value: Arn): Self = StObject.set(x, "snsTopicArn", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicArnUndefined: Self = StObject.set(x, "snsTopicArn", js.undefined)
  }
}
