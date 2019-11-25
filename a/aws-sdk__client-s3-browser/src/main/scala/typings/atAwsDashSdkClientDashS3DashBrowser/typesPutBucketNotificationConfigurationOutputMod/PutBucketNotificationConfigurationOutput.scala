package typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketNotificationConfigurationOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketNotificationConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketNotificationConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketNotificationConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutBucketNotificationConfigurationOutput]
  }
}

