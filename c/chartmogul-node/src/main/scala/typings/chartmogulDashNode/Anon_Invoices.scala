package typings.chartmogulDashNode

import typings.chartmogulDashNode.chartmogulDashNodeMod.Invoice.Invoice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Invoices extends js.Object {
  var invoices: js.Array[Invoice]
}

object Anon_Invoices {
  @scala.inline
  def apply(invoices: js.Array[Invoice]): Anon_Invoices = {
    val __obj = js.Dynamic.literal(invoices = invoices.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Invoices]
  }
}

