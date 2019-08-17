package typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketPolicyOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketPolicyOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketPolicyOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketPolicyOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
  
    __obj.asInstanceOf[PutBucketPolicyOutput]
  }
}

