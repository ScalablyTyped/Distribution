package typings.atAwsDashSdkClientDashS3DashNode.typesDeleteBucketCorsOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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

