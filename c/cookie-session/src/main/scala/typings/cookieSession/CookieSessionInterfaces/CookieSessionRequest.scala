package typings.cookieSession.CookieSessionInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieSessionRequest extends js.Object {
  /**
    * Represents the session for the given request.
    */
  var session: CookieSessionObject | Null = js.native
  /**
    * Represents the session options for the current request. These options are a shallow clone of what was provided at middleware construction and can be altered to change cookie setting behavior on a per-request basis.
    */
  var sessionOptions: CookieSessionOptions = js.native
}

object CookieSessionRequest {
  @scala.inline
  def apply(sessionOptions: CookieSessionOptions): CookieSessionRequest = {
    val __obj = js.Dynamic.literal(sessionOptions = sessionOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieSessionRequest]
  }
  @scala.inline
  implicit class CookieSessionRequestOps[Self <: CookieSessionRequest] (val x: Self) extends AnyVal {
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
    def setSessionOptions(value: CookieSessionOptions): Self = this.set("sessionOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: CookieSessionObject): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionNull: Self = this.set("session", null)
  }
  
}

