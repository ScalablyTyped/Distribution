package typings.awsSdkClientS3Browser.typesNotificationConfigurationDeprecatedMod

import typings.awsSdkClientS3Browser.typesCloudFunctionConfigurationMod.CloudFunctionConfiguration
import typings.awsSdkClientS3Browser.typesQueueConfigurationDeprecatedMod.QueueConfigurationDeprecated
import typings.awsSdkClientS3Browser.typesTopicConfigurationDeprecatedMod.TopicConfigurationDeprecated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationConfigurationDeprecated extends js.Object {
  /**
    * _CloudFunctionConfiguration shape
    */
  var CloudFunctionConfiguration: js.UndefOr[
    typings.awsSdkClientS3Browser.typesCloudFunctionConfigurationMod.CloudFunctionConfiguration
  ] = js.undefined
  /**
    * _QueueConfigurationDeprecated shape
    */
  var QueueConfiguration: js.UndefOr[QueueConfigurationDeprecated] = js.undefined
  /**
    * _TopicConfigurationDeprecated shape
    */
  var TopicConfiguration: js.UndefOr[TopicConfigurationDeprecated] = js.undefined
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

