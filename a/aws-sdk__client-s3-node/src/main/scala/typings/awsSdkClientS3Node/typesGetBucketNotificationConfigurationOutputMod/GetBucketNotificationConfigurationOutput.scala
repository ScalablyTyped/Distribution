package typings.awsSdkClientS3Node.typesGetBucketNotificationConfigurationOutputMod

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Node.typesLambdaFunctionConfigurationMod.UnmarshalledLambdaFunctionConfiguration
import typings.awsSdkClientS3Node.typesQueueConfigurationMod.UnmarshalledQueueConfiguration
import typings.awsSdkClientS3Node.typesTopicConfigurationMod.UnmarshalledTopicConfiguration
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketNotificationConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _LambdaFunctionConfigurationList shape
    */
  var LambdaFunctionConfigurations: js.UndefOr[js.Array[UnmarshalledLambdaFunctionConfiguration]] = js.native
  /**
    * _QueueConfigurationList shape
    */
  var QueueConfigurations: js.UndefOr[js.Array[UnmarshalledQueueConfiguration]] = js.native
  /**
    * _TopicConfigurationList shape
    */
  var TopicConfigurations: js.UndefOr[js.Array[UnmarshalledTopicConfiguration]] = js.native
}

object GetBucketNotificationConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetBucketNotificationConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketNotificationConfigurationOutput]
  }
  @scala.inline
  implicit class GetBucketNotificationConfigurationOutputOps[Self <: GetBucketNotificationConfigurationOutput] (val x: Self) extends AnyVal {
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

