package typings.chartmogulNode

import typings.chartmogulNode.mod.Invoice.Invoice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInvoices extends js.Object {
  var invoices: js.Array[Invoice]
}

object AnonInvoices {
  @scala.inline
  def apply(invoices: js.Array[Invoice]): AnonInvoices = {
    val __obj = js.Dynamic.literal(invoices = invoices.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInvoices]
  }
}

