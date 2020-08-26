package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutgoingCertificate extends js.Object {
  /**
    * The certificate ARN.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.native
  /**
    * The certificate ID.
    */
  var certificateId: js.UndefOr[CertificateId] = js.native
  /**
    * The certificate creation date.
    */
  var creationDate: js.UndefOr[DateType] = js.native
  /**
    * The date the transfer was initiated.
    */
  var transferDate: js.UndefOr[DateType] = js.native
  /**
    * The transfer message.
    */
  var transferMessage: js.UndefOr[Message] = js.native
  /**
    * The AWS account to which the transfer was made.
    */
  var transferredTo: js.UndefOr[AwsAccountId] = js.native
}

object OutgoingCertificate {
  @scala.inline
  def apply(): OutgoingCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutgoingCertificate]
  }
  @scala.inline
  implicit class OutgoingCertificateOps[Self <: OutgoingCertificate] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: DateType): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setTransferDate(value: DateType): Self = this.set("transferDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferDate: Self = this.set("transferDate", js.undefined)
    @scala.inline
    def setTransferMessage(value: Message): Self = this.set("transferMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferMessage: Self = this.set("transferMessage", js.undefined)
    @scala.inline
    def setTransferredTo(value: AwsAccountId): Self = this.set("transferredTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferredTo: Self = this.set("transferredTo", js.undefined)
  }
  
}

