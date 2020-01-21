package typings.awsSdkClientS3Browser.typesNotificationConfigurationMod

import typings.awsSdkClientS3Browser.typesLambdaFunctionConfigurationMod.LambdaFunctionConfiguration
import typings.awsSdkClientS3Browser.typesQueueConfigurationMod.QueueConfiguration
import typings.awsSdkClientS3Browser.typesTopicConfigurationMod.TopicConfiguration
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationConfiguration extends js.Object {
  /**
    * _LambdaFunctionConfigurationList shape
    */
  var LambdaFunctionConfigurations: js.UndefOr[js.Array[LambdaFunctionConfiguration] | Iterable[LambdaFunctionConfiguration]] = js.undefined
  /**
    * _QueueConfigurationList shape
    */
  var QueueConfigurations: js.UndefOr[js.Array[QueueConfiguration] | Iterable[QueueConfiguration]] = js.undefined
  /**
    * _TopicConfigurationList shape
    */
  var TopicConfigurations: js.UndefOr[js.Array[TopicConfiguration] | Iterable[TopicConfiguration]] = js.undefined
}

object NotificationConfiguration {
  @scala.inline
  def apply(
    LambdaFunctionConfigurations: js.Array[LambdaFunctionConfiguration] | Iterable[LambdaFunctionConfiguration] = null,
    QueueConfigurations: js.Array[QueueConfiguration] | Iterable[QueueConfiguration] = null,
    TopicConfigurations: js.Array[TopicConfiguration] | Iterable[TopicConfiguration] = null
  ): NotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (LambdaFunctionConfigurations != null) __obj.updateDynamic("LambdaFunctionConfigurations")(LambdaFunctionConfigurations.asInstanceOf[js.Any])
    if (QueueConfigurations != null) __obj.updateDynamic("QueueConfigurations")(QueueConfigurations.asInstanceOf[js.Any])
    if (TopicConfigurations != null) __obj.updateDynamic("TopicConfigurations")(TopicConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationConfiguration]
  }
}

