package typings.awsSdkClientS3Node.typesDeleteBucketOutputMod

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBucketOutput
  extends MetadataBearer
     with _OutputTypesUnion

object DeleteBucketOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketOutput]
  }
}

