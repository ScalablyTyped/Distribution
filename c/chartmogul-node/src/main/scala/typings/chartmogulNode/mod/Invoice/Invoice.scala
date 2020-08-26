package typings.chartmogulNode.mod.Invoice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invoice extends js.Object {
  var currency: js.UndefOr[String] = js.native
  var customer_uuid: js.UndefOr[String] = js.native
  var data_source_uuid: js.UndefOr[String] = js.native
  var date: js.UndefOr[String] = js.native
  var due_date: js.UndefOr[String] = js.native
  var external_id: js.UndefOr[String] = js.native
  var line_items: js.UndefOr[js.Array[LineItem]] = js.native
  var transactions: js.UndefOr[js.Array[Transaction]] = js.native
  var uuid: js.UndefOr[String] = js.native
}

object Invoice {
  @scala.inline
  def apply(): Invoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invoice]
  }
  @scala.inline
  implicit class InvoiceOps[Self <: typings.chartmogulNode.mod.Invoice.Invoice] (val x: Self) extends AnyVal {
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
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setCustomer_uuid(value: String): Self = this.set("customer_uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomer_uuid: Self = this.set("customer_uuid", js.undefined)
    @scala.inline
    def setData_source_uuid(value: String): Self = this.set("data_source_uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData_source_uuid: Self = this.set("data_source_uuid", js.undefined)
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDue_date(value: String): Self = this.set("due_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDue_date: Self = this.set("due_date", js.undefined)
    @scala.inline
    def setExternal_id(value: String): Self = this.set("external_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternal_id: Self = this.set("external_id", js.undefined)
    @scala.inline
    def setLine_itemsVarargs(value: LineItem*): Self = this.set("line_items", js.Array(value :_*))
    @scala.inline
    def setLine_items(value: js.Array[LineItem]): Self = this.set("line_items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine_items: Self = this.set("line_items", js.undefined)
    @scala.inline
    def setTransactionsVarargs(value: Transaction*): Self = this.set("transactions", js.Array(value :_*))
    @scala.inline
    def setTransactions(value: js.Array[Transaction]): Self = this.set("transactions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransactions: Self = this.set("transactions", js.undefined)
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
  }
  
}

