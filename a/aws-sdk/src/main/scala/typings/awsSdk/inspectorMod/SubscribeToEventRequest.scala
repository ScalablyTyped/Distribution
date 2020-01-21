package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeToEventRequest extends js.Object {
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
}

