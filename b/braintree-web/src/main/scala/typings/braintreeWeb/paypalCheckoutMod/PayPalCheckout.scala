package typings.braintreeWeb.paypalCheckoutMod

import typings.braintreeWeb.anon.MerchantAccountId
import typings.braintreeWeb.anon.OptOutOfModalBackdrop
import typings.braintreeWeb.coreMod.callback
import typings.paypalCheckoutComponents.callbackDataMod.TokenizePayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PayPalCheckout extends js.Object {
  /**
    * @description The current version of the SDK, i.e. `3.0.2`.
    */
  var VERSION: String = js.native
  def create(options: MerchantAccountId): Unit = js.native
  def create(options: MerchantAccountId, callback: callback): Unit = js.native
  /**
    * Creates a PayPal payment ID or billing token using the given options. This is meant to be passed to PayPal's checkout.js library.
    * When a {@link callback} is defined, the function returns undefined and invokes the callback with the id to be used with the checkout.js
    * library. Otherwise, it returns a Promise that resolves with the id.
    * `authorize` - Submits the transaction for authorization but not settlement.
    * `order` - Validates the transaction without an authorization (i.e. without holding funds).
    *           Useful for authorizing and capturing funds up to 90 days after the order has been placed. Only available for Checkout flow.
    * `capture` - Payment will be immediately submitted for settlement upon creating a transaction.
    * `sale` can be used as an alias for this value.
    * Supported locales are:
    * `da_DK`,
    * `de_DE`,
    * `en_AU`,
    * `en_GB`,
    * `en_US`,
    * `es_ES`,
    * `fr_CA`,
    * `fr_FR`,
    * `id_ID`,
    * `it_IT`,
    * `ja_JP`,
    * `ko_KR`,
    * `nl_NL`,
    * `no_NO`,
    * `pl_PL`,
    * `pt_BR`,
    * `pt_PT`,
    * `ru_RU`,
    * `sv_SE`,
    * `th_TH`,
    * `zh_CN`,
    * `zh_HK`,
    * and `zh_TW`.
    *     * * `login` - A PayPal account login page is used.
    * * `billing` - A non-PayPal account landing page is used.
    * // this paypal object is created by checkout.js
    * // see https://github.com/paypal/paypal-checkout
    * paypal.Buttons({
    *   createOrder: function () {
    *     // when createPayment resolves, it is automatically passed to checkout.js
    *     return paypalCheckoutInstance.createPayment({
    *       flow: 'checkout',
    *       amount: '10.00',
    *       currency: 'USD',
    *       intent: 'capture' // this value must either be `capture` or match the intent passed into the PayPal SDK intent query parameter
    *     });
    *   },
    *   // Add other options, e.g. onApproved, onCancel, onError
    * }).render('#paypal-button');
    *
    * @example
    * // shippingOptions are passed to createPayment. You can review the result from onAuthorize to determine which shipping option id was selected.
    * ```javascript
    * braintree.client.create({
    *   authorization: 'authorization'
    * }).then(function (clientInstance) {
    *   return braintree.paypalCheckout.create({
    *     client: clientInstance
    *   });
    * }).then(function (paypalCheckoutInstance) {
    *   return paypal.Button.render({
    *     env: 'production'
    *
    *     payment: function () {
    *       return paypalCheckoutInstance.createPayment({
    *         flow: 'checkout',
    *         amount: '10.00',
    *         currency: 'USD',
    *         shippingOptions: [
    *           {
    *             id: 'UUID-9',
    *             type: 'PICKUP',
    *             label: 'Store Location Five',
    *             selected: true,
    *             amount: {
    *               value: '1.00',
    *               currency: 'USD'
    *             }
    *           },
    *           {
    *             id: 'shipping-speed-fast',
    *             type: 'SHIPPING',
    *             label: 'Fast Shipping',
    *             selected: false,
    *             amount: {
    *               value: '1.00',
    *               currency: 'USD'
    *             }
    *           },
    *           {
    *             id: 'shipping-speed-slow',
    *             type: 'SHIPPING',
    *             label: 'Slow Shipping',
    *             selected: false,
    *             amount: {
    *               value: '1.00',
    *               currency: 'USD'
    *             }
    *           }
    *         ]
    *       });
    *     },
    *
    *     onAuthorize: function (data, actions) {
    *       return paypalCheckoutInstance.tokenizePayment(data).then(function (payload) {
    *         // Submit payload.nonce to your server
    *       });
    *     }
    *   }, '#paypal-button');
    * }).catch(function (err) {
    *  console.error('Error!', err);
    * });
    * ```
    *
    */
  def createPayment(options: PayPalCheckoutCreatePaymentOptions): js.Promise[String] = js.native
  def createPayment(options: PayPalCheckoutCreatePaymentOptions, callback: callback): js.Promise[String] = js.native
  /**
    * @description There are two ways to integrate the PayPal Checkout component.
    * See the [PayPal Checkout constructor documentation](PayPalCheckout.html#PayPalCheckout) for more information and examples.
    * @example
    * braintree.client.create({
    *   authorization: 'authorization'
    * }).then(function (clientInstance) {
    *   return braintree.paypalCheckout.create({
    *     client: clientInstance
    *   });
    * }).then(function (paypalCheckoutInstance) {
    *   // set up checkout.js
    * }).catch(function (err) {
    *   console.error('Error!', err);
    * });
    */
  @JSName("create")
  def create_Promise(options: MerchantAccountId): js.Promise[PayPalCheckout] = js.native
  /**
    * Resolves with the PayPal client id to be used when loading the PayPal SDK.     * @example
    * paypalCheckoutInstance.getClientId().then(function (id) {
    *  var script = document.createElement('script');
    *
    *  script.src = 'https://www.paypal.com/sdk/js?client-id=' + id;
    *  script.onload = function () {
    *    // setup the PayPal SDK
    *  };
    *
    *  document.body.appendChild(script);
    * });
    */
  def getClientId(): js.Promise[String] = js.native
  def getClientId(callback: js.Function1[/* id */ String, Unit]): Unit = js.native
  /**
    * Initializes the PayPal checkout flow with a payment method nonce that represents a vaulted PayPal account.
    * When a {@link callback} is defined, the function returns undefined and invokes the callback with the id to be used with the checkout.js library.
    * Otherwise, it returns a Promise that resolves with the id.
    * `flow` cannot be set (will always be `'checkout'`)
    * `amount`, `currency`, and `vaultInitiatedCheckoutPaymentMethodToken` are required instead of optional
    * * Additional configuration is available (listed below)
    * @example
    * paypalCheckoutInstance.startVaultInitiatedCheckout({
    *   vaultInitiatedCheckoutPaymentMethodToken: 'nonce-that-represents-a-vaulted-paypal-account',
    *   amount: '10.00',
    *   currency: 'USD'
    * }).then(function (payload) {
    *   // send payload.nonce to your server
    * }).catch(function (err) {
    *   if (err.code === 'PAYPAL_POPUP_CLOSED') {
    *     // indicates that customer canceled by
    *     // manually closing the PayPal popup
    *   }
    *
    *   // handle other errors
    * });
    *
    */
  def startVaultInitiatedCheckout(options: OptOutOfModalBackdrop): js.Promise[Unit] = js.native
  def startVaultInitiatedCheckout(options: OptOutOfModalBackdrop, callback: callback): Unit = js.native
  def teardown(): js.Promise[Unit] = js.native
  /**
    * Cleanly tear down anything set up by {@link module:braintree-web/paypal-checkout.create|create}.
    * @example
    * paypalCheckoutInstance.teardown();
    * @example <caption>With callback</caption>
    * paypalCheckoutInstance.teardown(function () {
    *   // teardown is complete
    * });
    */
  def teardown(callback: js.Function0[Unit]): Unit = js.native
  def tokenizePayment(tokenizeOptions: PayPalCheckoutTokenizationOptions): Unit = js.native
  def tokenizePayment(tokenizeOptions: PayPalCheckoutTokenizationOptions, callback: callback): Unit = js.native
  /**
    * Tokenizes the authorize data from PayPal's checkout.js library when completing a buyer approval flow.
    * When a {@link callback} is defined, invokes the callback with {@link PayPalCheckout~tokenizePayload|tokenizePayload} and returns undefined.
    * Otherwise, returns a Promise that resolves with a {@link PayPalCheckout~tokenizePayload|tokenizePayload}.
    * @example <caption>Opt out of auto-vaulting behavior</caption>
    * // create the paypalCheckoutInstance with a client token generated with a customer id
    * paypal.Buttons({
    *   createBillingAgreement: function () {
    *     return paypalCheckoutInstance.createPayment({
    *       flow: 'vault'
    *       // your other createPayment options here
    *     });
    *   },
    *   onApproved: function (data) {
    *     data.vault = false;
    *
    *     return paypalCheckoutInstance.tokenizePayment(data);
    *   },
    *   // Add other options, e.g. onCancel, onError
    * }).render('#paypal-button');
    *
    */
  @JSName("tokenizePayment")
  def tokenizePayment_Promise(tokenizeOptions: PayPalCheckoutTokenizationOptions): js.Promise[TokenizePayload] = js.native
}

