package typings.chromeDashApps.chrome.platformKeys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.platformKeys.verifyTLSServerCertificate")
@js.native
object verifyTLSServerCertificate extends js.Object {
  /**
    * Checks whether *details.serverCertificateChain* can be trusted
    * for *details.hostname* according to the trust settings of the
    * platform.
    * Note: The actual behavior of the trust verification is not fully
    * specified and might change in the future.
    * The API implementation verifies certificate expiration, validates the
    * certification path and checks trust by a known CA.
    * The implementation is supposed to respect the EKU serverAuth and to
    * support subject alternative names.
    */
  def apply(details: VerificationDetails, callback: js.Function1[/* result */ VerificationResult, Unit]): Unit = js.native
}

