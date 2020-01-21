package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCertificateRequest extends js.Object {
  /**
    * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
    */
  var certificateId: CertificateId = js.native
  /**
    * The new status.  Note: Setting the status to PENDING_TRANSFER will result in an exception being thrown. PENDING_TRANSFER is a status used internally by AWS IoT. It is not intended for developer use.  Note: The status value REGISTER_INACTIVE is deprecated and should not be used.
    */
  var newStatus: CertificateStatus = js.native
}

object UpdateCertificateRequest {
  @scala.inline
  def apply(certificateId: CertificateId, newStatus: CertificateStatus): UpdateCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any], newStatus = newStatus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateCertificateRequest]
  }
}

