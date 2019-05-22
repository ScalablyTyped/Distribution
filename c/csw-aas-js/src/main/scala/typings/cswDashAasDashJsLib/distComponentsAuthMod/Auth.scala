package typings
package cswDashAasDashJsLib.distComponentsAuthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth extends js.Object {
  def hasRealmRole(role: java.lang.String): scala.Boolean = js.native
  def hasResourceRole(role: java.lang.String): scala.Boolean = js.native
  def hasResourceRole(role: java.lang.String, resource: java.lang.String): scala.Boolean = js.native
  def isAuthenticated(): js.UndefOr[scala.Boolean] = js.native
  def loadUserProfile(): keycloakDashJsLib.keycloakDashJsMod.KeycloakPromise[keycloakDashJsLib.keycloakDashJsMod.KeycloakProfile, scala.Unit] = js.native
  def logout(): keycloakDashJsLib.keycloakDashJsMod.KeycloakPromise[scala.Unit, scala.Unit] = js.native
  def logout(options: js.Any): keycloakDashJsLib.keycloakDashJsMod.KeycloakPromise[scala.Unit, scala.Unit] = js.native
  def realmAccess(): js.UndefOr[keycloakDashJsLib.keycloakDashJsMod.KeycloakRoles] = js.native
  def resourceAccess(): js.UndefOr[keycloakDashJsLib.keycloakDashJsMod.KeycloakResourceAccess] = js.native
  def token(): js.UndefOr[java.lang.String] = js.native
  def tokenParsed(): js.UndefOr[keycloakDashJsLib.keycloakDashJsMod.KeycloakTokenParsed] = js.native
}

