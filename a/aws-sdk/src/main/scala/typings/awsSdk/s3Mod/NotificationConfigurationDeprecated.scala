package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    CloudFunctionConfiguration: CloudFunctionConfiguration = null,
    QueueConfiguration: QueueConfigurationDeprecated = null,
    TopicConfiguration: TopicConfigurationDeprecated = null
  ): NotificationConfigurationDeprecated = {
    val __obj = js.Dynamic.literal()
    if (CloudFunctionConfiguration != null) __obj.updateDynamic("CloudFunctionConfiguration")(CloudFunctionConfiguration.asInstanceOf[js.Any])
    if (QueueConfiguration != null) __obj.updateDynamic("QueueConfiguration")(QueueConfiguration.asInstanceOf[js.Any])
    if (TopicConfiguration != null) __obj.updateDynamic("TopicConfiguration")(TopicConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationConfigurationDeprecated]
  }
}

