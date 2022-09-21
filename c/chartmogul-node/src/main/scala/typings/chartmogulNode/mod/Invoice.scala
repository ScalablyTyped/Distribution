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
  
  inline def all(config: Config): js.Promise[Invoices] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Invoices]]
  inline def all(config: Config, params: ListInvoicesParams): js.Promise[Invoices] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(config.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Invoices]]
  inline def all(config: Config, uuid: String): js.Promise[Invoices] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Invoices]]
  inline def all(config: Config, uuid: String, params: ListInvoicesParams): js.Promise[Invoices] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Invoices]]
  
  inline def create(config: Config, uuid: String, data: typings.chartmogulNode.anon.Invoices): js.Promise[typings.chartmogulNode.mod.Invoice.Invoice] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.chartmogulNode.mod.Invoice.Invoice]]
  
  inline def destroy(config: Config, uuid: String): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  
  inline def retrieve(config: Config, uuid: String): js.Promise[typings.chartmogulNode.mod.Invoice.Invoice] = (^.asInstanceOf[js.Dynamic].applyDynamic("retrieve")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.chartmogulNode.mod.Invoice.Invoice]]
  
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
    
    inline def apply(): typings.chartmogulNode.mod.Invoice.Invoice = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.chartmogulNode.mod.Invoice.Invoice]
    }
    
    extension [Self <: typings.chartmogulNode.mod.Invoice.Invoice](x: Self) {
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setCustomer_uuid(value: String): Self = StObject.set(x, "customer_uuid", value.asInstanceOf[js.Any])
      
      inline def setCustomer_uuidUndefined: Self = StObject.set(x, "customer_uuid", js.undefined)
      
      inline def setData_source_uuid(value: String): Self = StObject.set(x, "data_source_uuid", value.asInstanceOf[js.Any])
      
      inline def setData_source_uuidUndefined: Self = StObject.set(x, "data_source_uuid", js.undefined)
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDue_date(value: String): Self = StObject.set(x, "due_date", value.asInstanceOf[js.Any])
      
      inline def setDue_dateUndefined: Self = StObject.set(x, "due_date", js.undefined)
      
      inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      inline def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
      
      inline def setLine_items(value: js.Array[LineItem]): Self = StObject.set(x, "line_items", value.asInstanceOf[js.Any])
      
      inline def setLine_itemsUndefined: Self = StObject.set(x, "line_items", js.undefined)
      
      inline def setLine_itemsVarargs(value: LineItem*): Self = StObject.set(x, "line_items", js.Array(value*))
      
      inline def setTransactions(value: js.Array[typings.chartmogulNode.mod.Invoice.Transaction]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
      
      inline def setTransactionsUndefined: Self = StObject.set(x, "transactions", js.undefined)
      
      inline def setTransactionsVarargs(value: typings.chartmogulNode.mod.Invoice.Transaction*): Self = StObject.set(x, "transactions", js.Array(value*))
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
  
  trait Invoices
    extends StObject
       with Cursor {
    
    var customer_uuid: js.UndefOr[String] = js.undefined
    
    var invoices: js.Array[typings.chartmogulNode.mod.Invoice.Invoice]
  }
  object Invoices {
    
    inline def apply(invoices: js.Array[typings.chartmogulNode.mod.Invoice.Invoice]): Invoices = {
      val __obj = js.Dynamic.literal(invoices = invoices.asInstanceOf[js.Any])
      __obj.asInstanceOf[Invoices]
    }
    
    extension [Self <: Invoices](x: Self) {
      
      inline def setCustomer_uuid(value: String): Self = StObject.set(x, "customer_uuid", value.asInstanceOf[js.Any])
      
      inline def setCustomer_uuidUndefined: Self = StObject.set(x, "customer_uuid", js.undefined)
      
      inline def setInvoices(value: js.Array[typings.chartmogulNode.mod.Invoice.Invoice]): Self = StObject.set(x, "invoices", value.asInstanceOf[js.Any])
      
      inline def setInvoicesVarargs(value: typings.chartmogulNode.mod.Invoice.Invoice*): Self = StObject.set(x, "invoices", js.Array(value*))
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
    
    inline def apply(): LineItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineItem]
    }
    
    extension [Self <: LineItem](x: Self) {
      
      inline def setAccount_code(value: String): Self = StObject.set(x, "account_code", value.asInstanceOf[js.Any])
      
      inline def setAccount_codeUndefined: Self = StObject.set(x, "account_code", js.undefined)
      
      inline def setAmount_in_cents(value: Double): Self = StObject.set(x, "amount_in_cents", value.asInstanceOf[js.Any])
      
      inline def setAmount_in_centsUndefined: Self = StObject.set(x, "amount_in_cents", js.undefined)
      
      inline def setCancelled_at(value: String): Self = StObject.set(x, "cancelled_at", value.asInstanceOf[js.Any])
      
      inline def setCancelled_atUndefined: Self = StObject.set(x, "cancelled_at", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDiscount_amount_in_cents(value: Double): Self = StObject.set(x, "discount_amount_in_cents", value.asInstanceOf[js.Any])
      
      inline def setDiscount_amount_in_centsUndefined: Self = StObject.set(x, "discount_amount_in_cents", js.undefined)
      
      inline def setDiscount_code(value: String): Self = StObject.set(x, "discount_code", value.asInstanceOf[js.Any])
      
      inline def setDiscount_codeUndefined: Self = StObject.set(x, "discount_code", js.undefined)
      
      inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      inline def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
      
      inline def setPlan_uuid(value: String): Self = StObject.set(x, "plan_uuid", value.asInstanceOf[js.Any])
      
      inline def setPlan_uuidUndefined: Self = StObject.set(x, "plan_uuid", js.undefined)
      
      inline def setProrated(value: Boolean): Self = StObject.set(x, "prorated", value.asInstanceOf[js.Any])
      
      inline def setProratedUndefined: Self = StObject.set(x, "prorated", js.undefined)
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
      
      inline def setService_period_end(value: String): Self = StObject.set(x, "service_period_end", value.asInstanceOf[js.Any])
      
      inline def setService_period_endUndefined: Self = StObject.set(x, "service_period_end", js.undefined)
      
      inline def setService_period_start(value: String): Self = StObject.set(x, "service_period_start", value.asInstanceOf[js.Any])
      
      inline def setService_period_startUndefined: Self = StObject.set(x, "service_period_start", js.undefined)
      
      inline def setSubscription_external_id(value: String): Self = StObject.set(x, "subscription_external_id", value.asInstanceOf[js.Any])
      
      inline def setSubscription_external_idUndefined: Self = StObject.set(x, "subscription_external_id", js.undefined)
      
      inline def setSubscription_uuid(value: String): Self = StObject.set(x, "subscription_uuid", value.asInstanceOf[js.Any])
      
      inline def setSubscription_uuidUndefined: Self = StObject.set(x, "subscription_uuid", js.undefined)
      
      inline def setTax_amount_in_cents(value: Double): Self = StObject.set(x, "tax_amount_in_cents", value.asInstanceOf[js.Any])
      
      inline def setTax_amount_in_centsUndefined: Self = StObject.set(x, "tax_amount_in_cents", js.undefined)
      
      inline def setTransaction_fees_in_cents(value: Double): Self = StObject.set(x, "transaction_fees_in_cents", value.asInstanceOf[js.Any])
      
      inline def setTransaction_fees_in_centsUndefined: Self = StObject.set(x, "transaction_fees_in_cents", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
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
    
    inline def apply(): ListInvoicesParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListInvoicesParams]
    }
    
    extension [Self <: ListInvoicesParams](x: Self) {
      
      inline def setCustomer_uuid(value: String): Self = StObject.set(x, "customer_uuid", value.asInstanceOf[js.Any])
      
      inline def setCustomer_uuidUndefined: Self = StObject.set(x, "customer_uuid", js.undefined)
      
      inline def setData_source_uuid(value: String): Self = StObject.set(x, "data_source_uuid", value.asInstanceOf[js.Any])
      
      inline def setData_source_uuidUndefined: Self = StObject.set(x, "data_source_uuid", js.undefined)
      
      inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      inline def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
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
    
    inline def apply(): typings.chartmogulNode.mod.Invoice.Transaction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.chartmogulNode.mod.Invoice.Transaction]
    }
    
    extension [Self <: typings.chartmogulNode.mod.Invoice.Transaction](x: Self) {
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      inline def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
      
      inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
}
