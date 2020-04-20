package typings.awsSdkClientS3Browser.typesPutBucketPolicyOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketPolicyOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketPolicyOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketPolicyOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketPolicyOutput]
  }
}

