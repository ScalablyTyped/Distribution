package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OidcConfigForResponse extends js.Object {
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
  implicit class OidcConfigForResponseOps[Self <: OidcConfigForResponse] (val x: Self) extends AnyVal {
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
    def deleteAuthorizationEndpoint: Self = this.set("AuthorizationEndpoint", js.undefined)
    @scala.inline
    def setClientId(value: ClientId): Self = this.set("ClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("ClientId", js.undefined)
    @scala.inline
    def setIssuer(value: OidcEndpoint): Self = this.set("Issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssuer: Self = this.set("Issuer", js.undefined)
    @scala.inline
    def setJwksUri(value: OidcEndpoint): Self = this.set("JwksUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJwksUri: Self = this.set("JwksUri", js.undefined)
    @scala.inline
    def setLogoutEndpoint(value: OidcEndpoint): Self = this.set("LogoutEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogoutEndpoint: Self = this.set("LogoutEndpoint", js.undefined)
    @scala.inline
    def setTokenEndpoint(value: OidcEndpoint): Self = this.set("TokenEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenEndpoint: Self = this.set("TokenEndpoint", js.undefined)
    @scala.inline
    def setUserInfoEndpoint(value: OidcEndpoint): Self = this.set("UserInfoEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserInfoEndpoint: Self = this.set("UserInfoEndpoint", js.undefined)
  }
  
}

