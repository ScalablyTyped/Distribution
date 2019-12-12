package typings.atAwsDashSdkClientDashS3DashBrowser

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreBucketMod._UnmarshalledBucket
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreOwnerMod._UnmarshalledOwner
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
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
    var Buckets: js.UndefOr[js.Array[_UnmarshalledBucket]] = js.native
    /**
      * _Owner shape
      */
    var Owner: js.UndefOr[_UnmarshalledOwner] = js.native
  }
  
}

