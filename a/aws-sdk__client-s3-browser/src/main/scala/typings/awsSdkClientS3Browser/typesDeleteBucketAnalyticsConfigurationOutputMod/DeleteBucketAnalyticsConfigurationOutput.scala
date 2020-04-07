package typings.awsSdkClientS3Browser.typesDeleteBucketAnalyticsConfigurationOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
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

