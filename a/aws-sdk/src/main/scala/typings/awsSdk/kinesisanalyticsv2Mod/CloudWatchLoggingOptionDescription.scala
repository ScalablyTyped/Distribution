package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLoggingOptionDescription extends StObject {
  
  /**
    * The ID of the CloudWatch logging option description.
    */
  var CloudWatchLoggingOptionId: js.UndefOr[Id] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch log to receive application messages.
    */
  var LogStreamARN: typings.awsSdk.kinesisanalyticsv2Mod.LogStreamARN
  
  /**
    * The IAM ARN of the role to use to send application messages.   Provided for backward compatibility. Applications created with the current API version have an application-level service execution role rather than a resource-level role. 
    */
  var RoleARN: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.RoleARN] = js.undefined
}
object CloudWatchLoggingOptionDescription {
  
  @scala.inline
  def apply(LogStreamARN: LogStreamARN): CloudWatchLoggingOptionDescription = {
    val __obj = js.Dynamic.literal(LogStreamARN = LogStreamARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLoggingOptionDescription]
  }
  
  @scala.inline
  implicit class CloudWatchLoggingOptionDescriptionMutableBuilder[Self <: CloudWatchLoggingOptionDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchLoggingOptionId(value: Id): Self = StObject.set(x, "CloudWatchLoggingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLoggingOptionIdUndefined: Self = StObject.set(x, "CloudWatchLoggingOptionId", js.undefined)
    
    @scala.inline
    def setLogStreamARN(value: LogStreamARN): Self = StObject.set(x, "LogStreamARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
  }
}
