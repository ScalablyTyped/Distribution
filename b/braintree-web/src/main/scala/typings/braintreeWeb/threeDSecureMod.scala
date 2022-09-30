package typings.braintreeWeb

import typings.braintreeWeb.anon.Bin
import typings.braintreeWeb.anon.LiabilityShiftPossible
import typings.braintreeWeb.anon.ThreeDSecureVersion
import typings.braintreeWeb.braintreeWebInts.`1`
import typings.braintreeWeb.braintreeWebInts.`2`
import typings.braintreeWeb.braintreeWebStrings.`2-bootstrap3-modal`
import typings.braintreeWeb.braintreeWebStrings.`2-inline-iframe`
import typings.braintreeWeb.braintreeWebStrings.`lookup-complete`
import typings.braintreeWeb.clientMod.Client
import typings.braintreeWeb.coreMod.BraintreeError
import typings.braintreeWeb.coreMod.callback
import typings.std.HTMLIFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object threeDSecureMod {
  
  @js.native
  trait ThreeDSecure extends StObject {
    
    /**
      * @description The current version of the SDK, i.e. `3.0.2`.
      */
    var VERSION: String = js.native
    
    def addFrameCallback(): Unit = js.native
    def addFrameCallback(err: Unit, iframe: HTMLIFrameElement): Unit = js.native
    def addFrameCallback(err: BraintreeError): Unit = js.native
    def addFrameCallback(err: BraintreeError, iframe: HTMLIFrameElement): Unit = js.native
    
    /**
      * Cancel the 3DS flow and return the verification payload if available.
      * @example
      * threeDSecure.cancelVerifyCard(function (err, verifyPayload) {
      *   if (err) {
      *     // Handle error
      *     console.log(err.message); // No verification payload available
      *     return;
      *   }
      *
      *   verifyPayload.nonce; // The nonce returned from the 3ds lookup call
      *   verifyPayload.liabilityShifted; // boolean
      *   verifyPayload.liabilityShiftPossible; // boolean
      * });
      */
    def cancelVerifyCard(callback: callback[Any]): Unit = js.native
    
    /**
      * braintree.threeDSecure.create({
      *   client: client
      * }, callback);
      */
    def create(options: ThreeDSecureCreateOptions): js.Promise[ThreeDSecure] = js.native
    def create(options: ThreeDSecureCreateOptions, callback: callback[ThreeDSecure]): Unit = js.native
    
    /**
      * Unsubscribes the handler function to a named event.
      * Documentation link: https://braintree.github.io/braintree-web/current/ThreeDSecure.html#off
      */
    def off(
      event: ThreeDSecureEvent,
      handler: js.Function2[/* data */ js.UndefOr[Any], /* next */ js.UndefOr[js.Function0[Unit]], Unit]
    ): Unit = js.native
    
    /**
      * Subscribes a handler function to a named event.
      * Documentation link: https://braintree.github.io/braintree-web/current/ThreeDSecure.html#on
      */
    def on(
      event: ThreeDSecureEvent,
      handler: js.Function2[/* data */ js.UndefOr[Any], /* next */ js.UndefOr[js.Function0[Unit]], Unit]
    ): Unit = js.native
    /**
      * Subscribes a function to execute when lookup completes.
      * The first argument, `data`, is a ThreeDSecureVerificationData object, and the second argument, `next`, is a callback. `next` must be called to continue.
      * See https://braintree.github.io/braintree-web/current/ThreeDSecure.html#event:lookup-complete,
      * and https://developer.paypal.com/braintree/docs/guides/3d-secure/migration/javascript/v3#hosted-fields.
      */
    @JSName("on")
    def on_lookupcomplete(
      event: `lookup-complete`,
      handler: js.Function2[
          /* data */ js.UndefOr[ThreeDSecureVerificationData], 
          /* next */ js.UndefOr[js.Function0[Unit]], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Gather the data needed for a 3D Secure lookup call.
      * @example
      * <caption>Preparing data for a 3D Secure lookup</caption>
      * threeDSecure.prepareLookup({
      *   nonce: hostedFieldsTokenizationPayload.nonce,
      *   bin: hostedFieldsTokenizationPayload.details.bin
      * }, function (err, payload) {
      *   if (err) {
      *     console.error(err);
      *     return;
      *   }
      *
      *   // send payload to server to do server side lookup
      * });
      */
    def prepareLookup(options: Bin): js.Promise[String] = js.native
    def prepareLookup(options: Bin, callback: callback[String]): Unit = js.native
    
    /**
      * @description The callback used for options.removeFrame in {@link ThreeDSecure#verifyCard|verifyCard}.
      */
    def removeFrameCallback(): Unit = js.native
    
    /**
      * Cleanly tear down anything set up by {@link module:braintree-web/three-d-secure.create|create}
      */
    def teardown(): Unit = js.native
    def teardown(callback: callback[Any]): Unit = js.native
    
    /**
      * Launch the 3D Secure login flow, returning a nonce payload.
      * @example
      * <caption>Verifying an existing nonce with 3DS</caption>
      * var my3DSContainer;
      *
      * threeDSecure.verifyCard({
      *   nonce: existingNonce,
      *   amount: 123.45,
      *   addFrame: function (err, iframe) {
      *     // Set up your UI and add the iframe.
      *     my3DSContainer = document.createElement('div');
      *     my3DSContainer.appendChild(iframe);
      *     document.body.appendChild(my3DSContainer);
      *   },
      *   removeFrame: function () {
      *     // Remove UI that you added in addFrame.
      *     document.body.removeChild(my3DSContainer);
      *   }
      * }, function (err, payload) {
      *   if (err) {
      *     console.error(err);
      *     return;
      *   }
      *
      *   if (payload.liabilityShifted) {
      *     // Liablity has shifted
      *     submitNonceToServer(payload.nonce);
      *   } else if (payload.liabilityShiftPossible) {
      *     // Liablity may still be shifted
      *     // Decide if you want to submit the nonce
      *   } else {
      *     // Liablity has not shifted and will not shift
      *     // Decide if you want to submit the nonce
      *   }
      * });
      */
    def verifyCard(options: ThreeDSecureVerifyOptions): js.Promise[ThreeDSecureVerifyPayload] = js.native
    def verifyCard(options: ThreeDSecureVerifyOptions, callback: callback[ThreeDSecureVerifyPayload]): Unit = js.native
  }
  
  trait ThreeDSecureAccountDetails extends StObject {
    
    var cardType: String
    
    var lastTwo: String
  }
  object ThreeDSecureAccountDetails {
    
    inline def apply(cardType: String, lastTwo: String): ThreeDSecureAccountDetails = {
      val __obj = js.Dynamic.literal(cardType = cardType.asInstanceOf[js.Any], lastTwo = lastTwo.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThreeDSecureAccountDetails]
    }
    
    extension [Self <: ThreeDSecureAccountDetails](x: Self) {
      
      inline def setCardType(value: String): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
      
      inline def setLastTwo(value: String): Self = StObject.set(x, "lastTwo", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThreeDSecureAdditionalInformation extends StObject {
    
    var accountAgeIndicator: js.UndefOr[String] = js.undefined
    
    var accountChangeDate: js.UndefOr[String] = js.undefined
    
    var accountChangeIndicator: js.UndefOr[String] = js.undefined
    
    var accountCreateDate: js.UndefOr[String] = js.undefined
    
    var accountId: js.UndefOr[String] = js.undefined
    
    var accountPurchases: js.UndefOr[String] = js.undefined
    
    var accountPwdChangeDate: js.UndefOr[String] = js.undefined
    
    var accountPwdChangeIndicator: js.UndefOr[String] = js.undefined
    
    var acsWindowSize: js.UndefOr[String] = js.undefined
    
    var addCardAttempts: js.UndefOr[String] = js.undefined
    
    var addressMatch: js.UndefOr[String] = js.undefined
    
    var authenticationIndicator: js.UndefOr[String] = js.undefined
    
    var countryCodeAlpha2: js.UndefOr[String] = js.undefined
    
    var deliveryEmail: js.UndefOr[String] = js.undefined
    
    var deliveryTimeframe: js.UndefOr[String] = js.undefined
    
    var extendedAddress: js.UndefOr[String] = js.undefined
    
    var fraudActivity: js.UndefOr[String] = js.undefined
    
    var giftCardAmount: js.UndefOr[String] = js.undefined
    
    var giftCardCount: js.UndefOr[String] = js.undefined
    
    var giftCardCurrencyCode: js.UndefOr[String] = js.undefined
    
    var installment: js.UndefOr[String] = js.undefined
    
    var ipAddress: js.UndefOr[String] = js.undefined
    
    var line3: js.UndefOr[String] = js.undefined
    
    var locality: js.UndefOr[String] = js.undefined
    
    var orderDescription: js.UndefOr[String] = js.undefined
    
    var paymentAccountAge: js.UndefOr[String] = js.undefined
    
    var paymentAccountIndicator: js.UndefOr[String] = js.undefined
    
    var postalCode: js.UndefOr[String] = js.undefined
    
    var preorderDate: js.UndefOr[String] = js.undefined
    
    var preorderIndicator: js.UndefOr[String] = js.undefined
    
    var productCode: js.UndefOr[String] = js.undefined
    
    var purchaseDate: js.UndefOr[String] = js.undefined
    
    var recurringEnd: js.UndefOr[String] = js.undefined
    
    var recurringFrequency: js.UndefOr[String] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var reorderindicator: js.UndefOr[String] = js.undefined
    
    var sdkMaxTimeout: js.UndefOr[String] = js.undefined
    
    var shippingAddress: js.UndefOr[ThreeDSecureShippingAddress] = js.undefined
    
    var shippingAddressUsageDate: js.UndefOr[String] = js.undefined
    
    var shippingAddressUsageIndicator: js.UndefOr[String] = js.undefined
    
    var shippingGivenName: js.UndefOr[String] = js.undefined
    
    var shippingMethod: js.UndefOr[String] = js.undefined
    
    var shippingMethodIndicator: js.UndefOr[String] = js.undefined
    
    var shippingNameIndicator: js.UndefOr[String] = js.undefined
    
    var shippingPhone: js.UndefOr[String] = js.undefined
    
    var shippingSurname: js.UndefOr[String] = js.undefined
    
    var streetAddress: js.UndefOr[String] = js.undefined
    
    var taxAmount: js.UndefOr[String] = js.undefined
    
    var transactionCountDay: js.UndefOr[String] = js.undefined
    
    var transactionCountYear: js.UndefOr[String] = js.undefined
    
    var userAgent: js.UndefOr[String] = js.undefined
    
    var workPhoneNumber: js.UndefOr[String] = js.undefined
  }
  object ThreeDSecureAdditionalInformation {
    
    inline def apply(): ThreeDSecureAdditionalInformation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThreeDSecureAdditionalInformation]
    }
    
    extension [Self <: ThreeDSecureAdditionalInformation](x: Self) {
      
      inline def setAccountAgeIndicator(value: String): Self = StObject.set(x, "accountAgeIndicator", value.asInstanceOf[js.Any])
      
      inline def setAccountAgeIndicatorUndefined: Self = StObject.set(x, "accountAgeIndicator", js.undefined)
      
      inline def setAccountChangeDate(value: String): Self = StObject.set(x, "accountChangeDate", value.asInstanceOf[js.Any])
      
      inline def setAccountChangeDateUndefined: Self = StObject.set(x, "accountChangeDate", js.undefined)
      
      inline def setAccountChangeIndicator(value: String): Self = StObject.set(x, "accountChangeIndicator", value.asInstanceOf[js.Any])
      
      inline def setAccountChangeIndicatorUndefined: Self = StObject.set(x, "accountChangeIndicator", js.undefined)
      
      inline def setAccountCreateDate(value: String): Self = StObject.set(x, "accountCreateDate", value.asInstanceOf[js.Any])
      
      inline def setAccountCreateDateUndefined: Self = StObject.set(x, "accountCreateDate", js.undefined)
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      inline def setAccountPurchases(value: String): Self = StObject.set(x, "accountPurchases", value.asInstanceOf[js.Any])
      
      inline def setAccountPurchasesUndefined: Self = StObject.set(x, "accountPurchases", js.undefined)
      
      inline def setAccountPwdChangeDate(value: String): Self = StObject.set(x, "accountPwdChangeDate", value.asInstanceOf[js.Any])
      
      inline def setAccountPwdChangeDateUndefined: Self = StObject.set(x, "accountPwdChangeDate", js.undefined)
      
      inline def setAccountPwdChangeIndicator(value: String): Self = StObject.set(x, "accountPwdChangeIndicator", value.asInstanceOf[js.Any])
      
      inline def setAccountPwdChangeIndicatorUndefined: Self = StObject.set(x, "accountPwdChangeIndicator", js.undefined)
      
      inline def setAcsWindowSize(value: String): Self = StObject.set(x, "acsWindowSize", value.asInstanceOf[js.Any])
      
      inline def setAcsWindowSizeUndefined: Self = StObject.set(x, "acsWindowSize", js.undefined)
      
      inline def setAddCardAttempts(value: String): Self = StObject.set(x, "addCardAttempts", value.asInstanceOf[js.Any])
      
      inline def setAddCardAttemptsUndefined: Self = StObject.set(x, "addCardAttempts", js.undefined)
      
      inline def setAddressMatch(value: String): Self = StObject.set(x, "addressMatch", value.asInstanceOf[js.Any])
      
      inline def setAddressMatchUndefined: Self = StObject.set(x, "addressMatch", js.undefined)
      
      inline def setAuthenticationIndicator(value: String): Self = StObject.set(x, "authenticationIndicator", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationIndicatorUndefined: Self = StObject.set(x, "authenticationIndicator", js.undefined)
      
      inline def setCountryCodeAlpha2(value: String): Self = StObject.set(x, "countryCodeAlpha2", value.asInstanceOf[js.Any])
      
      inline def setCountryCodeAlpha2Undefined: Self = StObject.set(x, "countryCodeAlpha2", js.undefined)
      
      inline def setDeliveryEmail(value: String): Self = StObject.set(x, "deliveryEmail", value.asInstanceOf[js.Any])
      
      inline def setDeliveryEmailUndefined: Self = StObject.set(x, "deliveryEmail", js.undefined)
      
      inline def setDeliveryTimeframe(value: String): Self = StObject.set(x, "deliveryTimeframe", value.asInstanceOf[js.Any])
      
      inline def setDeliveryTimeframeUndefined: Self = StObject.set(x, "deliveryTimeframe", js.undefined)
      
      inline def setExtendedAddress(value: String): Self = StObject.set(x, "extendedAddress", value.asInstanceOf[js.Any])
      
      inline def setExtendedAddressUndefined: Self = StObject.set(x, "extendedAddress", js.undefined)
      
      inline def setFraudActivity(value: String): Self = StObject.set(x, "fraudActivity", value.asInstanceOf[js.Any])
      
      inline def setFraudActivityUndefined: Self = StObject.set(x, "fraudActivity", js.undefined)
      
      inline def setGiftCardAmount(value: String): Self = StObject.set(x, "giftCardAmount", value.asInstanceOf[js.Any])
      
      inline def setGiftCardAmountUndefined: Self = StObject.set(x, "giftCardAmount", js.undefined)
      
      inline def setGiftCardCount(value: String): Self = StObject.set(x, "giftCardCount", value.asInstanceOf[js.Any])
      
      inline def setGiftCardCountUndefined: Self = StObject.set(x, "giftCardCount", js.undefined)
      
      inline def setGiftCardCurrencyCode(value: String): Self = StObject.set(x, "giftCardCurrencyCode", value.asInstanceOf[js.Any])
      
      inline def setGiftCardCurrencyCodeUndefined: Self = StObject.set(x, "giftCardCurrencyCode", js.undefined)
      
      inline def setInstallment(value: String): Self = StObject.set(x, "installment", value.asInstanceOf[js.Any])
      
      inline def setInstallmentUndefined: Self = StObject.set(x, "installment", js.undefined)
      
      inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
      
      inline def setLine3(value: String): Self = StObject.set(x, "line3", value.asInstanceOf[js.Any])
      
      inline def setLine3Undefined: Self = StObject.set(x, "line3", js.undefined)
      
      inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
      
      inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
      
      inline def setOrderDescription(value: String): Self = StObject.set(x, "orderDescription", value.asInstanceOf[js.Any])
      
      inline def setOrderDescriptionUndefined: Self = StObject.set(x, "orderDescription", js.undefined)
      
      inline def setPaymentAccountAge(value: String): Self = StObject.set(x, "paymentAccountAge", value.asInstanceOf[js.Any])
      
      inline def setPaymentAccountAgeUndefined: Self = StObject.set(x, "paymentAccountAge", js.undefined)
      
      inline def setPaymentAccountIndicator(value: String): Self = StObject.set(x, "paymentAccountIndicator", value.asInstanceOf[js.Any])
      
      inline def setPaymentAccountIndicatorUndefined: Self = StObject.set(x, "paymentAccountIndicator", js.undefined)
      
      inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
      
      inline def setPreorderDate(value: String): Self = StObject.set(x, "preorderDate", value.asInstanceOf[js.Any])
      
      inline def setPreorderDateUndefined: Self = StObject.set(x, "preorderDate", js.undefined)
      
      inline def setPreorderIndicator(value: String): Self = StObject.set(x, "preorderIndicator", value.asInstanceOf[js.Any])
      
      inline def setPreorderIndicatorUndefined: Self = StObject.set(x, "preorderIndicator", js.undefined)
      
      inline def setProductCode(value: String): Self = StObject.set(x, "productCode", value.asInstanceOf[js.Any])
      
      inline def setProductCodeUndefined: Self = StObject.set(x, "productCode", js.undefined)
      
      inline def setPurchaseDate(value: String): Self = StObject.set(x, "purchaseDate", value.asInstanceOf[js.Any])
      
      inline def setPurchaseDateUndefined: Self = StObject.set(x, "purchaseDate", js.undefined)
      
      inline def setRecurringEnd(value: String): Self = StObject.set(x, "recurringEnd", value.asInstanceOf[js.Any])
      
      inline def setRecurringEndUndefined: Self = StObject.set(x, "recurringEnd", js.undefined)
      
      inline def setRecurringFrequency(value: String): Self = StObject.set(x, "recurringFrequency", value.asInstanceOf[js.Any])
      
      inline def setRecurringFrequencyUndefined: Self = StObject.set(x, "recurringFrequency", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setReorderindicator(value: String): Self = StObject.set(x, "reorderindicator", value.asInstanceOf[js.Any])
      
      inline def setReorderindicatorUndefined: Self = StObject.set(x, "reorderindicator", js.undefined)
      
      inline def setSdkMaxTimeout(value: String): Self = StObject.set(x, "sdkMaxTimeout", value.asInstanceOf[js.Any])
      
      inline def setSdkMaxTimeoutUndefined: Self = StObject.set(x, "sdkMaxTimeout", js.undefined)
      
      inline def setShippingAddress(value: ThreeDSecureShippingAddress): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
      
      inline def setShippingAddressUndefined: Self = StObject.set(x, "shippingAddress", js.undefined)
      
      inline def setShippingAddressUsageDate(value: String): Self = StObject.set(x, "shippingAddressUsageDate", value.asInstanceOf[js.Any])
      
      inline def setShippingAddressUsageDateUndefined: Self = StObject.set(x, "shippingAddressUsageDate", js.undefined)
      
      inline def setShippingAddressUsageIndicator(value: String): Self = StObject.set(x, "shippingAddressUsageIndicator", value.asInstanceOf[js.Any])
      
      inline def setShippingAddressUsageIndicatorUndefined: Self = StObject.set(x, "shippingAddressUsageIndicator", js.undefined)
      
      inline def setShippingGivenName(value: String): Self = StObject.set(x, "shippingGivenName", value.asInstanceOf[js.Any])
      
      inline def setShippingGivenNameUndefined: Self = StObject.set(x, "shippingGivenName", js.undefined)
      
      inline def setShippingMethod(value: String): Self = StObject.set(x, "shippingMethod", value.asInstanceOf[js.Any])
      
      inline def setShippingMethodIndicator(value: String): Self = StObject.set(x, "shippingMethodIndicator", value.asInstanceOf[js.Any])
      
      inline def setShippingMethodIndicatorUndefined: Self = StObject.set(x, "shippingMethodIndicator", js.undefined)
      
      inline def setShippingMethodUndefined: Self = StObject.set(x, "shippingMethod", js.undefined)
      
      inline def setShippingNameIndicator(value: String): Self = StObject.set(x, "shippingNameIndicator", value.asInstanceOf[js.Any])
      
      inline def setShippingNameIndicatorUndefined: Self = StObject.set(x, "shippingNameIndicator", js.undefined)
      
      inline def setShippingPhone(value: String): Self = StObject.set(x, "shippingPhone", value.asInstanceOf[js.Any])
      
      inline def setShippingPhoneUndefined: Self = StObject.set(x, "shippingPhone", js.undefined)
      
      inline def setShippingSurname(value: String): Self = StObject.set(x, "shippingSurname", value.asInstanceOf[js.Any])
      
      inline def setShippingSurnameUndefined: Self = StObject.set(x, "shippingSurname", js.undefined)
      
      inline def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
      
      inline def setStreetAddressUndefined: Self = StObject.set(x, "streetAddress", js.undefined)
      
      inline def setTaxAmount(value: String): Self = StObject.set(x, "taxAmount", value.asInstanceOf[js.Any])
      
      inline def setTaxAmountUndefined: Self = StObject.set(x, "taxAmount", js.undefined)
      
      inline def setTransactionCountDay(value: String): Self = StObject.set(x, "transactionCountDay", value.asInstanceOf[js.Any])
      
      inline def setTransactionCountDayUndefined: Self = StObject.set(x, "transactionCountDay", js.undefined)
      
      inline def setTransactionCountYear(value: String): Self = StObject.set(x, "transactionCountYear", value.asInstanceOf[js.Any])
      
      inline def setTransactionCountYearUndefined: Self = StObject.set(x, "transactionCountYear", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      
      inline def setWorkPhoneNumber(value: String): Self = StObject.set(x, "workPhoneNumber", value.asInstanceOf[js.Any])
      
      inline def setWorkPhoneNumberUndefined: Self = StObject.set(x, "workPhoneNumber", js.undefined)
    }
  }
  
  trait ThreeDSecureBillingAddress extends StObject {
    
    var countryCodeAlpha2: js.UndefOr[String] = js.undefined
    
    var extendedAddress: js.UndefOr[String] = js.undefined
    
    var givenName: js.UndefOr[String] = js.undefined
    
    var line3: js.UndefOr[String] = js.undefined
    
    var locality: js.UndefOr[String] = js.undefined
    
    var phoneNumber: js.UndefOr[String] = js.undefined
    
    var postalCode: js.UndefOr[String] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var streetAddress: js.UndefOr[String] = js.undefined
    
    var surname: js.UndefOr[String] = js.undefined
  }
  object ThreeDSecureBillingAddress {
    
    inline def apply(): ThreeDSecureBillingAddress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThreeDSecureBillingAddress]
    }
    
    extension [Self <: ThreeDSecureBillingAddress](x: Self) {
      
      inline def setCountryCodeAlpha2(value: String): Self = StObject.set(x, "countryCodeAlpha2", value.asInstanceOf[js.Any])
      
      inline def setCountryCodeAlpha2Undefined: Self = StObject.set(x, "countryCodeAlpha2", js.undefined)
      
      inline def setExtendedAddress(value: String): Self = StObject.set(x, "extendedAddress", value.asInstanceOf[js.Any])
      
      inline def setExtendedAddressUndefined: Self = StObject.set(x, "extendedAddress", js.undefined)
      
      inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
      
      inline def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
      
      inline def setLine3(value: String): Self = StObject.set(x, "line3", value.asInstanceOf[js.Any])
      
      inline def setLine3Undefined: Self = StObject.set(x, "line3", js.undefined)
      
      inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
      
      inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      
      inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
      
      inline def setStreetAddressUndefined: Self = StObject.set(x, "streetAddress", js.undefined)
      
      inline def setSurname(value: String): Self = StObject.set(x, "surname", value.asInstanceOf[js.Any])
      
      inline def setSurnameUndefined: Self = StObject.set(x, "surname", js.undefined)
    }
  }
  
  trait ThreeDSecureBinData extends StObject {
    
    var commercial: String
    
    var countryOfIssuance: String
    
    var debit: String
    
    var durbinRegulated: String
    
    var healthcare: String
    
    var issuingBank: String
    
    var payroll: String
    
    var prepaid: String
    
    var productId: String
  }
  object ThreeDSecureBinData {
    
    inline def apply(
      commercial: String,
      countryOfIssuance: String,
      debit: String,
      durbinRegulated: String,
      healthcare: String,
      issuingBank: String,
      payroll: String,
      prepaid: String,
      productId: String
    ): ThreeDSecureBinData = {
      val __obj = js.Dynamic.literal(commercial = commercial.asInstanceOf[js.Any], countryOfIssuance = countryOfIssuance.asInstanceOf[js.Any], debit = debit.asInstanceOf[js.Any], durbinRegulated = durbinRegulated.asInstanceOf[js.Any], healthcare = healthcare.asInstanceOf[js.Any], issuingBank = issuingBank.asInstanceOf[js.Any], payroll = payroll.asInstanceOf[js.Any], prepaid = prepaid.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThreeDSecureBinData]
    }
    
    extension [Self <: ThreeDSecureBinData](x: Self) {
      
      inline def setCommercial(value: String): Self = StObject.set(x, "commercial", value.asInstanceOf[js.Any])
      
      inline def setCountryOfIssuance(value: String): Self = StObject.set(x, "countryOfIssuance", value.asInstanceOf[js.Any])
      
      inline def setDebit(value: String): Self = StObject.set(x, "debit", value.asInstanceOf[js.Any])
      
      inline def setDurbinRegulated(value: String): Self = StObject.set(x, "durbinRegulated", value.asInstanceOf[js.Any])
      
      inline def setHealthcare(value: String): Self = StObject.set(x, "healthcare", value.asInstanceOf[js.Any])
      
      inline def setIssuingBank(value: String): Self = StObject.set(x, "issuingBank", value.asInstanceOf[js.Any])
      
      inline def setPayroll(value: String): Self = StObject.set(x, "payroll", value.asInstanceOf[js.Any])
      
      inline def setPrepaid(value: String): Self = StObject.set(x, "prepaid", value.asInstanceOf[js.Any])
      
      inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThreeDSecureCreateOptions extends StObject {
    
    var authorization: js.UndefOr[String] = js.undefined
    
    var client: js.UndefOr[Client] = js.undefined
    
    /**
      * The version of 3D Secure to use. Possible options:
      *
      * 1 - The legacy 3D Secure v1.0 integration.
      *
      * 2 - A 3D Secure v2.0 integration that uses a modal to host the 3D Secure iframe.
      *
      * 2-bootstrap3-modal - A 3D Secure v2.0 integration that uses a modal styled with Bootstrap 3 styles
      * to host the 3D Secure iframe. Requires having the Bootstrap 3 script files and stylesheets on your page.
      *
      * 2-inline-iframe - A 3D Secure v2.0 integration that provides the authentication iframe directly to the merchant.
      *
      */
    var version: js.UndefOr[
        `1` | typings.braintreeWeb.braintreeWebStrings.`1` | `2` | typings.braintreeWeb.braintreeWebStrings.`2` | `2-bootstrap3-modal` | `2-inline-iframe`
      ] = js.undefined
  }
  object ThreeDSecureCreateOptions {
    
    inline def apply(): ThreeDSecureCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThreeDSecureCreateOptions]
    }
    
    extension [Self <: ThreeDSecureCreateOptions](x: Self) {
      
      inline def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
      
      inline def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setVersion(
        value: `1` | typings.braintreeWeb.braintreeWebStrings.`1` | `2` | typings.braintreeWeb.braintreeWebStrings.`2` | `2-bootstrap3-modal` | `2-inline-iframe`
      ): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.braintreeWeb.braintreeWebStrings.`lookup-complete`
    - typings.braintreeWeb.braintreeWebStrings.`customer-canceled`
    - typings.braintreeWeb.braintreeWebStrings.`authentication-iframe-available`
    - typings.braintreeWeb.braintreeWebStrings.`authentication-modal-render`
    - typings.braintreeWeb.braintreeWebStrings.`authentication-modal-close`
  */
  trait ThreeDSecureEvent extends StObject
  object ThreeDSecureEvent {
    
    inline def `authentication-iframe-available`: typings.braintreeWeb.braintreeWebStrings.`authentication-iframe-available` = "authentication-iframe-available".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.`authentication-iframe-available`]
    
    inline def `authentication-modal-close`: typings.braintreeWeb.braintreeWebStrings.`authentication-modal-close` = "authentication-modal-close".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.`authentication-modal-close`]
    
    inline def `authentication-modal-render`: typings.braintreeWeb.braintreeWebStrings.`authentication-modal-render` = "authentication-modal-render".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.`authentication-modal-render`]
    
    inline def `customer-canceled`: typings.braintreeWeb.braintreeWebStrings.`customer-canceled` = "customer-canceled".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.`customer-canceled`]
    
    inline def `lookup-complete`: typings.braintreeWeb.braintreeWebStrings.`lookup-complete` = "lookup-complete".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.`lookup-complete`]
  }
  
  trait ThreeDSecureInfo extends StObject {
    
    var cavv: String
    
    var dsTransactionId: String
    
    var eciFlag: String
    
    var liabilityShiftPossible: Boolean
    
    var liabilityShifted: Boolean
    
    var threeDSecureAuthenticationId: String
    
    var threeDSecureVersion: String
    
    var xid: String
  }
  object ThreeDSecureInfo {
    
    inline def apply(
      cavv: String,
      dsTransactionId: String,
      eciFlag: String,
      liabilityShiftPossible: Boolean,
      liabilityShifted: Boolean,
      threeDSecureAuthenticationId: String,
      threeDSecureVersion: String,
      xid: String
    ): ThreeDSecureInfo = {
      val __obj = js.Dynamic.literal(cavv = cavv.asInstanceOf[js.Any], dsTransactionId = dsTransactionId.asInstanceOf[js.Any], eciFlag = eciFlag.asInstanceOf[js.Any], liabilityShiftPossible = liabilityShiftPossible.asInstanceOf[js.Any], liabilityShifted = liabilityShifted.asInstanceOf[js.Any], threeDSecureAuthenticationId = threeDSecureAuthenticationId.asInstanceOf[js.Any], threeDSecureVersion = threeDSecureVersion.asInstanceOf[js.Any], xid = xid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThreeDSecureInfo]
    }
    
    extension [Self <: ThreeDSecureInfo](x: Self) {
      
      inline def setCavv(value: String): Self = StObject.set(x, "cavv", value.asInstanceOf[js.Any])
      
      inline def setDsTransactionId(value: String): Self = StObject.set(x, "dsTransactionId", value.asInstanceOf[js.Any])
      
      inline def setEciFlag(value: String): Self = StObject.set(x, "eciFlag", value.asInstanceOf[js.Any])
      
      inline def setLiabilityShiftPossible(value: Boolean): Self = StObject.set(x, "liabilityShiftPossible", value.asInstanceOf[js.Any])
      
      inline def setLiabilityShifted(value: Boolean): Self = StObject.set(x, "liabilityShifted", value.asInstanceOf[js.Any])
      
      inline def setThreeDSecureAuthenticationId(value: String): Self = StObject.set(x, "threeDSecureAuthenticationId", value.asInstanceOf[js.Any])
      
      inline def setThreeDSecureVersion(value: String): Self = StObject.set(x, "threeDSecureVersion", value.asInstanceOf[js.Any])
      
      inline def setXid(value: String): Self = StObject.set(x, "xid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThreeDSecureShippingAddress extends StObject {
    
    var countryCodeAlpha2: String
    
    var extendedAddress: String
    
    var line3: String
    
    var locality: String
    
    var postalCode: String
    
    var region: String
    
    var streetAddress: String
  }
  object ThreeDSecureShippingAddress {
    
    inline def apply(
      countryCodeAlpha2: String,
      extendedAddress: String,
      line3: String,
      locality: String,
      postalCode: String,
      region: String,
      streetAddress: String
    ): ThreeDSecureShippingAddress = {
      val __obj = js.Dynamic.literal(countryCodeAlpha2 = countryCodeAlpha2.asInstanceOf[js.Any], extendedAddress = extendedAddress.asInstanceOf[js.Any], line3 = line3.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], streetAddress = streetAddress.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThreeDSecureShippingAddress]
    }
    
    extension [Self <: ThreeDSecureShippingAddress](x: Self) {
      
      inline def setCountryCodeAlpha2(value: String): Self = StObject.set(x, "countryCodeAlpha2", value.asInstanceOf[js.Any])
      
      inline def setExtendedAddress(value: String): Self = StObject.set(x, "extendedAddress", value.asInstanceOf[js.Any])
      
      inline def setLine3(value: String): Self = StObject.set(x, "line3", value.asInstanceOf[js.Any])
      
      inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
      
      inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThreeDSecureVerificationData extends StObject {
    
    var lookup: ThreeDSecureVersion
    
    var paymentMethod: ThreeDSecureVerifyPayload
    
    var requiresUserAuthentication: Boolean
    
    var threeDSecureInfo: LiabilityShiftPossible
  }
  object ThreeDSecureVerificationData {
    
    inline def apply(
      lookup: ThreeDSecureVersion,
      paymentMethod: ThreeDSecureVerifyPayload,
      requiresUserAuthentication: Boolean,
      threeDSecureInfo: LiabilityShiftPossible
    ): ThreeDSecureVerificationData = {
      val __obj = js.Dynamic.literal(lookup = lookup.asInstanceOf[js.Any], paymentMethod = paymentMethod.asInstanceOf[js.Any], requiresUserAuthentication = requiresUserAuthentication.asInstanceOf[js.Any], threeDSecureInfo = threeDSecureInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThreeDSecureVerificationData]
    }
    
    extension [Self <: ThreeDSecureVerificationData](x: Self) {
      
      inline def setLookup(value: ThreeDSecureVersion): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
      
      inline def setPaymentMethod(value: ThreeDSecureVerifyPayload): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
      
      inline def setRequiresUserAuthentication(value: Boolean): Self = StObject.set(x, "requiresUserAuthentication", value.asInstanceOf[js.Any])
      
      inline def setThreeDSecureInfo(value: LiabilityShiftPossible): Self = StObject.set(x, "threeDSecureInfo", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThreeDSecureVerifyOptions extends StObject {
    
    var addFrame: js.UndefOr[
        js.Function2[
          /* err */ js.UndefOr[BraintreeError], 
          /* iframe */ js.UndefOr[HTMLIFrameElement], 
          Unit
        ]
      ] = js.undefined
    
    var additionalInformation: js.UndefOr[ThreeDSecureAdditionalInformation] = js.undefined
    
    var amount: Double
    
    var billingAddress: js.UndefOr[ThreeDSecureBillingAddress] = js.undefined
    
    var bin: String
    
    var challengeRequested: js.UndefOr[Boolean] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var exemptionRequested: js.UndefOr[Boolean] = js.undefined
    
    var mobilePhoneNumber: js.UndefOr[String] = js.undefined
    
    var nonce: String
    
    var removeFrame: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ThreeDSecureVerifyOptions {
    
    inline def apply(amount: Double, bin: String, nonce: String): ThreeDSecureVerifyOptions = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], bin = bin.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThreeDSecureVerifyOptions]
    }
    
    extension [Self <: ThreeDSecureVerifyOptions](x: Self) {
      
      inline def setAddFrame(value: (/* err */ js.UndefOr[BraintreeError], /* iframe */ js.UndefOr[HTMLIFrameElement]) => Unit): Self = StObject.set(x, "addFrame", js.Any.fromFunction2(value))
      
      inline def setAddFrameUndefined: Self = StObject.set(x, "addFrame", js.undefined)
      
      inline def setAdditionalInformation(value: ThreeDSecureAdditionalInformation): Self = StObject.set(x, "additionalInformation", value.asInstanceOf[js.Any])
      
      inline def setAdditionalInformationUndefined: Self = StObject.set(x, "additionalInformation", js.undefined)
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setBillingAddress(value: ThreeDSecureBillingAddress): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
      
      inline def setBillingAddressUndefined: Self = StObject.set(x, "billingAddress", js.undefined)
      
      inline def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      inline def setChallengeRequested(value: Boolean): Self = StObject.set(x, "challengeRequested", value.asInstanceOf[js.Any])
      
      inline def setChallengeRequestedUndefined: Self = StObject.set(x, "challengeRequested", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setExemptionRequested(value: Boolean): Self = StObject.set(x, "exemptionRequested", value.asInstanceOf[js.Any])
      
      inline def setExemptionRequestedUndefined: Self = StObject.set(x, "exemptionRequested", js.undefined)
      
      inline def setMobilePhoneNumber(value: String): Self = StObject.set(x, "mobilePhoneNumber", value.asInstanceOf[js.Any])
      
      inline def setMobilePhoneNumberUndefined: Self = StObject.set(x, "mobilePhoneNumber", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setRemoveFrame(value: () => Unit): Self = StObject.set(x, "removeFrame", js.Any.fromFunction0(value))
      
      inline def setRemoveFrameUndefined: Self = StObject.set(x, "removeFrame", js.undefined)
    }
  }
  
  trait ThreeDSecureVerifyPayload extends StObject {
    
    var binData: ThreeDSecureBinData
    
    var description: String
    
    var details: ThreeDSecureAccountDetails
    
    /** @deprecated Use threeDSecureInfo.liabilityShiftPossible */
    var liabilityShiftPossible: Boolean
    
    /** @deprecated Use threeDSecureInfo.liabilityShifted */
    var liabilityShifted: Boolean
    
    var nonce: String
    
    var threeDSecureInfo: ThreeDSecureInfo
    
    var `type`: String
  }
  object ThreeDSecureVerifyPayload {
    
    inline def apply(
      binData: ThreeDSecureBinData,
      description: String,
      details: ThreeDSecureAccountDetails,
      liabilityShiftPossible: Boolean,
      liabilityShifted: Boolean,
      nonce: String,
      threeDSecureInfo: ThreeDSecureInfo,
      `type`: String
    ): ThreeDSecureVerifyPayload = {
      val __obj = js.Dynamic.literal(binData = binData.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], liabilityShiftPossible = liabilityShiftPossible.asInstanceOf[js.Any], liabilityShifted = liabilityShifted.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], threeDSecureInfo = threeDSecureInfo.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThreeDSecureVerifyPayload]
    }
    
    extension [Self <: ThreeDSecureVerifyPayload](x: Self) {
      
      inline def setBinData(value: ThreeDSecureBinData): Self = StObject.set(x, "binData", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: ThreeDSecureAccountDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setLiabilityShiftPossible(value: Boolean): Self = StObject.set(x, "liabilityShiftPossible", value.asInstanceOf[js.Any])
      
      inline def setLiabilityShifted(value: Boolean): Self = StObject.set(x, "liabilityShifted", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setThreeDSecureInfo(value: ThreeDSecureInfo): Self = StObject.set(x, "threeDSecureInfo", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
