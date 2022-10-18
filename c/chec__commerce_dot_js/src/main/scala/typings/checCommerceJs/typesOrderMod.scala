package typings.checCommerceJs

import typings.checCommerceJs.anon.Discount
import typings.checCommerceJs.anon.Discounts
import typings.checCommerceJs.anon.Free
import typings.checCommerceJs.anon.Id
import typings.checCommerceJs.typesAddressMod.Address
import typings.checCommerceJs.typesCheckoutCaptureResponseMod.FulfillmentStatus
import typings.checCommerceJs.typesCheckoutCaptureResponseMod.PaymentStatus
import typings.checCommerceJs.typesCurrencyMod.Currency
import typings.checCommerceJs.typesCustomerMod.Customer
import typings.checCommerceJs.typesOrderCollectedMod.OrderCollected
import typings.checCommerceJs.typesOrderConditionalsMod.OrderConditionals
import typings.checCommerceJs.typesOrderTaxMod.OrderTax
import typings.checCommerceJs.typesPriceMod.Price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesOrderMod {
  
  trait Order extends StObject {
    
    var billing: Address
    
    var cart_id: String
    
    var checkout_token_id: String
    
    var client_details: Any
    
    var collected: OrderCollected
    
    var conditionals: OrderConditionals
    
    var created: Double
    
    var currency: Currency
    
    var customer: Customer
    
    var customer_reference: String
    
    var extra_fields: js.Array[Id]
    
    var fraud: Any
    
    var fulfillment: Any
    
    var has: Discounts
    
    var id: String
    
    var is: Free
    
    var meta: Any
    
    var order: Discount
    
    var order_value: Price
    
    var redirect: Boolean
    
    var sandbox: Boolean
    
    var shipping: Address
    
    var status_fulfillment: FulfillmentStatus
    
    var status_payment: PaymentStatus
    
    var tax: OrderTax
    
    var transactions: js.Array[Any]
    
    var version: String
  }
  object Order {
    
    inline def apply(
      billing: Address,
      cart_id: String,
      checkout_token_id: String,
      client_details: Any,
      collected: OrderCollected,
      conditionals: OrderConditionals,
      created: Double,
      currency: Currency,
      customer: Customer,
      customer_reference: String,
      extra_fields: js.Array[Id],
      fraud: Any,
      fulfillment: Any,
      has: Discounts,
      id: String,
      is: Free,
      meta: Any,
      order: Discount,
      order_value: Price,
      redirect: Boolean,
      sandbox: Boolean,
      shipping: Address,
      status_fulfillment: FulfillmentStatus,
      status_payment: PaymentStatus,
      tax: OrderTax,
      transactions: js.Array[Any],
      version: String
    ): Order = {
      val __obj = js.Dynamic.literal(billing = billing.asInstanceOf[js.Any], cart_id = cart_id.asInstanceOf[js.Any], checkout_token_id = checkout_token_id.asInstanceOf[js.Any], client_details = client_details.asInstanceOf[js.Any], collected = collected.asInstanceOf[js.Any], conditionals = conditionals.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], customer_reference = customer_reference.asInstanceOf[js.Any], extra_fields = extra_fields.asInstanceOf[js.Any], fraud = fraud.asInstanceOf[js.Any], fulfillment = fulfillment.asInstanceOf[js.Any], has = has.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], order_value = order_value.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any], sandbox = sandbox.asInstanceOf[js.Any], shipping = shipping.asInstanceOf[js.Any], status_fulfillment = status_fulfillment.asInstanceOf[js.Any], status_payment = status_payment.asInstanceOf[js.Any], tax = tax.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Order]
    }
    
    extension [Self <: Order](x: Self) {
      
      inline def setBilling(value: Address): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
      
      inline def setCart_id(value: String): Self = StObject.set(x, "cart_id", value.asInstanceOf[js.Any])
      
      inline def setCheckout_token_id(value: String): Self = StObject.set(x, "checkout_token_id", value.asInstanceOf[js.Any])
      
      inline def setClient_details(value: Any): Self = StObject.set(x, "client_details", value.asInstanceOf[js.Any])
      
      inline def setCollected(value: OrderCollected): Self = StObject.set(x, "collected", value.asInstanceOf[js.Any])
      
      inline def setConditionals(value: OrderConditionals): Self = StObject.set(x, "conditionals", value.asInstanceOf[js.Any])
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setCurrency(value: Currency): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCustomer(value: Customer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      inline def setCustomer_reference(value: String): Self = StObject.set(x, "customer_reference", value.asInstanceOf[js.Any])
      
      inline def setExtra_fields(value: js.Array[Id]): Self = StObject.set(x, "extra_fields", value.asInstanceOf[js.Any])
      
      inline def setExtra_fieldsVarargs(value: Id*): Self = StObject.set(x, "extra_fields", js.Array(value*))
      
      inline def setFraud(value: Any): Self = StObject.set(x, "fraud", value.asInstanceOf[js.Any])
      
      inline def setFulfillment(value: Any): Self = StObject.set(x, "fulfillment", value.asInstanceOf[js.Any])
      
      inline def setHas(value: Discounts): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIs(value: Free): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: Discount): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrder_value(value: Price): Self = StObject.set(x, "order_value", value.asInstanceOf[js.Any])
      
      inline def setRedirect(value: Boolean): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setSandbox(value: Boolean): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setShipping(value: Address): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
      
      inline def setStatus_fulfillment(value: FulfillmentStatus): Self = StObject.set(x, "status_fulfillment", value.asInstanceOf[js.Any])
      
      inline def setStatus_payment(value: PaymentStatus): Self = StObject.set(x, "status_payment", value.asInstanceOf[js.Any])
      
      inline def setTax(value: OrderTax): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
      
      inline def setTransactions(value: js.Array[Any]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
      
      inline def setTransactionsVarargs(value: Any*): Self = StObject.set(x, "transactions", js.Array(value*))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
