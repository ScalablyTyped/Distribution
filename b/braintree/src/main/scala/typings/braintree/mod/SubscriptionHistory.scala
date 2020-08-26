package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionHistory extends js.Object {
  var balance: String = js.native
  var price: String = js.native
  var status: SubscriptionStatus = js.native
  var subscriptionSource: SubscriptionSource = js.native
}

object SubscriptionHistory {
  @scala.inline
  def apply(balance: String, price: String, status: SubscriptionStatus, subscriptionSource: SubscriptionSource): SubscriptionHistory = {
    val __obj = js.Dynamic.literal(balance = balance.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subscriptionSource = subscriptionSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionHistory]
  }
  @scala.inline
  implicit class SubscriptionHistoryOps[Self <: SubscriptionHistory] (val x: Self) extends AnyVal {
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
    def setBalance(value: String): Self = this.set("balance", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrice(value: String): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: SubscriptionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptionSource(value: SubscriptionSource): Self = this.set("subscriptionSource", value.asInstanceOf[js.Any])
  }
  
}

