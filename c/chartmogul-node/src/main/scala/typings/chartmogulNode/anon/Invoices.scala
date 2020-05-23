package typings.chartmogulNode.anon

import typings.chartmogulNode.mod.Invoice.Invoice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invoices extends js.Object {
  var invoices: js.Array[Invoice]
}

object Invoices {
  @scala.inline
  def apply(invoices: js.Array[Invoice]): Invoices = {
    val __obj = js.Dynamic.literal(invoices = invoices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invoices]
  }
}

