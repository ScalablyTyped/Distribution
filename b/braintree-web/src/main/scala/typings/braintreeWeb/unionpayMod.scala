package typings.braintreeWeb

import typings.braintreeWeb.anon.Card
import typings.braintreeWeb.anon.Client
import typings.braintreeWeb.anon.EnrollmentId
import typings.braintreeWeb.anon.HostedFields
import typings.braintreeWeb.coreMod.callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unionpayMod {
  
  @js.native
  trait UnionPay extends StObject {
    
    /**
      * @description The current version of the SDK, i.e. `3.0.2`.
      */
    var VERSION: String = js.native
    
    /**
      * braintree.unionpay.create({ client: clientInstance }, function (createErr, unionpayInstance) {
      *   if (createErr) {
      *     console.error(createErr);
      *     return;
      *   }
      *   // ...
      * });
      */
    def create(options: Client, callback: callback[js.Any]): Unit = js.native
    
    /**
      * Enrolls a UnionPay card. Use {@link UnionPay#fetchCapabilities|fetchCapabilities} to determine if the SMS enrollment
      * process is required.
      * @example <caption>With raw card data</caption>
      * unionpayInstance.enroll({
      *   card: {
      *     number: '4111111111111111',
      *     expirationMonth: '12',
      *     expirationYear: '2038'
      *   },
      *   mobile: {
      *     countryCode: '62',
      *     number: '111111111111'
      *   }
      * }, function (enrollErr, response) {
      *   if (enrollErr) {
      *      console.error(enrollErr);
      *      return;
      *   }
      *
      *   if (response.smsCodeRequired) {
      *     // If smsCodeRequired, wait for SMS auth code from customer
      *     // Then use response.enrollmentId during {@link UnionPay#tokenize}
      *   } else {
      *     // SMS code is not required from the user.
      *     // {@link UnionPay#tokenize} can be called immediately
      * });
      * @example <caption>With Hosted Fields</caption>
      * unionpayInstance.enroll({
      *   hostedFields: hostedFields,
      *   mobile: {
      *     countryCode: '62',
      *     number: '111111111111'
      *   }
      * }, function (enrollErr, response) {
      *   if (enrollErr) {
      *     console.error(enrollErr);
      *     return;
      *   }
      *
      *   if (response.smsCodeRequired) {
      *     // If smsCodeRequired, wait for SMS auth code from customer
      *     // Then use response.enrollmentId during {@link UnionPay#tokenize}
      *   } else {
      *     // SMS code is not required from the user.
      *     // {@link UnionPay#tokenize} can be called immediately
      *   }
      * });
      */
    def enroll(options: HostedFields, callback: callback[js.Any]): Unit = js.native
    
    /**
      * Fetches the capabilities of a card, including whether or not the SMS enrollment process is required.
      * @example <caption>With raw card data</caption>
      * unionpayInstance.fetchCapabilities({
      *   card: {
      *     number: '4111111111111111'
      *   }
      * }, function (fetchErr, cardCapabilities) {
      *   if (fetchErr) {
      *     console.error(fetchErr);
      *     return;
      *   }
      *
      *   if (cardCapabilities.isUnionPay) {
      *     if (cardCapabilities.unionPay && !cardCapabilities.unionPay.isSupported) {
      *       // Braintree cannot process this UnionPay card.
      *       // Ask the user for a different card.
      *       return;
      *     }
      *
      *     if (cardCapabilities.isDebit) {
      *       // CVV and expiration date are not required
      *     } else {
      *       // CVV and expiration date are required
      *     }
      *
      *     // Show mobile phone number field for enrollment
      *   }
      * });
      * @example <caption>With Hosted Fields</caption>
      * // Fetch capabilities on `blur` inside of the Hosted Fields `create` callback
      * hostedFieldsInstance.on('blur', function (event) {
      *   // Only attempt to fetch capabilities when a valid card number has been entered
      *   if (event.emittedBy === 'number' && event.fields.number.isValid) {
      *     unionpayInstance.fetchCapabilities({
      *       hostedFields: hostedFieldsInstance
      *     }, function (fetchErr, cardCapabilities) {
      *       if (fetchErr) {
      *         console.error(fetchErr);
      *         return;
      *       }
      *
      *       if (cardCapabilities.isUnionPay) {
      *         if (cardCapabilities.unionPay && !cardCapabilities.unionPay.isSupported) {
      *           // Braintree cannot process this UnionPay card.
      *           // Ask the user for a different card.
      *           return;
      *         }
      *         if (cardCapabilities.isDebit) {
      *           // CVV and expiration date are not required
      *           // Hide the containers with your `cvv` and `expirationDate` fields
      *         } else {
      *           // CVV and expiration date are required
      *         }
      *       } else {
      *         // Not a UnionPay card
      *         // When form is complete, tokenize using your Hosted Fields instance
      *       }
      *
      *       // Show your own mobile country code and phone number inputs for enrollment
      *     });
      *   });
      * });
      */
    def fetchCapabilities(options: Card, callback: callback[js.Any]): Unit = js.native
    
    /**
      * Cleanly tear down anything set up by {@link module:braintree-web/unionpay.create|create}.
      * This only needs to be called when using UnionPay with Hosted Fields.
      * @example
      * unionpayInstance.teardown(function (teardownErr) {
      *   if (teardownErr) {
      *     console.error('Could not tear down UnionPay.');
      *   } else {
      *     console.log('UnionPay has been torn down.');
      *   }
      * });
      */
    def teardown(): Unit = js.native
    def teardown(callback: callback[js.Any]): Unit = js.native
    
    /**
      * Tokenizes a UnionPay card and returns a nonce payload.
      * @example <caption>With raw card data</caption>
      * unionpayInstance.tokenize({
      *   card: {
      *     number: '4111111111111111',
      *     expirationMonth: '12',
      *     expirationYear: '2038',
      *     cvv: '123'
      *   },
      *   enrollmentId: enrollResponse.enrollmentId, // Returned from enroll
      *   smsCode: '11111' // Received by customer's phone, if SMS enrollment was required. Otherwise it should be omitted
      * }, function (tokenizeErr, response) {
      *   if (tokenizeErr) {
      *     console.error(tokenizeErr);
      *     return;
      *   }
      *
      *   // Send response.nonce to your server
      * });
      * @example <caption>With Hosted Fields</caption>
      * unionpayInstance.tokenize({
      *   hostedFields: hostedFieldsInstance,
      *   enrollmentId: enrollResponse.enrollmentId, // Returned from enroll
      *   smsCode: '11111' // Received by customer's phone, if SMS enrollment was required. Otherwise it should be omitted
      * }, function (tokenizeErr, response) {
      *   if (tokenizeErr) {
      *     console.error(tokenizeErr);
      *     return;
      *   }
      *
      *   // Send response.nonce to your server
      * });
      */
    def tokenize(options: EnrollmentId, callback: callback[js.Any]): Unit = js.native
  }
  
  trait UnionPayAccountDetails extends StObject {
    
    var cardType: String
    
    var description: String
    
    var lastTwo: String
  }
  object UnionPayAccountDetails {
    
    inline def apply(cardType: String, description: String, lastTwo: String): UnionPayAccountDetails = {
      val __obj = js.Dynamic.literal(cardType = cardType.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], lastTwo = lastTwo.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnionPayAccountDetails]
    }
    
    extension [Self <: UnionPayAccountDetails](x: Self) {
      
      inline def setCardType(value: String): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setLastTwo(value: String): Self = StObject.set(x, "lastTwo", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnionPayEnrollPayload extends StObject {
    
    var enrollmentId: String
    
    var smsCodeRequired: Boolean
  }
  object UnionPayEnrollPayload {
    
    inline def apply(enrollmentId: String, smsCodeRequired: Boolean): UnionPayEnrollPayload = {
      val __obj = js.Dynamic.literal(enrollmentId = enrollmentId.asInstanceOf[js.Any], smsCodeRequired = smsCodeRequired.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnionPayEnrollPayload]
    }
    
    extension [Self <: UnionPayEnrollPayload](x: Self) {
      
      inline def setEnrollmentId(value: String): Self = StObject.set(x, "enrollmentId", value.asInstanceOf[js.Any])
      
      inline def setSmsCodeRequired(value: Boolean): Self = StObject.set(x, "smsCodeRequired", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnionPayFetchCapabilitiesPayload extends StObject {
    
    var isDebit: Boolean
    
    var isUnionPay: Boolean
    
    var unionPay: UnionPayProperties
  }
  object UnionPayFetchCapabilitiesPayload {
    
    inline def apply(isDebit: Boolean, isUnionPay: Boolean, unionPay: UnionPayProperties): UnionPayFetchCapabilitiesPayload = {
      val __obj = js.Dynamic.literal(isDebit = isDebit.asInstanceOf[js.Any], isUnionPay = isUnionPay.asInstanceOf[js.Any], unionPay = unionPay.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnionPayFetchCapabilitiesPayload]
    }
    
    extension [Self <: UnionPayFetchCapabilitiesPayload](x: Self) {
      
      inline def setIsDebit(value: Boolean): Self = StObject.set(x, "isDebit", value.asInstanceOf[js.Any])
      
      inline def setIsUnionPay(value: Boolean): Self = StObject.set(x, "isUnionPay", value.asInstanceOf[js.Any])
      
      inline def setUnionPay(value: UnionPayProperties): Self = StObject.set(x, "unionPay", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnionPayProperties extends StObject {
    
    var isSupported: Boolean
    
    var supportsTwoStepAuthAndCapture: Boolean
  }
  object UnionPayProperties {
    
    inline def apply(isSupported: Boolean, supportsTwoStepAuthAndCapture: Boolean): UnionPayProperties = {
      val __obj = js.Dynamic.literal(isSupported = isSupported.asInstanceOf[js.Any], supportsTwoStepAuthAndCapture = supportsTwoStepAuthAndCapture.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnionPayProperties]
    }
    
    extension [Self <: UnionPayProperties](x: Self) {
      
      inline def setIsSupported(value: Boolean): Self = StObject.set(x, "isSupported", value.asInstanceOf[js.Any])
      
      inline def setSupportsTwoStepAuthAndCapture(value: Boolean): Self = StObject.set(x, "supportsTwoStepAuthAndCapture", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnionPayTokenizePayload extends StObject {
    
    var details: UnionPayAccountDetails
    
    var nonce: String
    
    var `type`: String
  }
  object UnionPayTokenizePayload {
    
    inline def apply(details: UnionPayAccountDetails, nonce: String, `type`: String): UnionPayTokenizePayload = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnionPayTokenizePayload]
    }
    
    extension [Self <: UnionPayTokenizePayload](x: Self) {
      
      inline def setDetails(value: UnionPayAccountDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
