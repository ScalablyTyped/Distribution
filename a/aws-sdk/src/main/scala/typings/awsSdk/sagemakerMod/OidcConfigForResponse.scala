package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OidcConfigForResponse extends StObject {
  
  /**
    * The OIDC IdP authorization endpoint used to configure your private workforce.
    */
  var AuthorizationEndpoint: js.UndefOr[OidcEndpoint] = js.native
  
  /**
    * The OIDC IdP client ID used to configure your private workforce.
    */
  var ClientId: js.UndefOr[typings.awsSdk.sagemakerMod.ClientId] = js.native
  
  /**
    * The OIDC IdP issuer used to configure your private workforce.
    */
  var Issuer: js.UndefOr[OidcEndpoint] = js.native
  
  /**
    * The OIDC IdP JSON Web Key Set (Jwks) URI used to configure your private workforce.
    */
  var JwksUri: js.UndefOr[OidcEndpoint] = js.native
  
  /**
    * The OIDC IdP logout endpoint used to configure your private workforce.
    */
  var LogoutEndpoint: js.UndefOr[OidcEndpoint] = js.native
  
  /**
    * The OIDC IdP token endpoint used to configure your private workforce.
    */
  var TokenEndpoint: js.UndefOr[OidcEndpoint] = js.native
  
  /**
    * The OIDC IdP user information endpoint used to configure your private workforce.
    */
  var UserInfoEndpoint: js.UndefOr[OidcEndpoint] = js.native
}
object OidcConfigForResponse {
  
  @scala.inline
  def apply(): OidcConfigForResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OidcConfigForResponse]
  }
  
  @scala.inline
  implicit class OidcConfigForResponseMutableBuilder[Self <: OidcConfigForResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationEndpoint(value: OidcEndpoint): Self = StObject.set(x, "AuthorizationEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationEndpointUndefined: Self = StObject.set(x, "AuthorizationEndpoint", js.undefined)
    
    @scala.inline
    def setClientId(value: ClientId): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "ClientId", js.undefined)
    
    @scala.inline
    def setIssuer(value: OidcEndpoint): Self = StObject.set(x, "Issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerUndefined: Self = StObject.set(x, "Issuer", js.undefined)
    
    @scala.inline
    def setJwksUri(value: OidcEndpoint): Self = StObject.set(x, "JwksUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJwksUriUndefined: Self = StObject.set(x, "JwksUri", js.undefined)
    
    @scala.inline
    def setLogoutEndpoint(value: OidcEndpoint): Self = StObject.set(x, "LogoutEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoutEndpointUndefined: Self = StObject.set(x, "LogoutEndpoint", js.undefined)
    
    @scala.inline
    def setTokenEndpoint(value: OidcEndpoint): Self = StObject.set(x, "TokenEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenEndpointUndefined: Self = StObject.set(x, "TokenEndpoint", js.undefined)
    
    @scala.inline
    def setUserInfoEndpoint(value: OidcEndpoint): Self = StObject.set(x, "UserInfoEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfoEndpointUndefined: Self = StObject.set(x, "UserInfoEndpoint", js.undefined)
  }
}
