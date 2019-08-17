package typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketLifecycleOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreRuleMod._UnmarshalledRule
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketLifecycleOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _Rules shape
    */
  var Rules: js.UndefOr[js.Array[_UnmarshalledRule]] = js.undefined
}

object GetBucketLifecycleOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Rules: js.Array[_UnmarshalledRule] = null): GetBucketLifecycleOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (Rules != null) __obj.updateDynamic("Rules")(Rules)
    __obj.asInstanceOf[GetBucketLifecycleOutput]
  }
}

