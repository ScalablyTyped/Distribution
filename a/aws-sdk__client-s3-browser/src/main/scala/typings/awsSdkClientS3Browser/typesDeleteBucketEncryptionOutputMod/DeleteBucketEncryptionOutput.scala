package typings.awsSdkClientS3Browser.typesDeleteBucketEncryptionOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

