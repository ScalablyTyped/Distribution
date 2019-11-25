package typings.chartmogulDashNode.chartmogulDashNodeMod.Invoice

import typings.chartmogulDashNode.commonMod.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invoices extends Cursor {
  var customer_uuid: js.UndefOr[String] = js.undefined
  var invoices: js.Array[typings.chartmogulDashNode.chartmogulDashNodeMod.Invoice.Invoice]
}

object Invoices {
  @scala.inline
  def apply(
    invoices: js.Array[typings.chartmogulDashNode.chartmogulDashNodeMod.Invoice.Invoice],
    current_page: Int | Double = null,
    customer_uuid: String = null,
    has_more: js.UndefOr[Boolean] = js.undefined,
    page: Int | Double = null,
    per_page: Int | Double = null,
    total_pages: Int | Double = null
  ): Invoices = {
    val __obj = js.Dynamic.literal(invoices = invoices.asInstanceOf[js.Any])
    if (current_page != null) __obj.updateDynamic("current_page")(current_page.asInstanceOf[js.Any])
    if (customer_uuid != null) __obj.updateDynamic("customer_uuid")(customer_uuid.asInstanceOf[js.Any])
    if (!js.isUndefined(has_more)) __obj.updateDynamic("has_more")(has_more.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (total_pages != null) __obj.updateDynamic("total_pages")(total_pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invoices]
  }
}

