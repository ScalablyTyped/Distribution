package typings.chrome.chrome.platformKeys

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientCertificateSelectRequestDetails extends js.Object {
  /** List of distinguished names of certificate authorities allowed by the server. Each entry must be a DER-encoded X.509 DistinguishedName. */
  var certificateAuthorities: js.Array[ArrayBuffer] = js.native
  /** This field is a list of the types of certificates requested, sorted in order of the server's preference. Only certificates of a type contained in this list will be retrieved. If certificateTypes is the empty list, however, certificates of any type will be returned. */
  var certificateTypes: js.Array[String] = js.native
}

object ClientCertificateSelectRequestDetails {
  @scala.inline
  def apply(certificateAuthorities: js.Array[ArrayBuffer], certificateTypes: js.Array[String]): ClientCertificateSelectRequestDetails = {
    val __obj = js.Dynamic.literal(certificateAuthorities = certificateAuthorities.asInstanceOf[js.Any], certificateTypes = certificateTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCertificateSelectRequestDetails]
  }
  @scala.inline
  implicit class ClientCertificateSelectRequestDetailsOps[Self <: ClientCertificateSelectRequestDetails] (val x: Self) extends AnyVal {
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
    def setCertificateAuthoritiesVarargs(value: ArrayBuffer*): Self = this.set("certificateAuthorities", js.Array(value :_*))
    @scala.inline
    def setCertificateAuthorities(value: js.Array[ArrayBuffer]): Self = this.set("certificateAuthorities", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificateTypesVarargs(value: String*): Self = this.set("certificateTypes", js.Array(value :_*))
    @scala.inline
    def setCertificateTypes(value: js.Array[String]): Self = this.set("certificateTypes", value.asInstanceOf[js.Any])
  }
  
}

