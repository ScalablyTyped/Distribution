package typings.chromeApps.chrome.webViewRequest

import typings.chromeApps.chrome.double
import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A filter of a cookie in HTTP Responses. */
@js.native
trait FilterResponseCookie extends StObject {
  
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
  implicit class FilterResponseCookieMutableBuilder[Self <: FilterResponseCookie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgeLowerBound(value: integer): Self = StObject.set(x, "ageLowerBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeLowerBoundUndefined: Self = StObject.set(x, "ageLowerBound", js.undefined)
    
    @scala.inline
    def setAgeUpperBound(value: integer): Self = StObject.set(x, "ageUpperBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeUpperBoundUndefined: Self = StObject.set(x, "ageUpperBound", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    @scala.inline
    def setHttpOnly(value: String): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
    
    @scala.inline
    def setMaxAge(value: double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setSecure(value: String): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    @scala.inline
    def setSessionCookie(value: Boolean): Self = StObject.set(x, "sessionCookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionCookieUndefined: Self = StObject.set(x, "sessionCookie", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
