package typings.atAwsDashSdkClientDashS3DashNode.typesDeleteBucketLifecycleOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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

