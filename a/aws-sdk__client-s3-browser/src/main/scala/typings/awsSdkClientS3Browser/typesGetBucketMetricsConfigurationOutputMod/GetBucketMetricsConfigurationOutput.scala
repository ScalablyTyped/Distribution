package typings.awsSdkClientS3Browser.typesGetBucketMetricsConfigurationOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesMetricsConfigurationMod.UnmarshalledMetricsConfiguration
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketMetricsConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Specifies the metrics configuration.</p>
    */
  var MetricsConfiguration: js.UndefOr[UnmarshalledMetricsConfiguration] = js.undefined
}

object GetBucketMetricsConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, MetricsConfiguration: UnmarshalledMetricsConfiguration = null): GetBucketMetricsConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (MetricsConfiguration != null) __obj.updateDynamic("MetricsConfiguration")(MetricsConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketMetricsConfigurationOutput]
  }
}

