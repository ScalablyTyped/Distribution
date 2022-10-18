package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientCertificate extends StObject {
  
  /**
    * Paths to one or more CA files to validate certs against, relative to project root.
    */
  var ca: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A PEM format certificate/private key pair or PFX certificate container
    */
  var certs: js.Array[PEMCert | PFXCert]
  
  /**
    * URL to match requests against. Wildcards following [minimatch](https://github.com/isaacs/minimatch) rules are supported.
    */
  var url: String
}
object ClientCertificate {
  
  inline def apply(certs: js.Array[PEMCert | PFXCert], url: String): ClientCertificate = {
    val __obj = js.Dynamic.literal(certs = certs.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCertificate]
  }
  
  extension [Self <: ClientCertificate](x: Self) {
    
    inline def setCa(value: js.Array[String]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
    
    inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
    
    inline def setCaVarargs(value: String*): Self = StObject.set(x, "ca", js.Array(value*))
    
    inline def setCerts(value: js.Array[PEMCert | PFXCert]): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
    
    inline def setCertsVarargs(value: (PEMCert | PFXCert)*): Self = StObject.set(x, "certs", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
