package typings.chartmogulNode.mod.Subscription

import typings.chartmogulNode.commonMod.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscriptions extends Cursor {
  var customer_uuid: js.UndefOr[String] = js.native
  var subscriptions: js.Array[typings.chartmogulNode.mod.Subscription.Subscription] = js.native
}

object Subscriptions {
  @scala.inline
  def apply(subscriptions: js.Array[typings.chartmogulNode.mod.Subscription.Subscription]): Subscriptions = {
    val __obj = js.Dynamic.literal(subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscriptions]
  }
  @scala.inline
  implicit class SubscriptionsOps[Self <: Subscriptions] (val x: Self) extends AnyVal {
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
    def setSubscriptionsVarargs(value: typings.chartmogulNode.mod.Subscription.Subscription*): Self = this.set("subscriptions", js.Array(value :_*))
    @scala.inline
    def setSubscriptions(value: js.Array[typings.chartmogulNode.mod.Subscription.Subscription]): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomer_uuid(value: String): Self = this.set("customer_uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomer_uuid: Self = this.set("customer_uuid", js.undefined)
  }
  
}

