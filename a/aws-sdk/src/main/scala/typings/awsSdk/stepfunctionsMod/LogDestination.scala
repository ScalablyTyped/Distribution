package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogDestination extends StObject {
  
  /**
    * An object describing a CloudWatch log group. For more information, see AWS::Logs::LogGroup in the AWS CloudFormation User Guide.
    */
  var cloudWatchLogsLogGroup: js.UndefOr[CloudWatchLogsLogGroup] = js.undefined
}
object LogDestination {
  
  inline def apply(): LogDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogDestination]
  }
  
  extension [Self <: LogDestination](x: Self) {
    
    inline def setCloudWatchLogsLogGroup(value: CloudWatchLogsLogGroup): Self = StObject.set(x, "cloudWatchLogsLogGroup", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsLogGroupUndefined: Self = StObject.set(x, "cloudWatchLogsLogGroup", js.undefined)
  }
}
