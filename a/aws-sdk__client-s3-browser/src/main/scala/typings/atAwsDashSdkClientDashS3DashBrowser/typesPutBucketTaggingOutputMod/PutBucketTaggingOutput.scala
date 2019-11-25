package typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketTaggingOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
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
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutBucketTaggingOutput]
  }
}

