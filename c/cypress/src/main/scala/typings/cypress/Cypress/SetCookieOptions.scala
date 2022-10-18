package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetCookieOptions
  extends StObject
     with Loggable
     with Timeoutable {
  
  var domain: String
  
  var expiry: Double
  
  var httpOnly: Boolean
  
  var path: String
  
  var sameSite: SameSiteStatus
  
  var secure: Boolean
}
object SetCookieOptions {
  
  inline def apply(
    domain: String,
    expiry: Double,
    httpOnly: Boolean,
    log: Boolean,
    path: String,
    sameSite: SameSiteStatus,
    secure: Boolean,
    timeout: Double
  ): SetCookieOptions = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], expiry = expiry.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sameSite = sameSite.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCookieOptions]
  }
  
  extension [Self <: SetCookieOptions](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setExpiry(value: Double): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSameSite(value: SameSiteStatus): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
  }
}
