package typings.awsSdkClientS3Browser.typesDeleteBucketCorsOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBucketCorsOutput
  extends MetadataBearer
     with _OutputTypesUnion

object DeleteBucketCorsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketCorsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBucketCorsOutput]
  }
}

