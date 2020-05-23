package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterCertificateWithoutCARequest extends js.Object {
  /**
    * The certificate data, in PEM format.
    */
  var certificatePem: CertificatePem = js.native
  /**
    * The status of the register certificate request.
    */
  var status: js.UndefOr[CertificateStatus] = js.native
}

object RegisterCertificateWithoutCARequest {
  @scala.inline
  def apply(certificatePem: CertificatePem, status: CertificateStatus = null): RegisterCertificateWithoutCARequest = {
    val __obj = js.Dynamic.literal(certificatePem = certificatePem.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCertificateWithoutCARequest]
  }
}

