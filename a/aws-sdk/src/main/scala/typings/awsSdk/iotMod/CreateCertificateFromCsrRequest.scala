package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCertificateFromCsrRequest extends StObject {
  
  /**
    * The certificate signing request (CSR).
    */
  var certificateSigningRequest: CertificateSigningRequest
  
  /**
    * Specifies whether the certificate is active.
    */
  var setAsActive: js.UndefOr[SetAsActive] = js.undefined
}
object CreateCertificateFromCsrRequest {
  
  inline def apply(certificateSigningRequest: CertificateSigningRequest): CreateCertificateFromCsrRequest = {
    val __obj = js.Dynamic.literal(certificateSigningRequest = certificateSigningRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCertificateFromCsrRequest]
  }
  
  extension [Self <: CreateCertificateFromCsrRequest](x: Self) {
    
    inline def setCertificateSigningRequest(value: CertificateSigningRequest): Self = StObject.set(x, "certificateSigningRequest", value.asInstanceOf[js.Any])
    
    inline def setSetAsActive(value: SetAsActive): Self = StObject.set(x, "setAsActive", value.asInstanceOf[js.Any])
    
    inline def setSetAsActiveUndefined: Self = StObject.set(x, "setAsActive", js.undefined)
  }
}
