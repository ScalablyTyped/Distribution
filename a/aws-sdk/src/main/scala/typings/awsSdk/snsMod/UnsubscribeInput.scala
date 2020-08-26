package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsubscribeInput extends js.Object {
  /**
    * The ARN of the subscription to be deleted.
    */
  var SubscriptionArn: subscriptionARN = js.native
}

object UnsubscribeInput {
  @scala.inline
  def apply(SubscriptionArn: subscriptionARN): UnsubscribeInput = {
    val __obj = js.Dynamic.literal(SubscriptionArn = SubscriptionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsubscribeInput]
  }
  @scala.inline
  implicit class UnsubscribeInputOps[Self <: UnsubscribeInput] (val x: Self) extends AnyVal {
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
    def setSubscriptionArn(value: subscriptionARN): Self = this.set("SubscriptionArn", value.asInstanceOf[js.Any])
  }
  
}

