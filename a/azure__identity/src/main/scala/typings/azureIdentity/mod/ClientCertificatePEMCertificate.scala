package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientCertificatePEMCertificate
  extends StObject
     with ClientCertificateCredentialPEMConfiguration {
  
  /**
    * The PEM-encoded public/private key certificate on the filesystem.
    */
  var certificate: String
  
  /**
    * The password for the certificate file.
    */
  var certificatePassword: js.UndefOr[String] = js.undefined
}
object ClientCertificatePEMCertificate {
  
  inline def apply(certificate: String): ClientCertificatePEMCertificate = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCertificatePEMCertificate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientCertificatePEMCertificate] (val x: Self) extends AnyVal {
    
    inline def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificatePassword(value: String): Self = StObject.set(x, "certificatePassword", value.asInstanceOf[js.Any])
    
    inline def setCertificatePasswordUndefined: Self = StObject.set(x, "certificatePassword", js.undefined)
  }
}
