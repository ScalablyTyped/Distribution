package typings
package clientDashSessionsLib.clientDashSessionsMod.clientUnderscoreSessionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionOptions extends js.Object {
  /**
    * if expiresIn < activeDuration, the session will be extended by activeDuration milliseconds.
    * Default: 5 minutes
    */
  var activeDuration: js.UndefOr[scala.Double] = js.undefined
  var cookie: js.UndefOr[cookiesLib.cookiesMod.CookiesNs.IOptions] = js.undefined
  /**
    * session cookie name.
    * Default: 'session_state'
    */
  var cookieName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * how long the session will stay valid in ms.
    * Default: 24 hours
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * session accessor on the request object.
    * Default: 'session'
    */
  var requestKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * encryption secret for the session.
    * required
    */
  var secret: java.lang.String
}

object SessionOptions {
  @scala.inline
  def apply(
    secret: java.lang.String,
    activeDuration: scala.Int | scala.Double = null,
    cookie: cookiesLib.cookiesMod.CookiesNs.IOptions = null,
    cookieName: java.lang.String = null,
    duration: scala.Int | scala.Double = null,
    requestKey: java.lang.String = null
  ): SessionOptions = {
    val __obj = js.Dynamic.literal(secret = secret)
    if (activeDuration != null) __obj.updateDynamic("activeDuration")(activeDuration.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie)
    if (cookieName != null) __obj.updateDynamic("cookieName")(cookieName)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (requestKey != null) __obj.updateDynamic("requestKey")(requestKey)
    __obj.asInstanceOf[SessionOptions]
  }
}

