package typings.chromeApps.chrome.webViewRequest

import typings.chromeApps.chrome.double
import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A filter of a cookie in HTTP Responses. */
trait FilterResponseCookie extends StObject {
  
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
  
  inline def apply(): FilterResponseCookie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterResponseCookie]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterResponseCookie] (val x: Self) extends AnyVal {
    
    inline def setAgeLowerBound(value: integer): Self = StObject.set(x, "ageLowerBound", value.asInstanceOf[js.Any])
    
    inline def setAgeLowerBoundUndefined: Self = StObject.set(x, "ageLowerBound", js.undefined)
    
    inline def setAgeUpperBound(value: integer): Self = StObject.set(x, "ageUpperBound", value.asInstanceOf[js.Any])
    
    inline def setAgeUpperBoundUndefined: Self = StObject.set(x, "ageUpperBound", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    inline def setHttpOnly(value: String): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
    
    inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
    
    inline def setMaxAge(value: double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSecure(value: String): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setSessionCookie(value: Boolean): Self = StObject.set(x, "sessionCookie", value.asInstanceOf[js.Any])
    
    inline def setSessionCookieUndefined: Self = StObject.set(x, "sessionCookie", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
