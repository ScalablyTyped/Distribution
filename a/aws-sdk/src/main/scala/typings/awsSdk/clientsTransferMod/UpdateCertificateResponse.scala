package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCertificateResponse extends StObject {
  
  /**
    * Returns the identifier of the certificate object that you are updating.
    */
  var CertificateId: typings.awsSdk.clientsTransferMod.CertificateId
}
object UpdateCertificateResponse {
  
  inline def apply(CertificateId: CertificateId): UpdateCertificateResponse = {
    val __obj = js.Dynamic.literal(CertificateId = CertificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCertificateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCertificateResponse] (val x: Self) extends AnyVal {
    
    inline def setCertificateId(value: CertificateId): Self = StObject.set(x, "CertificateId", value.asInstanceOf[js.Any])
  }
}
