package typings.cswAasJs

import typings.cswAasJs.authContextMod.AuthContextType
import typings.cswAasJs.authContextProviderMod.AuthContextProps
import typings.cswAasJs.checkLoginMod.CheckLoginProps
import typings.cswAasJs.clientRoleMod.ClientRoleProps
import typings.cswAasJs.realmRoleMod.RealmRoleProps
import typings.react.mod.Context
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("csw-aas-js", JSImport.Namespace)
@js.native
object mod extends js.Object {
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

