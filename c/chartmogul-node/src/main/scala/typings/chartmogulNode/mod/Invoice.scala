package typings.chartmogulNode.mod

import typings.chartmogulNode.commonMod.Cursor
import typings.chartmogulNode.commonMod.CursorParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Invoice {
  
  @JSImport("chartmogul-node", "Invoice")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def all(config: Config): js.Promise[Invoices] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Invoices]]
  @scala.inline
  def all(config: Config, params: ListInvoicesParams): js.Promise[Invoices] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(config.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Invoices]]
  @scala.inline
  def all(config: Config, uuid: String): js.Promise[Invoices] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Invoices]]
  @scala.inline
  def all(config: Config, uuid: String, params: ListInvoicesParams): js.Promise[Invoices] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Invoices]]
  
  @scala.inline
  def create(config: Config, uuid: String, data: typings.chartmogulNode.anon.Invoices): js.Promise[typings.chartmogulNode.mod.Invoice.Invoice] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.chartmogulNode.mod.Invoice.Invoice]]
  
  @scala.inline
  def destroy(config: Config, uuid: String): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  
  @scala.inline
  def retrieve(config: Config, uuid: String): js.Promise[typings.chartmogulNode.mod.Invoice.Invoice] = (^.asInstanceOf[js.Dynamic].applyDynamic("retrieve")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.chartmogulNode.mod.Invoice.Invoice]]
  
  trait Invoice extends StObject {
    
    var currency: js.UndefOr[String] = js.undefined
    
    var customer_uuid: js.UndefOr[String] = js.undefined
    
    var data_source_uuid: js.UndefOr[String] = js.undefined
    
    var date: js.UndefOr[String] = js.undefined
    
    var due_date: js.UndefOr[String] = js.undefined
    
    var external_id: js.UndefOr[String] = js.undefined
    
    var line_items: js.UndefOr[js.Array[LineItem]] = js.undefined
    
    var transactions: js.UndefOr[js.Array[typings.chartmogulNode.mod.Invoice.Transaction]] = js.undefined
    
    var uuid: js.UndefOr[String] = js.undefined
  }
  object Invoice {
    
    @scala.inline
    def apply(): typings.chartmogulNode.mod.Invoice.Invoice = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.chartmogulNode.mod.Invoice.Invoice]
    }
    
    @scala.inline
    implicit class InvoiceMutableBuilder[Self <: typings.chartmogulNode.mod.Invoice.Invoice] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      @scala.inline
      def setCustomer_uuid(value: String): Self = StObject.set(x, "customer_uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomer_uuidUndefined: Self = StObject.set(x, "customer_uuid", js.undefined)
      
      @scala.inline
      def setData_source_uuid(value: String): Self = StObject.set(x, "data_source_uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData_source_uuidUndefined: Self = StObject.set(x, "data_source_uuid", js.undefined)
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setDue_date(value: String): Self = StObject.set(x, "due_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDue_dateUndefined: Self = StObject.set(x, "due_date", js.undefined)
      
      @scala.inline
      def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
      
      @scala.inline
      def setLine_items(value: js.Array[LineItem]): Self = StObject.set(x, "line_items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine_itemsUndefined: Self = StObject.set(x, "line_items", js.undefined)
      
      @scala.inline
      def setLine_itemsVarargs(value: LineItem*): Self = StObject.set(x, "line_items", js.Array(value :_*))
      
      @scala.inline
      def setTransactions(value: js.Array[typings.chartmogulNode.mod.Invoice.Transaction]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionsUndefined: Self = StObject.set(x, "transactions", js.undefined)
      
      @scala.inline
      def setTransactionsVarargs(value: typings.chartmogulNode.mod.Invoice.Transaction*): Self = StObject.set(x, "transactions", js.Array(value :_*))
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
  
  trait Invoices
    extends StObject
       with Cursor {
    
    var customer_uuid: js.UndefOr[String] = js.undefined
    
    var invoices: js.Array[typings.chartmogulNode.mod.Invoice.Invoice]
  }
  object Invoices {
    
    @scala.inline
    def apply(invoices: js.Array[typings.chartmogulNode.mod.Invoice.Invoice]): Invoices = {
      val __obj = js.Dynamic.literal(invoices = invoices.asInstanceOf[js.Any])
      __obj.asInstanceOf[Invoices]
    }
    
    @scala.inline
    implicit class InvoicesMutableBuilder[Self <: Invoices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomer_uuid(value: String): Self = StObject.set(x, "customer_uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomer_uuidUndefined: Self = StObject.set(x, "customer_uuid", js.undefined)
      
      @scala.inline
      def setInvoices(value: js.Array[typings.chartmogulNode.mod.Invoice.Invoice]): Self = StObject.set(x, "invoices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoicesVarargs(value: typings.chartmogulNode.mod.Invoice.Invoice*): Self = StObject.set(x, "invoices", js.Array(value :_*))
    }
  }
  
  trait LineItem extends StObject {
    
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
  object LineItem {
    
    @scala.inline
    def apply(): LineItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineItem]
    }
    
    @scala.inline
    implicit class LineItemMutableBuilder[Self <: LineItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount_code(value: String): Self = StObject.set(x, "account_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccount_codeUndefined: Self = StObject.set(x, "account_code", js.undefined)
      
      @scala.inline
      def setAmount_in_cents(value: Double): Self = StObject.set(x, "amount_in_cents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmount_in_centsUndefined: Self = StObject.set(x, "amount_in_cents", js.undefined)
      
      @scala.inline
      def setCancelled_at(value: String): Self = StObject.set(x, "cancelled_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelled_atUndefined: Self = StObject.set(x, "cancelled_at", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDiscount_amount_in_cents(value: Double): Self = StObject.set(x, "discount_amount_in_cents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiscount_amount_in_centsUndefined: Self = StObject.set(x, "discount_amount_in_cents", js.undefined)
      
      @scala.inline
      def setDiscount_code(value: String): Self = StObject.set(x, "discount_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiscount_codeUndefined: Self = StObject.set(x, "discount_code", js.undefined)
      
      @scala.inline
      def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
      
      @scala.inline
      def setPlan_uuid(value: String): Self = StObject.set(x, "plan_uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlan_uuidUndefined: Self = StObject.set(x, "plan_uuid", js.undefined)
      
      @scala.inline
      def setProrated(value: Boolean): Self = StObject.set(x, "prorated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProratedUndefined: Self = StObject.set(x, "prorated", js.undefined)
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
      
      @scala.inline
      def setService_period_end(value: String): Self = StObject.set(x, "service_period_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setService_period_endUndefined: Self = StObject.set(x, "service_period_end", js.undefined)
      
      @scala.inline
      def setService_period_start(value: String): Self = StObject.set(x, "service_period_start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setService_period_startUndefined: Self = StObject.set(x, "service_period_start", js.undefined)
      
      @scala.inline
      def setSubscription_external_id(value: String): Self = StObject.set(x, "subscription_external_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscription_external_idUndefined: Self = StObject.set(x, "subscription_external_id", js.undefined)
      
      @scala.inline
      def setSubscription_uuid(value: String): Self = StObject.set(x, "subscription_uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscription_uuidUndefined: Self = StObject.set(x, "subscription_uuid", js.undefined)
      
      @scala.inline
      def setTax_amount_in_cents(value: Double): Self = StObject.set(x, "tax_amount_in_cents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTax_amount_in_centsUndefined: Self = StObject.set(x, "tax_amount_in_cents", js.undefined)
      
      @scala.inline
      def setTransaction_fees_in_cents(value: Double): Self = StObject.set(x, "transaction_fees_in_cents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransaction_fees_in_centsUndefined: Self = StObject.set(x, "transaction_fees_in_cents", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
  
  trait ListInvoicesParams
    extends StObject
       with CursorParams {
    
    var customer_uuid: js.UndefOr[String] = js.undefined
    
    var data_source_uuid: js.UndefOr[String] = js.undefined
    
    var external_id: js.UndefOr[String] = js.undefined
  }
  object ListInvoicesParams {
    
    @scala.inline
    def apply(): ListInvoicesParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListInvoicesParams]
    }
    
    @scala.inline
    implicit class ListInvoicesParamsMutableBuilder[Self <: ListInvoicesParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomer_uuid(value: String): Self = StObject.set(x, "customer_uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomer_uuidUndefined: Self = StObject.set(x, "customer_uuid", js.undefined)
      
      @scala.inline
      def setData_source_uuid(value: String): Self = StObject.set(x, "data_source_uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData_source_uuidUndefined: Self = StObject.set(x, "data_source_uuid", js.undefined)
      
      @scala.inline
      def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
    }
  }
  
  trait Transaction extends StObject {
    
    var date: js.UndefOr[String] = js.undefined
    
    var external_id: js.UndefOr[String] = js.undefined
    
    var result: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var uuid: js.UndefOr[String] = js.undefined
  }
  object Transaction {
    
    @scala.inline
    def apply(): typings.chartmogulNode.mod.Invoice.Transaction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.chartmogulNode.mod.Invoice.Transaction]
    }
    
    @scala.inline
    implicit class TransactionMutableBuilder[Self <: typings.chartmogulNode.mod.Invoice.Transaction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
      
      @scala.inline
      def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
}
