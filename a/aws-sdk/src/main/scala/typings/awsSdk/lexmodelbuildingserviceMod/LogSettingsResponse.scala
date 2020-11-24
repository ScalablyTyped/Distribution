package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogSettingsResponse extends js.Object {
  
  /**
    * The destination where logs are delivered.
    */
  var destination: js.UndefOr[Destination] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the key used to encrypt audio logs in an S3 bucket.
    */
  var kmsKeyArn: js.UndefOr[KmsKeyArn] = js.native
  
  /**
    * The type of logging that is enabled.
    */
  var logType: js.UndefOr[LogType] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3 bucket where the logs are delivered.
    */
  var resourceArn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The resource prefix is the first part of the S3 object key within the S3 bucket that you specified to contain audio logs. For CloudWatch Logs it is the prefix of the log stream name within the log group that you specified. 
    */
  var resourcePrefix: js.UndefOr[ResourcePrefix] = js.native
}
object LogSettingsResponse {
  
  @scala.inline
  def apply(): LogSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogSettingsResponse]
  }
  
  @scala.inline
  implicit class LogSettingsResponseOps[Self <: LogSettingsResponse] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: Destination): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setKmsKeyArn(value: KmsKeyArn): Self = this.set("kmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("kmsKeyArn", js.undefined)
    
    @scala.inline
    def setLogType(value: LogType): Self = this.set("logType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogType: Self = this.set("logType", js.undefined)
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceArn: Self = this.set("resourceArn", js.undefined)
    
    @scala.inline
    def setResourcePrefix(value: ResourcePrefix): Self = this.set("resourcePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourcePrefix: Self = this.set("resourcePrefix", js.undefined)
  }
}
