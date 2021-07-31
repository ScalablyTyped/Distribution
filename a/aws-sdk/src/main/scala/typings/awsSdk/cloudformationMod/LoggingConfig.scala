package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingConfig extends StObject {
  
  /**
    * The Amazon CloudWatch log group to which CloudFormation sends error logging information when invoking the type's handlers.
    */
  var LogGroupName: typings.awsSdk.cloudformationMod.LogGroupName
  
  /**
    * The ARN of the role that CloudFormation should assume when sending log entries to CloudWatch logs.
    */
  var LogRoleArn: RoleArn
}
object LoggingConfig {
  
  @scala.inline
  def apply(LogGroupName: LogGroupName, LogRoleArn: RoleArn): LoggingConfig = {
    val __obj = js.Dynamic.literal(LogGroupName = LogGroupName.asInstanceOf[js.Any], LogRoleArn = LogRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfig]
  }
  
  @scala.inline
  implicit class LoggingConfigMutableBuilder[Self <: LoggingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "LogGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogRoleArn(value: RoleArn): Self = StObject.set(x, "LogRoleArn", value.asInstanceOf[js.Any])
  }
}
