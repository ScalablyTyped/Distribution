package typings.chromeDashApps.chrome.enterprise.platformKeys

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.enterprise.platformKeys.challengeUserKey")
@js.native
object challengeUserKey extends js.Object {
  /**
    * @since Chrome 50.
    * Challenges a hardware-backed Enterprise User Key and emits the response as part of a remote attestation protocol.
    * Only useful on Chrome OS and in conjunction with the Verified Access Web API which both issues challenges and verifies responses.
    * A successful verification by the Verified Access Web API is a strong signal of all of the following:
    *  - The current device is a legitimate Chrome OS device.
    *  - The current device is managed by the domain specified during verification.
    *  - The current signed-in user is managed by the domain specified during verification.
    *  - The current device state complies with enterprise user policy.
    * For example, a policy may specify that the device must not be in developer mode.
    *  - The public key emitted by the verification is tightly bound to the hardware of the current device and to the current signed-in user.
    * This function is highly restricted and will fail if the current device is not managed, the current user is not managed,
    * or if this operation has not explicitly been enabled for the caller by enterprise user policy.
    * The Enterprise User Key does not reside in the 'user' token and is not accessible by any other API.
    * @param challenge A challenge as emitted by the Verified Access Web API.
    * @param registerKey If set, the current Enterprise User Key is registered with the 'user' token and relinquishes the Enterprise User Key role.
    *                    The key can then be associated with a certificate and used like any other signing key.
    *                    This key is 2048-bit RSA. Subsequent calls to this function will then generate a new Enterprise User Key.
    * @param callback Called back with the challenge response.
    */
  def apply(
    challenge: ArrayBuffer,
    registerKey: Boolean,
    callback: js.Function1[/* response */ ArrayBuffer, Unit]
  ): Unit = js.native
}

