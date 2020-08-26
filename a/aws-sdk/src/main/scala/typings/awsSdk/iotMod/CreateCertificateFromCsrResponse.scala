package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCertificateFromCsrResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the certificate. You can use the ARN as a principal for policy operations.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.native
  /**
    * The ID of the certificate. Certificate management operations only take a certificateId.
    */
  var certificateId: js.UndefOr[CertificateId] = js.native
  /**
    * The certificate data, in PEM format.
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.native
}

object CreateCertificateFromCsrResponse {
  @scala.inline
  def apply(): CreateCertificateFromCsrResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCertificateFromCsrResponse]
  }
  @scala.inline
  implicit class CreateCertificateFromCsrResponseOps[Self <: CreateCertificateFromCsrResponse] (val x: Self) extends AnyVal {
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
  }
  
}

