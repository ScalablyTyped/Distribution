package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreNotificationConfigurationDeprecatedMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreCloudFunctionConfigurationMod._CloudFunctionConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreQueueConfigurationDeprecatedMod._QueueConfigurationDeprecated
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreTopicConfigurationDeprecatedMod._TopicConfigurationDeprecated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _NotificationConfigurationDeprecated extends js.Object {
  /**
    * _CloudFunctionConfiguration shape
    */
  var CloudFunctionConfiguration: js.UndefOr[_CloudFunctionConfiguration] = js.undefined
  /**
    * _QueueConfigurationDeprecated shape
    */
  var QueueConfiguration: js.UndefOr[_QueueConfigurationDeprecated] = js.undefined
  /**
    * _TopicConfigurationDeprecated shape
    */
  var TopicConfiguration: js.UndefOr[_TopicConfigurationDeprecated] = js.undefined
}

object _NotificationConfigurationDeprecated {
  @scala.inline
  def apply(
    CloudFunctionConfiguration: _CloudFunctionConfiguration = null,
    QueueConfiguration: _QueueConfigurationDeprecated = null,
    TopicConfiguration: _TopicConfigurationDeprecated = null
  ): _NotificationConfigurationDeprecated = {
    val __obj = js.Dynamic.literal()
    if (CloudFunctionConfiguration != null) __obj.updateDynamic("CloudFunctionConfiguration")(CloudFunctionConfiguration)
    if (QueueConfiguration != null) __obj.updateDynamic("QueueConfiguration")(QueueConfiguration)
    if (TopicConfiguration != null) __obj.updateDynamic("TopicConfiguration")(TopicConfiguration)
    __obj.asInstanceOf[_NotificationConfigurationDeprecated]
  }
}

