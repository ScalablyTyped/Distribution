package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerCertificateSummary extends js.Object {
  /**
    * The ARN of the server certificate.
    */
  var serverCertificateArn: js.UndefOr[AcmCertificateArn] = js.native
  /**
    * The status of the server certificate.
    */
  var serverCertificateStatus: js.UndefOr[ServerCertificateStatus] = js.native
  /**
    * Details that explain the status of the server certificate.
    */
  var serverCertificateStatusDetail: js.UndefOr[ServerCertificateStatusDetail] = js.native
}

object ServerCertificateSummary {
  @scala.inline
  def apply(
    serverCertificateArn: AcmCertificateArn = null,
    serverCertificateStatus: ServerCertificateStatus = null,
    serverCertificateStatusDetail: ServerCertificateStatusDetail = null
  ): ServerCertificateSummary = {
    val __obj = js.Dynamic.literal()
    if (serverCertificateArn != null) __obj.updateDynamic("serverCertificateArn")(serverCertificateArn.asInstanceOf[js.Any])
    if (serverCertificateStatus != null) __obj.updateDynamic("serverCertificateStatus")(serverCertificateStatus.asInstanceOf[js.Any])
    if (serverCertificateStatusDetail != null) __obj.updateDynamic("serverCertificateStatusDetail")(serverCertificateStatusDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerCertificateSummary]
  }
}

