package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreRuleMod._UnmarshalledRule
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketLifecycleOutput", JSImport.Namespace)
@js.native
object typesGetBucketLifecycleOutputMod extends js.Object {
  @js.native
  trait GetBucketLifecycleOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _Rules shape
      */
    var Rules: js.UndefOr[js.Array[_UnmarshalledRule]] = js.native
  }
  
}

