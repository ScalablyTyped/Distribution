package typings.awsSdkClientS3Browser.typesPutBucketAnalyticsConfigurationOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketAnalyticsConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketAnalyticsConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketAnalyticsConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketAnalyticsConfigurationOutput]
  }
}

