package typings
package chartmogulDashNodeLib.chartmogulDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Invoice")
@js.native
object InvoiceNs extends js.Object {
  trait Invoice extends js.Object {
    var currency: js.UndefOr[java.lang.String] = js.undefined
    var customer_uuid: js.UndefOr[java.lang.String] = js.undefined
    var data_source_uuid: js.UndefOr[java.lang.String] = js.undefined
    var date: js.UndefOr[java.lang.String] = js.undefined
    var due_date: js.UndefOr[java.lang.String] = js.undefined
    var external_id: js.UndefOr[java.lang.String] = js.undefined
    var line_items: js.UndefOr[js.Array[LineItem]] = js.undefined
    var transactions: js.UndefOr[js.Array[Transaction]] = js.undefined
    var uuid: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait Invoices
    extends chartmogulDashNodeLib.commonMod.Cursor {
    var customer_uuid: js.UndefOr[java.lang.String] = js.undefined
    var invoices: js.Array[Invoice]
  }
  
  trait LineItem extends js.Object {
    var account_code: js.UndefOr[java.lang.String] = js.undefined
    var amount_in_cents: js.UndefOr[scala.Double] = js.undefined
    var cancelled_at: js.UndefOr[java.lang.String] = js.undefined
    var description: js.UndefOr[java.lang.String] = js.undefined
    var discount_amount_in_cents: js.UndefOr[scala.Double] = js.undefined
    var discount_code: js.UndefOr[java.lang.String] = js.undefined
    var external_id: js.UndefOr[java.lang.String] = js.undefined
    var plan_uuid: js.UndefOr[java.lang.String] = js.undefined
    var prorated: js.UndefOr[scala.Boolean] = js.undefined
    var quantity: js.UndefOr[scala.Double] = js.undefined
    var service_period_end: js.UndefOr[java.lang.String] = js.undefined
    var service_period_start: js.UndefOr[java.lang.String] = js.undefined
    var subscription_external_id: js.UndefOr[java.lang.String] = js.undefined
    var subscription_uuid: js.UndefOr[java.lang.String] = js.undefined
    var tax_amount_in_cents: js.UndefOr[scala.Double] = js.undefined
    var transaction_fees_in_cents: js.UndefOr[scala.Double] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var uuid: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListInvoicesParams
    extends chartmogulDashNodeLib.commonMod.CursorParams {
    var customer_uuid: js.UndefOr[java.lang.String] = js.undefined
    var data_source_uuid: js.UndefOr[java.lang.String] = js.undefined
    var external_id: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait Transaction extends js.Object {
    var date: js.UndefOr[java.lang.String] = js.undefined
    var external_id: js.UndefOr[java.lang.String] = js.undefined
    var result: js.UndefOr[java.lang.String] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var uuid: js.UndefOr[java.lang.String] = js.undefined
  }
  
  def all(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config): js.Promise[Invoices] = js.native
  def all(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, params: ListInvoicesParams): js.Promise[Invoices] = js.native
  def all(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, uuid: java.lang.String): js.Promise[Invoices] = js.native
  def all(
    config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config,
    uuid: java.lang.String,
    params: ListInvoicesParams
  ): js.Promise[Invoices] = js.native
  def create(
    config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config,
    uuid: java.lang.String,
    data: chartmogulDashNodeLib.Anon_Invoices
  ): js.Promise[Invoice] = js.native
  def destroy(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, uuid: java.lang.String): js.Promise[js.Object] = js.native
  def retrieve(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, uuid: java.lang.String): js.Promise[Invoice] = js.native
}

