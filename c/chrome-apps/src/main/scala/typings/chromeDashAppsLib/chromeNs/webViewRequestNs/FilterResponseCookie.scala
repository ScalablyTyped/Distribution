package typings
package chromeDashAppsLib.chromeNs.webViewRequestNs

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
  var ageLowerBound: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /**
    * Inclusive upper bound on the cookie lifetime (specified in seconds after current time).
    * Only cookies whose expiration date-time is in the interval [now, now + ageUpperBound]
    * fulfill this criterion. Session cookies and cookies whose expiration date-time is
    * in the past do not meet the criterion of this filter. The cookie lifetime is calculated
    * from either 'max-age' or 'expires' cookie attributes. If both are specified, 'max-age'
    * is used to calculate the cookie lifetime.
    */
  var ageUpperBound: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** Value of the Domain cookie attribute. */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the Expires cookie attribute. */
  var expires: js.UndefOr[java.lang.String] = js.undefined
  /** Existence of the HttpOnly cookie attribute */
  var httpOnly: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the Max-Age cookie attribute */
  var maxAge: js.UndefOr[chromeDashAppsLib.chromeNs.double] = js.undefined
  /** Name of a cookie. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the Path cookie attribute. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Existence of the Secure cookie attribute. */
  var secure: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Filters session cookies.
    * Session cookies have no lifetime specified in any of 'max-age' or 'expires' attributes.
    */
  var sessionCookie: js.UndefOr[scala.Boolean] = js.undefined
  /** Value of a cookie, may be padded in double-quotes. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object FilterResponseCookie {
  @scala.inline
  def apply(
    ageLowerBound: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    ageUpperBound: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    domain: java.lang.String = null,
    expires: java.lang.String = null,
    httpOnly: java.lang.String = null,
    maxAge: js.UndefOr[chromeDashAppsLib.chromeNs.double] = js.undefined,
    name: java.lang.String = null,
    path: java.lang.String = null,
    secure: java.lang.String = null,
    sessionCookie: js.UndefOr[scala.Boolean] = js.undefined,
    value: java.lang.String = null
  ): FilterResponseCookie = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ageLowerBound)) __obj.updateDynamic("ageLowerBound")(ageLowerBound)
    if (!js.isUndefined(ageUpperBound)) __obj.updateDynamic("ageUpperBound")(ageUpperBound)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (expires != null) __obj.updateDynamic("expires")(expires)
    if (httpOnly != null) __obj.updateDynamic("httpOnly")(httpOnly)
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (secure != null) __obj.updateDynamic("secure")(secure)
    if (!js.isUndefined(sessionCookie)) __obj.updateDynamic("sessionCookie")(sessionCookie)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FilterResponseCookie]
  }
}

