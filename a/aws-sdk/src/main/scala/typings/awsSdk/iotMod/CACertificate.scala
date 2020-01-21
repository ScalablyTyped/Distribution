package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CACertificate extends js.Object {
  /**
    * The ARN of the CA certificate.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.native
  /**
    * The ID of the CA certificate.
    */
  var certificateId: js.UndefOr[CertificateId] = js.native
  /**
    * The date the CA certificate was created.
    */
  var creationDate: js.UndefOr[DateType] = js.native
  /**
    * The status of the CA certificate. The status value REGISTER_INACTIVE is deprecated and should not be used.
    */
  var status: js.UndefOr[CACertificateStatus] = js.native
}

object CACertificate {
  @scala.inline
  def apply(
    certificateArn: CertificateArn = null,
    certificateId: CertificateId = null,
    creationDate: DateType = null,
    status: CACertificateStatus = null
  ): CACertificate = {
    val __obj = js.Dynamic.literal()
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn.asInstanceOf[js.Any])
    if (certificateId != null) __obj.updateDynamic("certificateId")(certificateId.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CACertificate]
  }
}

