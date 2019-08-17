package typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketMetricsConfigurationOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketMetricsConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketMetricsConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketMetricsConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
  
    __obj.asInstanceOf[PutBucketMetricsConfigurationOutput]
  }
}

