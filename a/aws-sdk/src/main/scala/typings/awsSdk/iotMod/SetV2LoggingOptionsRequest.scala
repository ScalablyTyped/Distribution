package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetV2LoggingOptionsRequest extends js.Object {
  
  /**
    * The default logging level.
    */
  var defaultLogLevel: js.UndefOr[LogLevel] = js.native
  
  /**
    * If true all logs are disabled. The default is false.
    */
  var disableAllLogs: js.UndefOr[DisableAllLogs] = js.native
  
  /**
    * The ARN of the role that allows IoT to write to Cloudwatch logs.
    */
  var roleArn: js.UndefOr[AwsArn] = js.native
}
object SetV2LoggingOptionsRequest {
  
  @scala.inline
  def apply(): SetV2LoggingOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetV2LoggingOptionsRequest]
  }
  
  @scala.inline
  implicit class SetV2LoggingOptionsRequestOps[Self <: SetV2LoggingOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultLogLevel(value: LogLevel): Self = this.set("defaultLogLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLogLevel: Self = this.set("defaultLogLevel", js.undefined)
    
    @scala.inline
    def setDisableAllLogs(value: DisableAllLogs): Self = this.set("disableAllLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAllLogs: Self = this.set("disableAllLogs", js.undefined)
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
  }
}
