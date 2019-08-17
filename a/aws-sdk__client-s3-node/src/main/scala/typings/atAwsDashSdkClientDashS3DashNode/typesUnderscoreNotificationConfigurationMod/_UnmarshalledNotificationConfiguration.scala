package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreNotificationConfigurationMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreLambdaFunctionConfigurationMod._UnmarshalledLambdaFunctionConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreQueueConfigurationMod._UnmarshalledQueueConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreTopicConfigurationMod._UnmarshalledTopicConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledNotificationConfiguration extends _NotificationConfiguration {
  /**
    * _LambdaFunctionConfigurationList shape
    */
  @JSName("LambdaFunctionConfigurations")
  var LambdaFunctionConfigurations__UnmarshalledNotificationConfiguration: js.UndefOr[js.Array[_UnmarshalledLambdaFunctionConfiguration]] = js.undefined
  /**
    * _QueueConfigurationList shape
    */
  @JSName("QueueConfigurations")
  var QueueConfigurations__UnmarshalledNotificationConfiguration: js.UndefOr[js.Array[_UnmarshalledQueueConfiguration]] = js.undefined
  /**
    * _TopicConfigurationList shape
    */
  @JSName("TopicConfigurations")
  var TopicConfigurations__UnmarshalledNotificationConfiguration: js.UndefOr[js.Array[_UnmarshalledTopicConfiguration]] = js.undefined
}

object _UnmarshalledNotificationConfiguration {
  @scala.inline
  def apply(
    LambdaFunctionConfigurations: js.Array[_UnmarshalledLambdaFunctionConfiguration] = null,
    QueueConfigurations: js.Array[_UnmarshalledQueueConfiguration] = null,
    TopicConfigurations: js.Array[_UnmarshalledTopicConfiguration] = null
  ): _UnmarshalledNotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (LambdaFunctionConfigurations != null) __obj.updateDynamic("LambdaFunctionConfigurations")(LambdaFunctionConfigurations)
    if (QueueConfigurations != null) __obj.updateDynamic("QueueConfigurations")(QueueConfigurations)
    if (TopicConfigurations != null) __obj.updateDynamic("TopicConfigurations")(TopicConfigurations)
    __obj.asInstanceOf[_UnmarshalledNotificationConfiguration]
  }
}

