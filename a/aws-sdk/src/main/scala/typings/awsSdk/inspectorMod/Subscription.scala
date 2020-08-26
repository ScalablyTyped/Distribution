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
  @scala.inline
  implicit class SubscriptionOps[Self <: Subscription] (val x: Self) extends AnyVal {
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
    def setEventSubscriptionsVarargs(value: EventSubscription*): Self = this.set("eventSubscriptions", js.Array(value :_*))
    @scala.inline
    def setEventSubscriptions(value: EventSubscriptionList): Self = this.set("eventSubscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceArn(value: Arn): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopicArn(value: Arn): Self = this.set("topicArn", value.asInstanceOf[js.Any])
  }
  
}

