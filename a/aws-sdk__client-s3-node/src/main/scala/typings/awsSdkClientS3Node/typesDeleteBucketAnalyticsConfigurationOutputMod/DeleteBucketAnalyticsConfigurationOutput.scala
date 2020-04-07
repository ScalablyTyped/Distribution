package typings.awsSdkClientS3Node.typesDeleteBucketAnalyticsConfigurationOutputMod

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBucketAnalyticsConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion

object DeleteBucketAnalyticsConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketAnalyticsConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBucketAnalyticsConfigurationOutput]
  }
}

