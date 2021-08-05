package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLoggingOption extends StObject {
  
  /**
    * ARN of the CloudWatch log to receive application messages.
    */
  var LogStreamARN: typings.awsSdk.kinesisanalyticsMod.LogStreamARN
  
  /**
    * IAM ARN of the role to use to send application messages. Note: To write application messages to CloudWatch, the IAM role that is used must have the PutLogEvents policy action enabled.
    */
  var RoleARN: typings.awsSdk.kinesisanalyticsMod.RoleARN
}
object CloudWatchLoggingOption {
  
  inline def apply(LogStreamARN: LogStreamARN, RoleARN: RoleARN): CloudWatchLoggingOption = {
    val __obj = js.Dynamic.literal(LogStreamARN = LogStreamARN.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLoggingOption]
  }
  
  extension [Self <: CloudWatchLoggingOption](x: Self) {
    
    inline def setLogStreamARN(value: LogStreamARN): Self = StObject.set(x, "LogStreamARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
  }
}
