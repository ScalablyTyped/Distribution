package typings.chrome.chrome.platformKeys

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerCertificateVerificationDetails extends js.Object {
  /** The hostname of the server to verify the certificate for, e.g. the server that presented the serverCertificateChain. */
  var hostname: String = js.native
  /** Each chain entry must be the DER encoding of a X.509 certificate, the first entry must be the server certificate and each entry must certify the entry preceding it. */
  var serverCertificateChain: js.Array[ArrayBuffer] = js.native
}

object ServerCertificateVerificationDetails {
  @scala.inline
  def apply(hostname: String, serverCertificateChain: js.Array[ArrayBuffer]): ServerCertificateVerificationDetails = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], serverCertificateChain = serverCertificateChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerCertificateVerificationDetails]
  }
  @scala.inline
  implicit class ServerCertificateVerificationDetailsOps[Self <: ServerCertificateVerificationDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerCertificateChainVarargs(value: ArrayBuffer*): Self = this.set("serverCertificateChain", js.Array(value :_*))
    @scala.inline
    def setServerCertificateChain(value: js.Array[ArrayBuffer]): Self = this.set("serverCertificateChain", value.asInstanceOf[js.Any])
  }
  
}

