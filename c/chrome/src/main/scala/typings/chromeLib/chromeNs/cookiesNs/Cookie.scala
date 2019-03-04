package typings
package chromeLib.chromeNs.cookiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  /** The domain of the cookie (e.g. "www.google.com", "example.com"). */
  var domain: java.lang.String
  /** Optional. The expiration date of the cookie as the number of seconds since the UNIX epoch. Not provided for session cookies.  */
  var expirationDate: js.UndefOr[scala.Double] = js.undefined
  /** True if the cookie is a host-only cookie (i.e. a request's host must exactly match the domain of the cookie). */
  var hostOnly: scala.Boolean
  /** True if the cookie is marked as HttpOnly (i.e. the cookie is inaccessible to client-side scripts). */
  var httpOnly: scala.Boolean
  /** The name of the cookie. */
  var name: java.lang.String
  /** The path of the cookie. */
  var path: java.lang.String
  /** True if the cookie is marked as Secure (i.e. its scope is limited to secure channels, typically HTTPS). */
  var secure: scala.Boolean
  /** True if the cookie is a session cookie, as opposed to a persistent cookie with an expiration date. */
  var session: scala.Boolean
  /** The ID of the cookie store containing this cookie, as provided in getAllCookieStores(). */
  var storeId: java.lang.String
  /** The value of the cookie. */
  var value: java.lang.String
}

object Cookie {
  @scala.inline
  def apply(
    domain: java.lang.String,
    hostOnly: scala.Boolean,
    httpOnly: scala.Boolean,
    name: java.lang.String,
    path: java.lang.String,
    secure: scala.Boolean,
    session: scala.Boolean,
    storeId: java.lang.String,
    value: java.lang.String,
    expirationDate: scala.Int | scala.Double = null
  ): Cookie = {
    val __obj = js.Dynamic.literal(domain = domain, hostOnly = hostOnly, httpOnly = httpOnly, name = name, path = path, secure = secure, session = session, storeId = storeId, value = value)
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
}

