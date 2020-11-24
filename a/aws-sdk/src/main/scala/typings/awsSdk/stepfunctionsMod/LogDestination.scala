package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogDestination extends js.Object {
  
  /**
    * An object describing a CloudWatch log group. For more information, see AWS::Logs::LogGroup in the AWS CloudFormation User Guide.
    */
  var cloudWatchLogsLogGroup: js.UndefOr[CloudWatchLogsLogGroup] = js.native
}
object LogDestination {
  
  @scala.inline
  def apply(): LogDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogDestination]
  }
  
  @scala.inline
  implicit class LogDestinationOps[Self <: LogDestination] (val x: Self) extends AnyVal {
    
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
    def setCloudWatchLogsLogGroup(value: CloudWatchLogsLogGroup): Self = this.set("cloudWatchLogsLogGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchLogsLogGroup: Self = this.set("cloudWatchLogsLogGroup", js.undefined)
  }
}
