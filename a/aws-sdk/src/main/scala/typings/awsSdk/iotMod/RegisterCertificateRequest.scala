package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterCertificateRequest extends js.Object {
  /**
    * The CA certificate used to sign the device certificate being registered.
    */
  var caCertificatePem: js.UndefOr[CertificatePem] = js.native
  /**
    * The certificate data, in PEM format.
    */
  var certificatePem: CertificatePem = js.native
  /**
    * A boolean value that specifies if the certificate is set to active.
    */
  var setAsActive: js.UndefOr[SetAsActiveFlag] = js.native
  /**
    * The status of the register certificate request.
    */
  var status: js.UndefOr[CertificateStatus] = js.native
}

object RegisterCertificateRequest {
  @scala.inline
  def apply(certificatePem: CertificatePem): RegisterCertificateRequest = {
    val __obj = js.Dynamic.literal(certificatePem = certificatePem.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCertificateRequest]
  }
  @scala.inline
  implicit class RegisterCertificateRequestOps[Self <: RegisterCertificateRequest] (val x: Self) extends AnyVal {
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
    def setCaCertificatePem(value: CertificatePem): Self = this.set("caCertificatePem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaCertificatePem: Self = this.set("caCertificatePem", js.undefined)
    @scala.inline
    def setSetAsActive(value: SetAsActiveFlag): Self = this.set("setAsActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetAsActive: Self = this.set("setAsActive", js.undefined)
    @scala.inline
    def setStatus(value: CertificateStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

