package typings.awsSdkClientS3Node.typesNotificationConfigurationDeprecatedMod

import typings.awsSdkClientS3Node.typesCloudFunctionConfigurationMod.UnmarshalledCloudFunctionConfiguration
import typings.awsSdkClientS3Node.typesQueueConfigurationDeprecatedMod.UnmarshalledQueueConfigurationDeprecated
import typings.awsSdkClientS3Node.typesTopicConfigurationDeprecatedMod.UnmarshalledTopicConfigurationDeprecated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledNotificationConfigurationDeprecated extends NotificationConfigurationDeprecated {
  /**
    * _CloudFunctionConfiguration shape
    */
  @JSName("CloudFunctionConfiguration")
  var CloudFunctionConfiguration_UnmarshalledNotificationConfigurationDeprecated: js.UndefOr[UnmarshalledCloudFunctionConfiguration] = js.undefined
  /**
    * _QueueConfigurationDeprecated shape
    */
  @JSName("QueueConfiguration")
  var QueueConfiguration_UnmarshalledNotificationConfigurationDeprecated: js.UndefOr[UnmarshalledQueueConfigurationDeprecated] = js.undefined
  /**
    * _TopicConfigurationDeprecated shape
    */
  @JSName("TopicConfiguration")
  var TopicConfiguration_UnmarshalledNotificationConfigurationDeprecated: js.UndefOr[UnmarshalledTopicConfigurationDeprecated] = js.undefined
}

object UnmarshalledNotificationConfigurationDeprecated {
  @scala.inline
  def apply(
    CloudFunctionConfiguration: UnmarshalledCloudFunctionConfiguration = null,
    QueueConfiguration: UnmarshalledQueueConfigurationDeprecated = null,
    TopicConfiguration: UnmarshalledTopicConfigurationDeprecated = null
  ): UnmarshalledNotificationConfigurationDeprecated = {
    val __obj = js.Dynamic.literal()
    if (CloudFunctionConfiguration != null) __obj.updateDynamic("CloudFunctionConfiguration")(CloudFunctionConfiguration.asInstanceOf[js.Any])
    if (QueueConfiguration != null) __obj.updateDynamic("QueueConfiguration")(QueueConfiguration.asInstanceOf[js.Any])
    if (TopicConfiguration != null) __obj.updateDynamic("TopicConfiguration")(TopicConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledNotificationConfigurationDeprecated]
  }
}

