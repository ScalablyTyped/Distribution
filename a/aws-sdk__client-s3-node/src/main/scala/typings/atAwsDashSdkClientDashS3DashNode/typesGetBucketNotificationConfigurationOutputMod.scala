package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreLambdaFunctionConfigurationMod._UnmarshalledLambdaFunctionConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreQueueConfigurationMod._UnmarshalledQueueConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreTopicConfigurationMod._UnmarshalledTopicConfiguration
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketNotificationConfigurationOutput", JSImport.Namespace)
@js.native
object typesGetBucketNotificationConfigurationOutputMod extends js.Object {
  @js.native
  trait GetBucketNotificationConfigurationOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _LambdaFunctionConfigurationList shape
      */
    var LambdaFunctionConfigurations: js.UndefOr[js.Array[_UnmarshalledLambdaFunctionConfiguration]] = js.native
    /**
      * _QueueConfigurationList shape
      */
    var QueueConfigurations: js.UndefOr[js.Array[_UnmarshalledQueueConfiguration]] = js.native
    /**
      * _TopicConfigurationList shape
      */
    var TopicConfigurations: js.UndefOr[js.Array[_UnmarshalledTopicConfiguration]] = js.native
  }
  
}

