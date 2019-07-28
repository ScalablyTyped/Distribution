package typings.chartmogulDashNode.chartmogulDashNodeMod

import typings.chartmogulDashNode.Anon_Invoices
import typings.chartmogulDashNode.chartmogulDashNodeMod.InvoiceNs.Invoice
import typings.chartmogulDashNode.chartmogulDashNodeMod.InvoiceNs.Invoices
import typings.chartmogulDashNode.chartmogulDashNodeMod.InvoiceNs.LineItem
import typings.chartmogulDashNode.chartmogulDashNodeMod.InvoiceNs.ListInvoicesParams
import typings.chartmogulDashNode.chartmogulDashNodeMod.InvoiceNs.Transaction
import typings.chartmogulDashNode.commonMod.Cursor
import typings.chartmogulDashNode.commonMod.CursorParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Invoice")
@js.native
object InvoiceNs extends js.Object {
  trait Invoice extends js.Object {
    var currency: js.UndefOr[String] = js.undefined
    var customer_uuid: js.UndefOr[String] = js.undefined
    var data_source_uuid: js.UndefOr[String] = js.undefined
    var date: js.UndefOr[String] = js.undefined
    var due_date: js.UndefOr[String] = js.undefined
    var external_id: js.UndefOr[String] = js.undefined
    var line_items: js.UndefOr[js.Array[LineItem]] = js.undefined
    var transactions: js.UndefOr[js.Array[Transaction]] = js.undefined
    var uuid: js.UndefOr[String] = js.undefined
  }
  
  trait Invoices extends Cursor {
    var customer_uuid: js.UndefOr[String] = js.undefined
    var invoices: js.Array[Invoice]
  }
  
  trait LineItem extends js.Object {
    var account_code: js.UndefOr[String] = js.undefined
    var amount_in_cents: js.UndefOr[Double] = js.undefined
    var cancelled_at: js.UndefOr[String] = js.undefined
    var description: js.UndefOr[String] = js.undefined
    var discount_amount_in_cents: js.UndefOr[Double] = js.undefined
    var discount_code: js.UndefOr[String] = js.undefined
    var external_id: js.UndefOr[String] = js.undefined
    var plan_uuid: js.UndefOr[String] = js.undefined
    var prorated: js.UndefOr[Boolean] = js.undefined
    var quantity: js.UndefOr[Double] = js.undefined
    var service_period_end: js.UndefOr[String] = js.undefined
    var service_period_start: js.UndefOr[String] = js.undefined
    var subscription_external_id: js.UndefOr[String] = js.undefined
    var subscription_uuid: js.UndefOr[String] = js.undefined
    var tax_amount_in_cents: js.UndefOr[Double] = js.undefined
    var transaction_fees_in_cents: js.UndefOr[Double] = js.undefined
    var `type`: js.UndefOr[String] = js.undefined
    var uuid: js.UndefOr[String] = js.undefined
  }
  
  trait ListInvoicesParams extends CursorParams {
    var customer_uuid: js.UndefOr[String] = js.undefined
    var data_source_uuid: js.UndefOr[String] = js.undefined
    var external_id: js.UndefOr[String] = js.undefined
  }
  
  trait Transaction extends js.Object {
    var date: js.UndefOr[String] = js.undefined
    var external_id: js.UndefOr[String] = js.undefined
    var result: js.UndefOr[String] = js.undefined
    var `type`: js.UndefOr[String] = js.undefined
    var uuid: js.UndefOr[String] = js.undefined
  }
  
  def all(config: Config): js.Promise[Invoices] = js.native
  def all(config: Config, params: ListInvoicesParams): js.Promise[Invoices] = js.native
  def all(config: Config, uuid: String): js.Promise[Invoices] = js.native
  def all(config: Config, uuid: String, params: ListInvoicesParams): js.Promise[Invoices] = js.native
  def create(config: Config, uuid: String, data: Anon_Invoices): js.Promise[Invoice] = js.native
  def destroy(config: Config, uuid: String): js.Promise[js.Object] = js.native
  def retrieve(config: Config, uuid: String): js.Promise[Invoice] = js.native
}

