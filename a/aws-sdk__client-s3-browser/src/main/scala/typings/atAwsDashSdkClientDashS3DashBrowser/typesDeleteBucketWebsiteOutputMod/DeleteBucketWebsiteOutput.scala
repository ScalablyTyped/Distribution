package typings.atAwsDashSdkClientDashS3DashBrowser.typesDeleteBucketWebsiteOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBucketWebsiteOutput
  extends MetadataBearer
     with _OutputTypesUnion

object DeleteBucketWebsiteOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketWebsiteOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
  
    __obj.asInstanceOf[DeleteBucketWebsiteOutput]
  }
}

