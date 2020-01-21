package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Node.typesCloudFunctionConfigurationMod.UnmarshalledCloudFunctionConfiguration
import typings.awsSdkClientS3Node.typesQueueConfigurationDeprecatedMod.UnmarshalledQueueConfigurationDeprecated
import typings.awsSdkClientS3Node.typesTopicConfigurationDeprecatedMod.UnmarshalledTopicConfigurationDeprecated
import typings.awsSdkTypes.responseMod.MetadataBearer
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
    var CloudFunctionConfiguration: js.UndefOr[UnmarshalledCloudFunctionConfiguration] = js.native
    /**
      * _QueueConfigurationDeprecated shape
      */
    var QueueConfiguration: js.UndefOr[UnmarshalledQueueConfigurationDeprecated] = js.native
    /**
      * _TopicConfigurationDeprecated shape
      */
    var TopicConfiguration: js.UndefOr[UnmarshalledTopicConfigurationDeprecated] = js.native
  }
  
}

