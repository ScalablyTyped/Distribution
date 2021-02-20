package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsApiGatewayMethodSettings extends StObject {
  
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
  implicit class AwsApiGatewayMethodSettingsMutableBuilder[Self <: AwsApiGatewayMethodSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheDataEncrypted(value: Boolean): Self = StObject.set(x, "CacheDataEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheDataEncryptedUndefined: Self = StObject.set(x, "CacheDataEncrypted", js.undefined)
    
    @scala.inline
    def setCacheTtlInSeconds(value: Integer): Self = StObject.set(x, "CacheTtlInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheTtlInSecondsUndefined: Self = StObject.set(x, "CacheTtlInSeconds", js.undefined)
    
    @scala.inline
    def setCachingEnabled(value: Boolean): Self = StObject.set(x, "CachingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachingEnabledUndefined: Self = StObject.set(x, "CachingEnabled", js.undefined)
    
    @scala.inline
    def setDataTraceEnabled(value: Boolean): Self = StObject.set(x, "DataTraceEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTraceEnabledUndefined: Self = StObject.set(x, "DataTraceEnabled", js.undefined)
    
    @scala.inline
    def setHttpMethod(value: NonEmptyString): Self = StObject.set(x, "HttpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpMethodUndefined: Self = StObject.set(x, "HttpMethod", js.undefined)
    
    @scala.inline
    def setLoggingLevel(value: NonEmptyString): Self = StObject.set(x, "LoggingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingLevelUndefined: Self = StObject.set(x, "LoggingLevel", js.undefined)
    
    @scala.inline
    def setMetricsEnabled(value: Boolean): Self = StObject.set(x, "MetricsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsEnabledUndefined: Self = StObject.set(x, "MetricsEnabled", js.undefined)
    
    @scala.inline
    def setRequireAuthorizationForCacheControl(value: Boolean): Self = StObject.set(x, "RequireAuthorizationForCacheControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireAuthorizationForCacheControlUndefined: Self = StObject.set(x, "RequireAuthorizationForCacheControl", js.undefined)
    
    @scala.inline
    def setResourcePath(value: NonEmptyString): Self = StObject.set(x, "ResourcePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcePathUndefined: Self = StObject.set(x, "ResourcePath", js.undefined)
    
    @scala.inline
    def setThrottlingBurstLimit(value: Integer): Self = StObject.set(x, "ThrottlingBurstLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottlingBurstLimitUndefined: Self = StObject.set(x, "ThrottlingBurstLimit", js.undefined)
    
    @scala.inline
    def setThrottlingRateLimit(value: Double): Self = StObject.set(x, "ThrottlingRateLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottlingRateLimitUndefined: Self = StObject.set(x, "ThrottlingRateLimit", js.undefined)
    
    @scala.inline
    def setUnauthorizedCacheControlHeaderStrategy(value: NonEmptyString): Self = StObject.set(x, "UnauthorizedCacheControlHeaderStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnauthorizedCacheControlHeaderStrategyUndefined: Self = StObject.set(x, "UnauthorizedCacheControlHeaderStrategy", js.undefined)
  }
}
