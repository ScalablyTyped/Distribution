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

