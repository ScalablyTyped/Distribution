package typings.cswAasJs

import typings.cswAasJs.authContextMod.AuthContextType
import typings.cswAasJs.authContextProviderMod.default
import typings.cswAasJs.mod
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object cswAasJsComponents extends cswAasJsProps {
  @scala.inline
  def AuthContextProvider: ComponentType[AuthContextProviderProps] = default.asInstanceOf[ComponentType[AuthContextProviderProps]]
  @scala.inline
  def CheckLogin: ComponentType[CheckLoginProps] = typings.cswAasJs.checkLoginMod.default.asInstanceOf[ComponentType[CheckLoginProps]]
  @scala.inline
  def ClientRole: ComponentType[ClientRoleProps] = typings.cswAasJs.clientRoleMod.default.asInstanceOf[ComponentType[ClientRoleProps]]
  @scala.inline
  def Login: ComponentType[js.Object] = mod.asInstanceOf[js.Dynamic].selectDynamic("Login").asInstanceOf[ComponentType[js.Object]]
  @scala.inline
  def Logout: ComponentType[js.Object] = mod.asInstanceOf[js.Dynamic].selectDynamic("Logout").asInstanceOf[ComponentType[js.Object]]
  @scala.inline
  def Provider: ComponentType[ProviderProps[AuthContextType]] = typings.cswAasJs.authContextMod.Provider.asInstanceOf[ComponentType[ProviderProps[AuthContextType]]]
  @scala.inline
  def RealmRole: ComponentType[RealmRoleProps] = typings.cswAasJs.realmRoleMod.default.asInstanceOf[ComponentType[RealmRoleProps]]
}

