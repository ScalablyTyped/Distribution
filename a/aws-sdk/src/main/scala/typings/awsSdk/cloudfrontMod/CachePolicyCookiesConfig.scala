package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CachePolicyCookiesConfig extends js.Object {
  
  /**
    * Determines whether any cookies in viewer requests are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are:    none – Cookies in viewer requests are not included in the cache key and are not automatically included in requests that CloudFront sends to the origin. Even when this field is set to none, any cookies that are listed in an OriginRequestPolicy are included in origin requests.    whitelist – The cookies in viewer requests that are listed in the CookieNames type are included in the cache key and automatically included in requests that CloudFront sends to the origin.    allExcept – All cookies in viewer requests that are  not  listed in the CookieNames type are included in the cache key and automatically included in requests that CloudFront sends to the origin.    all – All cookies in viewer requests are included in the cache key and are automatically included in requests that CloudFront sends to the origin.  
    */
  var CookieBehavior: CachePolicyCookieBehavior = js.native
  
  var Cookies: js.UndefOr[CookieNames] = js.native
}
object CachePolicyCookiesConfig {
  
  @scala.inline
  def apply(CookieBehavior: CachePolicyCookieBehavior): CachePolicyCookiesConfig = {
    val __obj = js.Dynamic.literal(CookieBehavior = CookieBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachePolicyCookiesConfig]
  }
  
  @scala.inline
  implicit class CachePolicyCookiesConfigOps[Self <: CachePolicyCookiesConfig] (val x: Self) extends AnyVal {
    
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
    def setCookieBehavior(value: CachePolicyCookieBehavior): Self = this.set("CookieBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookies(value: CookieNames): Self = this.set("Cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookies: Self = this.set("Cookies", js.undefined)
  }
}
