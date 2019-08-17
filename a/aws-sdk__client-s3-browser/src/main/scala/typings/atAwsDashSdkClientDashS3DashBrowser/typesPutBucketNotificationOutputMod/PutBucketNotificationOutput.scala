package typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketNotificationOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
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
    val __obj = js.Dynamic.literal($metadata = $metadata)
  
    __obj.asInstanceOf[PutBucketNotificationOutput]
  }
}

