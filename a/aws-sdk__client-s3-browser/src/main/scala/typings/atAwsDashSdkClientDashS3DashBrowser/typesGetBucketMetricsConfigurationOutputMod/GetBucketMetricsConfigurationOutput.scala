package typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketMetricsConfigurationOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreMetricsConfigurationMod._UnmarshalledMetricsConfiguration
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketMetricsConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Specifies the metrics configuration.</p>
    */
  var MetricsConfiguration: js.UndefOr[_UnmarshalledMetricsConfiguration] = js.undefined
}

object GetBucketMetricsConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, MetricsConfiguration: _UnmarshalledMetricsConfiguration = null): GetBucketMetricsConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (MetricsConfiguration != null) __obj.updateDynamic("MetricsConfiguration")(MetricsConfiguration)
    __obj.asInstanceOf[GetBucketMetricsConfigurationOutput]
  }
}

