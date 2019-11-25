package typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketLoggingOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketLoggingOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketLoggingOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketLoggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutBucketLoggingOutput]
  }
}

