package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersInCacheKeyAndForwardedToOrigin extends StObject {
  
  /**
    * An object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the cache key and automatically included in requests that CloudFront sends to the origin.
    */
  var CookiesConfig: CachePolicyCookiesConfig
  
  /**
    * A flag that can affect whether the Accept-Encoding HTTP header is included in the cache key and included in requests that CloudFront sends to the origin. This field is related to the EnableAcceptEncodingGzip field. If one or both of these fields is true and the viewer request includes the Accept-Encoding header, then CloudFront does the following:   Normalizes the value of the viewer’s Accept-Encoding header   Includes the normalized header in the cache key   Includes the normalized header in the request to the origin, if a request is necessary   For more information, see Compression support in the Amazon CloudFront Developer Guide. If you set this value to true, and this cache behavior also has an origin request policy attached, do not include the Accept-Encoding header in the origin request policy. CloudFront always includes the Accept-Encoding header in origin requests when the value of this field is true, so including this header in an origin request policy has no effect. If both of these fields are false, then CloudFront treats the Accept-Encoding header the same as any other HTTP header in the viewer request. By default, it’s not included in the cache key and it’s not included in origin requests. In this case, you can manually add Accept-Encoding to the headers whitelist like any other HTTP header.
    */
  var EnableAcceptEncodingBrotli: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A flag that can affect whether the Accept-Encoding HTTP header is included in the cache key and included in requests that CloudFront sends to the origin. This field is related to the EnableAcceptEncodingBrotli field. If one or both of these fields is true and the viewer request includes the Accept-Encoding header, then CloudFront does the following:   Normalizes the value of the viewer’s Accept-Encoding header   Includes the normalized header in the cache key   Includes the normalized header in the request to the origin, if a request is necessary   For more information, see Compression support in the Amazon CloudFront Developer Guide. If you set this value to true, and this cache behavior also has an origin request policy attached, do not include the Accept-Encoding header in the origin request policy. CloudFront always includes the Accept-Encoding header in origin requests when the value of this field is true, so including this header in an origin request policy has no effect. If both of these fields are false, then CloudFront treats the Accept-Encoding header the same as any other HTTP header in the viewer request. By default, it’s not included in the cache key and it’s not included in origin requests. In this case, you can manually add Accept-Encoding to the headers whitelist like any other HTTP header.
    */
  var EnableAcceptEncodingGzip: Boolean
  
  /**
    * An object that determines whether any HTTP headers (and if so, which headers) are included in the cache key and automatically included in requests that CloudFront sends to the origin.
    */
  var HeadersConfig: CachePolicyHeadersConfig
  
  /**
    * An object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in the cache key and automatically included in requests that CloudFront sends to the origin.
    */
  var QueryStringsConfig: CachePolicyQueryStringsConfig
}
object ParametersInCacheKeyAndForwardedToOrigin {
  
  inline def apply(
    CookiesConfig: CachePolicyCookiesConfig,
    EnableAcceptEncodingGzip: Boolean,
    HeadersConfig: CachePolicyHeadersConfig,
    QueryStringsConfig: CachePolicyQueryStringsConfig
  ): ParametersInCacheKeyAndForwardedToOrigin = {
    val __obj = js.Dynamic.literal(CookiesConfig = CookiesConfig.asInstanceOf[js.Any], EnableAcceptEncodingGzip = EnableAcceptEncodingGzip.asInstanceOf[js.Any], HeadersConfig = HeadersConfig.asInstanceOf[js.Any], QueryStringsConfig = QueryStringsConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInCacheKeyAndForwardedToOrigin]
  }
  
  extension [Self <: ParametersInCacheKeyAndForwardedToOrigin](x: Self) {
    
    inline def setCookiesConfig(value: CachePolicyCookiesConfig): Self = StObject.set(x, "CookiesConfig", value.asInstanceOf[js.Any])
    
    inline def setEnableAcceptEncodingBrotli(value: Boolean): Self = StObject.set(x, "EnableAcceptEncodingBrotli", value.asInstanceOf[js.Any])
    
    inline def setEnableAcceptEncodingBrotliUndefined: Self = StObject.set(x, "EnableAcceptEncodingBrotli", js.undefined)
    
    inline def setEnableAcceptEncodingGzip(value: Boolean): Self = StObject.set(x, "EnableAcceptEncodingGzip", value.asInstanceOf[js.Any])
    
    inline def setHeadersConfig(value: CachePolicyHeadersConfig): Self = StObject.set(x, "HeadersConfig", value.asInstanceOf[js.Any])
    
    inline def setQueryStringsConfig(value: CachePolicyQueryStringsConfig): Self = StObject.set(x, "QueryStringsConfig", value.asInstanceOf[js.Any])
  }
}
