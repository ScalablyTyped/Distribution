package typings.cswAasJs

import typings.cswAasJs.distComponentsAuthenticationCheckLoginMod.CheckLoginProps
import typings.cswAasJs.distComponentsAuthorizationClientRoleMod.ClientRoleProps
import typings.cswAasJs.distComponentsAuthorizationRealmRoleMod.RealmRoleProps
import typings.cswAasJs.distComponentsContextAuthContextMod.AuthContextType
import typings.cswAasJs.distComponentsContextAuthContextProviderMod.AuthContextProps
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
  
  inline def AuthContextProvider(props: AuthContextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AuthContextProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def CheckLogin(param0: CheckLoginProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CheckLogin")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ClientRole(param0: ClientRoleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ClientRole")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /**
    * React component which renders Login button.
    */
  inline def Login(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Login")().asInstanceOf[Element]
  
  /**
    * React component which renders Logout button.
    */
  inline def Logout(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Logout")().asInstanceOf[Element]
  
  inline def RealmRole(param0: RealmRoleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("RealmRole")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
}
