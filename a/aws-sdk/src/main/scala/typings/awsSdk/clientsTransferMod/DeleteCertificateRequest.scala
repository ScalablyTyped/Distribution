package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCertificateRequest extends StObject {
  
  /**
    * The identifier of the certificate object that you are deleting.
    */
  var CertificateId: typings.awsSdk.clientsTransferMod.CertificateId
}
object DeleteCertificateRequest {
  
  inline def apply(CertificateId: CertificateId): DeleteCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateId = CertificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCertificateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCertificateRequest] (val x: Self) extends AnyVal {
    
    inline def setCertificateId(value: CertificateId): Self = StObject.set(x, "CertificateId", value.asInstanceOf[js.Any])
  }
}
