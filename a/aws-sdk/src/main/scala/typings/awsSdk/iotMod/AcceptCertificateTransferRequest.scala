package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptCertificateTransferRequest extends StObject {
  
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
  def apply(certificateId: CertificateId): AcceptCertificateTransferRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptCertificateTransferRequest]
  }
  
  @scala.inline
  implicit class AcceptCertificateTransferRequestMutableBuilder[Self <: AcceptCertificateTransferRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateId(value: CertificateId): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAsActive(value: SetAsActive): Self = StObject.set(x, "setAsActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAsActiveUndefined: Self = StObject.set(x, "setAsActive", js.undefined)
  }
}
