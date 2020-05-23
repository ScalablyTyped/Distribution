package typings.braintreeWeb.mod

import typings.braintreeWeb.anon.AddFrame
import typings.braintreeWeb.anon.Bin
import typings.braintreeWeb.anon.Client
import typings.braintreeWeb.anon.RemoveFrame
import typings.braintreeWeb.anon.Version
import typings.std.HTMLIFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreeDSecure_ extends js.Object {
  /**
    * @description The current version of the SDK, i.e. `3.0.2`.
    * @type {string}
    */
  var VERSION: String = js.native
  /**
    * @callback ThreeDSecure~addFrameCallback
    * @param {?BraintreeError} [err] `null` or `undefined` if there was no error.
    * @param {HTMLIFrameElement} iframe An iframe element containing the bank's authentication page that you must put on your page.
    * @description The callback used for options.addFrame in {@link ThreeDSecure#verifyCard|verifyCard}.
    * @returns {void}
    */
  def addFrameCallback(): Unit = js.native
  def addFrameCallback(err: BraintreeError): Unit = js.native
  def addFrameCallback(err: BraintreeError, iframe: HTMLIFrameElement): Unit = js.native
  /**
    * Cancel the 3DS flow and return the verification payload if available.
    * @public
    * @param {errback} callback The second argument is a {@link ThreeDSecure~verifyPayload|verifyPayload}. If there is no verifyPayload (the initial lookup did not complete), an error will be returned.
    * @returns {void}
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
  def cancelVerifyCard(callback: callback): Unit = js.native
  /**
    * @static
    * @function create
    * @param {object} options Creation options:
    * @param {string} [options.authorization] A tokenizationKey or clientToken. Can be used in place of `options.client`.
    * @param {Version} options.version=1 The version of 3DS to use. Pass in 2 to use 3DS 2.0.
    * @param {Client} options.client A {@link Client} instance.
    * @param {callback} callback The second argument, `data`, is the {@link ThreeDSecure} instance.
    * @returns {void}
    * @example
    * braintree.threeDSecure.create({
    *   client: client
    * }, callback);
    */
  def create(options: Client): js.Promise[ThreeDSecure_] = js.native
  def create(options: Client, callback: callback): Unit = js.native
  def create(options: Version): js.Promise[ThreeDSecure_] = js.native
  def create(options: Version, callback: callback): Unit = js.native
  /**
    * Gather the data needed for a 3D Secure lookup call.
    *
    * @public
    * @param {object} options Options for 3D Secure lookup.
    * @param {string} options.nonce The nonce representing the card from a tokenization payload. For example, this can be a {@link HostedFields~tokenizePayload|tokenizePayload} returned by Hosted Fields under `payload.nonce`.
    * @param {string} [options.bin] The numeric Bank Identification Number (bin) of the card from a tokenization payload. For example, this can be a {@link HostedFields~tokenizePayload|tokenizePayload} returned by Hosted Fields under `payload.details.bin`. Though not required to start the verification, it is required to receive a 3DS 2.0 lookup response.
    * @param {callback} [callback] The second argument, <code>data</code>, is a {@link ThreeDSecure~prepareLookupPayload|prepareLookupPayload}. If no callback is provided, it will return a promise that resolves {@link ThreeDSecure~prepareLookupPayload|prepareLookupPayload}.
    * @returns {Promise|void} Returns a promise if no callback is provided.
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
  def prepareLookup(options: Bin, callback: callback): Unit = js.native
  /**
    * @callback ThreeDSecure~removeFrameCallback
    * @description The callback used for options.removeFrame in {@link ThreeDSecure#verifyCard|verifyCard}.
    * @returns {void}
    */
  def removeFrameCallback(): Unit = js.native
  /**
    * Cleanly tear down anything set up by {@link module:braintree-web/three-d-secure.create|create}
    * @public
    * @param {errback} [callback] Called once teardown is complete. No data is returned if teardown completes successfully.
    * @returns {void}
    */
  def teardown(): Unit = js.native
  def teardown(callback: callback): Unit = js.native
  /**
    * Launch the 3D Secure login flow, returning a nonce payload.
    * @public
    * @param {object} options Options for card verification.
    * @param {string} options.nonce A nonce referencing the card to be verified. For example, this can be a nonce that was returned by Hosted Fields.
    * @param {number} options.amount The amount of the transaction in the current merchant account's currency. For example, if you are running a transaction of $123.45 US dollars, `amount` would be 123.45.
    * @param {errback} options.addFrame This {@link ThreeDSecure~addFrameCallback|addFrameCallback} will be called when the bank frame needs to be added to your page.
    * @param {callback} options.removeFrame This {@link ThreeDSecure~removeFrameCallback|removeFrameCallback} will be called when the bank frame needs to be removed from your page.
    * @param {errback} callback The second argument, <code>data</code>, is a {@link ThreeDSecure~verifyPayload|verifyPayload}
    * @returns {void}
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
  def verifyCard(options: AddFrame): js.Promise[ThreeDSecureVerifyPayload] = js.native
  def verifyCard(options: RemoveFrame, callback: callback): Unit = js.native
}

