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
  def apply(): NotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConfiguration]
  }
  @scala.inline
  implicit class NotificationConfigurationOps[Self <: NotificationConfiguration] (val x: Self) extends AnyVal {
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
    def setLambdaFunctionConfigurationsVarargs(value: LambdaFunctionConfiguration*): Self = this.set("LambdaFunctionConfigurations", js.Array(value :_*))
    @scala.inline
    def setLambdaFunctionConfigurations(value: LambdaFunctionConfigurationList): Self = this.set("LambdaFunctionConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaFunctionConfigurations: Self = this.set("LambdaFunctionConfigurations", js.undefined)
    @scala.inline
    def setQueueConfigurationsVarargs(value: QueueConfiguration*): Self = this.set("QueueConfigurations", js.Array(value :_*))
    @scala.inline
    def setQueueConfigurations(value: QueueConfigurationList): Self = this.set("QueueConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueueConfigurations: Self = this.set("QueueConfigurations", js.undefined)
    @scala.inline
    def setTopicConfigurationsVarargs(value: TopicConfiguration*): Self = this.set("TopicConfigurations", js.Array(value :_*))
    @scala.inline
    def setTopicConfigurations(value: TopicConfigurationList): Self = this.set("TopicConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicConfigurations: Self = this.set("TopicConfigurations", js.undefined)
  }
  
}

