package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OidcConfig extends StObject {
  
  /**
    * The OIDC IdP authorization endpoint used to configure your private workforce.
    */
  var AuthorizationEndpoint: OidcEndpoint
  
  /**
    * The OIDC IdP client ID used to configure your private workforce.
    */
  var ClientId: typings.awsSdk.sagemakerMod.ClientId
  
  /**
    * The OIDC IdP client secret used to configure your private workforce.
    */
  var ClientSecret: typings.awsSdk.sagemakerMod.ClientSecret
  
  /**
    * The OIDC IdP issuer used to configure your private workforce.
    */
  var Issuer: OidcEndpoint
  
  /**
    * The OIDC IdP JSON Web Key Set (Jwks) URI used to configure your private workforce.
    */
  var JwksUri: OidcEndpoint
  
  /**
    * The OIDC IdP logout endpoint used to configure your private workforce.
    */
  var LogoutEndpoint: OidcEndpoint
  
  /**
    * The OIDC IdP token endpoint used to configure your private workforce.
    */
  var TokenEndpoint: OidcEndpoint
  
  /**
    * The OIDC IdP user information endpoint used to configure your private workforce.
    */
  var UserInfoEndpoint: OidcEndpoint
}
object OidcConfig {
  
  @scala.inline
  def apply(
    AuthorizationEndpoint: OidcEndpoint,
    ClientId: ClientId,
    ClientSecret: ClientSecret,
    Issuer: OidcEndpoint,
    JwksUri: OidcEndpoint,
    LogoutEndpoint: OidcEndpoint,
    TokenEndpoint: OidcEndpoint,
    UserInfoEndpoint: OidcEndpoint
  ): OidcConfig = {
    val __obj = js.Dynamic.literal(AuthorizationEndpoint = AuthorizationEndpoint.asInstanceOf[js.Any], ClientId = ClientId.asInstanceOf[js.Any], ClientSecret = ClientSecret.asInstanceOf[js.Any], Issuer = Issuer.asInstanceOf[js.Any], JwksUri = JwksUri.asInstanceOf[js.Any], LogoutEndpoint = LogoutEndpoint.asInstanceOf[js.Any], TokenEndpoint = TokenEndpoint.asInstanceOf[js.Any], UserInfoEndpoint = UserInfoEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[OidcConfig]
  }
  
  @scala.inline
  implicit class OidcConfigMutableBuilder[Self <: OidcConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationEndpoint(value: OidcEndpoint): Self = StObject.set(x, "AuthorizationEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: ClientId): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: ClientSecret): Self = StObject.set(x, "ClientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuer(value: OidcEndpoint): Self = StObject.set(x, "Issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJwksUri(value: OidcEndpoint): Self = StObject.set(x, "JwksUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoutEndpoint(value: OidcEndpoint): Self = StObject.set(x, "LogoutEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenEndpoint(value: OidcEndpoint): Self = StObject.set(x, "TokenEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfoEndpoint(value: OidcEndpoint): Self = StObject.set(x, "UserInfoEndpoint", value.asInstanceOf[js.Any])
  }
}
