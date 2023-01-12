package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBehalfOfCredentialCertificateOptions extends StObject {
  
  /**
    * The path to a PEM-encoded public/private key certificate on the filesystem.
    */
  var certificatePath: String
  
  /**
    * The client (application) ID of an App Registration in the tenant.
    */
  var clientId: String
  
  /**
    * Option to include x5c header for SubjectName and Issuer name authorization.
    * Set this option to send base64 encoded public certificate in the client assertion header as an x5c claim
    */
  var sendCertificateChain: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Azure Active Directory tenant (directory) ID.
    */
  var tenantId: String
  
  /**
    * The user assertion for the On-Behalf-Of flow.
    */
  var userAssertionToken: String
}
object OnBehalfOfCredentialCertificateOptions {
  
  inline def apply(certificatePath: String, clientId: String, tenantId: String, userAssertionToken: String): OnBehalfOfCredentialCertificateOptions = {
    val __obj = js.Dynamic.literal(certificatePath = certificatePath.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any], userAssertionToken = userAssertionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBehalfOfCredentialCertificateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnBehalfOfCredentialCertificateOptions] (val x: Self) extends AnyVal {
    
    inline def setCertificatePath(value: String): Self = StObject.set(x, "certificatePath", value.asInstanceOf[js.Any])
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setSendCertificateChain(value: Boolean): Self = StObject.set(x, "sendCertificateChain", value.asInstanceOf[js.Any])
    
    inline def setSendCertificateChainUndefined: Self = StObject.set(x, "sendCertificateChain", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setUserAssertionToken(value: String): Self = StObject.set(x, "userAssertionToken", value.asInstanceOf[js.Any])
  }
}
