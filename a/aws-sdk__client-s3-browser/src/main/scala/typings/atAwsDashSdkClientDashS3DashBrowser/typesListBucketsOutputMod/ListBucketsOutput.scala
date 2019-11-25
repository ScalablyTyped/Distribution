package typings.atAwsDashSdkClientDashS3DashBrowser.typesListBucketsOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreBucketMod._UnmarshalledBucket
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreOwnerMod._UnmarshalledOwner
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBucketsOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _Buckets shape
    */
  var Buckets: js.UndefOr[js.Array[_UnmarshalledBucket]] = js.undefined
  /**
    * _Owner shape
    */
  var Owner: js.UndefOr[_UnmarshalledOwner] = js.undefined
}

object ListBucketsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Buckets: js.Array[_UnmarshalledBucket] = null,
    Owner: _UnmarshalledOwner = null
  ): ListBucketsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Buckets != null) __obj.updateDynamic("Buckets")(Buckets.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBucketsOutput]
  }
}

