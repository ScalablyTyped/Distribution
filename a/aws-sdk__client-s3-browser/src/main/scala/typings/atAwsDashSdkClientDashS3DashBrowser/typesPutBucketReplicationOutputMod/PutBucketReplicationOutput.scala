package typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketReplicationOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketReplicationOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketReplicationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketReplicationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
  
    __obj.asInstanceOf[PutBucketReplicationOutput]
  }
}

