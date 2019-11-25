package typings.chartmogulDashNode.chartmogulDashNodeMod.Plan

import typings.chartmogulDashNode.commonMod.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plans extends Cursor {
  var plans: js.Array[typings.chartmogulDashNode.chartmogulDashNodeMod.Plan.Plan]
}

object Plans {
  @scala.inline
  def apply(
    plans: js.Array[typings.chartmogulDashNode.chartmogulDashNodeMod.Plan.Plan],
    current_page: Int | Double = null,
    has_more: js.UndefOr[Boolean] = js.undefined,
    page: Int | Double = null,
    per_page: Int | Double = null,
    total_pages: Int | Double = null
  ): Plans = {
    val __obj = js.Dynamic.literal(plans = plans.asInstanceOf[js.Any])
    if (current_page != null) __obj.updateDynamic("current_page")(current_page.asInstanceOf[js.Any])
    if (!js.isUndefined(has_more)) __obj.updateDynamic("has_more")(has_more.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (total_pages != null) __obj.updateDynamic("total_pages")(total_pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plans]
  }
}

