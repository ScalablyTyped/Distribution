package typings.chartmogulNode.mod.Subscription

import typings.chartmogulNode.commonMod.Strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelSubscriptionParams extends js.Object {
  var cancellation_dates: js.UndefOr[Strings] = js.native
  var cancelled_at: js.UndefOr[String] = js.native
}

object CancelSubscriptionParams {
  @scala.inline
  def apply(): CancelSubscriptionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelSubscriptionParams]
  }
  @scala.inline
  implicit class CancelSubscriptionParamsOps[Self <: CancelSubscriptionParams] (val x: Self) extends AnyVal {
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
    def setCancellation_datesVarargs(value: String*): Self = this.set("cancellation_dates", js.Array(value :_*))
    @scala.inline
    def setCancellation_dates(value: Strings): Self = this.set("cancellation_dates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancellation_dates: Self = this.set("cancellation_dates", js.undefined)
    @scala.inline
    def setCancelled_at(value: String): Self = this.set("cancelled_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelled_at: Self = this.set("cancelled_at", js.undefined)
  }
  
}

