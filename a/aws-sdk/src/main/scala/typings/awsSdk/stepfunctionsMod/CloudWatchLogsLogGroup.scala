package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLogsLogGroup extends StObject {
  
  /**
    * The ARN of the the CloudWatch log group to which you want your logs emitted to. The ARN must end with :* 
    */
  var logGroupArn: js.UndefOr[Arn] = js.undefined
}
object CloudWatchLogsLogGroup {
  
  @scala.inline
  def apply(): CloudWatchLogsLogGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchLogsLogGroup]
  }
  
  @scala.inline
  implicit class CloudWatchLogsLogGroupMutableBuilder[Self <: CloudWatchLogsLogGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogGroupArn(value: Arn): Self = StObject.set(x, "logGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupArnUndefined: Self = StObject.set(x, "logGroupArn", js.undefined)
  }
}
