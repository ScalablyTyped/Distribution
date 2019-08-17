package typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketEncryptionOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketEncryptionOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketEncryptionOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketEncryptionOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
  
    __obj.asInstanceOf[PutBucketEncryptionOutput]
  }
}

