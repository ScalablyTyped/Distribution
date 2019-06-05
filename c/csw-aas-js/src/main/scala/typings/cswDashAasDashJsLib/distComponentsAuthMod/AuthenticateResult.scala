package typings
package cswDashAasDashJsLib.distComponentsAuthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateResult extends js.Object {
  var authenticated: keycloakDashJsLib.keycloakDashJsMod.KeycloakPromise[scala.Boolean, keycloakDashJsLib.keycloakDashJsMod.KeycloakError]
  var keycloak: keycloakDashJsLib.keycloakDashJsMod.KeycloakInstance
}

object AuthenticateResult {
  @scala.inline
  def apply(
    authenticated: keycloakDashJsLib.keycloakDashJsMod.KeycloakPromise[scala.Boolean, keycloakDashJsLib.keycloakDashJsMod.KeycloakError],
    keycloak: keycloakDashJsLib.keycloakDashJsMod.KeycloakInstance
  ): AuthenticateResult = {
    val __obj = js.Dynamic.literal(authenticated = authenticated, keycloak = keycloak)
  
    __obj.asInstanceOf[AuthenticateResult]
  }
}

