package typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketLifecycleOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketLifecycleOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketLifecycleOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketLifecycleOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutBucketLifecycleOutput]
  }
}

