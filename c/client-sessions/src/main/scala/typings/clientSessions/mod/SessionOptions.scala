package typings.clientSessions.mod

import typings.cookies.mod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionOptions extends js.Object {
  
  /**
    * if expiresIn < activeDuration, the session will be extended by activeDuration milliseconds.
    * Default: 5 minutes
    */
  var activeDuration: js.UndefOr[Double] = js.native
  
  var cookie: js.UndefOr[IOptions] = js.native
  
  /**
    * session cookie name.
    * Default: 'session_state'
    */
  var cookieName: js.UndefOr[String] = js.native
  
  /**
    * how long the session will stay valid in ms.
    * Default: 24 hours
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * session accessor on the request object.
    * Default: 'session'
    */
  var requestKey: js.UndefOr[String] = js.native
  
  /**
    * encryption secret for the session.
    * required
    */
  var secret: String = js.native
}
object SessionOptions {
  
  @scala.inline
  def apply(secret: String): SessionOptions = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionOptions]
  }
  
  @scala.inline
  implicit class SessionOptionsOps[Self <: SessionOptions] (val x: Self) extends AnyVal {
    
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
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveDuration(value: Double): Self = this.set("activeDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveDuration: Self = this.set("activeDuration", js.undefined)
    
    @scala.inline
    def setCookie(value: IOptions): Self = this.set("cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    
    @scala.inline
    def setCookieName(value: String): Self = this.set("cookieName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieName: Self = this.set("cookieName", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setRequestKey(value: String): Self = this.set("requestKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestKey: Self = this.set("requestKey", js.undefined)
  }
}
