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
  def apply(
    certificateArn: CertificateArn = null,
    certificateId: CertificateId = null,
    creationDate: DateType = null,
    transferDate: DateType = null,
    transferMessage: Message = null,
    transferredTo: AwsAccountId = null
  ): OutgoingCertificate = {
    val __obj = js.Dynamic.literal()
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn.asInstanceOf[js.Any])
    if (certificateId != null) __obj.updateDynamic("certificateId")(certificateId.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (transferDate != null) __obj.updateDynamic("transferDate")(transferDate.asInstanceOf[js.Any])
    if (transferMessage != null) __obj.updateDynamic("transferMessage")(transferMessage.asInstanceOf[js.Any])
    if (transferredTo != null) __obj.updateDynamic("transferredTo")(transferredTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutgoingCertificate]
  }
}

