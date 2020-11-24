package typings.cswAasJs.authContextMod

import typings.cswAasJs.authMod.Auth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthContextType extends js.Object {
  
  var auth: Auth | Null = js.native
  
  def login(): Unit = js.native
  
  def logout(): Unit = js.native
}
object AuthContextType {
  
  @scala.inline
  def apply(login: () => Unit, logout: () => Unit): AuthContextType = {
    val __obj = js.Dynamic.literal(login = js.Any.fromFunction0(login), logout = js.Any.fromFunction0(logout))
    __obj.asInstanceOf[AuthContextType]
  }
  
  @scala.inline
  implicit class AuthContextTypeOps[Self <: AuthContextType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLogin(value: () => Unit): Self = this.set("login", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLogout(value: () => Unit): Self = this.set("logout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAuth(value: Auth): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthNull: Self = this.set("auth", null)
  }
}
