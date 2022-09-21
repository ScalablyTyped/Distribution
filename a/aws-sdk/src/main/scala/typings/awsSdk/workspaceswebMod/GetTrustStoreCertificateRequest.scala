package typings.awsSdk.workspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTrustStoreCertificateRequest extends StObject {
  
  /**
    * The thumbprint of the trust store certificate.
    */
  var thumbprint: CertificateThumbprint
  
  /**
    * The ARN of the trust store certificate.
    */
  var trustStoreArn: ARN
}
object GetTrustStoreCertificateRequest {
  
  inline def apply(thumbprint: CertificateThumbprint, trustStoreArn: ARN): GetTrustStoreCertificateRequest = {
    val __obj = js.Dynamic.literal(thumbprint = thumbprint.asInstanceOf[js.Any], trustStoreArn = trustStoreArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTrustStoreCertificateRequest]
  }
  
  extension [Self <: GetTrustStoreCertificateRequest](x: Self) {
    
    inline def setThumbprint(value: CertificateThumbprint): Self = StObject.set(x, "thumbprint", value.asInstanceOf[js.Any])
    
    inline def setTrustStoreArn(value: ARN): Self = StObject.set(x, "trustStoreArn", value.asInstanceOf[js.Any])
  }
}
