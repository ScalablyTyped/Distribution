package typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketInventoryConfigurationOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketInventoryConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketInventoryConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketInventoryConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutBucketInventoryConfigurationOutput]
  }
}

