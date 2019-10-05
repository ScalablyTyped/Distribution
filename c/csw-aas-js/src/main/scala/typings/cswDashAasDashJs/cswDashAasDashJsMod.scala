package typings.cswDashAasDashJs

import typings.cswDashAasDashJs.distComponentsAuthenticationCheckLoginMod.CheckLoginProps
import typings.cswDashAasDashJs.distComponentsAuthorizationClientRoleMod.ClientRoleProps
import typings.cswDashAasDashJs.distComponentsAuthorizationRealmRoleMod.RealmRoleProps
import typings.cswDashAasDashJs.distComponentsContextAuthContextMod.AuthContextType
import typings.cswDashAasDashJs.distComponentsContextAuthContextProviderMod.AuthContextProps
import typings.react.reactMod.Context
import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("csw-aas-js", JSImport.Namespace)
@js.native
object cswDashAasDashJsMod extends js.Object {
  val AuthContext: Context[AuthContextType] = js.native
  def AuthContextProvider(props: AuthContextProps): Element = js.native
  def CheckLogin(hasChildrenError: CheckLoginProps): Element = js.native
  def ClientRole(hasClientRoleClientChildrenError: ClientRoleProps): Element = js.native
  /**
    * React component which renders Login button.
    */
  def Login(): Element = js.native
  /**
    * React component which renders Logout button.
    */
  def Logout(): Element = js.native
  def RealmRole(hasRealmRoleChildrenError: RealmRoleProps): Element = js.native
}

