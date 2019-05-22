package typings
package cswDashAasDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("csw-aas-js", JSImport.Namespace)
@js.native
object cswDashAasDashJsMod extends js.Object {
  val AuthContext: reactLib.reactMod.Context[cswDashAasDashJsLib.distComponentsContextAuthContextMod.AuthContextType] = js.native
  def AuthContextProvider(props: cswDashAasDashJsLib.distComponentsContextAuthContextProviderMod.AuthContextProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def CheckLogin(hasChildrenError: cswDashAasDashJsLib.distComponentsAuthenticationCheckLoginMod.CheckLoginProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def ClientRole(
    hasClientRoleClientChildrenError: cswDashAasDashJsLib.distComponentsAuthorizationClientRoleMod.ClientRoleProps
  ): reactLib.reactMod.Global.JSXNs.Element = js.native
  /**
    * React component which renders Login button.
    */
  def Login(): reactLib.reactMod.Global.JSXNs.Element = js.native
  /**
    * React component which renders Logout button.
    */
  def Logout(): reactLib.reactMod.Global.JSXNs.Element = js.native
  def RealmRole(
    hasRealmRoleChildrenError: cswDashAasDashJsLib.distComponentsAuthorizationRealmRoleMod.RealmRoleProps
  ): reactLib.reactMod.Global.JSXNs.Element = js.native
}

