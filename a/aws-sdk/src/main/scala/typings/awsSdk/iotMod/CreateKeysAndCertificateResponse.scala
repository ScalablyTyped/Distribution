package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateKeysAndCertificateResponse extends js.Object {
  /**
    * The ARN of the certificate.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.native
  /**
    * The ID of the certificate. AWS IoT issues a default subject name for the certificate (for example, AWS IoT Certificate).
    */
  var certificateId: js.UndefOr[CertificateId] = js.native
  /**
    * The certificate data, in PEM format.
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.native
  /**
    * The generated key pair.
    */
  var keyPair: js.UndefOr[KeyPair] = js.native
}

object CreateKeysAndCertificateResponse {
  @scala.inline
  def apply(): CreateKeysAndCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateKeysAndCertificateResponse]
  }
  @scala.inline
  implicit class CreateKeysAndCertificateResponseOps[Self <: CreateKeysAndCertificateResponse] (val x: Self) extends AnyVal {
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
    def setCertificateArn(value: CertificateArn): Self = this.set("certificateArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateArn: Self = this.set("certificateArn", js.undefined)
    @scala.inline
    def setCertificateId(value: CertificateId): Self = this.set("certificateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateId: Self = this.set("certificateId", js.undefined)
    @scala.inline
    def setCertificatePem(value: CertificatePem): Self = this.set("certificatePem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificatePem: Self = this.set("certificatePem", js.undefined)
    @scala.inline
    def setKeyPair(value: KeyPair): Self = this.set("keyPair", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyPair: Self = this.set("keyPair", js.undefined)
  }
  
}

