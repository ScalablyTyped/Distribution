package typings.chromeDashApps.chrome.certificateProvider

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateInfo extends js.Object {
  /**
    * Must be the DER encoding of a X.509 certificate. Currently, only
    * certificates of RSA keys are supported.
    */
  var certificate: js.UndefOr[ArrayBuffer] = js.undefined
  /**
    * Must be set to all hashes supported for this certificate. This app
    * will only be asked for signatures of digests calculated with one of these
    * hash algorithms. This should be in order of decreasing hash preference.
    * @see Hash
    */
  var supportedHashes: js.UndefOr[js.Array[Hash]] = js.undefined
}

object CertificateInfo {
  @scala.inline
  def apply(certificate: ArrayBuffer = null, supportedHashes: js.Array[Hash] = null): CertificateInfo = {
    val __obj = js.Dynamic.literal()
    if (certificate != null) __obj.updateDynamic("certificate")(certificate.asInstanceOf[js.Any])
    if (supportedHashes != null) __obj.updateDynamic("supportedHashes")(supportedHashes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateInfo]
  }
}

