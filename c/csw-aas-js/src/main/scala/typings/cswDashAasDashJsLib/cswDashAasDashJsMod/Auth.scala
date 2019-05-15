package typings
package cswDashAasDashJsLib.cswDashAasDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth extends js.Object {
  var hasRealmRole: js.UndefOr[js.Function1[/* role */ java.lang.String, scala.Boolean]] = js.native
  var isAuthenticated: js.UndefOr[js.Function0[js.UndefOr[scala.Boolean]]] = js.native
   // todo: should this be called resourceRoles?
  var loadUserProfile: js.UndefOr[
    js.Function0[
      keycloakDashJsLib.keycloakDashJsMod.KeycloakPromise[keycloakDashJsLib.keycloakDashJsMod.KeycloakProfile, scala.Unit]
    ]
  ] = js.native
  var logout: js.UndefOr[
    js.Function1[
      /* options */ js.UndefOr[js.Any], 
      keycloakDashJsLib.keycloakDashJsMod.KeycloakPromise[scala.Unit, scala.Unit]
    ]
  ] = js.native
  var realmAccess: js.UndefOr[js.Function0[js.UndefOr[keycloakDashJsLib.keycloakDashJsMod.KeycloakRoles]]] = js.native
   // todo: should this be called realmRoles?
  var resourceAccess: js.UndefOr[
    js.Function0[js.UndefOr[keycloakDashJsLib.keycloakDashJsMod.KeycloakResourceAccess]]
  ] = js.native
  var token: js.UndefOr[js.Function0[js.UndefOr[java.lang.String]]] = js.native
  var tokenParsed: js.UndefOr[
    js.Function0[js.UndefOr[keycloakDashJsLib.keycloakDashJsMod.KeycloakTokenParsed]]
  ] = js.native
  def hasResourceRole(role: java.lang.String): scala.Boolean = js.native
  def hasResourceRole(role: java.lang.String, resource: java.lang.String): scala.Boolean = js.native
}

