package typings.atAwsDashSdkClientDashS3DashBrowser.typesHeadBucketOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadBucketOutput
  extends MetadataBearer
     with _OutputTypesUnion

object HeadBucketOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): HeadBucketOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
  
    __obj.asInstanceOf[HeadBucketOutput]
  }
}

