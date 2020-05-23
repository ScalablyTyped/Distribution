package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptCertificateTransferRequest extends js.Object {
  /**
    * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
    */
  var certificateId: CertificateId = js.native
  /**
    * Specifies whether the certificate is active.
    */
  var setAsActive: js.UndefOr[SetAsActive] = js.native
}

object AcceptCertificateTransferRequest {
  @scala.inline
  def apply(certificateId: CertificateId, setAsActive: js.UndefOr[SetAsActive] = js.undefined): AcceptCertificateTransferRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any])
    if (!js.isUndefined(setAsActive)) __obj.updateDynamic("setAsActive")(setAsActive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptCertificateTransferRequest]
  }
}

