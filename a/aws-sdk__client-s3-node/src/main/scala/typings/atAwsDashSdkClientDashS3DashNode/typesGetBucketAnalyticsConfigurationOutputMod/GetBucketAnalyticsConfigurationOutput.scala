package typings.atAwsDashSdkClientDashS3DashNode.typesGetBucketAnalyticsConfigurationOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreAnalyticsConfigurationMod._UnmarshalledAnalyticsConfiguration
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketAnalyticsConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>The configuration and any analyses for the analytics filter.</p>
    */
  var AnalyticsConfiguration: js.UndefOr[_UnmarshalledAnalyticsConfiguration] = js.undefined
}

object GetBucketAnalyticsConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, AnalyticsConfiguration: _UnmarshalledAnalyticsConfiguration = null): GetBucketAnalyticsConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (AnalyticsConfiguration != null) __obj.updateDynamic("AnalyticsConfiguration")(AnalyticsConfiguration)
    __obj.asInstanceOf[GetBucketAnalyticsConfigurationOutput]
  }
}

