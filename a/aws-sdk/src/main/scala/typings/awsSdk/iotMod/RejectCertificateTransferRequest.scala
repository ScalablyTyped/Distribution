package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectCertificateTransferRequest extends js.Object {
  /**
    * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
    */
  var certificateId: CertificateId = js.native
  /**
    * The reason the certificate transfer was rejected.
    */
  var rejectReason: js.UndefOr[Message] = js.native
}

object RejectCertificateTransferRequest {
  @scala.inline
  def apply(certificateId: CertificateId): RejectCertificateTransferRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectCertificateTransferRequest]
  }
  @scala.inline
  implicit class RejectCertificateTransferRequestOps[Self <: RejectCertificateTransferRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setRejectReason(value: Message): Self = this.set("rejectReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectReason: Self = this.set("rejectReason", js.undefined)
  }
  
}

