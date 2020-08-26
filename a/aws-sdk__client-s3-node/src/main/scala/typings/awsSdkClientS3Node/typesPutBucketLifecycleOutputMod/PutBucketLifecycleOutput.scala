package typings.awsSdkClientS3Node.typesPutBucketLifecycleOutputMod

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketLifecycleOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketLifecycleOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketLifecycleOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketLifecycleOutput]
  }
}

