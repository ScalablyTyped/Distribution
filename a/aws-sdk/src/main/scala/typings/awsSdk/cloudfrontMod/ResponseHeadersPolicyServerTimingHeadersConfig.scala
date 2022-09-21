package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseHeadersPolicyServerTimingHeadersConfig extends StObject {
  
  /**
    * A Boolean that determines whether CloudFront adds the Server-Timing header to HTTP responses that it sends in response to requests that match a cache behavior that's associated with this response headers policy.
    */
  var Enabled: Boolean
  
  /**
    * A number 0–100 (inclusive) that specifies the percentage of responses that you want CloudFront to add the Server-Timing header to. When you set the sampling rate to 100, CloudFront adds the Server-Timing header to the HTTP response for every request that matches the cache behavior that this response headers policy is attached to. When you set it to 50, CloudFront adds the header to 50% of the responses for requests that match the cache behavior. You can set the sampling rate to any number 0–100 with up to four decimal places.
    */
  var SamplingRate: js.UndefOr[typings.awsSdk.cloudfrontMod.SamplingRate] = js.undefined
}
object ResponseHeadersPolicyServerTimingHeadersConfig {
  
  inline def apply(Enabled: Boolean): ResponseHeadersPolicyServerTimingHeadersConfig = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseHeadersPolicyServerTimingHeadersConfig]
  }
  
  extension [Self <: ResponseHeadersPolicyServerTimingHeadersConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setSamplingRate(value: SamplingRate): Self = StObject.set(x, "SamplingRate", value.asInstanceOf[js.Any])
    
    inline def setSamplingRateUndefined: Self = StObject.set(x, "SamplingRate", js.undefined)
  }
}
