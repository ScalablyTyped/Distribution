package typings.awsSdkClientS3Node.typesDeleteBucketPolicyOutputMod

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBucketPolicyOutput
  extends MetadataBearer
     with _OutputTypesUnion

object DeleteBucketPolicyOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketPolicyOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBucketPolicyOutput]
  }
}

