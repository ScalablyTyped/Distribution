package typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketCorsOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketCorsOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketCorsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketCorsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutBucketCorsOutput]
  }
}

