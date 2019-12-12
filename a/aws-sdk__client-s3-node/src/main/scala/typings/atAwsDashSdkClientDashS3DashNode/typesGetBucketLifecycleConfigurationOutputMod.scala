package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreLifecycleRuleMod._UnmarshalledLifecycleRule
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketLifecycleConfigurationOutput", JSImport.Namespace)
@js.native
object typesGetBucketLifecycleConfigurationOutputMod extends js.Object {
  @js.native
  trait GetBucketLifecycleConfigurationOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _LifecycleRules shape
      */
    var Rules: js.UndefOr[js.Array[_UnmarshalledLifecycleRule]] = js.native
  }
  
}

