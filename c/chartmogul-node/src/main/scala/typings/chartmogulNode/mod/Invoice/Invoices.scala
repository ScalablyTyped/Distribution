package typings.chartmogulNode.mod.Invoice

import typings.chartmogulNode.commonMod.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invoices extends Cursor {
  var customer_uuid: js.UndefOr[String] = js.native
  var invoices: js.Array[typings.chartmogulNode.mod.Invoice.Invoice] = js.native
}

object Invoices {
  @scala.inline
  def apply(invoices: js.Array[typings.chartmogulNode.mod.Invoice.Invoice]): Invoices = {
    val __obj = js.Dynamic.literal(invoices = invoices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invoices]
  }
  @scala.inline
  implicit class InvoicesOps[Self <: Invoices] (val x: Self) extends AnyVal {
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
    def setInvoicesVarargs(value: typings.chartmogulNode.mod.Invoice.Invoice*): Self = this.set("invoices", js.Array(value :_*))
    @scala.inline
    def setInvoices(value: js.Array[typings.chartmogulNode.mod.Invoice.Invoice]): Self = this.set("invoices", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomer_uuid(value: String): Self = this.set("customer_uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomer_uuid: Self = this.set("customer_uuid", js.undefined)
  }
  
}

