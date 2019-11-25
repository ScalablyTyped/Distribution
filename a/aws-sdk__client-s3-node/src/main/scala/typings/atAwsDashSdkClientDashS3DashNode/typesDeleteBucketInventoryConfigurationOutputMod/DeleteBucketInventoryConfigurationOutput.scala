package typings.atAwsDashSdkClientDashS3DashNode.typesDeleteBucketInventoryConfigurationOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBucketInventoryConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion

object DeleteBucketInventoryConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketInventoryConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBucketInventoryConfigurationOutput]
  }
}

