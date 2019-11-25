package typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketNotificationOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketNotificationOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketNotificationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketNotificationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutBucketNotificationOutput]
  }
}

