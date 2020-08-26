package typings.braintreeWeb.clientMod

import typings.braintreeWeb.anon.Authorization
import typings.braintreeWeb.anon.Data
import typings.braintreeWeb.coreMod.callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  /**
    * @description The current version of the SDK, i.e. `3.0.2`.
    */
  var VERSION: String = js.native
  var authorization: String = js.native
  /**
    * @description This function is the entry point for the <code>braintree.client</code> module.
    * It is used for creating {@link Client} instances that service communication to Braintree servers.
    *
    * @example
    * var createClient = require('braintree-web/client').create;
    *
    * createClient({
    *   authorization: CLIENT_AUTHORIZATION
    * }, function (createErr, clientInstance) {
    *   ...
    * });
    */
  def create(options: Authorization): js.Promise[Client] = js.native
  def create(options: Authorization, callback: callback): Unit = js.native
  /**
    * Returns a copy of the configuration values.
    */
  def getConfiguration(): Configuration = js.native
  /**
    * Used by other modules to formulate all network requests to the Braintree gateway.
    * It is also capable of being used directly from your own form to tokenize credit card information.
    * However, be sure to satisfy PCI compliance if you use direct card tokenization.
    *     * @example
    *
    * <caption>Direct Credit Card Tokenization</caption>
    * var createClient = require('braintree-web/client').create;
    *
    * createClient({
    *   authorization: CLIENT_AUTHORIZATION
    * }, function (createErr, clientInstance) {
    *   var form = document.getElementById('my-form-id');
    *   var data = {
    *     creditCard: {
    *       number: form['cc-number'].value,
    *       cvv: form['cc-cvv'].value,
    *       expirationDate: form['cc-date'].value,
    *       billingAddress: {
    *         postalCode: form['cc-postal'].value
    *       },
    *       options: {
    *         validate: false
    *       }
    *     }
    *   };
    *
    *   // Warning: For a merchant to be eligible for the easiest level of PCI compliance (SAQ A),
    *   // payment fields cannot be hosted on your checkout page.
    *   // For an alternative to the following, use Hosted Fields.
    *   clientInstance.request({
    *     endpoint: 'payment_methods/credit_cards',
    *     method: 'post',
    *     data: data
    *   }, function (requestErr, response) {
    *  // More detailed example of handling API errors: https://codepen.io/braintree/pen/MbwjdM
    *     if (requestErr) { throw new Error(requestErr); }
    *
    *     console.log('Got nonce:', response.creditCards[0].nonce);
    *   });
    * });
    */
  def request(options: Data, callback: callback): Unit = js.native
}

