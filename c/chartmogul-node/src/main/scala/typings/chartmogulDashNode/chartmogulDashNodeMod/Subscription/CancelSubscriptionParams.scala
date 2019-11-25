package typings.chartmogulDashNode.chartmogulDashNodeMod.Subscription

import typings.chartmogulDashNode.commonMod.Strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelSubscriptionParams extends js.Object {
  var cancellation_dates: js.UndefOr[Strings] = js.undefined
  var cancelled_at: js.UndefOr[String] = js.undefined
}

object CancelSubscriptionParams {
  @scala.inline
  def apply(cancellation_dates: Strings = null, cancelled_at: String = null): CancelSubscriptionParams = {
    val __obj = js.Dynamic.literal()
    if (cancellation_dates != null) __obj.updateDynamic("cancellation_dates")(cancellation_dates.asInstanceOf[js.Any])
    if (cancelled_at != null) __obj.updateDynamic("cancelled_at")(cancelled_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelSubscriptionParams]
  }
}

