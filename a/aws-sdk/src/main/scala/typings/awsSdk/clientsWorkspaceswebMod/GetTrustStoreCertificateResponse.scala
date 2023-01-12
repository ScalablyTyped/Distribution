package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTrustStoreCertificateResponse extends StObject {
  
  /**
    * The certificate of the trust store certificate.
    */
  var certificate: js.UndefOr[Certificate] = js.undefined
  
  /**
    * The ARN of the trust store certificate.
    */
  var trustStoreArn: js.UndefOr[ARN] = js.undefined
}
object GetTrustStoreCertificateResponse {
  
  inline def apply(): GetTrustStoreCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTrustStoreCertificateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTrustStoreCertificateResponse] (val x: Self) extends AnyVal {
    
    inline def setCertificate(value: Certificate): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    inline def setTrustStoreArn(value: ARN): Self = StObject.set(x, "trustStoreArn", value.asInstanceOf[js.Any])
    
    inline def setTrustStoreArnUndefined: Self = StObject.set(x, "trustStoreArn", js.undefined)
  }
}
