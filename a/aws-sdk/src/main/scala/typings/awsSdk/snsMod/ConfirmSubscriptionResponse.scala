package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmSubscriptionResponse extends js.Object {
  /**
    * The ARN of the created subscription.
    */
  var SubscriptionArn: js.UndefOr[subscriptionARN] = js.native
}

object ConfirmSubscriptionResponse {
  @scala.inline
  def apply(): ConfirmSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmSubscriptionResponse]
  }
  @scala.inline
  implicit class ConfirmSubscriptionResponseOps[Self <: ConfirmSubscriptionResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteSubscriptionArn: Self = this.set("SubscriptionArn", js.undefined)
  }
  
}

