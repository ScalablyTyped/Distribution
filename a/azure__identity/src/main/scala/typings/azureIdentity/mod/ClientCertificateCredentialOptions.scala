package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientCertificateCredentialOptions
  extends StObject
     with MultiTenantTokenCredentialOptions
     with CredentialPersistenceOptions {
  
  /**
    * Option to include x5c header for SubjectName and Issuer name authorization.
    * Set this option to send base64 encoded public certificate in the client assertion header as an x5c claim
    */
  var sendCertificateChain: js.UndefOr[Boolean] = js.undefined
}
object ClientCertificateCredentialOptions {
  
  inline def apply(): ClientCertificateCredentialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientCertificateCredentialOptions]
  }
  
  extension [Self <: ClientCertificateCredentialOptions](x: Self) {
    
    inline def setSendCertificateChain(value: Boolean): Self = StObject.set(x, "sendCertificateChain", value.asInstanceOf[js.Any])
    
    inline def setSendCertificateChainUndefined: Self = StObject.set(x, "sendCertificateChain", js.undefined)
  }
}
