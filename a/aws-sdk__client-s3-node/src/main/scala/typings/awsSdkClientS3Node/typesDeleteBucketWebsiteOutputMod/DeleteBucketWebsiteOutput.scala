package typings.awsSdkClientS3Node.typesDeleteBucketWebsiteOutputMod

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBucketWebsiteOutput
  extends MetadataBearer
     with _OutputTypesUnion

object DeleteBucketWebsiteOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketWebsiteOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketWebsiteOutput]
  }
}

