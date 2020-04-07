package typings.awsSdkClientS3Node.typesDeleteBucketReplicationOutputMod

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBucketReplicationOutput
  extends MetadataBearer
     with _OutputTypesUnion

object DeleteBucketReplicationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketReplicationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBucketReplicationOutput]
  }
}

