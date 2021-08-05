package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginRequestPolicyCookiesConfig extends StObject {
  
  /**
    * Determines whether cookies in viewer requests are included in requests that CloudFront sends to the origin. Valid values are:    none – Cookies in viewer requests are not included in requests that CloudFront sends to the origin. Even when this field is set to none, any cookies that are listed in a CachePolicy are included in origin requests.    whitelist – The cookies in viewer requests that are listed in the CookieNames type are included in requests that CloudFront sends to the origin.    all – All cookies in viewer requests are included in requests that CloudFront sends to the origin.  
    */
  var CookieBehavior: OriginRequestPolicyCookieBehavior
  
  var Cookies: js.UndefOr[CookieNames] = js.undefined
}
object OriginRequestPolicyCookiesConfig {
  
  inline def apply(CookieBehavior: OriginRequestPolicyCookieBehavior): OriginRequestPolicyCookiesConfig = {
    val __obj = js.Dynamic.literal(CookieBehavior = CookieBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginRequestPolicyCookiesConfig]
  }
  
  extension [Self <: OriginRequestPolicyCookiesConfig](x: Self) {
    
    inline def setCookieBehavior(value: OriginRequestPolicyCookieBehavior): Self = StObject.set(x, "CookieBehavior", value.asInstanceOf[js.Any])
    
    inline def setCookies(value: CookieNames): Self = StObject.set(x, "Cookies", value.asInstanceOf[js.Any])
    
    inline def setCookiesUndefined: Self = StObject.set(x, "Cookies", js.undefined)
  }
}
