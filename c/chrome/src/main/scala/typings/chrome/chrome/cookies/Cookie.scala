package typings.chrome.chrome.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  /** The domain of the cookie (e.g. "www.google.com", "example.com"). */
  var domain: String
  /** Optional. The expiration date of the cookie as the number of seconds since the UNIX epoch. Not provided for session cookies.  */
  var expirationDate: js.UndefOr[Double] = js.undefined
  /** True if the cookie is a host-only cookie (i.e. a request's host must exactly match the domain of the cookie). */
  var hostOnly: Boolean
  /** True if the cookie is marked as HttpOnly (i.e. the cookie is inaccessible to client-side scripts). */
  var httpOnly: Boolean
  /** The name of the cookie. */
  var name: String
  /** The path of the cookie. */
  var path: String
  /** True if the cookie is marked as Secure (i.e. its scope is limited to secure channels, typically HTTPS). */
  var secure: Boolean
  /** True if the cookie is a session cookie, as opposed to a persistent cookie with an expiration date. */
  var session: Boolean
  /** The ID of the cookie store containing this cookie, as provided in getAllCookieStores(). */
  var storeId: String
  /** The value of the cookie. */
  var value: String
}

object Cookie {
  @scala.inline
  def apply(
    domain: String,
    hostOnly: Boolean,
    httpOnly: Boolean,
    name: String,
    path: String,
    secure: Boolean,
    session: Boolean,
    storeId: String,
    value: String,
    expirationDate: Int | Double = null
  ): Cookie = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], hostOnly = hostOnly.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], storeId = storeId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
}

