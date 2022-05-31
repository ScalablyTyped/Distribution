package typings.braintree

import typings.braintree.mod.GatewayConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object braintree {
    
    @JSGlobal("braintree")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("braintree.AccountUpdaterDailyReport")
    @js.native
    class AccountUpdaterDailyReport ()
      extends typings.braintree.mod.AccountUpdaterDailyReport
    
    @JSGlobal("braintree.AddOn")
    @js.native
    class AddOn ()
      extends typings.braintree.mod.AddOn
    
    @JSGlobal("braintree.Address")
    @js.native
    class Address ()
      extends typings.braintree.mod.Address
    
    @JSGlobal("braintree.AndroidPayCard")
    @js.native
    class AndroidPayCard ()
      extends typings.braintree.mod.AndroidPayCard
    
    @JSGlobal("braintree.ApplePayCard")
    @js.native
    class ApplePayCard ()
      extends typings.braintree.mod.ApplePayCard
    
    @JSGlobal("braintree.BraintreeGateway")
    @js.native
    class BraintreeGateway protected ()
      extends typings.braintree.mod.BraintreeGateway {
      def this(config: GatewayConfig) = this()
    }
    
    @JSGlobal("braintree.CreditCard")
    @js.native
    class CreditCard ()
      extends typings.braintree.mod.CreditCard
    
    @JSGlobal("braintree.CreditCardVerification")
    @js.native
    class CreditCardVerification ()
      extends typings.braintree.mod.CreditCardVerification
    
    @JSGlobal("braintree.Customer")
    @js.native
    class Customer ()
      extends typings.braintree.mod.Customer
    
    @JSGlobal("braintree.Discount")
    @js.native
    class Discount ()
      extends typings.braintree.mod.Discount
    
    @JSGlobal("braintree.Dispute")
    @js.native
    class Dispute ()
      extends typings.braintree.mod.Dispute
    
    @JSGlobal("braintree.Environment")
    @js.native
    object Environment extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.braintree.mod.Environment & String] = js.native
      
      /* "Development" */ val Development: typings.braintree.mod.Environment.Development & String = js.native
      
      /* "Production" */ val Production: typings.braintree.mod.Environment.Production & String = js.native
      
      /* "Qa" */ val Qa: typings.braintree.mod.Environment.Qa & String = js.native
      
      /* "Sandbox" */ val Sandbox: typings.braintree.mod.Environment.Sandbox & String = js.native
    }
    
    @JSGlobal("braintree.MasterpassCard")
    @js.native
    class MasterpassCard ()
      extends typings.braintree.mod.MasterpassCard
    
    @JSGlobal("braintree.MerchantAccount")
    @js.native
    class MerchantAccount ()
      extends typings.braintree.mod.MerchantAccount
    
    @JSGlobal("braintree.PayPalAccount")
    @js.native
    class PayPalAccount ()
      extends typings.braintree.mod.PayPalAccount
    
    @JSGlobal("braintree.PaymentMethodNonce")
    @js.native
    class PaymentMethodNonce ()
      extends typings.braintree.mod.PaymentMethodNonce
    
    @JSGlobal("braintree.Plan")
    @js.native
    class Plan ()
      extends typings.braintree.mod.Plan
    
    @JSGlobal("braintree.SamsungPayCard")
    @js.native
    class SamsungPayCard ()
      extends typings.braintree.mod.SamsungPayCard
    
    @JSGlobal("braintree.SettlementBatchSummary")
    @js.native
    class SettlementBatchSummary ()
      extends typings.braintree.mod.SettlementBatchSummary
    
    @JSGlobal("braintree.Subscription")
    @js.native
    class Subscription ()
      extends typings.braintree.mod.Subscription
    
    @JSGlobal("braintree.Test")
    @js.native
    class Test ()
      extends typings.braintree.mod.Test
    
    @JSGlobal("braintree.Transaction")
    @js.native
    class Transaction ()
      extends typings.braintree.mod.Transaction
    
    @JSGlobal("braintree.TransactionLineItem")
    @js.native
    class TransactionLineItem ()
      extends typings.braintree.mod.TransactionLineItem
    
    @JSGlobal("braintree.TransactionRequestSource")
    @js.native
    object TransactionRequestSource extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.braintree.mod.TransactionRequestSource & String] = js.native
      
      /* "moto" */ val moto: typings.braintree.mod.TransactionRequestSource.moto & String = js.native
      
      /* "recurring" */ val recurring: typings.braintree.mod.TransactionRequestSource.recurring & String = js.native
      
      /* "recurring_first" */ val recurring_first: typings.braintree.mod.TransactionRequestSource.recurring_first & String = js.native
      
      /* "unscheduled" */ val unscheduled: typings.braintree.mod.TransactionRequestSource.unscheduled & String = js.native
    }
    
    @JSGlobal("braintree.VenmoAccount")
    @js.native
    class VenmoAccount ()
      extends typings.braintree.mod.VenmoAccount
    
    @JSGlobal("braintree.VisaCheckoutCard")
    @js.native
    class VisaCheckoutCard ()
      extends typings.braintree.mod.VisaCheckoutCard
    
    inline def connect(config: GatewayConfig): typings.braintree.mod.BraintreeGateway = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(config.asInstanceOf[js.Any]).asInstanceOf[typings.braintree.mod.BraintreeGateway]
  }
}
