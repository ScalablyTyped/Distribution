package typings.chartmogulDashNode.chartmogulDashNodeMod.Invoice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invoice extends js.Object {
  var currency: js.UndefOr[String] = js.undefined
  var customer_uuid: js.UndefOr[String] = js.undefined
  var data_source_uuid: js.UndefOr[String] = js.undefined
  var date: js.UndefOr[String] = js.undefined
  var due_date: js.UndefOr[String] = js.undefined
  var external_id: js.UndefOr[String] = js.undefined
  var line_items: js.UndefOr[js.Array[LineItem]] = js.undefined
  var transactions: js.UndefOr[js.Array[typings.chartmogulDashNode.chartmogulDashNodeMod.Invoice.Transaction]] = js.undefined
  var uuid: js.UndefOr[String] = js.undefined
}

object Invoice {
  @scala.inline
  def apply(
    currency: String = null,
    customer_uuid: String = null,
    data_source_uuid: String = null,
    date: String = null,
    due_date: String = null,
    external_id: String = null,
    line_items: js.Array[LineItem] = null,
    transactions: js.Array[typings.chartmogulDashNode.chartmogulDashNodeMod.Invoice.Transaction] = null,
    uuid: String = null
  ): Invoice = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (customer_uuid != null) __obj.updateDynamic("customer_uuid")(customer_uuid)
    if (data_source_uuid != null) __obj.updateDynamic("data_source_uuid")(data_source_uuid)
    if (date != null) __obj.updateDynamic("date")(date)
    if (due_date != null) __obj.updateDynamic("due_date")(due_date)
    if (external_id != null) __obj.updateDynamic("external_id")(external_id)
    if (line_items != null) __obj.updateDynamic("line_items")(line_items)
    if (transactions != null) __obj.updateDynamic("transactions")(transactions)
    if (uuid != null) __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[Invoice]
  }
}

