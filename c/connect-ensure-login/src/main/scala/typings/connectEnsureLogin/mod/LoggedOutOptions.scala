package typings.connectEnsureLogin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggedOutOptions extends js.Object {
  
  /**
    * URL to redirect to in logged in, defaults to _/_
    */
  var redirectTo: js.UndefOr[String] = js.native
}
object LoggedOutOptions {
  
  @scala.inline
  def apply(): LoggedOutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggedOutOptions]
  }
  
  @scala.inline
  implicit class LoggedOutOptionsOps[Self <: LoggedOutOptions] (val x: Self) extends AnyVal {
    
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
  }
}
