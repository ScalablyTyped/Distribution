package typings.awsSdkClientS3Node.typesNotificationConfigurationMod

import typings.awsSdkClientS3Node.typesLambdaFunctionConfigurationMod.UnmarshalledLambdaFunctionConfiguration
import typings.awsSdkClientS3Node.typesQueueConfigurationMod.UnmarshalledQueueConfiguration
import typings.awsSdkClientS3Node.typesTopicConfigurationMod.UnmarshalledTopicConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledNotificationConfiguration extends NotificationConfiguration {
  /**
    * _LambdaFunctionConfigurationList shape
    */
  @JSName("LambdaFunctionConfigurations")
  var LambdaFunctionConfigurations_UnmarshalledNotificationConfiguration: js.UndefOr[js.Array[UnmarshalledLambdaFunctionConfiguration]] = js.undefined
  /**
    * _QueueConfigurationList shape
    */
  @JSName("QueueConfigurations")
  var QueueConfigurations_UnmarshalledNotificationConfiguration: js.UndefOr[js.Array[UnmarshalledQueueConfiguration]] = js.undefined
  /**
    * _TopicConfigurationList shape
    */
  @JSName("TopicConfigurations")
  var TopicConfigurations_UnmarshalledNotificationConfiguration: js.UndefOr[js.Array[UnmarshalledTopicConfiguration]] = js.undefined
}

object UnmarshalledNotificationConfiguration {
  @scala.inline
  def apply(
    LambdaFunctionConfigurations: js.Array[UnmarshalledLambdaFunctionConfiguration] = null,
    QueueConfigurations: js.Array[UnmarshalledQueueConfiguration] = null,
    TopicConfigurations: js.Array[UnmarshalledTopicConfiguration] = null
  ): UnmarshalledNotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (LambdaFunctionConfigurations != null) __obj.updateDynamic("LambdaFunctionConfigurations")(LambdaFunctionConfigurations.asInstanceOf[js.Any])
    if (QueueConfigurations != null) __obj.updateDynamic("QueueConfigurations")(QueueConfigurations.asInstanceOf[js.Any])
    if (TopicConfigurations != null) __obj.updateDynamic("TopicConfigurations")(TopicConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledNotificationConfiguration]
  }
}

