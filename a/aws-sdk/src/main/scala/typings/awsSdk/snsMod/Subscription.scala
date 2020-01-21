package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscription extends js.Object {
  /**
    * The subscription's endpoint (format depends on the protocol).
    */
  var Endpoint: js.UndefOr[endpoint] = js.native
  /**
    * The subscription's owner.
    */
  var Owner: js.UndefOr[account] = js.native
  /**
    * The subscription's protocol.
    */
  var Protocol: js.UndefOr[protocol] = js.native
  /**
    * The subscription's ARN.
    */
  var SubscriptionArn: js.UndefOr[subscriptionARN] = js.native
  /**
    * The ARN of the subscription's topic.
    */
  var TopicArn: js.UndefOr[topicARN] = js.native
}

object Subscription {
  @scala.inline
  def apply(
    Endpoint: endpoint = null,
    Owner: account = null,
    Protocol: protocol = null,
    SubscriptionArn: subscriptionARN = null,
    TopicArn: topicARN = null
  ): Subscription = {
    val __obj = js.Dynamic.literal()
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    if (SubscriptionArn != null) __obj.updateDynamic("SubscriptionArn")(SubscriptionArn.asInstanceOf[js.Any])
    if (TopicArn != null) __obj.updateDynamic("TopicArn")(TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
}

