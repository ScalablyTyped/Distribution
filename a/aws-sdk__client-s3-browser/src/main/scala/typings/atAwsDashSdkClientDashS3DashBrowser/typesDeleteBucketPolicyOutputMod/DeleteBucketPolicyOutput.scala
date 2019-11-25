package typings.atAwsDashSdkClientDashS3DashBrowser.typesDeleteBucketPolicyOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBucketPolicyOutput
  extends MetadataBearer
     with _OutputTypesUnion

object DeleteBucketPolicyOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketPolicyOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBucketPolicyOutput]
  }
}

