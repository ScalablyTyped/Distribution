package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CachePolicyHeadersConfig extends StObject {
  
  /**
    * Determines whether any HTTP headers are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are:    none – HTTP headers are not included in the cache key and are not automatically included in requests that CloudFront sends to the origin. Even when this field is set to none, any headers that are listed in an OriginRequestPolicy are included in origin requests.    whitelist – The HTTP headers that are listed in the Headers type are included in the cache key and are automatically included in requests that CloudFront sends to the origin.  
    */
  var HeaderBehavior: CachePolicyHeaderBehavior = js.native
  
  var Headers: js.UndefOr[typings.awsSdk.cloudfrontMod.Headers] = js.native
}
object CachePolicyHeadersConfig {
  
  @scala.inline
  def apply(HeaderBehavior: CachePolicyHeaderBehavior): CachePolicyHeadersConfig = {
    val __obj = js.Dynamic.literal(HeaderBehavior = HeaderBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachePolicyHeadersConfig]
  }
  
  @scala.inline
  implicit class CachePolicyHeadersConfigMutableBuilder[Self <: CachePolicyHeadersConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaderBehavior(value: CachePolicyHeaderBehavior): Self = StObject.set(x, "HeaderBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: Headers): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "Headers", js.undefined)
  }
}
