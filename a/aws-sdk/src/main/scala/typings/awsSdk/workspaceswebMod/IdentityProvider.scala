package typings.awsSdk.workspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityProvider extends StObject {
  
  /**
    * The ARN of the identity provider.
    */
  var identityProviderArn: ARN
  
  /**
    * The identity provider details. The following list describes the provider detail keys for each identity provider type.    For Google and Login with Amazon:    client_id     client_secret     authorize_scopes      For Facebook:    client_id     client_secret     authorize_scopes     api_version      For Sign in with Apple:    client_id     team_id     key_id     private_key     authorize_scopes      For OIDC providers:    client_id     client_secret     attributes_request_method     oidc_issuer     authorize_scopes     authorize_url if not available from discovery URL specified by oidc_issuer key     token_url if not available from discovery URL specified by oidc_issuer key     attributes_url if not available from discovery URL specified by oidc_issuer key     jwks_uri if not available from discovery URL specified by oidc_issuer key      For SAML providers:    MetadataFile OR MetadataURL     IDPSignout optional     
    */
  var identityProviderDetails: js.UndefOr[IdentityProviderDetails] = js.undefined
  
  /**
    * The identity provider name.
    */
  var identityProviderName: js.UndefOr[IdentityProviderName] = js.undefined
  
  /**
    * The identity provider type.
    */
  var identityProviderType: js.UndefOr[IdentityProviderType] = js.undefined
}
object IdentityProvider {
  
  inline def apply(identityProviderArn: ARN): IdentityProvider = {
    val __obj = js.Dynamic.literal(identityProviderArn = identityProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityProvider]
  }
  
  extension [Self <: IdentityProvider](x: Self) {
    
    inline def setIdentityProviderArn(value: ARN): Self = StObject.set(x, "identityProviderArn", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderDetails(value: IdentityProviderDetails): Self = StObject.set(x, "identityProviderDetails", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderDetailsUndefined: Self = StObject.set(x, "identityProviderDetails", js.undefined)
    
    inline def setIdentityProviderName(value: IdentityProviderName): Self = StObject.set(x, "identityProviderName", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderNameUndefined: Self = StObject.set(x, "identityProviderName", js.undefined)
    
    inline def setIdentityProviderType(value: IdentityProviderType): Self = StObject.set(x, "identityProviderType", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderTypeUndefined: Self = StObject.set(x, "identityProviderType", js.undefined)
  }
}
