package typings.braintreeWeb

import typings.braintreeWeb.anon.Amount
import typings.braintreeWeb.anon.Client
import typings.braintreeWeb.anon.DisplayName
import typings.braintreeWeb.anon.Token
import typings.braintreeWeb.coreMod.callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applePayMod {
  
  @JSImport("braintree-web/modules/apple-pay", "ApplePaySession")
  @js.native
  class ApplePaySession protected () extends StObject {
    def this(version: Double, request: ApplePayPaymentRequest) = this()
    
    def abort(): Unit = js.native
    
    def begin(): Unit = js.native
    
    def canMakePayments(): Boolean = js.native
    
    def canMakePaymentsWithActiveCard(merchantIdentifier: String): Boolean = js.native
    
    def completeMerchantValidation(merchantSession: js.Any): Unit = js.native
    
    def completePayment(status: ApplePayStatusCodes): Unit = js.native
    
    def completePaymentMethodSelection(newTotal: js.Any, newLineItems: js.Any): Unit = js.native
    
    def completeShippingContactSelection(status: ApplePayStatusCodes, newShippingMethods: js.Any, newTotal: js.Any, newLineItems: js.Any): Unit = js.native
    
    def completeShippingMethodSelection(status: ApplePayStatusCodes, newTotal: js.Any, newLineItems: js.Any): Unit = js.native
    
    def oncancel(event: js.Any): Unit = js.native
    
    def onpaymentauthorized(event: js.Any): Unit = js.native
    
    def onpaymentmethodselected(event: js.Any): Unit = js.native
    
    def onshippingcontactselected(event: js.Any): Unit = js.native
    
    def onshippingmethodselected(event: js.Any): Unit = js.native
    
    def onvalidatemerchant(event: js.Any): Unit = js.native
    
    def supportsVersion(version: Double): Boolean = js.native
  }
  
  @js.native
  sealed trait ApplePayStatusCodes extends StObject
  @JSImport("braintree-web/modules/apple-pay", "ApplePayStatusCodes")
  @js.native
  object ApplePayStatusCodes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ApplePayStatusCodes with Double] = js.native
    
    // The requested action failed.
    @js.native
    sealed trait STATUS_FAILURE extends ApplePayStatusCodes
    /* 0 */ val STATUS_FAILURE: typings.braintreeWeb.applePayMod.ApplePayStatusCodes.STATUS_FAILURE with Double = js.native
    
    // The billing address is not valid.
    @js.native
    sealed trait STATUS_INVALID_BILLING_POSTAL_ADDRESS extends ApplePayStatusCodes
    /* 1 */ val STATUS_INVALID_BILLING_POSTAL_ADDRESS: typings.braintreeWeb.applePayMod.ApplePayStatusCodes.STATUS_INVALID_BILLING_POSTAL_ADDRESS with Double = js.native
    
    // The shipping contact information is not valid.
    @js.native
    sealed trait STATUS_INVALID_SHIPPING_CONTACT extends ApplePayStatusCodes
    /* 3 */ val STATUS_INVALID_SHIPPING_CONTACT: typings.braintreeWeb.applePayMod.ApplePayStatusCodes.STATUS_INVALID_SHIPPING_CONTACT with Double = js.native
    
    // The shipping address is not valid.
    @js.native
    sealed trait STATUS_INVALID_SHIPPING_POSTAL_ADDRESS extends ApplePayStatusCodes
    /* 2 */ val STATUS_INVALID_SHIPPING_POSTAL_ADDRESS: typings.braintreeWeb.applePayMod.ApplePayStatusCodes.STATUS_INVALID_SHIPPING_POSTAL_ADDRESS with Double = js.native
    
    // The PIN information is not valid.Cards on the China Union Pay network may require a PIN.
    @js.native
    sealed trait STATUS_PIN_INCORRECT extends ApplePayStatusCodes
    /* 5 */ val STATUS_PIN_INCORRECT: typings.braintreeWeb.applePayMod.ApplePayStatusCodes.STATUS_PIN_INCORRECT with Double = js.native
    
    // The maximum number of tries for a PIN has been reached and the user has been locked out. Cards on the China Union Pay network may require a PIN.
    @js.native
    sealed trait STATUS_PIN_LOCKOUT extends ApplePayStatusCodes
    /* 6 */ val STATUS_PIN_LOCKOUT: typings.braintreeWeb.applePayMod.ApplePayStatusCodes.STATUS_PIN_LOCKOUT with Double = js.native
    
    // The required PIN information was not provided. Cards on the China Union Pay payment network may require a PIN to authenticate the transaction.
    @js.native
    sealed trait STATUS_PIN_REQUIRED extends ApplePayStatusCodes
    /* 4 */ val STATUS_PIN_REQUIRED: typings.braintreeWeb.applePayMod.ApplePayStatusCodes.STATUS_PIN_REQUIRED with Double = js.native
    
    // The requested action succeeded.
    @js.native
    sealed trait STATUS_SUCCESS extends ApplePayStatusCodes
    /* 1 */ val STATUS_SUCCESS: typings.braintreeWeb.applePayMod.ApplePayStatusCodes.STATUS_SUCCESS with Double = js.native
  }
  
  @js.native
  trait ApplePay extends StObject {
    
    /**
      * @description The current version of the SDK, i.e. `3.0.2`.
      */
    var VERSION: String = js.native
    
    def create(options: Client): Unit = js.native
    def create(options: Client, callback: callback[_]): Unit = js.native
    
    /**
      * Merges a payment request with Braintree defaults
      * The following properties are assigned to `paymentRequest` if not already defined
      * - countryCode
      * - currencyCode
      * - merchantCapabilities
      * - supportedNetworks     * @example
      * var applePay = require('braintree-web/apple-pay');
      *
      * applePay.create({client: clientInstance}, function (createErr, applePayInstance) {
      *   // ...
      *   var paymentRequest = applePay.createPaymentRequest({
      *    total: {
      *      label: 'My Company',
      *      amount: '19.99'
      *   });
      *
      *   console.log(paymentRequest);
      *   // { total: { }, countryCode: 'US', currencyCode: 'USD', merchantCapabilities: [ ], supportedNetworks: [ ] }
      *
      */
    def createPaymentRequest(paymentRequest: ApplePayPaymentRequest): ApplePayPaymentRequest = js.native
    
    @JSName("create")
    def create_Promise(options: Client): js.Promise[_] = js.native
    
    /**
      * Validates the merchant website, as required by ApplePaySession before payment can be authorized.     * - The canonical name for your store.
      * - The system may display this name to the user.
      * - Use a 128-character or less, UTF-8 string.
      * - Do not localize the name.     * Your Apple merchant identifier. This is the Apple Merchant ID created on the Apple Developer Portal.
      * Defaults to the merchant identifier specified in the Braintree Control Panel.
      * You can use this field to override the merchant identifier for this transaction.     * Pass the merchant session to your Apple Pay session's completeMerchantValidation method.
      * @example
      * var applePay = require('braintree-web/apple-pay');
      *
      * applePay.create({client: clientInstance}, function (createErr, applePayInstance) {
      *   var session = new ApplePaySession(1, {
      *     // This should be the payment request object that
      *     // contains the information needed to display the payment sheet.
      *   });
      *
      *   session.onvalidatemerchant = function (event) {
      *     applePay.performValidation({
      *       validationURL: event.validationURL
      *     }, function(err, validationData) {
      *       if (err) {
      *         console.error(err);
      *         session.abort();
      *         return;
      *       }
      *       session.completeMerchantValidation(validationData);
      *     });
      *   };
      * });
      */
    def performValidation(options: DisplayName, callback: callback[_]): Unit = js.native
    
    /**
      * Tokenizes an Apple Pay payment.     * @example
      * var applePay = require('braintree-web/apple-pay');
      *
      * applePay.create({client: clientInstance}, function (createErr, applePayInstance) {
      *   var session = new ApplePaySession(1, { });
      *
      *   session.onpaymentauthorized = function (event) {
      *     applePay.tokenize({
      *       token: event.payment.token
      *     }, function (err, tokenizedPayload) {
      *       if (err) {
      *         session.completePayment(ApplePaySession.STATUS_FAILURE);
      *         return;
      *       }
      *       session.completePayment(ApplePaySession.STATUS_SUCCESS);
      *
      *       // Send the tokenizedPayload to your server.
      *     });
      *  };
      * });
      */
    def tokenize(options: Token, callback: callback[_]): Unit = js.native
  }
  
  @js.native
  trait ApplePayPayload extends StObject {
    
    var displayName: String = js.native
    
    var domainName: String = js.native
    
    var merchantIdentifier: String = js.native
  }
  object ApplePayPayload {
    
    @scala.inline
    def apply(displayName: String, domainName: String, merchantIdentifier: String): ApplePayPayload = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], merchantIdentifier = merchantIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplePayPayload]
    }
    
    @scala.inline
    implicit class ApplePayPayloadMutableBuilder[Self <: ApplePayPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMerchantIdentifier(value: String): Self = StObject.set(x, "merchantIdentifier", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ApplePayPaymentRequest extends StObject {
    
    var billingContact: js.UndefOr[js.Any] = js.native
    
    var countryCode: String = js.native
    
    var currencyCode: String = js.native
    
    var merchantCapabilities: js.Array[String] = js.native
    
    var requiredBillingContactFields: js.UndefOr[js.Any] = js.native
    
    var requiredShippingContactFields: js.UndefOr[js.Any] = js.native
    
    var shippingContact: js.UndefOr[js.Any] = js.native
    
    var shippingMethods: js.UndefOr[js.Any] = js.native
    
    var shippingType: js.UndefOr[js.Any] = js.native
    
    var supportedNetworks: js.Array[String] = js.native
    
    var total: Amount = js.native
  }
  object ApplePayPaymentRequest {
    
    @scala.inline
    def apply(
      countryCode: String,
      currencyCode: String,
      merchantCapabilities: js.Array[String],
      supportedNetworks: js.Array[String],
      total: Amount
    ): ApplePayPaymentRequest = {
      val __obj = js.Dynamic.literal(countryCode = countryCode.asInstanceOf[js.Any], currencyCode = currencyCode.asInstanceOf[js.Any], merchantCapabilities = merchantCapabilities.asInstanceOf[js.Any], supportedNetworks = supportedNetworks.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplePayPaymentRequest]
    }
    
    @scala.inline
    implicit class ApplePayPaymentRequestMutableBuilder[Self <: ApplePayPaymentRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBillingContact(value: js.Any): Self = StObject.set(x, "billingContact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBillingContactUndefined: Self = StObject.set(x, "billingContact", js.undefined)
      
      @scala.inline
      def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMerchantCapabilities(value: js.Array[String]): Self = StObject.set(x, "merchantCapabilities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMerchantCapabilitiesVarargs(value: String*): Self = StObject.set(x, "merchantCapabilities", js.Array(value :_*))
      
      @scala.inline
      def setRequiredBillingContactFields(value: js.Any): Self = StObject.set(x, "requiredBillingContactFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredBillingContactFieldsUndefined: Self = StObject.set(x, "requiredBillingContactFields", js.undefined)
      
      @scala.inline
      def setRequiredShippingContactFields(value: js.Any): Self = StObject.set(x, "requiredShippingContactFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredShippingContactFieldsUndefined: Self = StObject.set(x, "requiredShippingContactFields", js.undefined)
      
      @scala.inline
      def setShippingContact(value: js.Any): Self = StObject.set(x, "shippingContact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingContactUndefined: Self = StObject.set(x, "shippingContact", js.undefined)
      
      @scala.inline
      def setShippingMethods(value: js.Any): Self = StObject.set(x, "shippingMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingMethodsUndefined: Self = StObject.set(x, "shippingMethods", js.undefined)
      
      @scala.inline
      def setShippingType(value: js.Any): Self = StObject.set(x, "shippingType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingTypeUndefined: Self = StObject.set(x, "shippingType", js.undefined)
      
      @scala.inline
      def setSupportedNetworks(value: js.Array[String]): Self = StObject.set(x, "supportedNetworks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedNetworksVarargs(value: String*): Self = StObject.set(x, "supportedNetworks", js.Array(value :_*))
      
      @scala.inline
      def setTotal(value: Amount): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
