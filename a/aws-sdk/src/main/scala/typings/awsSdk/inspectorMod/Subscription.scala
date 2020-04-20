package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscription extends js.Object {
  /**
    * The list of existing event subscriptions.
    */
  var eventSubscriptions: EventSubscriptionList = js.native
  /**
    * The ARN of the assessment template that is used during the event for which the SNS notification is sent.
    */
  var resourceArn: Arn = js.native
  /**
    * The ARN of the Amazon Simple Notification Service (SNS) topic to which the SNS notifications are sent.
    */
  var topicArn: Arn = js.native
}

object Subscription {
  @scala.inline
  def apply(eventSubscriptions: EventSubscriptionList, resourceArn: Arn, topicArn: Arn): Subscription = {
    val __obj = js.Dynamic.literal(eventSubscriptions = eventSubscriptions.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], topicArn = topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
}

