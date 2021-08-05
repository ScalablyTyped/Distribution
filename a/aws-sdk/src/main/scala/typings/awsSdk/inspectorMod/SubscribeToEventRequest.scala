package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscribeToEventRequest extends StObject {
  
  /**
    * The event for which you want to receive SNS notifications.
    */
  var event: InspectorEvent
  
  /**
    * The ARN of the assessment template that is used during the event for which you want to receive SNS notifications.
    */
  var resourceArn: Arn
  
  /**
    * The ARN of the SNS topic to which the SNS notifications are sent.
    */
  var topicArn: Arn
}
object SubscribeToEventRequest {
  
  inline def apply(event: InspectorEvent, resourceArn: Arn, topicArn: Arn): SubscribeToEventRequest = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], topicArn = topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeToEventRequest]
  }
  
  extension [Self <: SubscribeToEventRequest](x: Self) {
    
    inline def setEvent(value: InspectorEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setTopicArn(value: Arn): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
  }
}
