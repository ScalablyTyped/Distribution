package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Node.typesRuleMod.UnmarshalledRule
import typings.awsSdkTypes.responseMod.MetadataBearer
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
    var Rules: js.UndefOr[js.Array[UnmarshalledRule]] = js.native
  }
  
}

