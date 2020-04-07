package typings.awsSdkClientS3Browser.typesPutBucketVersioningOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketVersioningOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketVersioningOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketVersioningOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutBucketVersioningOutput]
  }
}

