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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("csw-aas-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("csw-aas-js", "AuthContext")
  @js.native
  val AuthContext: Context[AuthContextType] = js.native
  
  @scala.inline
  def AuthContextProvider(props: AuthContextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AuthContextProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def CheckLogin(hasChildrenError: CheckLoginProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CheckLogin")(hasChildrenError.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def ClientRole(hasClientRoleClientChildrenError: ClientRoleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ClientRole")(hasClientRoleClientChildrenError.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /**
    * React component which renders Login button.
    */
  @scala.inline
  def Login(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Login")().asInstanceOf[Element]
  
  /**
    * React component which renders Logout button.
    */
  @scala.inline
  def Logout(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Logout")().asInstanceOf[Element]
  
  @scala.inline
  def RealmRole(hasRealmRoleChildrenError: RealmRoleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("RealmRole")(hasRealmRoleChildrenError.asInstanceOf[js.Any]).asInstanceOf[Element]
}
