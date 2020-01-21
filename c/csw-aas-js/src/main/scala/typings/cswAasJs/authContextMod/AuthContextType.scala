package typings.cswAasJs.authContextMod

import typings.cswAasJs.authMod.Auth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthContextType extends js.Object {
  var auth: Auth | Null
  def login(): Unit
  def logout(): Unit
}

object AuthContextType {
  @scala.inline
  def apply(login: () => Unit, logout: () => Unit, auth: Auth = null): AuthContextType = {
    val __obj = js.Dynamic.literal(login = js.Any.fromFunction0(login), logout = js.Any.fromFunction0(logout))
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthContextType]
  }
}

