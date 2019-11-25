package typings.atAwsDashSdkClientDashS3DashNode.typesDeleteBucketReplicationOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBucketReplicationOutput
  extends MetadataBearer
     with _OutputTypesUnion

object DeleteBucketReplicationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketReplicationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBucketReplicationOutput]
  }
}

