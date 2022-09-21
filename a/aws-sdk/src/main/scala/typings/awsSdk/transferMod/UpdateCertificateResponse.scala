package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCertificateResponse extends StObject {
  
  /**
    * Returns the identifier of the certificate object that you are updating.
    */
  var CertificateId: typings.awsSdk.transferMod.CertificateId
}
object UpdateCertificateResponse {
  
  inline def apply(CertificateId: CertificateId): UpdateCertificateResponse = {
    val __obj = js.Dynamic.literal(CertificateId = CertificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCertificateResponse]
  }
  
  extension [Self <: UpdateCertificateResponse](x: Self) {
    
    inline def setCertificateId(value: CertificateId): Self = StObject.set(x, "CertificateId", value.asInstanceOf[js.Any])
  }
}
