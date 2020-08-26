package typings.braintreeWeb.paypalMod

import typings.braintreeWeb.anon.BillingAgreementDescription
import typings.braintreeWeb.anon.Client
import typings.braintreeWeb.coreMod.callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PayPal extends js.Object {
  var VERSION: String = js.native
  /**
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
    */
  def create(options: Client): js.Promise[PayPal] = js.native
  def create(options: Client, callback: callback): Unit = js.native
  /**
    * Cleanly tear down anything set up by `create`.
    */
  def teardown(): Unit = js.native
  def teardown(callback: js.Function0[Unit]): Unit = js.native
  /**
    * Launches the PayPal login flow and returns a nonce payload. Only one PayPal login flow should be active at a time.
    * One way to achieve this is to disable your PayPal button while the flow is open.
    * * Checkout flows only.
    * * `authorize` - Submits the transaction for authorization but not settlement.
    * * `sale` - Payment will be immediately submitted for settlement upon creating a transaction.
    * * Changes the call-to-action in the PayPal flow. By default the final button will show the localized
    * word for "Continue" and implies that the final amount billed is not yet known.
    *
    * Setting this option to `commit` changes the button text to "Pay Now" and page text will convey to
    * the user that billing will take place immediately.         *
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
    */
  def tokenize(options: BillingAgreementDescription): js.Promise[PayPalTokenizeReturn] = js.native
  def tokenize(options: BillingAgreementDescription, callback: callback): PayPalTokenizeReturn = js.native
}

