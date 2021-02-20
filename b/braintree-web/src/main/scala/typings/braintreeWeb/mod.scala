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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("braintree-web", "ApplePaySession")
  @js.native
  class ApplePaySession protected ()
    extends typings.braintreeWeb.applePayMod.ApplePaySession {
    def this(version: Double, request: ApplePayPaymentRequest) = this()
  }
  
  @JSImport("braintree-web", "ApplePayStatusCodes")
  @js.native
  object ApplePayStatusCodes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.braintreeWeb.applePayMod.ApplePayStatusCodes with Double] = js.native
    
    /* 0 */ val STATUS_FAILURE: typings.braintreeWeb.applePayMod.ApplePayStatusCodes.STATUS_FAILURE with Double = js.native
    
    /* 1 */ val STATUS_INVALID_BILLING_POSTAL_ADDRESS: typings.braintreeWeb.applePayMod.ApplePayStatusCodes.STATUS_INVALID_BILLING_POSTAL_ADDRESS with Double = js.native
    
    /* 3 */ val STATUS_INVALID_SHIPPING_CONTACT: typings.braintreeWeb.applePayMod.ApplePayStatusCodes.STATUS_INVALID_SHIPPING_CONTACT with Double = js.native
    
    /* 2 */ val STATUS_INVALID_SHIPPING_POSTAL_ADDRESS: typings.braintreeWeb.applePayMod.ApplePayStatusCodes.STATUS_INVALID_SHIPPING_POSTAL_ADDRESS with Double = js.native
    
    /* 5 */ val STATUS_PIN_INCORRECT: typings.braintreeWeb.applePayMod.ApplePayStatusCodes.STATUS_PIN_INCORRECT with Double = js.native
    
    /* 6 */ val STATUS_PIN_LOCKOUT: typings.braintreeWeb.applePayMod.ApplePayStatusCodes.STATUS_PIN_LOCKOUT with Double = js.native
    
    /* 4 */ val STATUS_PIN_REQUIRED: typings.braintreeWeb.applePayMod.ApplePayStatusCodes.STATUS_PIN_REQUIRED with Double = js.native
    
    /* 1 */ val STATUS_SUCCESS: typings.braintreeWeb.applePayMod.ApplePayStatusCodes.STATUS_SUCCESS with Double = js.native
  }
  
  @JSImport("braintree-web", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  @JSImport("braintree-web", "americanExpress")
  @js.native
  val americanExpress: AmericanExpress = js.native
  
  @JSImport("braintree-web", "applePay")
  @js.native
  val applePay: ApplePay = js.native
  
  @JSImport("braintree-web", "client")
  @js.native
  val client: Client = js.native
  
  @JSImport("braintree-web", "dataCollector")
  @js.native
  val dataCollector: DataCollector = js.native
  
  @JSImport("braintree-web", "googlePayment")
  @js.native
  val googlePayment: GooglePayment = js.native
  
  @JSImport("braintree-web", "hostedFields")
  @js.native
  val hostedFields: HostedFields = js.native
  
  @JSImport("braintree-web", "paypal")
  @js.native
  val paypal: PayPal = js.native
  
  @JSImport("braintree-web", "paypalCheckout")
  @js.native
  val paypalCheckout: PayPalCheckout = js.native
  
  @JSImport("braintree-web", "threeDSecure")
  @js.native
  val threeDSecure: ThreeDSecure = js.native
  
  @JSImport("braintree-web", "unionpay")
  @js.native
  val unionpay: UnionPay = js.native
  
  @JSImport("braintree-web", "usBankAccount")
  @js.native
  val usBankAccount: USBankAccount = js.native
  
  @JSImport("braintree-web", "venmo")
  @js.native
  val venmo: Venmo = js.native
}
