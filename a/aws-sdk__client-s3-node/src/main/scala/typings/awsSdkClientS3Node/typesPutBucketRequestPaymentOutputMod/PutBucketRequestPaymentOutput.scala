package typings.awsSdkClientS3Node.typesPutBucketRequestPaymentOutputMod

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketRequestPaymentOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketRequestPaymentOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketRequestPaymentOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketRequestPaymentOutput]
  }
}

