package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsApiGatewayV2RouteSettings extends js.Object {
  
  /**
    * Indicates whether data trace logging is enabled. Data trace logging affects the log entries that are pushed to CloudWatch Logs. Supported only for WebSocket APIs.
    */
  var DataTraceEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether detailed metrics are enabled.
    */
  var DetailedMetricsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The logging level. The logging level affects the log entries that are pushed to CloudWatch Logs. Supported only for WebSocket APIs. If the logging level is ERROR, then the logs only include error-level entries. If the logging level is INFO, then the logs include both ERROR events and extra informational events. Valid values: OFF | ERROR | INFO 
    */
  var LoggingLevel: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The throttling burst limit.
    */
  var ThrottlingBurstLimit: js.UndefOr[Integer] = js.native
  
  /**
    * The throttling rate limit.
    */
  var ThrottlingRateLimit: js.UndefOr[Double] = js.native
}
object AwsApiGatewayV2RouteSettings {
  
  @scala.inline
  def apply(): AwsApiGatewayV2RouteSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsApiGatewayV2RouteSettings]
  }
  
  @scala.inline
  implicit class AwsApiGatewayV2RouteSettingsOps[Self <: AwsApiGatewayV2RouteSettings] (val x: Self) extends AnyVal {
    
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
    def setDataTraceEnabled(value: Boolean): Self = this.set("DataTraceEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataTraceEnabled: Self = this.set("DataTraceEnabled", js.undefined)
    
    @scala.inline
    def setDetailedMetricsEnabled(value: Boolean): Self = this.set("DetailedMetricsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailedMetricsEnabled: Self = this.set("DetailedMetricsEnabled", js.undefined)
    
    @scala.inline
    def setLoggingLevel(value: NonEmptyString): Self = this.set("LoggingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggingLevel: Self = this.set("LoggingLevel", js.undefined)
    
    @scala.inline
    def setThrottlingBurstLimit(value: Integer): Self = this.set("ThrottlingBurstLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottlingBurstLimit: Self = this.set("ThrottlingBurstLimit", js.undefined)
    
    @scala.inline
    def setThrottlingRateLimit(value: Double): Self = this.set("ThrottlingRateLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottlingRateLimit: Self = this.set("ThrottlingRateLimit", js.undefined)
  }
}
