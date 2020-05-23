package typings.chartmogulNode.mod.Invoice

import typings.chartmogulNode.commonMod.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invoices extends Cursor {
  var customer_uuid: js.UndefOr[String] = js.undefined
  var invoices: js.Array[typings.chartmogulNode.mod.Invoice.Invoice]
}

object Invoices {
  @scala.inline
  def apply(
    invoices: js.Array[typings.chartmogulNode.mod.Invoice.Invoice],
    current_page: js.UndefOr[Double] = js.undefined,
    customer_uuid: String = null,
    has_more: js.UndefOr[Boolean] = js.undefined,
    page: js.UndefOr[Double] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined,
    total_pages: js.UndefOr[Double] = js.undefined
  ): Invoices = {
    val __obj = js.Dynamic.literal(invoices = invoices.asInstanceOf[js.Any])
    if (!js.isUndefined(current_page)) __obj.updateDynamic("current_page")(current_page.get.asInstanceOf[js.Any])
    if (customer_uuid != null) __obj.updateDynamic("customer_uuid")(customer_uuid.asInstanceOf[js.Any])
    if (!js.isUndefined(has_more)) __obj.updateDynamic("has_more")(has_more.get.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total_pages)) __obj.updateDynamic("total_pages")(total_pages.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invoices]
  }
}

