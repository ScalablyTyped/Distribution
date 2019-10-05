package typings.chromeDashApps.chrome.webViewRequest

import typings.chromeDashApps.chrome.double
import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A filter of a cookie in HTTP Responses. */
trait FilterResponseCookie extends js.Object {
  /**
    * Inclusive lower bound on the cookie lifetime (specified in seconds after current time).
    * Only cookies whose expiration date-time is set to 'now + ageLowerBound' or later fulfill
    * this criterion. Session cookies do not meet the criterion of this filter. The cookie
    * lifetime is calculated from either 'max-age' or 'expires' cookie attributes. If both
    * are specified, 'max-age' is used to calculate the cookie lifetime.
    */
  var ageLowerBound: js.UndefOr[integer] = js.undefined
  /**
    * Inclusive upper bound on the cookie lifetime (specified in seconds after current time).
    * Only cookies whose expiration date-time is in the interval [now, now + ageUpperBound]
    * fulfill this criterion. Session cookies and cookies whose expiration date-time is
    * in the past do not meet the criterion of this filter. The cookie lifetime is calculated
    * from either 'max-age' or 'expires' cookie attributes. If both are specified, 'max-age'
    * is used to calculate the cookie lifetime.
    */
  var ageUpperBound: js.UndefOr[integer] = js.undefined
  /** Value of the Domain cookie attribute. */
  var domain: js.UndefOr[String] = js.undefined
  /** Value of the Expires cookie attribute. */
  var expires: js.UndefOr[String] = js.undefined
  /** Existence of the HttpOnly cookie attribute */
  var httpOnly: js.UndefOr[String] = js.undefined
  /** Value of the Max-Age cookie attribute */
  var maxAge: js.UndefOr[double] = js.undefined
  /** Name of a cookie. */
  var name: js.UndefOr[String] = js.undefined
  /** Value of the Path cookie attribute. */
  var path: js.UndefOr[String] = js.undefined
  /** Existence of the Secure cookie attribute. */
  var secure: js.UndefOr[String] = js.undefined
  /**
    * Filters session cookies.
    * Session cookies have no lifetime specified in any of 'max-age' or 'expires' attributes.
    */
  var sessionCookie: js.UndefOr[Boolean] = js.undefined
  /** Value of a cookie, may be padded in double-quotes. */
  var value: js.UndefOr[String] = js.undefined
}

object FilterResponseCookie {
  @scala.inline
  def apply(
    ageLowerBound: Int | Double = null,
    ageUpperBound: Int | Double = null,
    domain: String = null,
    expires: String = null,
    httpOnly: String = null,
    maxAge: Int | Double = null,
    name: String = null,
    path: String = null,
    secure: String = null,
    sessionCookie: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): FilterResponseCookie = {
    val __obj = js.Dynamic.literal()
    if (ageLowerBound != null) __obj.updateDynamic("ageLowerBound")(ageLowerBound.asInstanceOf[js.Any])
    if (ageUpperBound != null) __obj.updateDynamic("ageUpperBound")(ageUpperBound.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (expires != null) __obj.updateDynamic("expires")(expires)
    if (httpOnly != null) __obj.updateDynamic("httpOnly")(httpOnly)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (secure != null) __obj.updateDynamic("secure")(secure)
    if (!js.isUndefined(sessionCookie)) __obj.updateDynamic("sessionCookie")(sessionCookie)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FilterResponseCookie]
  }
}

