package typings.chartmogulNode.mod.Invoice

import typings.chartmogulNode.commonMod.CursorParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInvoicesParams extends CursorParams {
  var customer_uuid: js.UndefOr[String] = js.undefined
  var data_source_uuid: js.UndefOr[String] = js.undefined
  var external_id: js.UndefOr[String] = js.undefined
}

object ListInvoicesParams {
  @scala.inline
  def apply(
    customer_uuid: String = null,
    data_source_uuid: String = null,
    external_id: String = null,
    page: js.UndefOr[Double] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined
  ): ListInvoicesParams = {
    val __obj = js.Dynamic.literal()
    if (customer_uuid != null) __obj.updateDynamic("customer_uuid")(customer_uuid.asInstanceOf[js.Any])
    if (data_source_uuid != null) __obj.updateDynamic("data_source_uuid")(data_source_uuid.asInstanceOf[js.Any])
    if (external_id != null) __obj.updateDynamic("external_id")(external_id.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInvoicesParams]
  }
}

