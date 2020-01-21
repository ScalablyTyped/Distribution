package typings.clientSessions.mod

import typings.cookies.mod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionOptions extends js.Object {
  /**
    * if expiresIn < activeDuration, the session will be extended by activeDuration milliseconds.
    * Default: 5 minutes
    */
  var activeDuration: js.UndefOr[Double] = js.undefined
  var cookie: js.UndefOr[IOptions] = js.undefined
  /**
    * session cookie name.
    * Default: 'session_state'
    */
  var cookieName: js.UndefOr[String] = js.undefined
  /**
    * how long the session will stay valid in ms.
    * Default: 24 hours
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * session accessor on the request object.
    * Default: 'session'
    */
  var requestKey: js.UndefOr[String] = js.undefined
  /**
    * encryption secret for the session.
    * required
    */
  var secret: String
}

object SessionOptions {
  @scala.inline
  def apply(
    secret: String,
    activeDuration: Int | Double = null,
    cookie: IOptions = null,
    cookieName: String = null,
    duration: Int | Double = null,
    requestKey: String = null
  ): SessionOptions = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    if (activeDuration != null) __obj.updateDynamic("activeDuration")(activeDuration.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (cookieName != null) __obj.updateDynamic("cookieName")(cookieName.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (requestKey != null) __obj.updateDynamic("requestKey")(requestKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionOptions]
  }
}

