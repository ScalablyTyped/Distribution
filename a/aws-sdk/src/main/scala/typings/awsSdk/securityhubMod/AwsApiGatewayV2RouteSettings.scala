package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsApiGatewayV2RouteSettings extends StObject {
  
  /**
    * Indicates whether data trace logging is enabled. Data trace logging affects the log entries that are pushed to CloudWatch Logs. Supported only for WebSocket APIs.
    */
  var DataTraceEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether detailed metrics are enabled.
    */
  var DetailedMetricsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The logging level. The logging level affects the log entries that are pushed to CloudWatch Logs. Supported only for WebSocket APIs. If the logging level is ERROR, then the logs only include error-level entries. If the logging level is INFO, then the logs include both ERROR events and extra informational events. Valid values: OFF | ERROR | INFO 
    */
  var LoggingLevel: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The throttling burst limit.
    */
  var ThrottlingBurstLimit: js.UndefOr[Integer] = js.undefined
  
  /**
    * The throttling rate limit.
    */
  var ThrottlingRateLimit: js.UndefOr[Double] = js.undefined
}
object AwsApiGatewayV2RouteSettings {
  
  inline def apply(): AwsApiGatewayV2RouteSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsApiGatewayV2RouteSettings]
  }
  
  extension [Self <: AwsApiGatewayV2RouteSettings](x: Self) {
    
    inline def setDataTraceEnabled(value: Boolean): Self = StObject.set(x, "DataTraceEnabled", value.asInstanceOf[js.Any])
    
    inline def setDataTraceEnabledUndefined: Self = StObject.set(x, "DataTraceEnabled", js.undefined)
    
    inline def setDetailedMetricsEnabled(value: Boolean): Self = StObject.set(x, "DetailedMetricsEnabled", value.asInstanceOf[js.Any])
    
    inline def setDetailedMetricsEnabledUndefined: Self = StObject.set(x, "DetailedMetricsEnabled", js.undefined)
    
    inline def setLoggingLevel(value: NonEmptyString): Self = StObject.set(x, "LoggingLevel", value.asInstanceOf[js.Any])
    
    inline def setLoggingLevelUndefined: Self = StObject.set(x, "LoggingLevel", js.undefined)
    
    inline def setThrottlingBurstLimit(value: Integer): Self = StObject.set(x, "ThrottlingBurstLimit", value.asInstanceOf[js.Any])
    
    inline def setThrottlingBurstLimitUndefined: Self = StObject.set(x, "ThrottlingBurstLimit", js.undefined)
    
    inline def setThrottlingRateLimit(value: Double): Self = StObject.set(x, "ThrottlingRateLimit", value.asInstanceOf[js.Any])
    
    inline def setThrottlingRateLimitUndefined: Self = StObject.set(x, "ThrottlingRateLimit", js.undefined)
  }
}
