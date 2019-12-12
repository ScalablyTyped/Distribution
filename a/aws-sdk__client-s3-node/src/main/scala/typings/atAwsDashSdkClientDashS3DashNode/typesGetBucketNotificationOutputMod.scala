package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreCloudFunctionConfigurationMod._UnmarshalledCloudFunctionConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreQueueConfigurationDeprecatedMod._UnmarshalledQueueConfigurationDeprecated
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreTopicConfigurationDeprecatedMod._UnmarshalledTopicConfigurationDeprecated
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketNotificationOutput", JSImport.Namespace)
@js.native
object typesGetBucketNotificationOutputMod extends js.Object {
  @js.native
  trait GetBucketNotificationOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _CloudFunctionConfiguration shape
      */
    var CloudFunctionConfiguration: js.UndefOr[_UnmarshalledCloudFunctionConfiguration] = js.native
    /**
      * _QueueConfigurationDeprecated shape
      */
    var QueueConfiguration: js.UndefOr[_UnmarshalledQueueConfigurationDeprecated] = js.native
    /**
      * _TopicConfigurationDeprecated shape
      */
    var TopicConfiguration: js.UndefOr[_UnmarshalledTopicConfigurationDeprecated] = js.native
  }
  
}

