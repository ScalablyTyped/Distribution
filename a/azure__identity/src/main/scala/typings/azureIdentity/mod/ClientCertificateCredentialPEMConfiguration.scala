package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.azureIdentity.mod.ClientCertificatePEMCertificate
  - typings.azureIdentity.mod.ClientCertificatePEMCertificatePath
*/
trait ClientCertificateCredentialPEMConfiguration extends StObject
object ClientCertificateCredentialPEMConfiguration {
  
  inline def ClientCertificatePEMCertificate(certificate: String): typings.azureIdentity.mod.ClientCertificatePEMCertificate = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.azureIdentity.mod.ClientCertificatePEMCertificate]
  }
  
  inline def ClientCertificatePEMCertificatePath(certificatePath: String): typings.azureIdentity.mod.ClientCertificatePEMCertificatePath = {
    val __obj = js.Dynamic.literal(certificatePath = certificatePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.azureIdentity.mod.ClientCertificatePEMCertificatePath]
  }
}
