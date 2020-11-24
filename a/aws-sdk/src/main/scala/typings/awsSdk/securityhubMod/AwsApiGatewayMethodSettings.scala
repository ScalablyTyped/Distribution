package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsApiGatewayMethodSettings extends js.Object {
  
  /**
    * Indicates whether the cached responses are encrypted. 
    */
  var CacheDataEncrypted: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the response is cached.
    */
  var CacheTtlInSeconds: js.UndefOr[Integer] = js.native
  
  /**
    * Indicates whether responses are cached and returned for requests. For responses to be cached, a cache cluster must be enabled on the stage.
    */
  var CachingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether data trace logging is enabled for the method. Data trace logging affects the log entries that are pushed to CloudWatch Logs.
    */
  var DataTraceEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The HTTP method. You can use an asterisk (*) as a wildcard to apply method settings to multiple methods.
    */
  var HttpMethod: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The logging level for this method. The logging level affects the log entries that are pushed to CloudWatch Logs. If the logging level is ERROR, then the logs only include error-level entries. If the logging level is INFO, then the logs include both ERROR events and extra informational events. Valid values: OFF | ERROR | INFO 
    */
  var LoggingLevel: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates whether CloudWatch metrics are enabled for the method. 
    */
  var MetricsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether authorization is required for a cache invalidation request.
    */
  var RequireAuthorizationForCacheControl: js.UndefOr[Boolean] = js.native
  
  /**
    * The resource path for this method. Forward slashes (/) are encoded as ~1 . The initial slash must include a forward slash. For example, the path value /resource/subresource must be encoded as /~1resource~1subresource. To specify the root path, use only a slash (/). You can use an asterisk (*) as a wildcard to apply method settings to multiple methods.
    */
  var ResourcePath: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The throttling burst limit for the method.
    */
  var ThrottlingBurstLimit: js.UndefOr[Integer] = js.native
  
  /**
    * The throttling rate limit for the method.
    */
  var ThrottlingRateLimit: js.UndefOr[Double] = js.native
  
  /**
    * Indicates how to handle unauthorized requests for cache invalidation. Valid values: FAIL_WITH_403 | SUCCEED_WITH_RESPONSE_HEADER | SUCCEED_WITHOUT_RESPONSE_HEADER 
    */
  var UnauthorizedCacheControlHeaderStrategy: js.UndefOr[NonEmptyString] = js.native
}
object AwsApiGatewayMethodSettings {
  
  @scala.inline
  def apply(): AwsApiGatewayMethodSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsApiGatewayMethodSettings]
  }
  
  @scala.inline
  implicit class AwsApiGatewayMethodSettingsOps[Self <: AwsApiGatewayMethodSettings] (val x: Self) extends AnyVal {
    
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
    def setCacheDataEncrypted(value: Boolean): Self = this.set("CacheDataEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheDataEncrypted: Self = this.set("CacheDataEncrypted", js.undefined)
    
    @scala.inline
    def setCacheTtlInSeconds(value: Integer): Self = this.set("CacheTtlInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheTtlInSeconds: Self = this.set("CacheTtlInSeconds", js.undefined)
    
    @scala.inline
    def setCachingEnabled(value: Boolean): Self = this.set("CachingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCachingEnabled: Self = this.set("CachingEnabled", js.undefined)
    
    @scala.inline
    def setDataTraceEnabled(value: Boolean): Self = this.set("DataTraceEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataTraceEnabled: Self = this.set("DataTraceEnabled", js.undefined)
    
    @scala.inline
    def setHttpMethod(value: NonEmptyString): Self = this.set("HttpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpMethod: Self = this.set("HttpMethod", js.undefined)
    
    @scala.inline
    def setLoggingLevel(value: NonEmptyString): Self = this.set("LoggingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggingLevel: Self = this.set("LoggingLevel", js.undefined)
    
    @scala.inline
    def setMetricsEnabled(value: Boolean): Self = this.set("MetricsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricsEnabled: Self = this.set("MetricsEnabled", js.undefined)
    
    @scala.inline
    def setRequireAuthorizationForCacheControl(value: Boolean): Self = this.set("RequireAuthorizationForCacheControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireAuthorizationForCacheControl: Self = this.set("RequireAuthorizationForCacheControl", js.undefined)
    
    @scala.inline
    def setResourcePath(value: NonEmptyString): Self = this.set("ResourcePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourcePath: Self = this.set("ResourcePath", js.undefined)
    
    @scala.inline
    def setThrottlingBurstLimit(value: Integer): Self = this.set("ThrottlingBurstLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottlingBurstLimit: Self = this.set("ThrottlingBurstLimit", js.undefined)
    
    @scala.inline
    def setThrottlingRateLimit(value: Double): Self = this.set("ThrottlingRateLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottlingRateLimit: Self = this.set("ThrottlingRateLimit", js.undefined)
    
    @scala.inline
    def setUnauthorizedCacheControlHeaderStrategy(value: NonEmptyString): Self = this.set("UnauthorizedCacheControlHeaderStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnauthorizedCacheControlHeaderStrategy: Self = this.set("UnauthorizedCacheControlHeaderStrategy", js.undefined)
  }
}
