package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticateOidcActionConfig extends js.Object {
  
  /**
    * The query parameters (up to 10) to include in the redirect request to the authorization endpoint.
    */
  var AuthenticationRequestExtraParams: js.UndefOr[AuthenticateOidcActionAuthenticationRequestExtraParams] = js.native
  
  /**
    * The authorization endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the path.
    */
  var AuthorizationEndpoint: AuthenticateOidcActionAuthorizationEndpoint = js.native
  
  /**
    * The OAuth 2.0 client identifier.
    */
  var ClientId: AuthenticateOidcActionClientId = js.native
  
  /**
    * The OAuth 2.0 client secret. This parameter is required if you are creating a rule. If you are modifying a rule, you can omit this parameter if you set UseExistingClientSecret to true.
    */
  var ClientSecret: js.UndefOr[AuthenticateOidcActionClientSecret] = js.native
  
  /**
    * The OIDC issuer identifier of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the path.
    */
  var Issuer: AuthenticateOidcActionIssuer = js.native
  
  /**
    * The behavior if the user is not authenticated. The following are possible values:   deny - Return an HTTP 401 Unauthorized error.   allow - Allow the request to be forwarded to the target.   authenticate - Redirect the request to the IdP authorization endpoint. This is the default value.  
    */
  var OnUnauthenticatedRequest: js.UndefOr[AuthenticateOidcActionConditionalBehaviorEnum] = js.native
  
  /**
    * The set of user claims to be requested from the IdP. The default is openid. To verify which scope values your IdP supports and how to separate multiple values, see the documentation for your IdP.
    */
  var Scope: js.UndefOr[AuthenticateOidcActionScope] = js.native
  
  /**
    * The name of the cookie used to maintain session information. The default is AWSELBAuthSessionCookie.
    */
  var SessionCookieName: js.UndefOr[AuthenticateOidcActionSessionCookieName] = js.native
  
  /**
    * The maximum duration of the authentication session, in seconds. The default is 604800 seconds (7 days).
    */
  var SessionTimeout: js.UndefOr[AuthenticateOidcActionSessionTimeout] = js.native
  
  /**
    * The token endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the path.
    */
  var TokenEndpoint: AuthenticateOidcActionTokenEndpoint = js.native
  
  /**
    * Indicates whether to use the existing client secret when modifying a rule. If you are creating a rule, you can omit this parameter or set it to false.
    */
  var UseExistingClientSecret: js.UndefOr[AuthenticateOidcActionUseExistingClientSecret] = js.native
  
  /**
    * The user info endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the path.
    */
  var UserInfoEndpoint: AuthenticateOidcActionUserInfoEndpoint = js.native
}
object AuthenticateOidcActionConfig {
  
  @scala.inline
  def apply(
    AuthorizationEndpoint: AuthenticateOidcActionAuthorizationEndpoint,
    ClientId: AuthenticateOidcActionClientId,
    Issuer: AuthenticateOidcActionIssuer,
    TokenEndpoint: AuthenticateOidcActionTokenEndpoint,
    UserInfoEndpoint: AuthenticateOidcActionUserInfoEndpoint
  ): AuthenticateOidcActionConfig = {
    val __obj = js.Dynamic.literal(AuthorizationEndpoint = AuthorizationEndpoint.asInstanceOf[js.Any], ClientId = ClientId.asInstanceOf[js.Any], Issuer = Issuer.asInstanceOf[js.Any], TokenEndpoint = TokenEndpoint.asInstanceOf[js.Any], UserInfoEndpoint = UserInfoEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateOidcActionConfig]
  }
  
  @scala.inline
  implicit class AuthenticateOidcActionConfigOps[Self <: AuthenticateOidcActionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthorizationEndpoint(value: AuthenticateOidcActionAuthorizationEndpoint): Self = this.set("AuthorizationEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: AuthenticateOidcActionClientId): Self = this.set("ClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuer(value: AuthenticateOidcActionIssuer): Self = this.set("Issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenEndpoint(value: AuthenticateOidcActionTokenEndpoint): Self = this.set("TokenEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfoEndpoint(value: AuthenticateOidcActionUserInfoEndpoint): Self = this.set("UserInfoEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationRequestExtraParams(value: AuthenticateOidcActionAuthenticationRequestExtraParams): Self = this.set("AuthenticationRequestExtraParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationRequestExtraParams: Self = this.set("AuthenticationRequestExtraParams", js.undefined)
    
    @scala.inline
    def setClientSecret(value: AuthenticateOidcActionClientSecret): Self = this.set("ClientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientSecret: Self = this.set("ClientSecret", js.undefined)
    
    @scala.inline
    def setOnUnauthenticatedRequest(value: AuthenticateOidcActionConditionalBehaviorEnum): Self = this.set("OnUnauthenticatedRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnUnauthenticatedRequest: Self = this.set("OnUnauthenticatedRequest", js.undefined)
    
    @scala.inline
    def setScope(value: AuthenticateOidcActionScope): Self = this.set("Scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("Scope", js.undefined)
    
    @scala.inline
    def setSessionCookieName(value: AuthenticateOidcActionSessionCookieName): Self = this.set("SessionCookieName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionCookieName: Self = this.set("SessionCookieName", js.undefined)
    
    @scala.inline
    def setSessionTimeout(value: AuthenticateOidcActionSessionTimeout): Self = this.set("SessionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionTimeout: Self = this.set("SessionTimeout", js.undefined)
    
    @scala.inline
    def setUseExistingClientSecret(value: AuthenticateOidcActionUseExistingClientSecret): Self = this.set("UseExistingClientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseExistingClientSecret: Self = this.set("UseExistingClientSecret", js.undefined)
  }
}
