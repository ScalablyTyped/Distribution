package typings
package chartmogulDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Invoices extends js.Object {
  var invoices: js.Array[chartmogulDashNodeLib.chartmogulDashNodeMod.InvoiceNs.Invoice]
}

object Anon_Invoices {
  @scala.inline
  def apply(invoices: js.Array[chartmogulDashNodeLib.chartmogulDashNodeMod.InvoiceNs.Invoice]): Anon_Invoices = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("invoices")(invoices)
    __obj.asInstanceOf[Anon_Invoices]
  }
}

