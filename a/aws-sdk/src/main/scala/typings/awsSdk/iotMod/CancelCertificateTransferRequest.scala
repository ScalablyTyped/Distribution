package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelCertificateTransferRequest extends js.Object {
  /**
    * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
    */
  var certificateId: CertificateId = js.native
}

object CancelCertificateTransferRequest {
  @scala.inline
  def apply(certificateId: CertificateId): CancelCertificateTransferRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelCertificateTransferRequest]
  }
  @scala.inline
  implicit class CancelCertificateTransferRequestOps[Self <: CancelCertificateTransferRequest] (val x: Self) extends AnyVal {
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
    def setCertificateId(value: CertificateId): Self = this.set("certificateId", value.asInstanceOf[js.Any])
  }
  
}

