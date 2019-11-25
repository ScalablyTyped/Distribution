package typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketRequestPaymentOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketRequestPaymentOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketRequestPaymentOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketRequestPaymentOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutBucketRequestPaymentOutput]
  }
}

