package typings.braintreeWeb.threeDSecureMod

import typings.braintreeWeb.anon.AddFrame
import typings.braintreeWeb.anon.BinNonce
import typings.braintreeWeb.anon.RemoveFrame
import typings.braintreeWeb.anon.Version
import typings.braintreeWeb.coreMod.BraintreeError
import typings.braintreeWeb.coreMod.callback
import typings.std.HTMLIFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreeDSecure extends js.Object {
  /**
    * @description The current version of the SDK, i.e. `3.0.2`.
    */
  var VERSION: String = js.native
  def addFrameCallback(): Unit = js.native
  def addFrameCallback(err: js.UndefOr[scala.Nothing], iframe: HTMLIFrameElement): Unit = js.native
  def addFrameCallback(err: BraintreeError): Unit = js.native
  def addFrameCallback(err: BraintreeError, iframe: HTMLIFrameElement): Unit = js.native
  /**
    * Cancel the 3DS flow and return the verification payload if available.     * @example
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
    * braintree.threeDSecure.create({
    *   client: client
    * }, callback);
    */
  def create(options: Version): js.Promise[ThreeDSecure] = js.native
  def create(options: Version, callback: callback): Unit = js.native
  /**
    * Gather the data needed for a 3D Secure lookup call.
    *     * @example
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
  def prepareLookup(options: BinNonce): js.Promise[String] = js.native
  def prepareLookup(options: BinNonce, callback: callback): Unit = js.native
  /**
    * @description The callback used for options.removeFrame in {@link ThreeDSecure#verifyCard|verifyCard}.
    */
  def removeFrameCallback(): Unit = js.native
  /**
    * Cleanly tear down anything set up by {@link module:braintree-web/three-d-secure.create|create}
    */
  def teardown(): Unit = js.native
  def teardown(callback: callback): Unit = js.native
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
  def verifyCard(options: AddFrame): js.Promise[ThreeDSecureVerifyPayload] = js.native
  def verifyCard(options: RemoveFrame, callback: callback): Unit = js.native
}

