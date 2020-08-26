package typings.awsSdkClientS3Browser.typesGetBucketMetricsConfigurationOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesMetricsConfigurationMod.UnmarshalledMetricsConfiguration
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketMetricsConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Specifies the metrics configuration.</p>
    */
  var MetricsConfiguration: js.UndefOr[UnmarshalledMetricsConfiguration] = js.native
}

object GetBucketMetricsConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetBucketMetricsConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketMetricsConfigurationOutput]
  }
  @scala.inline
  implicit class GetBucketMetricsConfigurationOutputOps[Self <: GetBucketMetricsConfigurationOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMetricsConfiguration(value: UnmarshalledMetricsConfiguration): Self = this.set("MetricsConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricsConfiguration: Self = this.set("MetricsConfiguration", js.undefined)
  }
  
}

