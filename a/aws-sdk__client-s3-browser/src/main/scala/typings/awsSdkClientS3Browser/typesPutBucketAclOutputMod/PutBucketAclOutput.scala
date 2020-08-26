package typings.awsSdkClientS3Browser.typesPutBucketAclOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketAclOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketAclOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketAclOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketAclOutput]
  }
}

