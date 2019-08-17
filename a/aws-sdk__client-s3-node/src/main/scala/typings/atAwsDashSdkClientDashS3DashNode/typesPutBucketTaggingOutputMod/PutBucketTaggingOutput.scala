package typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketTaggingOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketTaggingOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketTaggingOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketTaggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
  
    __obj.asInstanceOf[PutBucketTaggingOutput]
  }
}

