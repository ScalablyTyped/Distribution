package typings.awsSdkClientS3Browser.typesPutBucketInventoryConfigurationOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketInventoryConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketInventoryConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketInventoryConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketInventoryConfigurationOutput]
  }
}

