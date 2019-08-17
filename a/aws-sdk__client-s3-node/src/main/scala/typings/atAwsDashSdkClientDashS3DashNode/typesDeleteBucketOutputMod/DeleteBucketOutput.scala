package typings.atAwsDashSdkClientDashS3DashNode.typesDeleteBucketOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBucketOutput
  extends MetadataBearer
     with _OutputTypesUnion

object DeleteBucketOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
  
    __obj.asInstanceOf[DeleteBucketOutput]
  }
}

