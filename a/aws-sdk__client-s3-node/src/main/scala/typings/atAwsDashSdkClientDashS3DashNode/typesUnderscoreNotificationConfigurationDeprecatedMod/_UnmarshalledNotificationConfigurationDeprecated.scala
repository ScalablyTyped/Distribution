package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreNotificationConfigurationDeprecatedMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreCloudFunctionConfigurationMod._UnmarshalledCloudFunctionConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreQueueConfigurationDeprecatedMod._UnmarshalledQueueConfigurationDeprecated
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreTopicConfigurationDeprecatedMod._UnmarshalledTopicConfigurationDeprecated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledNotificationConfigurationDeprecated extends _NotificationConfigurationDeprecated {
  /**
    * _CloudFunctionConfiguration shape
    */
  @JSName("CloudFunctionConfiguration")
  var CloudFunctionConfiguration__UnmarshalledNotificationConfigurationDeprecated: js.UndefOr[_UnmarshalledCloudFunctionConfiguration] = js.undefined
  /**
    * _QueueConfigurationDeprecated shape
    */
  @JSName("QueueConfiguration")
  var QueueConfiguration__UnmarshalledNotificationConfigurationDeprecated: js.UndefOr[_UnmarshalledQueueConfigurationDeprecated] = js.undefined
  /**
    * _TopicConfigurationDeprecated shape
    */
  @JSName("TopicConfiguration")
  var TopicConfiguration__UnmarshalledNotificationConfigurationDeprecated: js.UndefOr[_UnmarshalledTopicConfigurationDeprecated] = js.undefined
}

object _UnmarshalledNotificationConfigurationDeprecated {
  @scala.inline
  def apply(
    CloudFunctionConfiguration: _UnmarshalledCloudFunctionConfiguration = null,
    QueueConfiguration: _UnmarshalledQueueConfigurationDeprecated = null,
    TopicConfiguration: _UnmarshalledTopicConfigurationDeprecated = null
  ): _UnmarshalledNotificationConfigurationDeprecated = {
    val __obj = js.Dynamic.literal()
    if (CloudFunctionConfiguration != null) __obj.updateDynamic("CloudFunctionConfiguration")(CloudFunctionConfiguration.asInstanceOf[js.Any])
    if (QueueConfiguration != null) __obj.updateDynamic("QueueConfiguration")(QueueConfiguration.asInstanceOf[js.Any])
    if (TopicConfiguration != null) __obj.updateDynamic("TopicConfiguration")(TopicConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledNotificationConfigurationDeprecated]
  }
}

