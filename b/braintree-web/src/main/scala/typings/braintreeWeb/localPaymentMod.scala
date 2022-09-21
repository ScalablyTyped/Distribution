package typings.braintreeWeb

import typings.braintreeWeb.anon.Height
import typings.braintreeWeb.clientMod.Client
import typings.braintreeWeb.coreMod.callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localPaymentMod {
  
  @js.native
  trait LocalPayment extends StObject {
    
    /**
      * The current version of the SDK, i.e. 3.84.0.
      */
    var VERSION: String = js.native
    
    /**
      * Closes the LocalPayment window if it is open.
      * @example
      * localPaymentInstance.closeWindow();
      */
    def closeWindow(): Unit = js.native
    
    /**
      * braintree.localPayment.create({
      *     client: client
      * }, callback)
      */
    def create(options: LocalPaymentCreateOptions): js.Promise[LocalPayment] = js.native
    def create(options: LocalPaymentCreateOptions, callback: callback[LocalPayment]): Unit = js.native
    
    /**
      * Focuses the LocalPayment window if it is open.
      * @example
      * localPaymentInstance.focusWindow();
      */
    def focusWindow(): Unit = js.native
    
    /**
      * Checks if required tokenization parameters are available in querystring for manual tokenization requests.
      * @example
      * // if query string contains
      * // ?btLpToken=token&btLpPaymentId=payment-id&btLpPayerId=payer-id
      * localPaymentInstance.hasTokenizationParams(); // true
      * // if query string is missing required params
      * localPaymentInstance.hasTokenizationParams(); // false
      * if (localPaymentInstance.hasTokenizationParams()) {
      *   localPaymentInstance.tokenize();
      * }
      */
    def hasTokenizationParams(): Boolean = js.native
    
    def startPayment(options: LocalPaymentStartPaymentOptions): Unit = js.native
    def startPayment(options: LocalPaymentStartPaymentOptions, callback: callback[LocalPaymentTokenizePayload]): Unit = js.native
    /**
      * Launches the local payment flow and returns a nonce payload. Only one local payment flow should be active at a time.
      * One way to achieve this is to disable your local payment button while the flow is open.
      * @example
      * button.addEventListener('click', function () {
      *  // Disable the button when local payment is in progress
      *  button.setAttribute('disabled', 'disabled');
      *  // Because startPayment opens a new window, this must be called
      *  // as a result of a user action, such as a button click.
      *  localPaymentInstance.startPayment({
      *      paymentType: 'ideal',
      *      paymentTypeCountryCode: 'NL',
      *      fallback: {
      *          buttonText: 'Return to Merchant',
      *          url: 'https://example.com/my-checkout-page'
      *      },
      *          amount: '10.00',
      *          currencyCode: 'EUR',
      *          onPaymentStart: function (data, continueCallback) {
      *              // Do any preprocessing before starting the flow
      *              // data.paymentId is the ID of the localPayment
      *              continueCallback();
      *          }
      *      }).then(function (payload) {
      *          button.removeAttribute('disabled');
      *          // Submit payload.nonce to your server
      *      }).catch(function (startPaymentError) {
      *          button.removeAttribute('disabled');
      *          // Handle flow errors or premature flow closure
      *          console.error('Error!', startPaymentError);
      *      });
      * });
      */
    @JSName("startPayment")
    def startPayment_Promise(options: LocalPaymentStartPaymentOptions): js.Promise[LocalPaymentTokenizePayload] = js.native
    
    /**
      * Cleanly remove anything set up by {@link module:braintree-web/local-payment.create|create}.
      * @example
      * localPaymentInstance.teardown();
      * @example <caption>With callback</caption>
      * localPaymentInstance.teardown(function () {
      *   // teardown is complete
      * });
      */
    def teardown(): Unit = js.native
    def teardown(callback: callback[Any]): Unit = js.native
    @JSName("teardown")
    def teardown_Promise(): js.Promise[Unit] = js.native
    
    def tokenize(): Unit = js.native
    def tokenize(params: Unit, callback: callback[LocalPaymentTokenizePayload]): Unit = js.native
    def tokenize(params: LocalPaymentTokenizeOptions): Unit = js.native
    def tokenize(params: LocalPaymentTokenizeOptions, callback: callback[LocalPaymentTokenizePayload]): Unit = js.native
    /**
      * Manually tokenizes params for a local payment received from PayPal.
      * When app switching back from a mobile application (such as a bank application for an iDEAL payment) the window may lose context with the parent page.
      * In that case, a fallback url is used, and this method can be used to finish the flow.
      * @example
      * localPaymentInstance.tokenize().then(function (payload) {
      *  // send payload.nonce to your server
      * }).catch(function (err) {
      *  // handle tokenization error
      * });
      */
    @JSName("tokenize")
    def tokenize_Promise(): js.Promise[LocalPaymentTokenizePayload] = js.native
    @JSName("tokenize")
    def tokenize_Promise(params: LocalPaymentTokenizeOptions): js.Promise[LocalPaymentTokenizePayload] = js.native
  }
  
  trait LocalPaymentAddress extends StObject {
    
    var countryCode: js.UndefOr[String] = js.undefined
    
    var extendedAddress: js.UndefOr[String] = js.undefined
    
    var locality: js.UndefOr[String] = js.undefined
    
    var postalCode: js.UndefOr[String] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var streetAddress: js.UndefOr[String] = js.undefined
  }
  object LocalPaymentAddress {
    
    inline def apply(): LocalPaymentAddress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocalPaymentAddress]
    }
    
    extension [Self <: LocalPaymentAddress](x: Self) {
      
      inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
      
      inline def setExtendedAddress(value: String): Self = StObject.set(x, "extendedAddress", value.asInstanceOf[js.Any])
      
      inline def setExtendedAddressUndefined: Self = StObject.set(x, "extendedAddress", js.undefined)
      
      inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
      
      inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
      
      inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
      
      inline def setStreetAddressUndefined: Self = StObject.set(x, "streetAddress", js.undefined)
    }
  }
  
  trait LocalPaymentCreateOptions extends StObject {
    
    var authorization: js.UndefOr[String] = js.undefined
    
    var client: js.UndefOr[Client] = js.undefined
    
    var merchantAccountId: js.UndefOr[String] = js.undefined
  }
  object LocalPaymentCreateOptions {
    
    inline def apply(): LocalPaymentCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocalPaymentCreateOptions]
    }
    
    extension [Self <: LocalPaymentCreateOptions](x: Self) {
      
      inline def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
      
      inline def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setMerchantAccountId(value: String): Self = StObject.set(x, "merchantAccountId", value.asInstanceOf[js.Any])
      
      inline def setMerchantAccountIdUndefined: Self = StObject.set(x, "merchantAccountId", js.undefined)
    }
  }
  
  trait LocalPaymentFallback extends StObject {
    
    var buttonText: js.UndefOr[String] = js.undefined
    
    var cancelButtonText: js.UndefOr[String] = js.undefined
    
    var cancelUrl: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object LocalPaymentFallback {
    
    inline def apply(): LocalPaymentFallback = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocalPaymentFallback]
    }
    
    extension [Self <: LocalPaymentFallback](x: Self) {
      
      inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      inline def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
      
      inline def setCancelButtonTextUndefined: Self = StObject.set(x, "cancelButtonText", js.undefined)
      
      inline def setCancelUrl(value: String): Self = StObject.set(x, "cancelUrl", value.asInstanceOf[js.Any])
      
      inline def setCancelUrlUndefined: Self = StObject.set(x, "cancelUrl", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait LocalPaymentStartData extends StObject {
    
    var paymentId: String
  }
  object LocalPaymentStartData {
    
    inline def apply(paymentId: String): LocalPaymentStartData = {
      val __obj = js.Dynamic.literal(paymentId = paymentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalPaymentStartData]
    }
    
    extension [Self <: LocalPaymentStartData](x: Self) {
      
      inline def setPaymentId(value: String): Self = StObject.set(x, "paymentId", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocalPaymentStartPaymentOptions extends StObject {
    
    var address: js.UndefOr[LocalPaymentAddress] = js.undefined
    
    var amount: String | Double
    
    var bic: js.UndefOr[String] = js.undefined
    
    var countryCode: js.UndefOr[String] = js.undefined
    
    var currencyCode: String
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var fallback: js.UndefOr[LocalPaymentFallback] = js.undefined
    
    var givenName: js.UndefOr[String] = js.undefined
    
    var onPaymentStart: js.UndefOr[
        js.Function2[/* data */ LocalPaymentStartData, /* callback */ callback[Any], Unit]
      ] = js.undefined
    
    var paymentType: LocalPaymentTypes
    
    var paymentTypeCountryCode: js.UndefOr[String] = js.undefined
    
    var phone: js.UndefOr[String] = js.undefined
    
    var shippingAddressRequired: js.UndefOr[Boolean] = js.undefined
    
    var surname: js.UndefOr[String] = js.undefined
    
    var windowOptions: js.UndefOr[Height] = js.undefined
  }
  object LocalPaymentStartPaymentOptions {
    
    inline def apply(amount: String | Double, currencyCode: String, paymentType: LocalPaymentTypes): LocalPaymentStartPaymentOptions = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currencyCode = currencyCode.asInstanceOf[js.Any], paymentType = paymentType.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalPaymentStartPaymentOptions]
    }
    
    extension [Self <: LocalPaymentStartPaymentOptions](x: Self) {
      
      inline def setAddress(value: LocalPaymentAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setAmount(value: String | Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setBic(value: String): Self = StObject.set(x, "bic", value.asInstanceOf[js.Any])
      
      inline def setBicUndefined: Self = StObject.set(x, "bic", js.undefined)
      
      inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
      
      inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setFallback(value: LocalPaymentFallback): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
      
      inline def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
      
      inline def setOnPaymentStart(value: (/* data */ LocalPaymentStartData, /* callback */ callback[Any]) => Unit): Self = StObject.set(x, "onPaymentStart", js.Any.fromFunction2(value))
      
      inline def setOnPaymentStartUndefined: Self = StObject.set(x, "onPaymentStart", js.undefined)
      
      inline def setPaymentType(value: LocalPaymentTypes): Self = StObject.set(x, "paymentType", value.asInstanceOf[js.Any])
      
      inline def setPaymentTypeCountryCode(value: String): Self = StObject.set(x, "paymentTypeCountryCode", value.asInstanceOf[js.Any])
      
      inline def setPaymentTypeCountryCodeUndefined: Self = StObject.set(x, "paymentTypeCountryCode", js.undefined)
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
      
      inline def setShippingAddressRequired(value: Boolean): Self = StObject.set(x, "shippingAddressRequired", value.asInstanceOf[js.Any])
      
      inline def setShippingAddressRequiredUndefined: Self = StObject.set(x, "shippingAddressRequired", js.undefined)
      
      inline def setSurname(value: String): Self = StObject.set(x, "surname", value.asInstanceOf[js.Any])
      
      inline def setSurnameUndefined: Self = StObject.set(x, "surname", js.undefined)
      
      inline def setWindowOptions(value: Height): Self = StObject.set(x, "windowOptions", value.asInstanceOf[js.Any])
      
      inline def setWindowOptionsUndefined: Self = StObject.set(x, "windowOptions", js.undefined)
    }
  }
  
  trait LocalPaymentTokenizeOptions extends StObject {
    
    var btLpPayerId: js.UndefOr[String] = js.undefined
    
    var btLpPaymentId: js.UndefOr[String] = js.undefined
    
    var btLpToken: js.UndefOr[String] = js.undefined
  }
  object LocalPaymentTokenizeOptions {
    
    inline def apply(): LocalPaymentTokenizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocalPaymentTokenizeOptions]
    }
    
    extension [Self <: LocalPaymentTokenizeOptions](x: Self) {
      
      inline def setBtLpPayerId(value: String): Self = StObject.set(x, "btLpPayerId", value.asInstanceOf[js.Any])
      
      inline def setBtLpPayerIdUndefined: Self = StObject.set(x, "btLpPayerId", js.undefined)
      
      inline def setBtLpPaymentId(value: String): Self = StObject.set(x, "btLpPaymentId", value.asInstanceOf[js.Any])
      
      inline def setBtLpPaymentIdUndefined: Self = StObject.set(x, "btLpPaymentId", js.undefined)
      
      inline def setBtLpToken(value: String): Self = StObject.set(x, "btLpToken", value.asInstanceOf[js.Any])
      
      inline def setBtLpTokenUndefined: Self = StObject.set(x, "btLpToken", js.undefined)
    }
  }
  
  trait LocalPaymentTokenizePayload extends StObject {
    
    var correlationId: String
    
    var details: Any
    
    var nonce: String
    
    var `type`: String
  }
  object LocalPaymentTokenizePayload {
    
    inline def apply(correlationId: String, details: Any, nonce: String, `type`: String): LocalPaymentTokenizePayload = {
      val __obj = js.Dynamic.literal(correlationId = correlationId.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalPaymentTokenizePayload]
    }
    
    extension [Self <: LocalPaymentTokenizePayload](x: Self) {
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: Any): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.braintreeWeb.braintreeWebStrings.bancontact
    - typings.braintreeWeb.braintreeWebStrings.blik
    - typings.braintreeWeb.braintreeWebStrings.eps
    - typings.braintreeWeb.braintreeWebStrings.giropay
    - typings.braintreeWeb.braintreeWebStrings.ideal
    - typings.braintreeWeb.braintreeWebStrings.sofort
    - typings.braintreeWeb.braintreeWebStrings.mybank
    - typings.braintreeWeb.braintreeWebStrings.p24
    - typings.braintreeWeb.braintreeWebStrings.trustly
  */
  trait LocalPaymentTypes extends StObject
  object LocalPaymentTypes {
    
    inline def bancontact: typings.braintreeWeb.braintreeWebStrings.bancontact = "bancontact".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.bancontact]
    
    inline def blik: typings.braintreeWeb.braintreeWebStrings.blik = "blik".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.blik]
    
    inline def eps: typings.braintreeWeb.braintreeWebStrings.eps = "eps".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.eps]
    
    inline def giropay: typings.braintreeWeb.braintreeWebStrings.giropay = "giropay".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.giropay]
    
    inline def ideal: typings.braintreeWeb.braintreeWebStrings.ideal = "ideal".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.ideal]
    
    inline def mybank: typings.braintreeWeb.braintreeWebStrings.mybank = "mybank".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.mybank]
    
    inline def p24: typings.braintreeWeb.braintreeWebStrings.p24 = "p24".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.p24]
    
    inline def sofort: typings.braintreeWeb.braintreeWebStrings.sofort = "sofort".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.sofort]
    
    inline def trustly: typings.braintreeWeb.braintreeWebStrings.trustly = "trustly".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.trustly]
  }
}
