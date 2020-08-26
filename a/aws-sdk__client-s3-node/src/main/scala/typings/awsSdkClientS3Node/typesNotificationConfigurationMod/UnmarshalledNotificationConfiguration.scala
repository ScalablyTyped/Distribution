package typings.awsSdkClientS3Node.typesNotificationConfigurationMod

import typings.awsSdkClientS3Node.typesLambdaFunctionConfigurationMod.UnmarshalledLambdaFunctionConfiguration
import typings.awsSdkClientS3Node.typesQueueConfigurationMod.UnmarshalledQueueConfiguration
import typings.awsSdkClientS3Node.typesTopicConfigurationMod.UnmarshalledTopicConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledNotificationConfiguration extends NotificationConfiguration {
  /**
    * _LambdaFunctionConfigurationList shape
    */
  @JSName("LambdaFunctionConfigurations")
  var LambdaFunctionConfigurations_UnmarshalledNotificationConfiguration: js.UndefOr[js.Array[UnmarshalledLambdaFunctionConfiguration]] = js.native
  /**
    * _QueueConfigurationList shape
    */
  @JSName("QueueConfigurations")
  var QueueConfigurations_UnmarshalledNotificationConfiguration: js.UndefOr[js.Array[UnmarshalledQueueConfiguration]] = js.native
  /**
    * _TopicConfigurationList shape
    */
  @JSName("TopicConfigurations")
  var TopicConfigurations_UnmarshalledNotificationConfiguration: js.UndefOr[js.Array[UnmarshalledTopicConfiguration]] = js.native
}

object UnmarshalledNotificationConfiguration {
  @scala.inline
  def apply(): UnmarshalledNotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledNotificationConfiguration]
  }
  @scala.inline
  implicit class UnmarshalledNotificationConfigurationOps[Self <: UnmarshalledNotificationConfiguration] (val x: Self) extends AnyVal {
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
    def setLambdaFunctionConfigurationsVarargs(value: UnmarshalledLambdaFunctionConfiguration*): Self = this.set("LambdaFunctionConfigurations", js.Array(value :_*))
    @scala.inline
    def setLambdaFunctionConfigurations(value: js.Array[UnmarshalledLambdaFunctionConfiguration]): Self = this.set("LambdaFunctionConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaFunctionConfigurations: Self = this.set("LambdaFunctionConfigurations", js.undefined)
    @scala.inline
    def setQueueConfigurationsVarargs(value: UnmarshalledQueueConfiguration*): Self = this.set("QueueConfigurations", js.Array(value :_*))
    @scala.inline
    def setQueueConfigurations(value: js.Array[UnmarshalledQueueConfiguration]): Self = this.set("QueueConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueueConfigurations: Self = this.set("QueueConfigurations", js.undefined)
    @scala.inline
    def setTopicConfigurationsVarargs(value: UnmarshalledTopicConfiguration*): Self = this.set("TopicConfigurations", js.Array(value :_*))
    @scala.inline
    def setTopicConfigurations(value: js.Array[UnmarshalledTopicConfiguration]): Self = this.set("TopicConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicConfigurations: Self = this.set("TopicConfigurations", js.undefined)
  }
  
}

