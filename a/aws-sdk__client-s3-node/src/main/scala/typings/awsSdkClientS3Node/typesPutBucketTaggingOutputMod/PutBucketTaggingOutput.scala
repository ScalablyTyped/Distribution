package typings.awsSdkClientS3Node.typesPutBucketTaggingOutputMod

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketTaggingOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketTaggingOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketTaggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketTaggingOutput]
  }
}

