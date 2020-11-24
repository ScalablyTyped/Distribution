package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogPublishingOption extends js.Object {
  
  var CloudWatchLogsLogGroupArn: js.UndefOr[typings.awsSdk.esMod.CloudWatchLogsLogGroupArn] = js.native
  
  /**
    *  Specifies whether given log publishing option is enabled or not.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}
object LogPublishingOption {
  
  @scala.inline
  def apply(): LogPublishingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogPublishingOption]
  }
  
  @scala.inline
  implicit class LogPublishingOptionOps[Self <: LogPublishingOption] (val x: Self) extends AnyVal {
    
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
    def setCloudWatchLogsLogGroupArn(value: CloudWatchLogsLogGroupArn): Self = this.set("CloudWatchLogsLogGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchLogsLogGroupArn: Self = this.set("CloudWatchLogsLogGroupArn", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
  }
}
