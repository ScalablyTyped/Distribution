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
  def apply(certificatePem: CertificatePem): RegisterCertificateWithoutCARequest = {
    val __obj = js.Dynamic.literal(certificatePem = certificatePem.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCertificateWithoutCARequest]
  }
  @scala.inline
  implicit class RegisterCertificateWithoutCARequestOps[Self <: RegisterCertificateWithoutCARequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCertificatePem(value: CertificatePem): Self = this.set("certificatePem", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: CertificateStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

