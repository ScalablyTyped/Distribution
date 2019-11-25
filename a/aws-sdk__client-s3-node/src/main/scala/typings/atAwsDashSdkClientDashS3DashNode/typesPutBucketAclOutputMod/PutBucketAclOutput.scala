package typings.atAwsDashSdkClientDashS3DashNode.typesPutBucketAclOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketAclOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketAclOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketAclOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutBucketAclOutput]
  }
}

