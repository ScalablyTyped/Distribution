package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudWatchLogsLogGroup extends js.Object {
  
  /**
    * The ARN of the the CloudWatch log group to which you want your logs emitted to. The ARN must end with :* 
    */
  var logGroupArn: js.UndefOr[Arn] = js.native
}
object CloudWatchLogsLogGroup {
  
  @scala.inline
  def apply(): CloudWatchLogsLogGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchLogsLogGroup]
  }
  
  @scala.inline
  implicit class CloudWatchLogsLogGroupOps[Self <: CloudWatchLogsLogGroup] (val x: Self) extends AnyVal {
    
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
    def setLogGroupArn(value: Arn): Self = this.set("logGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogGroupArn: Self = this.set("logGroupArn", js.undefined)
  }
}
