package typings.atAwsDashSdkClientDashS3DashBrowser.typesDeleteBucketEncryptionOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBucketEncryptionOutput
  extends MetadataBearer
     with _OutputTypesUnion

object DeleteBucketEncryptionOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): DeleteBucketEncryptionOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBucketEncryptionOutput]
  }
}

