package typings.chromeApps.chrome.platformKeys

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerificationDetails extends js.Object {
  // The hostname of the server to verify the certificate for, e.g. the server
  // that presented the *serverCertificateChain*.
  var hostname: String
  // Each chain entry must be the DER encoding of a X.509 certificate, the
  // first entry must be the server certificate and each entry must certify
  // the entry preceding it.
  var serverCertificateChain: js.Array[ArrayBuffer]
}

object VerificationDetails {
  @scala.inline
  def apply(hostname: String, serverCertificateChain: js.Array[ArrayBuffer]): VerificationDetails = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], serverCertificateChain = serverCertificateChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerificationDetails]
  }
}

