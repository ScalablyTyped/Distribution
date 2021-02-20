package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCACertificateRequest extends StObject {
  
  /**
    * The ID of the certificate to delete. (The last part of the certificate ARN contains the certificate ID.)
    */
  var certificateId: CertificateId = js.native
}
object DeleteCACertificateRequest {
  
  @scala.inline
  def apply(certificateId: CertificateId): DeleteCACertificateRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCACertificateRequest]
  }
  
  @scala.inline
  implicit class DeleteCACertificateRequestMutableBuilder[Self <: DeleteCACertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateId(value: CertificateId): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
  }
}
