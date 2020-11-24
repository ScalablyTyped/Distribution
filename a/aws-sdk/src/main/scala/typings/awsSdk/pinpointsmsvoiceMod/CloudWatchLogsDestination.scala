package typings.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudWatchLogsDestination extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of an Amazon Identity and Access Management (IAM) role that is able to write event data to an Amazon CloudWatch destination.
    */
  var IamRoleArn: js.UndefOr[String] = js.native
  
  /**
    * The name of the Amazon CloudWatch Log Group that you want to record events in.
    */
  var LogGroupArn: js.UndefOr[String] = js.native
}
object CloudWatchLogsDestination {
  
  @scala.inline
  def apply(): CloudWatchLogsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchLogsDestination]
  }
  
  @scala.inline
  implicit class CloudWatchLogsDestinationOps[Self <: CloudWatchLogsDestination] (val x: Self) extends AnyVal {
    
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
    def setIamRoleArn(value: String): Self = this.set("IamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamRoleArn: Self = this.set("IamRoleArn", js.undefined)
    
    @scala.inline
    def setLogGroupArn(value: String): Self = this.set("LogGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogGroupArn: Self = this.set("LogGroupArn", js.undefined)
  }
}
