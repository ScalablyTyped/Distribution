package typings.awsSdkClientS3Browser.typesDeleteBucketLifecycleOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBucketLifecycleOutput
  extends MetadataBearer
     with _OutputTypesUnion

object DeleteBucketLifecycleOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketLifecycleOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketLifecycleOutput]
  }
}

