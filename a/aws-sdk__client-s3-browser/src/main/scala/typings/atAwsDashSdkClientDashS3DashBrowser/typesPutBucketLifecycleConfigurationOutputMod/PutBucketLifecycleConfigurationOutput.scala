package typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketLifecycleConfigurationOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketLifecycleConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketLifecycleConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketLifecycleConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutBucketLifecycleConfigurationOutput]
  }
}

