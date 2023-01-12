package typings.chromeApps.chrome.webViewRequest

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A specification of a cookie in HTTP Responses.
  */
trait ResponseCookie extends StObject {
  
  /** Value of the Domain cookie attribute. */
  var domain: js.UndefOr[String] = js.undefined
  
  /** Value of the Expires cookie attribute. */
  var expires: js.UndefOr[String] = js.undefined
  
  /** Existence of the HttpOnly cookie attribute. */
  var httpOnly: js.UndefOr[String] = js.undefined
  
  /** Value of the Max-Age cookie attribute */
  var maxAge: js.UndefOr[integer] = js.undefined
  
  /** Name of a cookie. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Value of the Path cookie attribute. */
  var path: js.UndefOr[String] = js.undefined
  
  /** Existence of the Secure cookie attribute. */
  var secure: js.UndefOr[String] = js.undefined
  
  /** Value of a cookie, may be padded in double-quotes. */
  var value: js.UndefOr[String] = js.undefined
}
object ResponseCookie {
  
  inline def apply(): ResponseCookie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseCookie]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseCookie] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    inline def setHttpOnly(value: String): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
    
    inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
    
    inline def setMaxAge(value: integer): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSecure(value: String): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
