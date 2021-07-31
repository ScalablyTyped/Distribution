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
  
  @scala.inline
  def apply(): ResponseCookie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseCookie]
  }
  
  @scala.inline
  implicit class ResponseCookieMutableBuilder[Self <: ResponseCookie] (val x: Self) extends AnyVal {
    
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
    def setMaxAge(value: integer): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
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
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
