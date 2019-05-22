package typings
package cswDashAasDashJsLib.distComponentsContextAuthContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthContextType extends js.Object {
  var auth: cswDashAasDashJsLib.distComponentsAuthMod.Auth | scala.Null
  def login(): scala.Unit
  def logout(): scala.Unit
}

object AuthContextType {
  @scala.inline
  def apply(
    login: () => scala.Unit,
    logout: () => scala.Unit,
    auth: cswDashAasDashJsLib.distComponentsAuthMod.Auth = null
  ): AuthContextType = {
    val __obj = js.Dynamic.literal(login = js.Any.fromFunction0(login), logout = js.Any.fromFunction0(logout))
    if (auth != null) __obj.updateDynamic("auth")(auth)
    __obj.asInstanceOf[AuthContextType]
  }
}

