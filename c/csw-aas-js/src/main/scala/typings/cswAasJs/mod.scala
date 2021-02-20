package typings.cswAasJs

import typings.cswAasJs.authContextMod.AuthContextType
import typings.cswAasJs.authContextProviderMod.AuthContextProps
import typings.cswAasJs.checkLoginMod.CheckLoginProps
import typings.cswAasJs.clientRoleMod.ClientRoleProps
import typings.cswAasJs.realmRoleMod.RealmRoleProps
import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("csw-aas-js", "AuthContext")
  @js.native
  val AuthContext: Context[AuthContextType] = js.native
  
  @JSImport("csw-aas-js", "AuthContextProvider")
  @js.native
  def AuthContextProvider(props: AuthContextProps): Element = js.native
  
  @JSImport("csw-aas-js", "CheckLogin")
  @js.native
  def CheckLogin(hasChildrenError: CheckLoginProps): Element = js.native
  
  @JSImport("csw-aas-js", "ClientRole")
  @js.native
  def ClientRole(hasClientRoleClientChildrenError: ClientRoleProps): Element = js.native
  
  /**
    * React component which renders Login button.
    */
  @JSImport("csw-aas-js", "Login")
  @js.native
  def Login(): Element = js.native
  
  /**
    * React component which renders Logout button.
    */
  @JSImport("csw-aas-js", "Logout")
  @js.native
  def Logout(): Element = js.native
  
  @JSImport("csw-aas-js", "RealmRole")
  @js.native
  def RealmRole(hasRealmRoleChildrenError: RealmRoleProps): Element = js.native
}
