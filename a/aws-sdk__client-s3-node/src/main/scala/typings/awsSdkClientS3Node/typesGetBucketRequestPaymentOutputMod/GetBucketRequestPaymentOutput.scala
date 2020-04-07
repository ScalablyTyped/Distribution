package typings.awsSdkClientS3Node.typesGetBucketRequestPaymentOutputMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BucketOwner
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Requester
import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Payer != null) __obj.updateDynamic("Payer")(Payer.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketRequestPaymentOutput]
  }
}

