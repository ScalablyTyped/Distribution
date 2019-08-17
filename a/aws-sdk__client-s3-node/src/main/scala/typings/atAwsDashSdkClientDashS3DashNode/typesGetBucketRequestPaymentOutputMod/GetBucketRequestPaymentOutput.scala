package typings.atAwsDashSdkClientDashS3DashNode.typesGetBucketRequestPaymentOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.BucketOwner
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.Requester
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketRequestPaymentOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Specifies who pays for the download and request fees.</p>
    */
  var Payer: js.UndefOr[Requester | BucketOwner | String] = js.undefined
}

object GetBucketRequestPaymentOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Payer: Requester | BucketOwner | String = null): GetBucketRequestPaymentOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (Payer != null) __obj.updateDynamic("Payer")(Payer.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketRequestPaymentOutput]
  }
}

