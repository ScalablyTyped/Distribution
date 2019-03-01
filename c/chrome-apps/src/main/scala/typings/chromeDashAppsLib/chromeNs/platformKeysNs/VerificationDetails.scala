package typings
package chromeDashAppsLib.chromeNs.platformKeysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerificationDetails extends js.Object {
  // The hostname of the server to verify the certificate for, e.g. the server
  // that presented the *serverCertificateChain*.
  var hostname: java.lang.String
  // Each chain entry must be the DER encoding of a X.509 certificate, the
  // first entry must be the server certificate and each entry must certify
  // the entry preceding it.
  var serverCertificateChain: js.Array[stdLib.ArrayBuffer]
}

object VerificationDetails {
  @scala.inline
  def apply(hostname: java.lang.String, serverCertificateChain: js.Array[stdLib.ArrayBuffer]): VerificationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hostname")(hostname)
    __obj.updateDynamic("serverCertificateChain")(serverCertificateChain)
    __obj.asInstanceOf[VerificationDetails]
  }
}

