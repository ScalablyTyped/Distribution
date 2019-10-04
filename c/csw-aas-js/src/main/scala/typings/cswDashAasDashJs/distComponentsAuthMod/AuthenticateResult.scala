package typings.cswDashAasDashJs.distComponentsAuthMod

import typings.keycloakDashJs.keycloakDashJsMod.KeycloakError
import typings.keycloakDashJs.keycloakDashJsMod.KeycloakInstance
import typings.keycloakDashJs.keycloakDashJsMod.KeycloakPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateResult extends js.Object {
  var authenticated: KeycloakPromise[Boolean, KeycloakError]
  var keycloak: KeycloakInstance[js.UndefOr[scala.Nothing]]
}

object AuthenticateResult {
  @scala.inline
  def apply(
    authenticated: KeycloakPromise[Boolean, KeycloakError],
    keycloak: KeycloakInstance[js.UndefOr[scala.Nothing]]
  ): AuthenticateResult = {
    val __obj = js.Dynamic.literal(authenticated = authenticated, keycloak = keycloak)
  
    __obj.asInstanceOf[AuthenticateResult]
  }
}

