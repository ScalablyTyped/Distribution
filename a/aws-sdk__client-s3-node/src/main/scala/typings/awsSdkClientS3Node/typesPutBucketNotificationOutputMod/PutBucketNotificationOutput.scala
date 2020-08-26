package typings.awsSdkClientS3Node.typesPutBucketNotificationOutputMod

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketNotificationOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketNotificationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketNotificationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketNotificationOutput]
  }
}

