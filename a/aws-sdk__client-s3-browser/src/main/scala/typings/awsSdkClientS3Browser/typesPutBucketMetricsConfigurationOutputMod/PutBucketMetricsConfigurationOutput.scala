package typings.awsSdkClientS3Browser.typesPutBucketMetricsConfigurationOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
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

