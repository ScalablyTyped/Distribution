package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterCertificateWithoutCAResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the registered certificate.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.native
  /**
    * The ID of the registered certificate. (The last part of the certificate ARN contains the certificate ID.
    */
  var certificateId: js.UndefOr[CertificateId] = js.native
}

object RegisterCertificateWithoutCAResponse {
  @scala.inline
  def apply(): RegisterCertificateWithoutCAResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterCertificateWithoutCAResponse]
  }
  @scala.inline
  implicit class RegisterCertificateWithoutCAResponseOps[Self <: RegisterCertificateWithoutCAResponse] (val x: Self) extends AnyVal {
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
  }
  
}

