package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudWatchLoggingOptions extends js.Object {
  
  /**
    * Enables or disables CloudWatch logging.
    */
  var Enabled: js.UndefOr[BooleanObject] = js.native
  
  /**
    * The CloudWatch group name for logging. This value is required if CloudWatch logging is enabled.
    */
  var LogGroupName: js.UndefOr[typings.awsSdk.firehoseMod.LogGroupName] = js.native
  
  /**
    * The CloudWatch log stream name for logging. This value is required if CloudWatch logging is enabled.
    */
  var LogStreamName: js.UndefOr[typings.awsSdk.firehoseMod.LogStreamName] = js.native
}
object CloudWatchLoggingOptions {
  
  @scala.inline
  def apply(): CloudWatchLoggingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchLoggingOptions]
  }
  
  @scala.inline
  implicit class CloudWatchLoggingOptionsOps[Self <: CloudWatchLoggingOptions] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: BooleanObject): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = this.set("LogGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogGroupName: Self = this.set("LogGroupName", js.undefined)
    
    @scala.inline
    def setLogStreamName(value: LogStreamName): Self = this.set("LogStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogStreamName: Self = this.set("LogStreamName", js.undefined)
  }
}
