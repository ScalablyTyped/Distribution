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

trait GetBucketNotificationConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _LambdaFunctionConfigurationList shape
    */
  var LambdaFunctionConfigurations: js.UndefOr[js.Array[UnmarshalledLambdaFunctionConfiguration]] = js.undefined
  /**
    * _QueueConfigurationList shape
    */
  var QueueConfigurations: js.UndefOr[js.Array[UnmarshalledQueueConfiguration]] = js.undefined
  /**
    * _TopicConfigurationList shape
    */
  var TopicConfigurations: js.UndefOr[js.Array[UnmarshalledTopicConfiguration]] = js.undefined
}

object GetBucketNotificationConfigurationOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    LambdaFunctionConfigurations: js.Array[UnmarshalledLambdaFunctionConfiguration] = null,
    QueueConfigurations: js.Array[UnmarshalledQueueConfiguration] = null,
    TopicConfigurations: js.Array[UnmarshalledTopicConfiguration] = null
  ): GetBucketNotificationConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (LambdaFunctionConfigurations != null) __obj.updateDynamic("LambdaFunctionConfigurations")(LambdaFunctionConfigurations.asInstanceOf[js.Any])
    if (QueueConfigurations != null) __obj.updateDynamic("QueueConfigurations")(QueueConfigurations.asInstanceOf[js.Any])
    if (TopicConfigurations != null) __obj.updateDynamic("TopicConfigurations")(TopicConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketNotificationConfigurationOutput]
  }
}

