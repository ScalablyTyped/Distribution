package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreTagMod._UnmarshalledTag
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketTaggingOutput", JSImport.Namespace)
@js.native
object typesGetBucketTaggingOutputMod extends js.Object {
  @js.native
  trait GetBucketTaggingOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _TagSet shape
      */
    var TagSet: js.Array[_UnmarshalledTag] = js.native
  }
  
}

