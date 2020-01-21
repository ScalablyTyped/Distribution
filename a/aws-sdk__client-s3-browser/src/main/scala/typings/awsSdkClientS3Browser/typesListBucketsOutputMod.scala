package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesBucketMod.UnmarshalledBucket
import typings.awsSdkClientS3Browser.typesOwnerMod.UnmarshalledOwner
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/types/ListBucketsOutput", JSImport.Namespace)
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

