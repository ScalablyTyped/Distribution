package typings.chrome.chrome.platformKeys

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerCertificateVerificationDetails extends js.Object {
  /** The hostname of the server to verify the certificate for, e.g. the server that presented the serverCertificateChain. */
  var hostname: String
  /** Each chain entry must be the DER encoding of a X.509 certificate, the first entry must be the server certificate and each entry must certify the entry preceding it. */
  var serverCertificateChain: js.Array[ArrayBuffer]
}

object ServerCertificateVerificationDetails {
  @scala.inline
  def apply(hostname: String, serverCertificateChain: js.Array[ArrayBuffer]): ServerCertificateVerificationDetails = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], serverCertificateChain = serverCertificateChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerCertificateVerificationDetails]
  }
}

