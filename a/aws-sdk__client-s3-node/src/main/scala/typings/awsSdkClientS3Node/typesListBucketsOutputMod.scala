package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Node.typesBucketMod.UnmarshalledBucket
import typings.awsSdkClientS3Node.typesOwnerMod.UnmarshalledOwner
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/ListBucketsOutput", JSImport.Namespace)
@js.native
object typesListBucketsOutputMod extends js.Object {
  @js.native
  trait ListBucketsOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _Buckets shape
      */
    var Buckets: js.UndefOr[js.Array[UnmarshalledBucket]] = js.native
    /**
      * _Owner shape
      */
    var Owner: js.UndefOr[UnmarshalledOwner] = js.native
  }
  
}

