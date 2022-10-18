package typings.cypress.anon

import typings.cypress.Cypress.SameSiteStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.Cypress.SetCookieOptions> */
trait PartialSetCookieOptions extends StObject {
  
  var domain: js.UndefOr[String] = js.undefined
  
  var expiry: js.UndefOr[Double] = js.undefined
  
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  
  var log: js.UndefOr[Boolean] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var sameSite: js.UndefOr[SameSiteStatus] = js.undefined
  
  var secure: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object PartialSetCookieOptions {
  
  inline def apply(): PartialSetCookieOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSetCookieOptions]
  }
  
  extension [Self <: PartialSetCookieOptions](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setExpiry(value: Double): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    inline def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
    
    inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
    
    inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
    
    inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSameSite(value: SameSiteStatus): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
    
    inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
