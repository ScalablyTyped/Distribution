package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersInCacheKeyAndForwardedToOrigin extends js.Object {
  /**
    * An object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the cache key and automatically included in requests that CloudFront sends to the origin.
    */
  var CookiesConfig: CachePolicyCookiesConfig = js.native
  /**
    * A flag that determines whether the Accept-Encoding HTTP header is included in the cache key and included in requests that CloudFront sends to the origin. If this field is true and the viewer request includes the Accept-Encoding header, then CloudFront normalizes the value of the viewer’s Accept-Encoding header to one of the following:    Accept-Encoding: gzip (if gzip is in the viewer’s Accept-Encoding header)    Accept-Encoding: identity (if gzip is not in the viewer’s Accept-Encoding header)   CloudFront includes the normalized header in the cache key and includes it in requests that CloudFront sends to the origin. If this field is false, then CloudFront treats the Accept-Encoding header the same as any other HTTP header in the viewer request. By default, it’s not included in the cache key and it’s not included in origin requests. You can manually add Accept-Encoding to the headers whitelist like any other HTTP header. When this field is true, you should not whitelist the Accept-Encoding header in the cache policy or in an origin request policy attached to the same cache behavior. For more information, see Cache compressed objects in the Amazon CloudFront Developer Guide.
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
  }
  
}

