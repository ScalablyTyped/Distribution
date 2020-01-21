package typings.cswAasJs

import typings.cswAasJs.authContextMod.AuthContextType
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object cswAasJsComponents extends cswAasJsProps {
  @scala.inline
  def AuthContextProvider: ComponentType[AuthContextProviderProps] = typings.cswAasJs.authContextProviderMod.default.asInstanceOf[typings.react.mod.ComponentType[AuthContextProviderProps]]
  @scala.inline
  def CheckLogin: ComponentType[CheckLoginProps] = typings.cswAasJs.checkLoginMod.default.asInstanceOf[typings.react.mod.ComponentType[CheckLoginProps]]
  @scala.inline
  def ClientRole: ComponentType[ClientRoleProps] = typings.cswAasJs.clientRoleMod.default.asInstanceOf[typings.react.mod.ComponentType[ClientRoleProps]]
  @scala.inline
  def Login: ComponentType[js.Object] = typings.cswAasJs.mod.asInstanceOf[js.Dynamic].selectDynamic("Login").asInstanceOf[typings.react.mod.ComponentType[js.Object]]
  @scala.inline
  def Logout: ComponentType[js.Object] = typings.cswAasJs.mod.asInstanceOf[js.Dynamic].selectDynamic("Logout").asInstanceOf[typings.react.mod.ComponentType[js.Object]]
  @scala.inline
  def Provider: ComponentType[ProviderProps[AuthContextType]] = typings.cswAasJs.authContextMod.Provider.asInstanceOf[typings.react.mod.ComponentType[ProviderProps[typings.cswAasJs.authContextMod.AuthContextType]]]
  @scala.inline
  def RealmRole: ComponentType[RealmRoleProps] = typings.cswAasJs.realmRoleMod.default.asInstanceOf[typings.react.mod.ComponentType[RealmRoleProps]]
}

