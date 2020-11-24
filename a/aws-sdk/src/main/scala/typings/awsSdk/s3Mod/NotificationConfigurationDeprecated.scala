package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationConfigurationDeprecated extends js.Object {
  
  /**
    * Container for specifying the AWS Lambda notification configuration.
    */
  var CloudFunctionConfiguration: js.UndefOr[typings.awsSdk.s3Mod.CloudFunctionConfiguration] = js.native
  
  /**
    * This data type is deprecated. This data type specifies the configuration for publishing messages to an Amazon Simple Queue Service (Amazon SQS) queue when Amazon S3 detects specified events. 
    */
  var QueueConfiguration: js.UndefOr[QueueConfigurationDeprecated] = js.native
  
  /**
    * This data type is deprecated. A container for specifying the configuration for publication of messages to an Amazon Simple Notification Service (Amazon SNS) topic when Amazon S3 detects specified events. 
    */
  var TopicConfiguration: js.UndefOr[TopicConfigurationDeprecated] = js.native
}
object NotificationConfigurationDeprecated {
  
  @scala.inline
  def apply(): NotificationConfigurationDeprecated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConfigurationDeprecated]
  }
  
  @scala.inline
  implicit class NotificationConfigurationDeprecatedOps[Self <: NotificationConfigurationDeprecated] (val x: Self) extends AnyVal {
    
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
    def setCloudFunctionConfiguration(value: CloudFunctionConfiguration): Self = this.set("CloudFunctionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudFunctionConfiguration: Self = this.set("CloudFunctionConfiguration", js.undefined)
    
    @scala.inline
    def setQueueConfiguration(value: QueueConfigurationDeprecated): Self = this.set("QueueConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueueConfiguration: Self = this.set("QueueConfiguration", js.undefined)
    
    @scala.inline
    def setTopicConfiguration(value: TopicConfigurationDeprecated): Self = this.set("TopicConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicConfiguration: Self = this.set("TopicConfiguration", js.undefined)
  }
}
