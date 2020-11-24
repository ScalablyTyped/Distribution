package typings.connectEnsureLogin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggedInOptions extends js.Object {
  
  /**
    * URL to redirect to for login, defaults to _/login_
    */
  var redirectTo: js.UndefOr[String] = js.native
  
  /**
    * set redirectTo in session, defaults to _true_
    */
  var setRedirectTo: js.UndefOr[Boolean] = js.native
}
object LoggedInOptions {
  
  @scala.inline
  def apply(): LoggedInOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggedInOptions]
  }
  
  @scala.inline
  implicit class LoggedInOptionsOps[Self <: LoggedInOptions] (val x: Self) extends AnyVal {
    
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
    def setRedirectTo(value: String): Self = this.set("redirectTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectTo: Self = this.set("redirectTo", js.undefined)
    
    @scala.inline
    def setSetRedirectTo(value: Boolean): Self = this.set("setRedirectTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetRedirectTo: Self = this.set("setRedirectTo", js.undefined)
  }
}
