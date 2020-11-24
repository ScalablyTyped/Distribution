package typings.braintreeWeb.applePayMod

import typings.braintreeWeb.anon.Client
import typings.braintreeWeb.anon.DisplayName
import typings.braintreeWeb.anon.Token
import typings.braintreeWeb.coreMod.callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplePay extends js.Object {
  
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
