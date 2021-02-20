package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudwatchLogsAction extends StObject {
  
  /**
    * The CloudWatch log group to which the action sends data.
    */
  var logGroupName: LogGroupName = js.native
  
  /**
    * The IAM role that allows access to the CloudWatch log.
    */
  var roleArn: AwsArn = js.native
}
object CloudwatchLogsAction {
  
  @scala.inline
  def apply(logGroupName: LogGroupName, roleArn: AwsArn): CloudwatchLogsAction = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudwatchLogsAction]
  }
  
  @scala.inline
  implicit class CloudwatchLogsActionMutableBuilder[Self <: CloudwatchLogsAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
