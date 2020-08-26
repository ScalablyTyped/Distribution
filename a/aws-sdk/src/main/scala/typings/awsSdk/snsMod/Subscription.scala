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
  def apply(): Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscription]
  }
  @scala.inline
  implicit class SubscriptionOps[Self <: Subscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndpoint(value: endpoint): Self = this.set("Endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("Endpoint", js.undefined)
    @scala.inline
    def setOwner(value: account): Self = this.set("Owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
    @scala.inline
    def setProtocol(value: protocol): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("Protocol", js.undefined)
    @scala.inline
    def setSubscriptionArn(value: subscriptionARN): Self = this.set("SubscriptionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriptionArn: Self = this.set("SubscriptionArn", js.undefined)
    @scala.inline
    def setTopicArn(value: topicARN): Self = this.set("TopicArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicArn: Self = this.set("TopicArn", js.undefined)
  }
  
}

