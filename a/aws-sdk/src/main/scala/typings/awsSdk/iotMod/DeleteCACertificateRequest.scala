package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCACertificateRequest extends StObject {
  
  /**
    * The ID of the certificate to delete. (The last part of the certificate ARN contains the certificate ID.)
    */
  var certificateId: CertificateId
}
object DeleteCACertificateRequest {
  
  inline def apply(certificateId: CertificateId): DeleteCACertificateRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCACertificateRequest]
  }
  
  extension [Self <: DeleteCACertificateRequest](x: Self) {
    
    inline def setCertificateId(value: CertificateId): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
  }
}
