package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationConfiguration extends js.Object {
  /**
    * Describes the AWS Lambda functions to invoke and the events for which to invoke them.
    */
  var LambdaFunctionConfigurations: js.UndefOr[LambdaFunctionConfigurationList] = js.native
  /**
    * The Amazon Simple Queue Service queues to publish messages to and the events for which to publish messages.
    */
  var QueueConfigurations: js.UndefOr[QueueConfigurationList] = js.native
  /**
    * The topic to which notifications are sent and the events for which notifications are generated.
    */
  var TopicConfigurations: js.UndefOr[TopicConfigurationList] = js.native
}

object NotificationConfiguration {
  @scala.inline
  def apply(
    LambdaFunctionConfigurations: LambdaFunctionConfigurationList = null,
    QueueConfigurations: QueueConfigurationList = null,
    TopicConfigurations: TopicConfigurationList = null
  ): NotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (LambdaFunctionConfigurations != null) __obj.updateDynamic("LambdaFunctionConfigurations")(LambdaFunctionConfigurations.asInstanceOf[js.Any])
    if (QueueConfigurations != null) __obj.updateDynamic("QueueConfigurations")(QueueConfigurations.asInstanceOf[js.Any])
    if (TopicConfigurations != null) __obj.updateDynamic("TopicConfigurations")(TopicConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationConfiguration]
  }
}

