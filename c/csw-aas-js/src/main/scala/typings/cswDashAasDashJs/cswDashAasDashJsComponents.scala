package typings.cswDashAasDashJs

import typings.cswDashAasDashJs.distComponentsContextAuthContextMod.AuthContextType
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object cswDashAasDashJsComponents extends cswDashAasDashJsProps {
  @scala.inline
  def AuthContextProvider: ComponentType[AuthContextProviderProps] = typings.cswDashAasDashJs.distComponentsContextAuthContextProviderMod.default.asInstanceOf[typings.react.reactMod.ComponentType[AuthContextProviderProps]]
  @scala.inline
  def CheckLogin: ComponentType[CheckLoginProps] = typings.cswDashAasDashJs.distComponentsAuthenticationCheckLoginMod.default.asInstanceOf[typings.react.reactMod.ComponentType[CheckLoginProps]]
  @scala.inline
  def ClientRole: ComponentType[ClientRoleProps] = typings.cswDashAasDashJs.distComponentsAuthorizationClientRoleMod.default.asInstanceOf[typings.react.reactMod.ComponentType[ClientRoleProps]]
  @scala.inline
  def Login: ComponentType[js.Object] = typings.cswDashAasDashJs.cswDashAasDashJsMod.asInstanceOf[js.Dynamic].selectDynamic("Login").asInstanceOf[typings.react.reactMod.ComponentType[js.Object]]
  @scala.inline
  def Logout: ComponentType[js.Object] = typings.cswDashAasDashJs.cswDashAasDashJsMod.asInstanceOf[js.Dynamic].selectDynamic("Logout").asInstanceOf[typings.react.reactMod.ComponentType[js.Object]]
  @scala.inline
  def Provider: ComponentType[ProviderProps[AuthContextType]] = typings.cswDashAasDashJs.distComponentsContextAuthContextMod.Provider.asInstanceOf[typings.react.reactMod.ComponentType[
  ProviderProps[typings.cswDashAasDashJs.distComponentsContextAuthContextMod.AuthContextType]]]
  @scala.inline
  def RealmRole: ComponentType[RealmRoleProps] = typings.cswDashAasDashJs.distComponentsAuthorizationRealmRoleMod.default.asInstanceOf[typings.react.reactMod.ComponentType[RealmRoleProps]]
}

