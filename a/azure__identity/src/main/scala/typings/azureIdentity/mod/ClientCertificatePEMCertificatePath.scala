package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientCertificatePEMCertificatePath
  extends StObject
     with ClientCertificateCredentialPEMConfiguration {
  
  /**
    * The password for the certificate file.
    */
  var certificatePassword: js.UndefOr[String] = js.undefined
  
  /**
    * The path to the PEM-encoded public/private key certificate on the filesystem.
    */
  var certificatePath: String
}
object ClientCertificatePEMCertificatePath {
  
  inline def apply(certificatePath: String): ClientCertificatePEMCertificatePath = {
    val __obj = js.Dynamic.literal(certificatePath = certificatePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCertificatePEMCertificatePath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientCertificatePEMCertificatePath] (val x: Self) extends AnyVal {
    
    inline def setCertificatePassword(value: String): Self = StObject.set(x, "certificatePassword", value.asInstanceOf[js.Any])
    
    inline def setCertificatePasswordUndefined: Self = StObject.set(x, "certificatePassword", js.undefined)
    
    inline def setCertificatePath(value: String): Self = StObject.set(x, "certificatePath", value.asInstanceOf[js.Any])
  }
}
