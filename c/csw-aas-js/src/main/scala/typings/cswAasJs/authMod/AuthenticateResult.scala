package typings.cswAasJs.authMod

import typings.cswAasJs.cswAasJsStrings.legacy
import typings.keycloakJs.mod.KeycloakError
import typings.keycloakJs.mod.KeycloakInstance
import typings.keycloakJs.mod.KeycloakPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateResult extends js.Object {
  var authenticated: KeycloakPromise[Boolean, KeycloakError]
  var keycloak: KeycloakInstance[legacy]
}

object AuthenticateResult {
  @scala.inline
  def apply(authenticated: KeycloakPromise[Boolean, KeycloakError], keycloak: KeycloakInstance[legacy]): AuthenticateResult = {
    val __obj = js.Dynamic.literal(authenticated = authenticated.asInstanceOf[js.Any], keycloak = keycloak.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthenticateResult]
  }
}

