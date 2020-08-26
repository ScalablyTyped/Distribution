package typings.awsSdkClientS3Node.typesDeleteBucketEncryptionOutputMod

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketEncryptionOutput
  extends MetadataBearer
     with _OutputTypesUnion

object DeleteBucketEncryptionOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketEncryptionOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketEncryptionOutput]
  }
}

