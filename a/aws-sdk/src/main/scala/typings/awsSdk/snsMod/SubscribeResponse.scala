package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeResponse extends js.Object {
  /**
    * The ARN of the subscription if it is confirmed, or the string "pending confirmation" if the subscription requires confirmation. However, if the API request parameter ReturnSubscriptionArn is true, then the value is always the subscription ARN, even if the subscription requires confirmation.
    */
  var SubscriptionArn: js.UndefOr[subscriptionARN] = js.native
}

object SubscribeResponse {
  @scala.inline
  def apply(): SubscribeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeResponse]
  }
  @scala.inline
  implicit class SubscribeResponseOps[Self <: SubscribeResponse] (val x: Self) extends AnyVal {
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

