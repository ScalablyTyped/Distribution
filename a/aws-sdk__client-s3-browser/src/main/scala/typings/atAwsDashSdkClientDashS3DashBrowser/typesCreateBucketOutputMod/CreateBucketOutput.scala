package typings.atAwsDashSdkClientDashS3DashBrowser.typesCreateBucketOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBucketOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _Location shape
    */
  var Location: js.UndefOr[String] = js.undefined
}

object CreateBucketOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Location: String = null): CreateBucketOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (Location != null) __obj.updateDynamic("Location")(Location)
    __obj.asInstanceOf[CreateBucketOutput]
  }
}

