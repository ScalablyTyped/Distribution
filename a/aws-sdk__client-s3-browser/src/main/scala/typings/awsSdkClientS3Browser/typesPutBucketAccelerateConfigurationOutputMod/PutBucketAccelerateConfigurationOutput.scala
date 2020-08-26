package typings.awsSdkClientS3Browser.typesPutBucketAccelerateConfigurationOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketAccelerateConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketAccelerateConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketAccelerateConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketAccelerateConfigurationOutput]
  }
}

