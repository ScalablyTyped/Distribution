package typings.chromeApps.chrome.webViewRequest

import typings.chromeApps.chrome.double
import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A filter of a cookie in HTTP Responses. */
@js.native
trait FilterResponseCookie extends js.Object {
  /**
    * Inclusive lower bound on the cookie lifetime (specified in seconds after current time).
    * Only cookies whose expiration date-time is set to 'now + ageLowerBound' or later fulfill
    * this criterion. Session cookies do not meet the criterion of this filter. The cookie
    * lifetime is calculated from either 'max-age' or 'expires' cookie attributes. If both
    * are specified, 'max-age' is used to calculate the cookie lifetime.
    */
  var ageLowerBound: js.UndefOr[integer] = js.native
  /**
    * Inclusive upper bound on the cookie lifetime (specified in seconds after current time).
    * Only cookies whose expiration date-time is in the interval [now, now + ageUpperBound]
    * fulfill this criterion. Session cookies and cookies whose expiration date-time is
    * in the past do not meet the criterion of this filter. The cookie lifetime is calculated
    * from either 'max-age' or 'expires' cookie attributes. If both are specified, 'max-age'
    * is used to calculate the cookie lifetime.
    */
  var ageUpperBound: js.UndefOr[integer] = js.native
  /** Value of the Domain cookie attribute. */
  var domain: js.UndefOr[String] = js.native
  /** Value of the Expires cookie attribute. */
  var expires: js.UndefOr[String] = js.native
  /** Existence of the HttpOnly cookie attribute */
  var httpOnly: js.UndefOr[String] = js.native
  /** Value of the Max-Age cookie attribute */
  var maxAge: js.UndefOr[double] = js.native
  /** Name of a cookie. */
  var name: js.UndefOr[String] = js.native
  /** Value of the Path cookie attribute. */
  var path: js.UndefOr[String] = js.native
  /** Existence of the Secure cookie attribute. */
  var secure: js.UndefOr[String] = js.native
  /**
    * Filters session cookies.
    * Session cookies have no lifetime specified in any of 'max-age' or 'expires' attributes.
    */
  var sessionCookie: js.UndefOr[Boolean] = js.native
  /** Value of a cookie, may be padded in double-quotes. */
  var value: js.UndefOr[String] = js.native
}

object FilterResponseCookie {
  @scala.inline
  def apply(): FilterResponseCookie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterResponseCookie]
  }
  @scala.inline
  implicit class FilterResponseCookieOps[Self <: FilterResponseCookie] (val x: Self) extends AnyVal {
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
    def setAgeLowerBound(value: integer): Self = this.set("ageLowerBound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgeLowerBound: Self = this.set("ageLowerBound", js.undefined)
    @scala.inline
    def setAgeUpperBound(value: integer): Self = this.set("ageUpperBound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgeUpperBound: Self = this.set("ageUpperBound", js.undefined)
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setExpires(value: String): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    @scala.inline
    def setHttpOnly(value: String): Self = this.set("httpOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpOnly: Self = this.set("httpOnly", js.undefined)
    @scala.inline
    def setMaxAge(value: double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setSecure(value: String): Self = this.set("secure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    @scala.inline
    def setSessionCookie(value: Boolean): Self = this.set("sessionCookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionCookie: Self = this.set("sessionCookie", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

