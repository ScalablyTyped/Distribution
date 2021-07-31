package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscription extends StObject {
  
  /**
    * The list of existing event subscriptions.
    */
  var eventSubscriptions: EventSubscriptionList
  
  /**
    * The ARN of the assessment template that is used during the event for which the SNS notification is sent.
    */
  var resourceArn: Arn
  
  /**
    * The ARN of the Amazon Simple Notification Service (SNS) topic to which the SNS notifications are sent.
    */
  var topicArn: Arn
}
object Subscription {
  
  @scala.inline
  def apply(eventSubscriptions: EventSubscriptionList, resourceArn: Arn, topicArn: Arn): Subscription = {
    val __obj = js.Dynamic.literal(eventSubscriptions = eventSubscriptions.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], topicArn = topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventSubscriptions(value: EventSubscriptionList): Self = StObject.set(x, "eventSubscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSubscriptionsVarargs(value: EventSubscription*): Self = StObject.set(x, "eventSubscriptions", js.Array(value :_*))
    
    @scala.inline
    def setResourceArn(value: Arn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicArn(value: Arn): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
  }
}
