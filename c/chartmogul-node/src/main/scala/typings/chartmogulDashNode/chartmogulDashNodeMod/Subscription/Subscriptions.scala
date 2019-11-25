package typings.chartmogulDashNode.chartmogulDashNodeMod.Subscription

import typings.chartmogulDashNode.commonMod.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscriptions extends Cursor {
  var customer_uuid: js.UndefOr[String] = js.undefined
  var subscriptions: js.Array[typings.chartmogulDashNode.chartmogulDashNodeMod.Subscription.Subscription]
}

object Subscriptions {
  @scala.inline
  def apply(
    subscriptions: js.Array[typings.chartmogulDashNode.chartmogulDashNodeMod.Subscription.Subscription],
    current_page: Int | Double = null,
    customer_uuid: String = null,
    has_more: js.UndefOr[Boolean] = js.undefined,
    page: Int | Double = null,
    per_page: Int | Double = null,
    total_pages: Int | Double = null
  ): Subscriptions = {
    val __obj = js.Dynamic.literal(subscriptions = subscriptions.asInstanceOf[js.Any])
    if (current_page != null) __obj.updateDynamic("current_page")(current_page.asInstanceOf[js.Any])
    if (customer_uuid != null) __obj.updateDynamic("customer_uuid")(customer_uuid.asInstanceOf[js.Any])
    if (!js.isUndefined(has_more)) __obj.updateDynamic("has_more")(has_more.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (total_pages != null) __obj.updateDynamic("total_pages")(total_pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscriptions]
  }
}

