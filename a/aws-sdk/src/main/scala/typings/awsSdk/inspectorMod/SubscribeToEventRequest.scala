package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscribeToEventRequest extends StObject {
  
  /**
    * The event for which you want to receive SNS notifications.
    */
  var event: InspectorEvent = js.native
  
  /**
    * The ARN of the assessment template that is used during the event for which you want to receive SNS notifications.
    */
  var resourceArn: Arn = js.native
  
  /**
    * The ARN of the SNS topic to which the SNS notifications are sent.
    */
  var topicArn: Arn = js.native
}
object SubscribeToEventRequest {
  
  @scala.inline
  def apply(event: InspectorEvent, resourceArn: Arn, topicArn: Arn): SubscribeToEventRequest = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], topicArn = topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeToEventRequest]
  }
  
  @scala.inline
  implicit class SubscribeToEventRequestMutableBuilder[Self <: SubscribeToEventRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: InspectorEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArn(value: Arn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicArn(value: Arn): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
  }
}
