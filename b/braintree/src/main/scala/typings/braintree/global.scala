package typings.braintree

import typings.braintree.anon.Active
import typings.braintree.anon.All
import typings.braintree.anon.Api
import typings.braintree.anon.ApplicationIncomplete
import typings.braintree.anon.AuthorizationExpired
import typings.braintree.anon.Bank
import typings.braintree.anon.Canceled
import typings.braintree.anon.Credit
import typings.braintree.anon.FullInformation
import typings.braintree.anon.Held
import typings.braintree.anon.International
import typings.braintree.anon.No
import typings.braintree.anon.Sale
import typings.braintree.mod.GatewayConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object braintree {
    
    @JSGlobal("braintree.AccountUpdaterDailyReport")
    @js.native
    open class AccountUpdaterDailyReport ()
      extends typings.braintree.mod.AccountUpdaterDailyReport
    
    @JSGlobal("braintree.AddOn")
    @js.native
    open class AddOn ()
      extends typings.braintree.mod.AddOn
    
    @JSGlobal("braintree.Address")
    @js.native
    open class Address ()
      extends typings.braintree.mod.Address
    
    @JSGlobal("braintree.AndroidPayCard")
    @js.native
    open class AndroidPayCard ()
      extends typings.braintree.mod.AndroidPayCard
    
    @JSGlobal("braintree.ApplePayCard")
    @js.native
    open class ApplePayCard ()
      extends typings.braintree.mod.ApplePayCard
    
    @JSGlobal("braintree.BraintreeGateway")
    @js.native
    open class BraintreeGateway protected ()
      extends typings.braintree.mod.BraintreeGateway {
      def this(config: GatewayConfig) = this()
    }
    
    @JSGlobal("braintree.CreditCard")
    @js.native
    open class CreditCard ()
      extends typings.braintree.mod.CreditCard
    /* static members */
    object CreditCard {
      
      @JSGlobal("braintree.CreditCard")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("braintree.CreditCard.CardType")
      @js.native
      def CardType: All = js.native
      
      @JSGlobal("braintree.CreditCard.CardTypeIndicator")
      @js.native
      def CardTypeIndicator: No = js.native
      inline def CardTypeIndicator_=(x: No): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CardTypeIndicator")(x.asInstanceOf[js.Any])
      
      inline def CardType_=(x: All): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CardType")(x.asInstanceOf[js.Any])
      
      @JSGlobal("braintree.CreditCard.CustomerLocation")
      @js.native
      def CustomerLocation: International = js.native
      inline def CustomerLocation_=(x: International): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CustomerLocation")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("braintree.CreditCardVerification")
    @js.native
    open class CreditCardVerification ()
      extends typings.braintree.mod.CreditCardVerification
    
    @JSGlobal("braintree.Customer")
    @js.native
    open class Customer ()
      extends typings.braintree.mod.Customer
    
    @JSGlobal("braintree.Disbursement")
    @js.native
    open class Disbursement ()
      extends typings.braintree.mod.Disbursement
    /* static members */
    object Disbursement {
      
      @JSGlobal("braintree.Disbursement")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("braintree.Disbursement.Types")
      @js.native
      def Types: Credit = js.native
      inline def Types_=(x: Credit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Types")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("braintree.Discount")
    @js.native
    open class Discount ()
      extends typings.braintree.mod.Discount
    
    @JSGlobal("braintree.Dispute")
    @js.native
    open class Dispute ()
      extends typings.braintree.mod.Dispute
    
    @JSGlobal("braintree.Environment")
    @js.native
    open class Environment protected ()
      extends typings.braintree.mod.Environment {
      def this(
        server: String,
        port: String,
        authUrl: String,
        ssl: Boolean,
        graphQLServer: String,
        graphQLPort: String
      ) = this()
    }
    /* static members */
    object Environment {
      
      @JSGlobal("braintree.Environment.Development")
      @js.native
      val Development: typings.braintree.mod.Environment = js.native
      
      @JSGlobal("braintree.Environment.Production")
      @js.native
      val Production: typings.braintree.mod.Environment = js.native
      
      @JSGlobal("braintree.Environment.Qa")
      @js.native
      val Qa: typings.braintree.mod.Environment = js.native
      
      @JSGlobal("braintree.Environment.Sandbox")
      @js.native
      val Sandbox: typings.braintree.mod.Environment = js.native
    }
    
    @JSGlobal("braintree.MasterpassCard")
    @js.native
    open class MasterpassCard ()
      extends typings.braintree.mod.MasterpassCard
    
    @JSGlobal("braintree.MerchantAccount")
    @js.native
    open class MerchantAccount ()
      extends typings.braintree.mod.MerchantAccount
    /* static members */
    object MerchantAccount {
      
      @JSGlobal("braintree.MerchantAccount")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("braintree.MerchantAccount.FundingDestination")
      @js.native
      def FundingDestination: Bank = js.native
      inline def FundingDestination_=(x: Bank): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FundingDestination")(x.asInstanceOf[js.Any])
      
      @JSGlobal("braintree.MerchantAccount.Status")
      @js.native
      def Status: Active = js.native
      inline def Status_=(x: Active): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Status")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("braintree.PayPalAccount")
    @js.native
    open class PayPalAccount ()
      extends typings.braintree.mod.PayPalAccount
    
    @JSGlobal("braintree.PaymentMethodNonce")
    @js.native
    open class PaymentMethodNonce ()
      extends typings.braintree.mod.PaymentMethodNonce
    
    @JSGlobal("braintree.Plan")
    @js.native
    open class Plan ()
      extends typings.braintree.mod.Plan
    
    @JSGlobal("braintree.SamsungPayCard")
    @js.native
    open class SamsungPayCard ()
      extends typings.braintree.mod.SamsungPayCard
    
    @JSGlobal("braintree.SettlementBatchSummary")
    @js.native
    open class SettlementBatchSummary ()
      extends typings.braintree.mod.SettlementBatchSummary
    
    @JSGlobal("braintree.Subscription")
    @js.native
    open class Subscription ()
      extends typings.braintree.mod.Subscription
    /* static members */
    object Subscription {
      
      @JSGlobal("braintree.Subscription")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("braintree.Subscription.Status")
      @js.native
      def Status: Canceled = js.native
      inline def Status_=(x: Canceled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Status")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("braintree.Test")
    @js.native
    open class Test ()
      extends typings.braintree.mod.Test
    
    @JSGlobal("braintree.Transaction")
    @js.native
    open class Transaction ()
      extends typings.braintree.mod.Transaction
    /* static members */
    object Transaction {
      
      @JSGlobal("braintree.Transaction")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("braintree.Transaction.CreatedUsing")
      @js.native
      def CreatedUsing: FullInformation = js.native
      inline def CreatedUsing_=(x: FullInformation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreatedUsing")(x.asInstanceOf[js.Any])
      
      @JSGlobal("braintree.Transaction.EscrowStatus")
      @js.native
      def EscrowStatus: Held = js.native
      inline def EscrowStatus_=(x: Held): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EscrowStatus")(x.asInstanceOf[js.Any])
      
      @JSGlobal("braintree.Transaction.GatewayRejectionReason")
      @js.native
      def GatewayRejectionReason: ApplicationIncomplete = js.native
      inline def GatewayRejectionReason_=(x: ApplicationIncomplete): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GatewayRejectionReason")(x.asInstanceOf[js.Any])
      
      @JSGlobal("braintree.Transaction.Source")
      @js.native
      def Source: Api = js.native
      inline def Source_=(x: Api): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Source")(x.asInstanceOf[js.Any])
      
      @JSGlobal("braintree.Transaction.Status")
      @js.native
      def Status: AuthorizationExpired = js.native
      inline def Status_=(x: AuthorizationExpired): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Status")(x.asInstanceOf[js.Any])
      
      @JSGlobal("braintree.Transaction.Type")
      @js.native
      def Type: Sale = js.native
      inline def Type_=(x: Sale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Type")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("braintree.TransactionLineItem")
    @js.native
    open class TransactionLineItem ()
      extends typings.braintree.mod.TransactionLineItem
    
    @JSGlobal("braintree.VenmoAccount")
    @js.native
    open class VenmoAccount ()
      extends typings.braintree.mod.VenmoAccount
    
    @JSGlobal("braintree.VisaCheckoutCard")
    @js.native
    open class VisaCheckoutCard ()
      extends typings.braintree.mod.VisaCheckoutCard
  }
}
