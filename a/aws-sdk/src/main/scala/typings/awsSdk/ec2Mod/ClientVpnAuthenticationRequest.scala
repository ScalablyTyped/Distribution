package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientVpnAuthenticationRequest extends StObject {
  
  /**
    * Information about the Active Directory to be used, if applicable. You must provide this information if Type is directory-service-authentication.
    */
  var ActiveDirectory: js.UndefOr[DirectoryServiceAuthenticationRequest] = js.native
  
  /**
    * Information about the IAM SAML identity provider to be used, if applicable. You must provide this information if Type is federated-authentication.
    */
  var FederatedAuthentication: js.UndefOr[FederatedAuthenticationRequest] = js.native
  
  /**
    * Information about the authentication certificates to be used, if applicable. You must provide this information if Type is certificate-authentication.
    */
  var MutualAuthentication: js.UndefOr[CertificateAuthenticationRequest] = js.native
  
  /**
    * The type of client authentication to be used.
    */
  var Type: js.UndefOr[ClientVpnAuthenticationType] = js.native
}
object ClientVpnAuthenticationRequest {
  
  @scala.inline
  def apply(): ClientVpnAuthenticationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnAuthenticationRequest]
  }
  
  @scala.inline
  implicit class ClientVpnAuthenticationRequestMutableBuilder[Self <: ClientVpnAuthenticationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveDirectory(value: DirectoryServiceAuthenticationRequest): Self = StObject.set(x, "ActiveDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveDirectoryUndefined: Self = StObject.set(x, "ActiveDirectory", js.undefined)
    
    @scala.inline
    def setFederatedAuthentication(value: FederatedAuthenticationRequest): Self = StObject.set(x, "FederatedAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFederatedAuthenticationUndefined: Self = StObject.set(x, "FederatedAuthentication", js.undefined)
    
    @scala.inline
    def setMutualAuthentication(value: CertificateAuthenticationRequest): Self = StObject.set(x, "MutualAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutualAuthenticationUndefined: Self = StObject.set(x, "MutualAuthentication", js.undefined)
    
    @scala.inline
    def setType(value: ClientVpnAuthenticationType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
