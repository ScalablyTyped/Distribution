package typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketNotificationOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreCloudFunctionConfigurationMod._UnmarshalledCloudFunctionConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreQueueConfigurationDeprecatedMod._UnmarshalledQueueConfigurationDeprecated
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreTopicConfigurationDeprecatedMod._UnmarshalledTopicConfigurationDeprecated
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketNotificationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _CloudFunctionConfiguration shape
    */
  var CloudFunctionConfiguration: js.UndefOr[_UnmarshalledCloudFunctionConfiguration] = js.undefined
  /**
    * _QueueConfigurationDeprecated shape
    */
  var QueueConfiguration: js.UndefOr[_UnmarshalledQueueConfigurationDeprecated] = js.undefined
  /**
    * _TopicConfigurationDeprecated shape
    */
  var TopicConfiguration: js.UndefOr[_UnmarshalledTopicConfigurationDeprecated] = js.undefined
}

object GetBucketNotificationOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    CloudFunctionConfiguration: _UnmarshalledCloudFunctionConfiguration = null,
    QueueConfiguration: _UnmarshalledQueueConfigurationDeprecated = null,
    TopicConfiguration: _UnmarshalledTopicConfigurationDeprecated = null
  ): GetBucketNotificationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (CloudFunctionConfiguration != null) __obj.updateDynamic("CloudFunctionConfiguration")(CloudFunctionConfiguration.asInstanceOf[js.Any])
    if (QueueConfiguration != null) __obj.updateDynamic("QueueConfiguration")(QueueConfiguration.asInstanceOf[js.Any])
    if (TopicConfiguration != null) __obj.updateDynamic("TopicConfiguration")(TopicConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketNotificationOutput]
  }
}

