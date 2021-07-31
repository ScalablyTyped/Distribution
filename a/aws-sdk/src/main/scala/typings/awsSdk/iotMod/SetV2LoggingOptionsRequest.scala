package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetV2LoggingOptionsRequest extends StObject {
  
  /**
    * The default logging level.
    */
  var defaultLogLevel: js.UndefOr[LogLevel] = js.undefined
  
  /**
    * If true all logs are disabled. The default is false.
    */
  var disableAllLogs: js.UndefOr[DisableAllLogs] = js.undefined
  
  /**
    * The ARN of the role that allows IoT to write to Cloudwatch logs.
    */
  var roleArn: js.UndefOr[AwsArn] = js.undefined
}
object SetV2LoggingOptionsRequest {
  
  @scala.inline
  def apply(): SetV2LoggingOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetV2LoggingOptionsRequest]
  }
  
  @scala.inline
  implicit class SetV2LoggingOptionsRequestMutableBuilder[Self <: SetV2LoggingOptionsRequest] (val x: Self) extends AnyVal {
    
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
