package typings.awsSdkClientS3Node.typesHeadBucketOutputMod

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadBucketOutput
  extends MetadataBearer
     with _OutputTypesUnion

object HeadBucketOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): HeadBucketOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeadBucketOutput]
  }
}

