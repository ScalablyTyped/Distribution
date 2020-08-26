package typings.awsSdkClientS3Browser.typesPutBucketEncryptionOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketEncryptionOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketEncryptionOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketEncryptionOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketEncryptionOutput]
  }
}

