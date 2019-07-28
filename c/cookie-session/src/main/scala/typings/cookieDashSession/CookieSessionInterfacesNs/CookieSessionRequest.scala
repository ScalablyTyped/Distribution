package typings.cookieDashSession.CookieSessionInterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieSessionRequest extends js.Object {
  /**
    * Represents the session for the given request.
    */
  var session: js.UndefOr[CookieSessionObject] = js.undefined
  /**
    * Represents the session options for the current request. These options are a shallow clone of what was provided at middleware construction and can be altered to change cookie setting behavior on a per-request basis.
    */
  var sessionOptions: CookieSessionOptions
}

object CookieSessionRequest {
  @scala.inline
  def apply(sessionOptions: CookieSessionOptions, session: CookieSessionObject = null): CookieSessionRequest = {
    val __obj = js.Dynamic.literal(sessionOptions = sessionOptions)
    if (session != null) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[CookieSessionRequest]
  }
}

