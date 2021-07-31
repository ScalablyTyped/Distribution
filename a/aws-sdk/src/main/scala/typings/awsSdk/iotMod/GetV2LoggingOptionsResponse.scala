package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetV2LoggingOptionsResponse extends StObject {
  
  /**
    * The default log level.
    */
  var defaultLogLevel: js.UndefOr[LogLevel] = js.undefined
  
  /**
    * Disables all logs.
    */
  var disableAllLogs: js.UndefOr[DisableAllLogs] = js.undefined
  
  /**
    * The IAM role ARN AWS IoT uses to write to your CloudWatch logs.
    */
  var roleArn: js.UndefOr[AwsArn] = js.undefined
}
object GetV2LoggingOptionsResponse {
  
  @scala.inline
  def apply(): GetV2LoggingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetV2LoggingOptionsResponse]
  }
  
  @scala.inline
  implicit class GetV2LoggingOptionsResponseMutableBuilder[Self <: GetV2LoggingOptionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultLogLevel(value: LogLevel): Self = StObject.set(x, "defaultLogLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLogLevelUndefined: Self = StObject.set(x, "defaultLogLevel", js.undefined)
    
    @scala.inline
    def setDisableAllLogs(value: DisableAllLogs): Self = StObject.set(x, "disableAllLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableAllLogsUndefined: Self = StObject.set(x, "disableAllLogs", js.undefined)
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
