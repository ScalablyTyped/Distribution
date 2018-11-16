package typings
package braintreeDashWebLib.braintreeDashWebMod.braintreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PayPal extends js.Object {
  /**
       * @description The current version of the SDK, i.e. `3.0.2`.
       * @type {string}
       */
  var VERSION: java.lang.String = js.native
  /**
       * @static
       * @function create
       * @param {object} options Creation options:
       * @param {Client} options.client A {@link Client} instance.
       * @param {callback} callback The second argument, `data`, is the {@link PayPal} instance.
       * @example
       * braintree.paypal.create({
       *   client: clientInstance
       * }, function (createErr, paypalInstance) {
       *   if (createErr) {
       *     if (createErr.code === 'PAYPAL_BROWSER_NOT_SUPPORTED') {
       *       console.error('This browser is not supported.');
       *     } else {
       *       console.error('Error!', createErr);
       *     }
       *   }
       * });
       * @returns {void}
       */
  def create(options: braintreeDashWebLib.Anon_Client_681695910, callback: callback): scala.Unit = js.native
  /**
       * Cleanly tear down anything set up by {@link module:braintree-web/paypal.create|create}.
       * @public
       * @param {callback} [callback] Called once teardown is complete. No data is returned if teardown completes successfully.
       * @returns {void}
       */
  def teardown(): scala.Unit = js.native
  /**
       * Cleanly tear down anything set up by {@link module:braintree-web/paypal.create|create}.
       * @public
       * @param {callback} [callback] Called once teardown is complete. No data is returned if teardown completes successfully.
       * @returns {void}
       */
  def teardown(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Launches the PayPal login flow and returns a nonce payload. Only one PayPal login flow should be active at a time. One way to achieve this is to disable your PayPal button while the flow is open.
       * @public
       * @param {object} options All tokenization options for the PayPal component.
       * @param {string} options.flow Set to 'checkout' for one-time payment flow, or 'vault' for Vault flow. If 'vault' is used with a client token generated with a customer id, the PayPal account will be added to that customer as a saved payment method.
       * @param {string} [options.intent=authorize]
       * Checkout flows only.
       * * `authorize` - Submits the transaction for authorization but not settlement.
       * * `sale` - Payment will be immediately submitted for settlement upon creating a transaction.
       * @param {boolean} [options.offerCredit=false] Offers the customer PayPal Credit if they qualify. Checkout flows only.
       * @param {string} [options.useraction]
       * Changes the call-to-action in the PayPal flow. By default the final button will show the localized
       * word for "Continue" and implies that the final amount billed is not yet known.
       *
       * Setting this option to `commit` changes the button text to "Pay Now" and page text will convey to
       * the user that billing will take place immediately.
       * @param {string|number} [options.amount] The amount of the transaction. Required when using the Checkout flow.
       * @param {string} [options.currency] The currency code of the amount, such as 'USD'. Required when using the Checkout flow.
       * @param {string} [options.displayName] The merchant name displayed inside of the PayPal lightbox; defaults to the company name on your Braintree account
       * @param {string} [options.locale=en_US] Use this option to change the language, links, and terminology used in the PayPal flow. This locale will be used unless the buyer has set a preferred locale for their account. If an unsupported locale is supplied, a fallback locale (determined by buyer preference or browser data) will be used and no error will be thrown.
       *
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
       *
       * @param {boolean} [options.enableShippingAddress=false] Returns a shipping address object in {@link PayPal#tokenize}.
       * @param {object} [options.shippingAddressOverride] Allows you to pass a shipping address you have already collected into the PayPal payment flow.
       * @param {string} options.shippingAddressOverride.line1 Street address.
       * @param {string} [options.shippingAddressOverride.line2] Street address (extended).
       * @param {string} options.shippingAddressOverride.city City.
       * @param {string} options.shippingAddressOverride.state State.
       * @param {string} options.shippingAddressOverride.postalCode Postal code.
       * @param {string} options.shippingAddressOverride.countryCode Country.
       * @param {string} [options.shippingAddressOverride.phone] Phone number.
       * @param {string} [options.shippingAddressOverride.recipientName] Recipient's name.
       * @param {boolean} [options.shippingAddressEditable=true] Set to false to disable user editing of the shipping address.
       * @param {string} [options.billingAgreementDescription] Use this option to set the description of the preapproved payment agreement visible to customers in their PayPal profile during Vault flows. Max 255 characters.
       * @param {callback} callback The second argument, <code>data</code>, is a {@link PayPal~tokenizePayload|tokenizePayload}.
       * @example
       * button.addEventListener('click', function () {
       *   // Disable the button so that we don't attempt to open multiple popups.
       *   button.setAttribute('disabled', 'disabled');
       *
       *   // Because PayPal tokenization opens a popup, this must be called
       *   // as a result of a user action, such as a button click.
       *   paypalInstance.tokenize({
       *     flow: 'vault' // Required
       *     // Any other tokenization options
       *   }, function (tokenizeErr, payload) {
       *     button.removeAttribute('disabled');
       *
       *     if (tokenizeErr) {
       *       // Handle tokenization errors or premature flow closure
       *
       *       switch (tokenizeErr.code) {
       *         case 'PAYPAL_POPUP_CLOSED':
       *           console.error('Customer closed PayPal popup.');
       *           break;
       *         case 'PAYPAL_ACCOUNT_TOKENIZATION_FAILED':
       *           console.error('PayPal tokenization failed. See details:', tokenizeErr.details);
       *           break;
       *         case 'PAYPAL_FLOW_FAILED':
       *           console.error('Unable to initialize PayPal flow. Are your options correct?', tokenizeErr.details);
       *           break;
       *         default:
       *           console.error('Error!', tokenizeErr);
       *       }
       *     } else {
       *       // Submit payload.nonce to your server
       *     }
       *   });
       * });
       * @returns {PayPal~tokenizeReturn} A handle to close the PayPal checkout frame.
       */
  def tokenize(options: braintreeDashWebLib.Anon_DisplayName, callback: callback): PayPalTokenizeReturn = js.native
}

