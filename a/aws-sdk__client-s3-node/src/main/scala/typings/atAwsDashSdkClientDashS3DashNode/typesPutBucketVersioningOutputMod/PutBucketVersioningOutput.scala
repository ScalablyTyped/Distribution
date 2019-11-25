package typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketVersioningOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketVersioningOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketVersioningOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketVersioningOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutBucketVersioningOutput]
  }
}

