package typings.cswAasJs.authMod

import typings.keycloakJs.mod.KeycloakError
import typings.keycloakJs.mod.KeycloakInstance
import typings.keycloakJs.mod.KeycloakPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticateResult extends js.Object {
  
  var authenticated: KeycloakPromise[Boolean, KeycloakError] = js.native
  
  var keycloak: KeycloakInstance = js.native
}
object AuthenticateResult {
  
  @scala.inline
  def apply(authenticated: KeycloakPromise[Boolean, KeycloakError], keycloak: KeycloakInstance): AuthenticateResult = {
    val __obj = js.Dynamic.literal(authenticated = authenticated.asInstanceOf[js.Any], keycloak = keycloak.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateResult]
  }
  
  @scala.inline
  implicit class AuthenticateResultOps[Self <: AuthenticateResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthenticated(value: KeycloakPromise[Boolean, KeycloakError]): Self = this.set("authenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeycloak(value: KeycloakInstance): Self = this.set("keycloak", value.asInstanceOf[js.Any])
  }
}
