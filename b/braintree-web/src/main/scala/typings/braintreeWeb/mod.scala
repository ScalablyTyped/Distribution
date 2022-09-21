package typings.braintreeWeb

import typings.braintreeWeb.americanExpressMod.AmericanExpress
import typings.braintreeWeb.anon.Authorization
import typings.braintreeWeb.applePayMod.ApplePay
import typings.braintreeWeb.applePayMod.ApplePayPaymentRequest
import typings.braintreeWeb.clientMod.Client
import typings.braintreeWeb.coreMod.callback
import typings.braintreeWeb.dataCollectorMod.DataCollector
import typings.braintreeWeb.googlePaymentMod.GooglePayment
import typings.braintreeWeb.hostedFieldsMod.HostedFields
import typings.braintreeWeb.localPaymentMod.LocalPayment
import typings.braintreeWeb.paypalCheckoutMod.PayPalCheckout
import typings.braintreeWeb.paypalMod.PayPal
import typings.braintreeWeb.threeDSecureMod.ThreeDSecure
import typings.braintreeWeb.unionpayMod.UnionPay
import typings.braintreeWeb.usBankAccountMod.USBankAccount
import typings.braintreeWeb.vaultManagerMod.VaultManager
import typings.braintreeWeb.venmoMod.Venmo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("braintree-web", "ApplePaySession")
  @js.native
  open class ApplePaySession protected ()
    extends typings.braintreeWeb.applePayMod.ApplePaySession {
    def this(version: Double, request: ApplePayPaymentRequest) = this()
  }
  /* static members */
  object ApplePaySession {
    
    @JSImport("braintree-web", "ApplePaySession")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The requested action failed.
      */
    @JSImport("braintree-web", "ApplePaySession.STATUS_FAILURE")
    @js.native
    val STATUS_FAILURE: Double = js.native
    
    /**
      * The billing address is not valid.
      */
    @JSImport("braintree-web", "ApplePaySession.STATUS_INVALID_BILLING_POSTAL_ADDRESS")
    @js.native
    val STATUS_INVALID_BILLING_POSTAL_ADDRESS: Double = js.native
    
    /**
      * The shipping contact information is not valid.
      */
    @JSImport("braintree-web", "ApplePaySession.STATUS_INVALID_SHIPPING_CONTACT")
    @js.native
    val STATUS_INVALID_SHIPPING_CONTACT: Double = js.native
    
    /**
      * The shipping address is not valid.
      */
    @JSImport("braintree-web", "ApplePaySession.STATUS_INVALID_SHIPPING_POSTAL_ADDRESS")
    @js.native
    val STATUS_INVALID_SHIPPING_POSTAL_ADDRESS: Double = js.native
    
    /**
      * The PIN information is not valid. Cards on the China Union Pay network may require a PIN.
      */
    @JSImport("braintree-web", "ApplePaySession.STATUS_PIN_INCORRECT")
    @js.native
    val STATUS_PIN_INCORRECT: Double = js.native
    
    /**
      * The maximum number of tries for a PIN has been reached and the user has been locked out. Cards on the China Union Pay network may require a PIN.
      */
    @JSImport("braintree-web", "ApplePaySession.STATUS_PIN_LOCKOUT")
    @js.native
    val STATUS_PIN_LOCKOUT: Double = js.native
    
    /**
      * The required PIN information was not provided. Cards on the China Union Pay payment network may require a PIN to authenticate the transaction.
      */
    @JSImport("braintree-web", "ApplePaySession.STATUS_PIN_REQUIRED")
    @js.native
    val STATUS_PIN_REQUIRED: Double = js.native
    
    /**
      * The requested action succeeded.
      */
    @JSImport("braintree-web", "ApplePaySession.STATUS_SUCCESS")
    @js.native
    val STATUS_SUCCESS: Double = js.native
    
    inline def canMakePayments(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canMakePayments")().asInstanceOf[Boolean]
    
    inline def canMakePaymentsWithActiveCard(merchantIdentifier: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canMakePaymentsWithActiveCard")(merchantIdentifier.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def supportsVersion(version: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsVersion")(version.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("braintree-web", "ApplePayStatusCodes")
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
    
    /* 0 */ val STATUS_SUCCESS: typings.braintreeWeb.applePayMod.ApplePayStatusCodes.STATUS_SUCCESS & Double = js.native
  }
  
  @JSImport("braintree-web", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  @JSImport("braintree-web", "VaultManager")
  @js.native
  open class VaultManager_ () extends VaultManager
  /* static members */
  object VaultManager_ {
    
    @JSImport("braintree-web", "VaultManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(options: Authorization): js.Promise[VaultManager] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[VaultManager]]
    inline def create(options: Authorization, callback: callback[VaultManager]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
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
  
  @JSImport("braintree-web", "localPayment")
  @js.native
  val localPayment: LocalPayment = js.native
  
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
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("braintree-web", "vaultManager")
  @js.native
  open class vaultManager () extends VaultManager
  object vaultManager {
    
    @JSImport("braintree-web", "vaultManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(options: Authorization): js.Promise[VaultManager] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[VaultManager]]
    inline def create(options: Authorization, callback: callback[VaultManager]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("braintree-web", "venmo")
  @js.native
  val venmo: Venmo = js.native
}
