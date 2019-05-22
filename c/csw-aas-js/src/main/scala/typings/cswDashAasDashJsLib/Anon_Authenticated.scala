package typings
package cswDashAasDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authenticated extends js.Object {
  var authenticated: keycloakDashJsLib.keycloakDashJsMod.KeycloakPromise[scala.Boolean, keycloakDashJsLib.keycloakDashJsMod.KeycloakError]
  var keycloak: keycloakDashJsLib.keycloakDashJsMod.KeycloakInstance
}

object Anon_Authenticated {
  @scala.inline
  def apply(
    authenticated: keycloakDashJsLib.keycloakDashJsMod.KeycloakPromise[scala.Boolean, keycloakDashJsLib.keycloakDashJsMod.KeycloakError],
    keycloak: keycloakDashJsLib.keycloakDashJsMod.KeycloakInstance
  ): Anon_Authenticated = {
    val __obj = js.Dynamic.literal(authenticated = authenticated, keycloak = keycloak)
  
    __obj.asInstanceOf[Anon_Authenticated]
  }
}

