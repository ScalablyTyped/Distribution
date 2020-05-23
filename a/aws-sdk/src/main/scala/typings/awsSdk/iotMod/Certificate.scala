package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Certificate extends js.Object {
  /**
    * The ARN of the certificate.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.native
  /**
    * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
    */
  var certificateId: js.UndefOr[CertificateId] = js.native
  /**
    * The mode of the certificate.
    */
  var certificateMode: js.UndefOr[CertificateMode] = js.native
  /**
    * The date and time the certificate was created.
    */
  var creationDate: js.UndefOr[DateType] = js.native
  /**
    * The status of the certificate. The status value REGISTER_INACTIVE is deprecated and should not be used.
    */
  var status: js.UndefOr[CertificateStatus] = js.native
}

object Certificate {
  @scala.inline
  def apply(
    certificateArn: CertificateArn = null,
    certificateId: CertificateId = null,
    certificateMode: CertificateMode = null,
    creationDate: DateType = null,
    status: CertificateStatus = null
  ): Certificate = {
    val __obj = js.Dynamic.literal()
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn.asInstanceOf[js.Any])
    if (certificateId != null) __obj.updateDynamic("certificateId")(certificateId.asInstanceOf[js.Any])
    if (certificateMode != null) __obj.updateDynamic("certificateMode")(certificateMode.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certificate]
  }
}

