package typings.awsSdkClientS3Browser.typesPutBucketCorsOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketCorsOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketCorsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketCorsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutBucketCorsOutput]
  }
}

