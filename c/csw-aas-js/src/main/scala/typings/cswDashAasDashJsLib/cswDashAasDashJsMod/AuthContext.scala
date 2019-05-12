package typings
package cswDashAasDashJsLib.cswDashAasDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthContext extends js.Object {
  var auth: Auth
  def login(): scala.Unit
  def logout(): scala.Unit
}

object AuthContext {
  @scala.inline
  def apply(auth: Auth, login: () => scala.Unit, logout: () => scala.Unit): AuthContext = {
    val __obj = js.Dynamic.literal(auth = auth, login = js.Any.fromFunction0(login), logout = js.Any.fromFunction0(logout))
  
    __obj.asInstanceOf[AuthContext]
  }
}

