package typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketCorsOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreCORSRuleMod._UnmarshalledCORSRule
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketCorsOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _CORSRules shape
    */
  var CORSRules: js.UndefOr[js.Array[_UnmarshalledCORSRule]] = js.undefined
}

object GetBucketCorsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, CORSRules: js.Array[_UnmarshalledCORSRule] = null): GetBucketCorsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (CORSRules != null) __obj.updateDynamic("CORSRules")(CORSRules)
    __obj.asInstanceOf[GetBucketCorsOutput]
  }
}

