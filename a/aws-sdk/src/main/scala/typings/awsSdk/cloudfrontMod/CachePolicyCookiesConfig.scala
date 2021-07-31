package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CachePolicyCookiesConfig extends StObject {
  
  /**
    * Determines whether any cookies in viewer requests are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are:    none – Cookies in viewer requests are not included in the cache key and are not automatically included in requests that CloudFront sends to the origin. Even when this field is set to none, any cookies that are listed in an OriginRequestPolicy are included in origin requests.    whitelist – The cookies in viewer requests that are listed in the CookieNames type are included in the cache key and automatically included in requests that CloudFront sends to the origin.    allExcept – All cookies in viewer requests that are  not  listed in the CookieNames type are included in the cache key and automatically included in requests that CloudFront sends to the origin.    all – All cookies in viewer requests are included in the cache key and are automatically included in requests that CloudFront sends to the origin.  
    */
  var CookieBehavior: CachePolicyCookieBehavior
  
  var Cookies: js.UndefOr[CookieNames] = js.undefined
}
object CachePolicyCookiesConfig {
  
  @scala.inline
  def apply(CookieBehavior: CachePolicyCookieBehavior): CachePolicyCookiesConfig = {
    val __obj = js.Dynamic.literal(CookieBehavior = CookieBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachePolicyCookiesConfig]
  }
  
  @scala.inline
  implicit class CachePolicyCookiesConfigMutableBuilder[Self <: CachePolicyCookiesConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookieBehavior(value: CachePolicyCookieBehavior): Self = StObject.set(x, "CookieBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookies(value: CookieNames): Self = StObject.set(x, "Cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookiesUndefined: Self = StObject.set(x, "Cookies", js.undefined)
  }
}
