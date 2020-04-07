package typings.awsSdkClientS3Browser.typesGetBucketNotificationOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesCloudFunctionConfigurationMod.UnmarshalledCloudFunctionConfiguration
import typings.awsSdkClientS3Browser.typesQueueConfigurationDeprecatedMod.UnmarshalledQueueConfigurationDeprecated
import typings.awsSdkClientS3Browser.typesTopicConfigurationDeprecatedMod.UnmarshalledTopicConfigurationDeprecated
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketNotificationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _CloudFunctionConfiguration shape
    */
  var CloudFunctionConfiguration: js.UndefOr[UnmarshalledCloudFunctionConfiguration] = js.undefined
  /**
    * _QueueConfigurationDeprecated shape
    */
  var QueueConfiguration: js.UndefOr[UnmarshalledQueueConfigurationDeprecated] = js.undefined
  /**
    * _TopicConfigurationDeprecated shape
    */
  var TopicConfiguration: js.UndefOr[UnmarshalledTopicConfigurationDeprecated] = js.undefined
}

object GetBucketNotificationOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    CloudFunctionConfiguration: UnmarshalledCloudFunctionConfiguration = null,
    QueueConfiguration: UnmarshalledQueueConfigurationDeprecated = null,
    TopicConfiguration: UnmarshalledTopicConfigurationDeprecated = null
  ): GetBucketNotificationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (CloudFunctionConfiguration != null) __obj.updateDynamic("CloudFunctionConfiguration")(CloudFunctionConfiguration.asInstanceOf[js.Any])
    if (QueueConfiguration != null) __obj.updateDynamic("QueueConfiguration")(QueueConfiguration.asInstanceOf[js.Any])
    if (TopicConfiguration != null) __obj.updateDynamic("TopicConfiguration")(TopicConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketNotificationOutput]
  }
}

