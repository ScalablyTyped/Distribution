package typings.braintreeWeb

import typings.braintreeWeb.anon.Amount
import typings.braintreeWeb.anon.Client
import typings.braintreeWeb.anon.Commercial
import typings.braintreeWeb.anon.DisplayName
import typings.braintreeWeb.anon.OmitApplePayPaymentReques
import typings.braintreeWeb.anon.Token
import typings.braintreeWeb.braintreeWebStrings.Unknown_
import typings.braintreeWeb.modulesCoreMod.callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesApplePayMod {
  
  @JSImport("braintree-web/modules/apple-pay", "ApplePaySession")
  @js.native
  open class ApplePaySession protected () extends StObject {
    def this(version: Double, request: ApplePayPaymentRequest) = this()
    
    def abort(): Unit = js.native
    
    def begin(): Unit = js.native
    
    def completeMerchantValidation(merchantSession: Any): Unit = js.native
    
    def completePayment(status: ApplePayStatusCodes): Unit = js.native
    
    def completePaymentMethodSelection(newTotal: Any, newLineItems: Any): Unit = js.native
    
    def completeShippingContactSelection(status: ApplePayStatusCodes, newShippingMethods: Any, newTotal: Any, newLineItems: Any): Unit = js.native
    
    def completeShippingMethodSelection(status: ApplePayStatusCodes, newTotal: Any, newLineItems: Any): Unit = js.native
    
    def oncancel(event: Any): Unit = js.native
    
    def onpaymentauthorized(event: Any): Unit = js.native
    
    def onpaymentmethodselected(event: Any): Unit = js.native
    
    def onshippingcontactselected(event: Any): Unit = js.native
    
    def onshippingmethodselected(event: Any): Unit = js.native
    
    def onvalidatemerchant(event: Any): Unit = js.native
  }
  /* static members */
  object ApplePaySession {
    
    @JSImport("braintree-web/modules/apple-pay", "ApplePaySession")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The requested action failed.
      */
    @JSImport("braintree-web/modules/apple-pay", "ApplePaySession.STATUS_FAILURE")
    @js.native
    val STATUS_FAILURE: Double = js.native
    
    /**
      * The billing address is not valid.
      */
    @JSImport("braintree-web/modules/apple-pay", "ApplePaySession.STATUS_INVALID_BILLING_POSTAL_ADDRESS")
    @js.native
    val STATUS_INVALID_BILLING_POSTAL_ADDRESS: Double = js.native
    
    /**
      * The shipping contact information is not valid.
      */
    @JSImport("braintree-web/modules/apple-pay", "ApplePaySession.STATUS_INVALID_SHIPPING_CONTACT")
    @js.native
    val STATUS_INVALID_SHIPPING_CONTACT: Double = js.native
    
    /**
      * The shipping address is not valid.
      */
    @JSImport("braintree-web/modules/apple-pay", "ApplePaySession.STATUS_INVALID_SHIPPING_POSTAL_ADDRESS")
    @js.native
    val STATUS_INVALID_SHIPPING_POSTAL_ADDRESS: Double = js.native
    
    /**
      * The PIN information is not valid. Cards on the China Union Pay network may require a PIN.
      */
    @JSImport("braintree-web/modules/apple-pay", "ApplePaySession.STATUS_PIN_INCORRECT")
    @js.native
    val STATUS_PIN_INCORRECT: Double = js.native
    
    /**
      * The maximum number of tries for a PIN has been reached and the user has been locked out. Cards on the China Union Pay network may require a PIN.
      */
    @JSImport("braintree-web/modules/apple-pay", "ApplePaySession.STATUS_PIN_LOCKOUT")
    @js.native
    val STATUS_PIN_LOCKOUT: Double = js.native
    
    /**
      * The required PIN information was not provided. Cards on the China Union Pay payment network may require a PIN to authenticate the transaction.
      */
    @JSImport("braintree-web/modules/apple-pay", "ApplePaySession.STATUS_PIN_REQUIRED")
    @js.native
    val STATUS_PIN_REQUIRED: Double = js.native
    
    /**
      * The requested action succeeded.
      */
    @JSImport("braintree-web/modules/apple-pay", "ApplePaySession.STATUS_SUCCESS")
    @js.native
    val STATUS_SUCCESS: Double = js.native
    
    inline def canMakePayments(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canMakePayments")().asInstanceOf[Boolean]
    
    inline def canMakePaymentsWithActiveCard(merchantIdentifier: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canMakePaymentsWithActiveCard")(merchantIdentifier.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def supportsVersion(version: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsVersion")(version.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @js.native
  sealed trait ApplePayStatusCodes extends StObject
  @JSImport("braintree-web/modules/apple-pay", "ApplePayStatusCodes")
  @js.native
  object ApplePayStatusCodes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ApplePayStatusCodes & Double] = js.native
    
    // The requested action failed.
    @js.native
    sealed trait STATUS_FAILURE
      extends StObject
         with ApplePayStatusCodes
    /* 0 */ val STATUS_FAILURE: typings.braintreeWeb.modulesApplePayMod.ApplePayStatusCodes.STATUS_FAILURE & Double = js.native
    
    // The billing address is not valid.
    @js.native
    sealed trait STATUS_INVALID_BILLING_POSTAL_ADDRESS
      extends StObject
         with ApplePayStatusCodes
    /* 1 */ val STATUS_INVALID_BILLING_POSTAL_ADDRESS: typings.braintreeWeb.modulesApplePayMod.ApplePayStatusCodes.STATUS_INVALID_BILLING_POSTAL_ADDRESS & Double = js.native
    
    // The shipping contact information is not valid.
    @js.native
    sealed trait STATUS_INVALID_SHIPPING_CONTACT
      extends StObject
         with ApplePayStatusCodes
    /* 3 */ val STATUS_INVALID_SHIPPING_CONTACT: typings.braintreeWeb.modulesApplePayMod.ApplePayStatusCodes.STATUS_INVALID_SHIPPING_CONTACT & Double = js.native
    
    // The shipping address is not valid.
    @js.native
    sealed trait STATUS_INVALID_SHIPPING_POSTAL_ADDRESS
      extends StObject
         with ApplePayStatusCodes
    /* 2 */ val STATUS_INVALID_SHIPPING_POSTAL_ADDRESS: typings.braintreeWeb.modulesApplePayMod.ApplePayStatusCodes.STATUS_INVALID_SHIPPING_POSTAL_ADDRESS & Double = js.native
    
    // The PIN information is not valid.Cards on the China Union Pay network may require a PIN.
    @js.native
    sealed trait STATUS_PIN_INCORRECT
      extends StObject
         with ApplePayStatusCodes
    /* 5 */ val STATUS_PIN_INCORRECT: typings.braintreeWeb.modulesApplePayMod.ApplePayStatusCodes.STATUS_PIN_INCORRECT & Double = js.native
    
    // The maximum number of tries for a PIN has been reached and the user has been locked out. Cards on the China Union Pay network may require a PIN.
    @js.native
    sealed trait STATUS_PIN_LOCKOUT
      extends StObject
         with ApplePayStatusCodes
    /* 6 */ val STATUS_PIN_LOCKOUT: typings.braintreeWeb.modulesApplePayMod.ApplePayStatusCodes.STATUS_PIN_LOCKOUT & Double = js.native
    
    // The required PIN information was not provided. Cards on the China Union Pay payment network may require a PIN to authenticate the transaction.
    @js.native
    sealed trait STATUS_PIN_REQUIRED
      extends StObject
         with ApplePayStatusCodes
    /* 4 */ val STATUS_PIN_REQUIRED: typings.braintreeWeb.modulesApplePayMod.ApplePayStatusCodes.STATUS_PIN_REQUIRED & Double = js.native
    
    // The requested action succeeded.
    @js.native
    sealed trait STATUS_SUCCESS
      extends StObject
         with ApplePayStatusCodes
    /* 0 */ val STATUS_SUCCESS: typings.braintreeWeb.modulesApplePayMod.ApplePayStatusCodes.STATUS_SUCCESS & Double = js.native
  }
  
  @js.native
  trait ApplePay extends StObject {
    
    /**
      * @description The current version of the SDK, i.e. `3.0.2`.
      */
    var VERSION: String = js.native
    
    def create(options: Client): Unit = js.native
    def create(options: Client, callback: callback[ApplePay]): Unit = js.native
    
    // per https://braintree.github.io/braintree-web/current/ApplePay.html#merchantIdentifier
    /**
      * Merges a payment request with Braintree defaults
      * The following properties are assigned to `paymentRequest` if not already defined
      * - countryCode
      * - currencyCode
      * - merchantCapabilities
      * - supportedNetworks
      * @example
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
    def createPaymentRequest(paymentRequest: OmitApplePayPaymentReques): ApplePayPaymentRequest = js.native
    
    @JSName("create")
    def create_Promise(options: Client): js.Promise[ApplePay] = js.native
    
    /**
      * @description A special merchant ID which represents the merchant association with Braintree. Required when using ApplePaySession.canMakePaymentsWithActiveCard.
      */
    var merchantIdentifier: js.UndefOr[String] = js.native
    
    def performValidation(options: DisplayName): js.Promise[Any] = js.native
    /**
      * Validates the merchant website, as required by ApplePaySession before payment can be authorized.     * - The canonical name for your store.
      * - The system may display this name to the user.
      * - Use a 128-character or less, UTF-8 string.
      * - Do not localize the name.     * Your Apple merchant identifier. This is the Apple Merchant ID created on the Apple Developer Portal.
      * Defaults to the merchant identifier specified in the Braintree Control Panel.
      * You can use this field to override the merchant identifier for this transaction.     * Pass the merchant session to your Apple Pay session's completeMerchantValidation method.
      * If no callback is provided this returns a promise
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
    def performValidation(options: DisplayName, callback: callback[Any]): Unit = js.native
    
    def tokenize(options: Token): js.Promise[ApplePayPayload] = js.native
    /**
      * Tokenizes an Apple Pay payment.
      * If no callback is provided this will return a promise
      * @example
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
    def tokenize(options: Token, callback: callback[ApplePayPayload]): Unit = js.native
  }
  
  trait ApplePayDetails extends StObject {
    
    var cardType: String
    
    var cardholderName: String
    
    var dpanLastTwo: String
  }
  object ApplePayDetails {
    
    inline def apply(cardType: String, cardholderName: String, dpanLastTwo: String): ApplePayDetails = {
      val __obj = js.Dynamic.literal(cardType = cardType.asInstanceOf[js.Any], cardholderName = cardholderName.asInstanceOf[js.Any], dpanLastTwo = dpanLastTwo.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplePayDetails]
    }
    
    extension [Self <: ApplePayDetails](x: Self) {
      
      inline def setCardType(value: String): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
      
      inline def setCardholderName(value: String): Self = StObject.set(x, "cardholderName", value.asInstanceOf[js.Any])
      
      inline def setDpanLastTwo(value: String): Self = StObject.set(x, "dpanLastTwo", value.asInstanceOf[js.Any])
    }
  }
  
  trait ApplePayLineItem extends StObject {
    
    var amount: String
    
    var automaticReloadPaymentThresholdAmount: js.UndefOr[String] = js.undefined
    
    var deferredPaymentDate: js.UndefOr[js.Date] = js.undefined
    
    var label: String
    
    var paymentTiming: js.UndefOr[ApplePayPaymentTiming] = js.undefined
    
    var recurringPaymentEndDate: js.UndefOr[js.Date] = js.undefined
    
    var recurringPaymentIntervalCount: js.UndefOr[Double] = js.undefined
    
    var recurringPaymentIntervalUnit: js.UndefOr[ApplePayRecurringPaymentDateUnit] = js.undefined
    
    var recurringPaymentStartDate: js.UndefOr[js.Date] = js.undefined
    
    var `type`: js.UndefOr[ApplePayLineItemType] = js.undefined
  }
  object ApplePayLineItem {
    
    inline def apply(amount: String, label: String): ApplePayLineItem = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplePayLineItem]
    }
    
    extension [Self <: ApplePayLineItem](x: Self) {
      
      inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAutomaticReloadPaymentThresholdAmount(value: String): Self = StObject.set(x, "automaticReloadPaymentThresholdAmount", value.asInstanceOf[js.Any])
      
      inline def setAutomaticReloadPaymentThresholdAmountUndefined: Self = StObject.set(x, "automaticReloadPaymentThresholdAmount", js.undefined)
      
      inline def setDeferredPaymentDate(value: js.Date): Self = StObject.set(x, "deferredPaymentDate", value.asInstanceOf[js.Any])
      
      inline def setDeferredPaymentDateUndefined: Self = StObject.set(x, "deferredPaymentDate", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setPaymentTiming(value: ApplePayPaymentTiming): Self = StObject.set(x, "paymentTiming", value.asInstanceOf[js.Any])
      
      inline def setPaymentTimingUndefined: Self = StObject.set(x, "paymentTiming", js.undefined)
      
      inline def setRecurringPaymentEndDate(value: js.Date): Self = StObject.set(x, "recurringPaymentEndDate", value.asInstanceOf[js.Any])
      
      inline def setRecurringPaymentEndDateUndefined: Self = StObject.set(x, "recurringPaymentEndDate", js.undefined)
      
      inline def setRecurringPaymentIntervalCount(value: Double): Self = StObject.set(x, "recurringPaymentIntervalCount", value.asInstanceOf[js.Any])
      
      inline def setRecurringPaymentIntervalCountUndefined: Self = StObject.set(x, "recurringPaymentIntervalCount", js.undefined)
      
      inline def setRecurringPaymentIntervalUnit(value: ApplePayRecurringPaymentDateUnit): Self = StObject.set(x, "recurringPaymentIntervalUnit", value.asInstanceOf[js.Any])
      
      inline def setRecurringPaymentIntervalUnitUndefined: Self = StObject.set(x, "recurringPaymentIntervalUnit", js.undefined)
      
      inline def setRecurringPaymentStartDate(value: js.Date): Self = StObject.set(x, "recurringPaymentStartDate", value.asInstanceOf[js.Any])
      
      inline def setRecurringPaymentStartDateUndefined: Self = StObject.set(x, "recurringPaymentStartDate", js.undefined)
      
      inline def setType(value: ApplePayLineItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.braintreeWeb.braintreeWebStrings.`final`
    - typings.braintreeWeb.braintreeWebStrings.pending
  */
  trait ApplePayLineItemType extends StObject
  object ApplePayLineItemType {
    
    inline def `final`: typings.braintreeWeb.braintreeWebStrings.`final` = "final".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.`final`]
    
    inline def pending: typings.braintreeWeb.braintreeWebStrings.pending = "pending".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.pending]
  }
  
  trait ApplePayPayload extends StObject {
    
    var binData: Commercial
    
    var consumed: Boolean
    
    var description: String
    
    var details: ApplePayDetails
    
    var nonce: String
    
    var `type`: String
  }
  object ApplePayPayload {
    
    inline def apply(
      binData: Commercial,
      consumed: Boolean,
      description: String,
      details: ApplePayDetails,
      nonce: String,
      `type`: String
    ): ApplePayPayload = {
      val __obj = js.Dynamic.literal(binData = binData.asInstanceOf[js.Any], consumed = consumed.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplePayPayload]
    }
    
    extension [Self <: ApplePayPayload](x: Self) {
      
      inline def setBinData(value: Commercial): Self = StObject.set(x, "binData", value.asInstanceOf[js.Any])
      
      inline def setConsumed(value: Boolean): Self = StObject.set(x, "consumed", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: ApplePayDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ApplePayPaymentRequest extends StObject {
    
    var billingContact: js.UndefOr[Any] = js.undefined
    
    var countryCode: String
    
    var currencyCode: String
    
    /**
      * @description Optional array of items to display in the payment sheet per https://developer.apple.com/documentation/apple_pay_on_the_web/applepaypaymentrequest/1916120-lineitems
      */
    var lineItems: js.UndefOr[js.Array[ApplePayLineItem]] = js.undefined
    
    var merchantCapabilities: js.Array[String]
    
    var requiredBillingContactFields: js.UndefOr[Any] = js.undefined
    
    var requiredShippingContactFields: js.UndefOr[Any] = js.undefined
    
    // See https://developer.apple.com/documentation/apple_pay_on_the_web/applepaypaymentrequest/1916120-lineitems
    var shippingContact: js.UndefOr[Any] = js.undefined
    
    var shippingMethods: js.UndefOr[Any] = js.undefined
    
    var shippingType: js.UndefOr[Any] = js.undefined
    
    var supportedNetworks: js.Array[String]
    
    var total: Amount
  }
  object ApplePayPaymentRequest {
    
    inline def apply(
      countryCode: String,
      currencyCode: String,
      merchantCapabilities: js.Array[String],
      supportedNetworks: js.Array[String],
      total: Amount
    ): ApplePayPaymentRequest = {
      val __obj = js.Dynamic.literal(countryCode = countryCode.asInstanceOf[js.Any], currencyCode = currencyCode.asInstanceOf[js.Any], merchantCapabilities = merchantCapabilities.asInstanceOf[js.Any], supportedNetworks = supportedNetworks.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplePayPaymentRequest]
    }
    
    extension [Self <: ApplePayPaymentRequest](x: Self) {
      
      inline def setBillingContact(value: Any): Self = StObject.set(x, "billingContact", value.asInstanceOf[js.Any])
      
      inline def setBillingContactUndefined: Self = StObject.set(x, "billingContact", js.undefined)
      
      inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
      
      inline def setLineItems(value: js.Array[ApplePayLineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
      
      inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
      
      inline def setLineItemsVarargs(value: ApplePayLineItem*): Self = StObject.set(x, "lineItems", js.Array(value*))
      
      inline def setMerchantCapabilities(value: js.Array[String]): Self = StObject.set(x, "merchantCapabilities", value.asInstanceOf[js.Any])
      
      inline def setMerchantCapabilitiesVarargs(value: String*): Self = StObject.set(x, "merchantCapabilities", js.Array(value*))
      
      inline def setRequiredBillingContactFields(value: Any): Self = StObject.set(x, "requiredBillingContactFields", value.asInstanceOf[js.Any])
      
      inline def setRequiredBillingContactFieldsUndefined: Self = StObject.set(x, "requiredBillingContactFields", js.undefined)
      
      inline def setRequiredShippingContactFields(value: Any): Self = StObject.set(x, "requiredShippingContactFields", value.asInstanceOf[js.Any])
      
      inline def setRequiredShippingContactFieldsUndefined: Self = StObject.set(x, "requiredShippingContactFields", js.undefined)
      
      inline def setShippingContact(value: Any): Self = StObject.set(x, "shippingContact", value.asInstanceOf[js.Any])
      
      inline def setShippingContactUndefined: Self = StObject.set(x, "shippingContact", js.undefined)
      
      inline def setShippingMethods(value: Any): Self = StObject.set(x, "shippingMethods", value.asInstanceOf[js.Any])
      
      inline def setShippingMethodsUndefined: Self = StObject.set(x, "shippingMethods", js.undefined)
      
      inline def setShippingType(value: Any): Self = StObject.set(x, "shippingType", value.asInstanceOf[js.Any])
      
      inline def setShippingTypeUndefined: Self = StObject.set(x, "shippingType", js.undefined)
      
      inline def setSupportedNetworks(value: js.Array[String]): Self = StObject.set(x, "supportedNetworks", value.asInstanceOf[js.Any])
      
      inline def setSupportedNetworksVarargs(value: String*): Self = StObject.set(x, "supportedNetworks", js.Array(value*))
      
      inline def setTotal(value: Amount): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.braintreeWeb.braintreeWebStrings.immediate
    - typings.braintreeWeb.braintreeWebStrings.recurring
    - typings.braintreeWeb.braintreeWebStrings.deferred
    - typings.braintreeWeb.braintreeWebStrings.automaticReload
  */
  trait ApplePayPaymentTiming extends StObject
  object ApplePayPaymentTiming {
    
    inline def automaticReload: typings.braintreeWeb.braintreeWebStrings.automaticReload = "automaticReload".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.automaticReload]
    
    inline def deferred: typings.braintreeWeb.braintreeWebStrings.deferred = "deferred".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.deferred]
    
    inline def immediate: typings.braintreeWeb.braintreeWebStrings.immediate = "immediate".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.immediate]
    
    inline def recurring: typings.braintreeWeb.braintreeWebStrings.recurring = "recurring".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.recurring]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.braintreeWeb.braintreeWebStrings.year
    - typings.braintreeWeb.braintreeWebStrings.month
    - typings.braintreeWeb.braintreeWebStrings.day
    - typings.braintreeWeb.braintreeWebStrings.hour
    - typings.braintreeWeb.braintreeWebStrings.minute
  */
  trait ApplePayRecurringPaymentDateUnit extends StObject
  object ApplePayRecurringPaymentDateUnit {
    
    inline def day: typings.braintreeWeb.braintreeWebStrings.day = "day".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.day]
    
    inline def hour: typings.braintreeWeb.braintreeWebStrings.hour = "hour".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.hour]
    
    inline def minute: typings.braintreeWeb.braintreeWebStrings.minute = "minute".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.minute]
    
    inline def month: typings.braintreeWeb.braintreeWebStrings.month = "month".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.month]
    
    inline def year: typings.braintreeWeb.braintreeWebStrings.year = "year".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.year]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.braintreeWeb.braintreeWebStrings.Yes
    - typings.braintreeWeb.braintreeWebStrings.No
    - typings.braintreeWeb.braintreeWebStrings.Unknown_
  */
  trait ApplePayTokenizeValues extends StObject
  object ApplePayTokenizeValues {
    
    inline def No: typings.braintreeWeb.braintreeWebStrings.No = "No".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.No]
    
    inline def Unknown: Unknown_ = "Unknown".asInstanceOf[Unknown_]
    
    inline def Yes: typings.braintreeWeb.braintreeWebStrings.Yes = "Yes".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.Yes]
  }
}
