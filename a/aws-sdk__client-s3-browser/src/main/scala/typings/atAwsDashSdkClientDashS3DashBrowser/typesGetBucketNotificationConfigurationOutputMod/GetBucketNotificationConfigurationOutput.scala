package typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketNotificationConfigurationOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreLambdaFunctionConfigurationMod._UnmarshalledLambdaFunctionConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreQueueConfigurationMod._UnmarshalledQueueConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreTopicConfigurationMod._UnmarshalledTopicConfiguration
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketNotificationConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _LambdaFunctionConfigurationList shape
    */
  var LambdaFunctionConfigurations: js.UndefOr[js.Array[_UnmarshalledLambdaFunctionConfiguration]] = js.undefined
  /**
    * _QueueConfigurationList shape
    */
  var QueueConfigurations: js.UndefOr[js.Array[_UnmarshalledQueueConfiguration]] = js.undefined
  /**
    * _TopicConfigurationList shape
    */
  var TopicConfigurations: js.UndefOr[js.Array[_UnmarshalledTopicConfiguration]] = js.undefined
}

object GetBucketNotificationConfigurationOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    LambdaFunctionConfigurations: js.Array[_UnmarshalledLambdaFunctionConfiguration] = null,
    QueueConfigurations: js.Array[_UnmarshalledQueueConfiguration] = null,
    TopicConfigurations: js.Array[_UnmarshalledTopicConfiguration] = null
  ): GetBucketNotificationConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (LambdaFunctionConfigurations != null) __obj.updateDynamic("LambdaFunctionConfigurations")(LambdaFunctionConfigurations)
    if (QueueConfigurations != null) __obj.updateDynamic("QueueConfigurations")(QueueConfigurations)
    if (TopicConfigurations != null) __obj.updateDynamic("TopicConfigurations")(TopicConfigurations)
    __obj.asInstanceOf[GetBucketNotificationConfigurationOutput]
  }
}

