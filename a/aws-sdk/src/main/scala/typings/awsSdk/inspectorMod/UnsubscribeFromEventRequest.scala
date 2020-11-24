package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnsubscribeFromEventRequest extends js.Object {
  
  /**
    * The event for which you want to stop receiving SNS notifications.
    */
  var event: InspectorEvent = js.native
  
  /**
    * The ARN of the assessment template that is used during the event for which you want to stop receiving SNS notifications.
    */
  var resourceArn: Arn = js.native
  
  /**
    * The ARN of the SNS topic to which SNS notifications are sent.
    */
  var topicArn: Arn = js.native
}
object UnsubscribeFromEventRequest {
  
  @scala.inline
  def apply(event: InspectorEvent, resourceArn: Arn, topicArn: Arn): UnsubscribeFromEventRequest = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], topicArn = topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsubscribeFromEventRequest]
  }
  
  @scala.inline
  implicit class UnsubscribeFromEventRequestOps[Self <: UnsubscribeFromEventRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEvent(value: InspectorEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArn(value: Arn): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicArn(value: Arn): Self = this.set("topicArn", value.asInstanceOf[js.Any])
  }
}
