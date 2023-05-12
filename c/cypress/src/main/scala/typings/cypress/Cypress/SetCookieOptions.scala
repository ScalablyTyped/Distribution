package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options that control how the `cy.setCookie` command
  * sets the cookie in the browser.
  * @see https://on.cypress.io/setcookie#Arguments
  */
trait SetCookieOptions
  extends StObject
     with Loggable
     with Timeoutable {
  
  /**
    * Represents the domain the cookie belongs to (e.g. "docs.cypress.io", "github.com").
    * @default location.hostname
    */
  var domain: String
  
  /**
    * The cookie's expiry time, specified in seconds since Unix Epoch.
    * The default is expiry is 20 years in the future from current time.
    */
  var expiry: Double
  
  /**
    * Whether or not the cookie is a host-only cookie, meaning the request's host must exactly match the domain of the cookie.
    * @default false
    */
  var hostOnly: Boolean
  
  /**
    * Whether or not the cookie is HttpOnly, meaning the cookie is inaccessible to client-side scripts.
    * The Cypress cookie API has access to HttpOnly cookies.
    * @default false
    */
  var httpOnly: Boolean
  
  /**
    * The path of the cookie.
    * @default "/"
    */
  var path: String
  
  /**
    * The cookie's SameSite value. If set, should be one of `lax`, `strict`, or `no_restriction`.
    * `no_restriction` is the equivalent of `SameSite=None`. Pass `undefined` to use the browser's default.
    * Note: `no_restriction` can only be used if the secure flag is set to `true`.
    * @default undefined
    */
  var sameSite: SameSiteStatus
  
  /**
    * Whether a cookie's scope is limited to secure channels, such as HTTPS.
    * @default false
    */
  var secure: Boolean
}
object SetCookieOptions {
  
  inline def apply(
    domain: String,
    expiry: Double,
    hostOnly: Boolean,
    httpOnly: Boolean,
    log: Boolean,
    path: String,
    sameSite: SameSiteStatus,
    secure: Boolean,
    timeout: Double
  ): SetCookieOptions = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], expiry = expiry.asInstanceOf[js.Any], hostOnly = hostOnly.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sameSite = sameSite.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCookieOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetCookieOptions] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setExpiry(value: Double): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    inline def setHostOnly(value: Boolean): Self = StObject.set(x, "hostOnly", value.asInstanceOf[js.Any])
    
    inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSameSite(value: SameSiteStatus): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
  }
}
