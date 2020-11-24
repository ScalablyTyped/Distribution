package typings.chartmogulNode.anon

import typings.chartmogulNode.mod.Invoice.Invoice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Invoices extends js.Object {
  
  var invoices: js.Array[Invoice] = js.native
}
object Invoices {
  
  @scala.inline
  def apply(invoices: js.Array[Invoice]): Invoices = {
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
    def setInvoicesVarargs(value: Invoice*): Self = this.set("invoices", js.Array(value :_*))
    
    @scala.inline
    def setInvoices(value: js.Array[Invoice]): Self = this.set("invoices", value.asInstanceOf[js.Any])
  }
}
