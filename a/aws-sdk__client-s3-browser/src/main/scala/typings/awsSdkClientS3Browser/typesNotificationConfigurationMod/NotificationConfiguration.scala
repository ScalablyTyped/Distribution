package typings.awsSdkClientS3Browser.typesNotificationConfigurationMod

import typings.awsSdkClientS3Browser.typesLambdaFunctionConfigurationMod.LambdaFunctionConfiguration
import typings.awsSdkClientS3Browser.typesQueueConfigurationMod.QueueConfiguration
import typings.awsSdkClientS3Browser.typesTopicConfigurationMod.TopicConfiguration
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationConfiguration extends js.Object {
  /**
    * _LambdaFunctionConfigurationList shape
    */
  var LambdaFunctionConfigurations: js.UndefOr[js.Array[LambdaFunctionConfiguration] | Iterable[LambdaFunctionConfiguration]] = js.native
  /**
    * _QueueConfigurationList shape
    */
  var QueueConfigurations: js.UndefOr[js.Array[QueueConfiguration] | Iterable[QueueConfiguration]] = js.native
  /**
    * _TopicConfigurationList shape
    */
  var TopicConfigurations: js.UndefOr[js.Array[TopicConfiguration] | Iterable[TopicConfiguration]] = js.native
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
    def setLambdaFunctionConfigurations(value: js.Array[LambdaFunctionConfiguration] | Iterable[LambdaFunctionConfiguration]): Self = this.set("LambdaFunctionConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaFunctionConfigurations: Self = this.set("LambdaFunctionConfigurations", js.undefined)
    @scala.inline
    def setQueueConfigurationsVarargs(value: QueueConfiguration*): Self = this.set("QueueConfigurations", js.Array(value :_*))
    @scala.inline
    def setQueueConfigurations(value: js.Array[QueueConfiguration] | Iterable[QueueConfiguration]): Self = this.set("QueueConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueueConfigurations: Self = this.set("QueueConfigurations", js.undefined)
    @scala.inline
    def setTopicConfigurationsVarargs(value: TopicConfiguration*): Self = this.set("TopicConfigurations", js.Array(value :_*))
    @scala.inline
    def setTopicConfigurations(value: js.Array[TopicConfiguration] | Iterable[TopicConfiguration]): Self = this.set("TopicConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicConfigurations: Self = this.set("TopicConfigurations", js.undefined)
  }
  
}

