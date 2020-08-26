package typings.braintreeWeb.venmoMod

import typings.braintreeWeb.anon.AllowNewBrowserTab
import typings.braintreeWeb.anon.ProcessResultsDelay
import typings.braintreeWeb.coreMod.BraintreeError
import typings.braintreeWeb.coreMod.callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Venmo extends js.Object {
  var VERSION: String = js.native
  def create(options: AllowNewBrowserTab): Unit = js.native
  def create(options: AllowNewBrowserTab, callback: callback): Unit = js.native
  /**
    * braintree.venmo.create({
    *   client: clientInstance
    * }).then(function (venmoInstance) {
    *   // venmoInstance is ready to be used.
    * }).catch(function (createErr) {
    *   console.error('Error creating Venmo instance', createErr);
    * });
    */
  @JSName("create")
  def create_Promise(options: AllowNewBrowserTab): js.Promise[Venmo] = js.native
  /**
    * Returns a boolean indicating whether a Venmo tokenization result is ready to be processed immediately.
    *
    * This method should be called after initialization to see if the result of Venmo authorization is available.
    * If it returns true, call {@link Venmo#tokenize|tokenize} immediately to process the results.
    */
  def hasTokenizationResult(): Boolean = js.native
  /**
    * Returns a boolean indicating whether the current browser supports Venmo as a payment method.
    *
    * If `options.allowNewBrowserTab` is false when calling {@link module:braintree-web/venmo.create|venmo.create},
    * this method will return true only for browsers known to support returning from the Venmo app to the same browser tab.
    * Currently, this is limited to iOS Safari and Android Chrome.
    */
  def isBrowserSupported(): Boolean = js.native
  /**
    * Cleanly tear down anything set up by {@link module:braintree-web/venmo.create|create}.         * @example
    * venmoInstance.teardown();
    * @example <caption>With callback</caption>
    * venmoInstance.teardown(function () {
    *   // teardown is complete
    * });
    */
  def teardown(): Unit = js.native
  def teardown(callback: js.Function0[Unit]): Unit = js.native
  @JSName("teardown")
  def teardown_Promise(): js.Promise[Unit] = js.native
  def tokenize(): Unit = js.native
  def tokenize(
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      /* error */ js.UndefOr[BraintreeError], 
      /* payload */ js.UndefOr[VenmoTokenizePayload], 
      Unit
    ]
  ): Unit = js.native
  def tokenize(options: ProcessResultsDelay): Unit = js.native
  def tokenize(
    options: ProcessResultsDelay,
    callback: js.Function2[
      /* error */ js.UndefOr[BraintreeError], 
      /* payload */ js.UndefOr[VenmoTokenizePayload], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Launches the Venmo flow and returns a nonce payload.
    *
    * If {@link Venmo#hasTokenizationResult|hasTokenizationResult} returns true, calling tokenize will immediately
    * process and return the results without initiating the Venmo payment authorization flow.
    *
    * Only one Venmo flow can be active at a time. One way to achieve this is to disable your Venmo button while
    * the flow is open.
    * @example
    * button.addEventListener('click', function () {
    *   // Disable the button so that we don't attempt to open multiple popups.
    *   button.setAttribute('disabled', 'disabled');
    *
    *   // Because tokenize opens a new window, this must be called
    *   // as a result of a user action, such as a button click.
    *   venmoInstance.tokenize().then(function (payload) {
    *     // Submit payload.nonce to your server
    *     // Use payload.username to get the Venmo username and display any UI
    *   }).catch(function (tokenizeError) {
    *     // Handle flow errors or premature flow closure
    *     switch (tokenizeErr.code) {
    *       case 'VENMO_APP_CANCELED':
    *         console.log('User canceled Venmo flow.');
    *         break;
    *       case 'VENMO_CANCELED':
    *         console.log('User canceled Venmo, or Venmo app is not available.');
    *         break;
    *       default:
    *         console.error('Error!', tokenizeErr);
    *     }
    *   }).then(function () {
    *     button.removeAttribute('disabled');
    *   });
    * });
    */
  @JSName("tokenize")
  def tokenize_Promise(): js.Promise[VenmoTokenizePayload] = js.native
  @JSName("tokenize")
  def tokenize_Promise(options: ProcessResultsDelay): js.Promise[VenmoTokenizePayload] = js.native
}

