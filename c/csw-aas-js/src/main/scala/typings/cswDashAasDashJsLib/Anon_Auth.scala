package typings
package cswDashAasDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auth extends js.Object {
  var auth: scala.Null
  def login(): scala.Unit
  def logout(): scala.Unit
}

object Anon_Auth {
  @scala.inline
  def apply(auth: scala.Null, login: () => scala.Unit, logout: () => scala.Unit): Anon_Auth = {
    val __obj = js.Dynamic.literal(auth = auth, login = js.Any.fromFunction0(login), logout = js.Any.fromFunction0(logout))
  
    __obj.asInstanceOf[Anon_Auth]
  }
}

