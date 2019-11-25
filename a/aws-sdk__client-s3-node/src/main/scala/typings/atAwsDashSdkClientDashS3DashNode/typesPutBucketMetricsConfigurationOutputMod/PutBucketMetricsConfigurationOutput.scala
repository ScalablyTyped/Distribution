package typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketMetricsConfigurationOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
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
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutBucketMetricsConfigurationOutput]
  }
}

