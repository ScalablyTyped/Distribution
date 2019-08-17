package typings.atAwsDashSdkClientDashS3DashBrowser.typesDeleteBucketTaggingOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBucketTaggingOutput
  extends MetadataBearer
     with _OutputTypesUnion

object DeleteBucketTaggingOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketTaggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
  
    __obj.asInstanceOf[DeleteBucketTaggingOutput]
  }
}

