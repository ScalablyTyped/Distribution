package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersInCacheKeyAndForwardedToOrigin extends js.Object {
  
  /**
    * An object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the cache key and automatically included in requests that CloudFront sends to the origin.
    */
  var CookiesConfig: CachePolicyCookiesConfig = js.native
  
  /**
    * A flag that can affect whether the Accept-Encoding HTTP header is included in the cache key and included in requests that CloudFront sends to the origin. This field is related to the EnableAcceptEncodingGzip field. If one or both of these fields is true and the viewer request includes the Accept-Encoding header, then CloudFront does the following:   Normalizes the value of the viewer’s Accept-Encoding header   Includes the normalized header in the cache key   Includes the normalized header in the request to the origin, if a request is necessary   For more information, see Compression support in the Amazon CloudFront Developer Guide. If you set this value to true, and this cache behavior also has an origin request policy attached, do not include the Accept-Encoding header in the origin request policy. CloudFront always includes the Accept-Encoding header in origin requests when the value of this field is true, so including this header in an origin request policy has no effect. If both of these fields are false, then CloudFront treats the Accept-Encoding header the same as any other HTTP header in the viewer request. By default, it’s not included in the cache key and it’s not included in origin requests. In this case, you can manually add Accept-Encoding to the headers whitelist like any other HTTP header.
    */
  var EnableAcceptEncodingBrotli: js.UndefOr[Boolean] = js.native
  
  /**
    * A flag that can affect whether the Accept-Encoding HTTP header is included in the cache key and included in requests that CloudFront sends to the origin. This field is related to the EnableAcceptEncodingBrotli field. If one or both of these fields is true and the viewer request includes the Accept-Encoding header, then CloudFront does the following:   Normalizes the value of the viewer’s Accept-Encoding header   Includes the normalized header in the cache key   Includes the normalized header in the request to the origin, if a request is necessary   For more information, see Compression support in the Amazon CloudFront Developer Guide. If you set this value to true, and this cache behavior also has an origin request policy attached, do not include the Accept-Encoding header in the origin request policy. CloudFront always includes the Accept-Encoding header in origin requests when the value of this field is true, so including this header in an origin request policy has no effect. If both of these fields are false, then CloudFront treats the Accept-Encoding header the same as any other HTTP header in the viewer request. By default, it’s not included in the cache key and it’s not included in origin requests. In this case, you can manually add Accept-Encoding to the headers whitelist like any other HTTP header.
    */
  var EnableAcceptEncodingGzip: Boolean = js.native
  
  /**
    * An object that determines whether any HTTP headers (and if so, which headers) are included in the cache key and automatically included in requests that CloudFront sends to the origin.
    */
  var HeadersConfig: CachePolicyHeadersConfig = js.native
  
  /**
    * An object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in the cache key and automatically included in requests that CloudFront sends to the origin.
    */
  var QueryStringsConfig: CachePolicyQueryStringsConfig = js.native
}
object ParametersInCacheKeyAndForwardedToOrigin {
  
  @scala.inline
  def apply(
    CookiesConfig: CachePolicyCookiesConfig,
    EnableAcceptEncodingGzip: Boolean,
    HeadersConfig: CachePolicyHeadersConfig,
    QueryStringsConfig: CachePolicyQueryStringsConfig
  ): ParametersInCacheKeyAndForwardedToOrigin = {
    val __obj = js.Dynamic.literal(CookiesConfig = CookiesConfig.asInstanceOf[js.Any], EnableAcceptEncodingGzip = EnableAcceptEncodingGzip.asInstanceOf[js.Any], HeadersConfig = HeadersConfig.asInstanceOf[js.Any], QueryStringsConfig = QueryStringsConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInCacheKeyAndForwardedToOrigin]
  }
  
  @scala.inline
  implicit class ParametersInCacheKeyAndForwardedToOriginOps[Self <: ParametersInCacheKeyAndForwardedToOrigin] (val x: Self) extends AnyVal {
    
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
    def setCookiesConfig(value: CachePolicyCookiesConfig): Self = this.set("CookiesConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAcceptEncodingGzip(value: Boolean): Self = this.set("EnableAcceptEncodingGzip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersConfig(value: CachePolicyHeadersConfig): Self = this.set("HeadersConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringsConfig(value: CachePolicyQueryStringsConfig): Self = this.set("QueryStringsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAcceptEncodingBrotli(value: Boolean): Self = this.set("EnableAcceptEncodingBrotli", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAcceptEncodingBrotli: Self = this.set("EnableAcceptEncodingBrotli", js.undefined)
  }
}
