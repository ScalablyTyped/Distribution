package typings.braintreeWeb

import typings.braintreeWeb.americanExpressMod.AmericanExpress
import typings.braintreeWeb.applePayMod.ApplePay
import typings.braintreeWeb.applePayMod.ApplePayPaymentRequest
import typings.braintreeWeb.clientMod.Client
import typings.braintreeWeb.dataCollectorMod.DataCollector
import typings.braintreeWeb.googlePaymentMod.GooglePayment
import typings.braintreeWeb.hostedFieldsMod.HostedFields
import typings.braintreeWeb.paypalCheckoutMod.PayPalCheckout
import typings.braintreeWeb.paypalMod.PayPal
import typings.braintreeWeb.threeDSecureMod.ThreeDSecure
import typings.braintreeWeb.unionpayMod.UnionPay
import typings.braintreeWeb.usBankAccountMod.USBankAccount
import typings.braintreeWeb.venmoMod.Venmo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object braintree {
    
    @JSGlobal("braintree.ApplePaySession")
    @js.native
    class ApplePaySession protected ()
      extends typings.braintreeWeb.mod.ApplePaySession {
      def this(version: Double, request: ApplePayPaymentRequest) = this()
    }
    
    @JSGlobal("braintree.ApplePayStatusCodes")
    @js.native
    object ApplePayStatusCodes extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.braintreeWeb.applePayMod.ApplePayStatusCodes & Double] = js.native
      
      /* 0 */ val STATUS_FAILURE: typings.braintreeWeb.applePayMod.ApplePayStatusCodes.STATUS_FAILURE & Double = js.native
      
      /* 1 */ val STATUS_INVALID_BILLING_POSTAL_ADDRESS: typings.braintreeWeb.applePayMod.ApplePayStatusCodes.STATUS_INVALID_BILLING_POSTAL_ADDRESS & Double = js.native
      
      /* 3 */ val STATUS_INVALID_SHIPPING_CONTACT: typings.braintreeWeb.applePayMod.ApplePayStatusCodes.STATUS_INVALID_SHIPPING_CONTACT & Double = js.native
      
      /* 2 */ val STATUS_INVALID_SHIPPING_POSTAL_ADDRESS: typings.braintreeWeb.applePayMod.ApplePayStatusCodes.STATUS_INVALID_SHIPPING_POSTAL_ADDRESS & Double = js.native
      
      /* 5 */ val STATUS_PIN_INCORRECT: typings.braintreeWeb.applePayMod.ApplePayStatusCodes.STATUS_PIN_INCORRECT & Double = js.native
      
      /* 6 */ val STATUS_PIN_LOCKOUT: typings.braintreeWeb.applePayMod.ApplePayStatusCodes.STATUS_PIN_LOCKOUT & Double = js.native
      
      /* 4 */ val STATUS_PIN_REQUIRED: typings.braintreeWeb.applePayMod.ApplePayStatusCodes.STATUS_PIN_REQUIRED & Double = js.native
      
      /* 1 */ val STATUS_SUCCESS: typings.braintreeWeb.applePayMod.ApplePayStatusCodes.STATUS_SUCCESS & Double = js.native
    }
    
    @JSGlobal("braintree.VERSION")
    @js.native
    val VERSION: String = js.native
    
    @JSGlobal("braintree.americanExpress")
    @js.native
    val americanExpress: AmericanExpress = js.native
    
    @JSGlobal("braintree.applePay")
    @js.native
    val applePay: ApplePay = js.native
    
    @JSGlobal("braintree.client")
    @js.native
    val client: Client = js.native
    
    @JSGlobal("braintree.dataCollector")
    @js.native
    val dataCollector: DataCollector = js.native
    
    @JSGlobal("braintree.googlePayment")
    @js.native
    val googlePayment: GooglePayment = js.native
    
    @JSGlobal("braintree.hostedFields")
    @js.native
    val hostedFields: HostedFields = js.native
    
    @JSGlobal("braintree.paypal")
    @js.native
    val paypal: PayPal = js.native
    
    @JSGlobal("braintree.paypalCheckout")
    @js.native
    val paypalCheckout: PayPalCheckout = js.native
    
    @JSGlobal("braintree.threeDSecure")
    @js.native
    val threeDSecure: ThreeDSecure = js.native
    
    @JSGlobal("braintree.unionpay")
    @js.native
    val unionpay: UnionPay = js.native
    
    @JSGlobal("braintree.usBankAccount")
    @js.native
    val usBankAccount: USBankAccount = js.native
    
    @JSGlobal("braintree.venmo")
    @js.native
    val venmo: Venmo = js.native
  }
}
