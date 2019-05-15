package typings
package cswDashAasDashJsLib.cswDashAasDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuthContext extends js.Object {
  var auth: Auth | scala.Null
  def login(): scala.Unit
  def logout(): scala.Unit
}

object IAuthContext {
  @scala.inline
  def apply(login: () => scala.Unit, logout: () => scala.Unit, auth: Auth = null): IAuthContext = {
    val __obj = js.Dynamic.literal(login = js.Any.fromFunction0(login), logout = js.Any.fromFunction0(logout))
    if (auth != null) __obj.updateDynamic("auth")(auth)
    __obj.asInstanceOf[IAuthContext]
  }
}

