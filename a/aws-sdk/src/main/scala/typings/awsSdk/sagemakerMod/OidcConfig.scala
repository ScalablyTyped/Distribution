package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OidcConfig extends js.Object {
  /**
    * The OIDC IdP authorization endpoint used to configure your private workforce.
    */
  var AuthorizationEndpoint: OidcEndpoint = js.native
  /**
    * The OIDC IdP client ID used to configure your private workforce.
    */
  var ClientId: typings.awsSdk.sagemakerMod.ClientId = js.native
  /**
    * The OIDC IdP client secret used to configure your private workforce.
    */
  var ClientSecret: typings.awsSdk.sagemakerMod.ClientSecret = js.native
  /**
    * The OIDC IdP issuer used to configure your private workforce.
    */
  var Issuer: OidcEndpoint = js.native
  /**
    * The OIDC IdP JSON Web Key Set (Jwks) URI used to configure your private workforce.
    */
  var JwksUri: OidcEndpoint = js.native
  /**
    * The OIDC IdP logout endpoint used to configure your private workforce.
    */
  var LogoutEndpoint: OidcEndpoint = js.native
  /**
    * The OIDC IdP token endpoint used to configure your private workforce.
    */
  var TokenEndpoint: OidcEndpoint = js.native
  /**
    * The OIDC IdP user information endpoint used to configure your private workforce.
    */
  var UserInfoEndpoint: OidcEndpoint = js.native
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
  implicit class OidcConfigOps[Self <: OidcConfig] (val x: Self) extends AnyVal {
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
    def setAuthorizationEndpoint(value: OidcEndpoint): Self = this.set("AuthorizationEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientId(value: ClientId): Self = this.set("ClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientSecret(value: ClientSecret): Self = this.set("ClientSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssuer(value: OidcEndpoint): Self = this.set("Issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def setJwksUri(value: OidcEndpoint): Self = this.set("JwksUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogoutEndpoint(value: OidcEndpoint): Self = this.set("LogoutEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokenEndpoint(value: OidcEndpoint): Self = this.set("TokenEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserInfoEndpoint(value: OidcEndpoint): Self = this.set("UserInfoEndpoint", value.asInstanceOf[js.Any])
  }
  
}

