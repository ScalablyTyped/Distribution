package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationConfigurationDeprecated extends StObject {
  
  /**
    * Container for specifying the AWS Lambda notification configuration.
    */
  var CloudFunctionConfiguration: js.UndefOr[typings.awsSdk.s3Mod.CloudFunctionConfiguration] = js.undefined
  
  /**
    * This data type is deprecated. This data type specifies the configuration for publishing messages to an Amazon Simple Queue Service (Amazon SQS) queue when Amazon S3 detects specified events. 
    */
  var QueueConfiguration: js.UndefOr[QueueConfigurationDeprecated] = js.undefined
  
  /**
    * This data type is deprecated. A container for specifying the configuration for publication of messages to an Amazon Simple Notification Service (Amazon SNS) topic when Amazon S3 detects specified events. 
    */
  var TopicConfiguration: js.UndefOr[TopicConfigurationDeprecated] = js.undefined
}
object NotificationConfigurationDeprecated {
  
  @scala.inline
  def apply(): NotificationConfigurationDeprecated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConfigurationDeprecated]
  }
  
  @scala.inline
  implicit class NotificationConfigurationDeprecatedMutableBuilder[Self <: NotificationConfigurationDeprecated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudFunctionConfiguration(value: CloudFunctionConfiguration): Self = StObject.set(x, "CloudFunctionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudFunctionConfigurationUndefined: Self = StObject.set(x, "CloudFunctionConfiguration", js.undefined)
    
    @scala.inline
    def setQueueConfiguration(value: QueueConfigurationDeprecated): Self = StObject.set(x, "QueueConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueConfigurationUndefined: Self = StObject.set(x, "QueueConfiguration", js.undefined)
    
    @scala.inline
    def setTopicConfiguration(value: TopicConfigurationDeprecated): Self = StObject.set(x, "TopicConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicConfigurationUndefined: Self = StObject.set(x, "TopicConfiguration", js.undefined)
  }
}
