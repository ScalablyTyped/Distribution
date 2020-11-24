package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateCertificateRequest extends js.Object {
  
  /**
    * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
    */
  var certificateId: CertificateId = js.native
  
  /**
    * The new status.  Note: Setting the status to PENDING_TRANSFER or PENDING_ACTIVATION will result in an exception being thrown. PENDING_TRANSFER and PENDING_ACTIVATION are statuses used internally by AWS IoT. They are not intended for developer use.  Note: The status value REGISTER_INACTIVE is deprecated and should not be used.
    */
  var newStatus: CertificateStatus = js.native
}
object UpdateCertificateRequest {
  
  @scala.inline
  def apply(certificateId: CertificateId, newStatus: CertificateStatus): UpdateCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any], newStatus = newStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCertificateRequest]
  }
  
  @scala.inline
  implicit class UpdateCertificateRequestOps[Self <: UpdateCertificateRequest] (val x: Self) extends AnyVal {
    
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
    def setNewStatus(value: CertificateStatus): Self = this.set("newStatus", value.asInstanceOf[js.Any])
  }
}
