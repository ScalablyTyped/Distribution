package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadSigningCertificateResponse extends StObject {
  
  /**
    * Information about the certificate.
    */
  var Certificate: SigningCertificate
}
object UploadSigningCertificateResponse {
  
  inline def apply(Certificate: SigningCertificate): UploadSigningCertificateResponse = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadSigningCertificateResponse]
  }
  
  extension [Self <: UploadSigningCertificateResponse](x: Self) {
    
    inline def setCertificate(value: SigningCertificate): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
  }
}
