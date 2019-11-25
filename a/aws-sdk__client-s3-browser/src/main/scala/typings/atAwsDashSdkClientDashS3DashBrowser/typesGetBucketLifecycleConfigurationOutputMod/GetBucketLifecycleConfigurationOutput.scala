package typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketLifecycleConfigurationOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreLifecycleRuleMod._UnmarshalledLifecycleRule
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketLifecycleConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _LifecycleRules shape
    */
  var Rules: js.UndefOr[js.Array[_UnmarshalledLifecycleRule]] = js.undefined
}

object GetBucketLifecycleConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Rules: js.Array[_UnmarshalledLifecycleRule] = null): GetBucketLifecycleConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Rules != null) __obj.updateDynamic("Rules")(Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketLifecycleConfigurationOutput]
  }
}

