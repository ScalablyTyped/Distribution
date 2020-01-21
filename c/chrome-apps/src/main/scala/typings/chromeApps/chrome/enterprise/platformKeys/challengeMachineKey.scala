package typings.chromeApps.chrome.enterprise.platformKeys

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.enterprise.platformKeys.challengeMachineKey")
@js.native
object challengeMachineKey extends js.Object {
  /**
    * @since Chrome 50.
    * @description
    * Challenges a hardware-backed Enterprise Machine Key and emits the response as part of a remote attestation protocol.
    * Only useful on Chrome OS and in conjunction with the Verified Access Web API which both issues challenges and verifies responses.
    * A successful verification by the Verified Access Web API is a strong signal of all of the following:
    *  - The current device is a legitimate Chrome OS device.
    *  - The current device is managed by the domain specified during verification.
    *  - The current signed-in user is managed by the domain specified during verification.
    *  - The current device state complies with enterprise device policy.
    * For example, a policy may specify that the device must not be in developer mode.
    *  - Any device identity emitted by the verification is tightly bound to the hardware of the current device.
    *    This function is highly restricted and will fail if the current device is not managed,
    *    the current user is not managed, or if this operation has not explicitly been enabled
    *    for the caller by enterprise device policy. The Enterprise Machine Key does not reside
    *    in the 'system' token and is not accessible by any other API.
    * @param challenge A challenge as emitted by the Verified Access Web API.
    * @param callback Called back with the challenge response.
    */
  def apply(challenge: ArrayBuffer, callback: js.Function1[/* response */ ArrayBuffer, Unit]): Unit = js.native
  /**
    * @since **Since Chrome 59.** - Note: the parameter 'registerKey' requires at least Chrome 59
    * @description
    * Challenges a hardware-backed Enterprise Machine Key and emits the response as part of a remote attestation protocol.
    * Only useful on Chrome OS and in conjunction with the Verified Access Web API which both issues challenges and verifies responses.
    * A successful verification by the Verified Access Web API is a strong signal of all of the following:
    *  - The current device is a legitimate Chrome OS device.
    *  - The current device is managed by the domain specified during verification.
    *  - The current signed-in user is managed by the domain specified during verification.
    *  - The current device state complies with enterprise device policy.
    * For example, a policy may specify that the device must not be in developer mode.
    *  - Any device identity emitted by the verification is tightly bound to the hardware of the current device.
    *    This function is highly restricted and will fail if the current device is not managed,
    *    the current user is not managed, or if this operation has not explicitly been enabled
    *    for the caller by enterprise device policy. The Enterprise Machine Key does not reside
    *    in the 'system' token and is not accessible by any other API.
    * @param challenge A challenge as emitted by the Verified Access Web API.
    * @param registerKey If set, the current Enterprise Machine Key is registered with the 'system' token and relinquishes the Enterprise Machine Key role.
    *                    The key can then be associated with a certificate and used like any other signing key. This key is 2048-bit RSA.
    *                    Subsequent calls to this function will then generate a new Enterprise Machine Key.
    * @param callback Called back with the challenge response.
    */
  def apply(
    challenge: ArrayBuffer,
    registerKey: Boolean,
    callback: js.Function1[/* response */ ArrayBuffer, Unit]
  ): Unit = js.native
}

