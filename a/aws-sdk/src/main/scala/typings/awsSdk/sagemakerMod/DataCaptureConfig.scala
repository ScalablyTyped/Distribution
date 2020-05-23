package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataCaptureConfig extends js.Object {
  /**
    * 
    */
  var CaptureContentTypeHeader: js.UndefOr[typings.awsSdk.sagemakerMod.CaptureContentTypeHeader] = js.native
  /**
    * 
    */
  var CaptureOptions: CaptureOptionList = js.native
  /**
    * 
    */
  var DestinationS3Uri: typings.awsSdk.sagemakerMod.DestinationS3Uri = js.native
  /**
    * 
    */
  var EnableCapture: js.UndefOr[typings.awsSdk.sagemakerMod.EnableCapture] = js.native
  /**
    * 
    */
  var InitialSamplingPercentage: SamplingPercentage = js.native
  /**
    * 
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.sagemakerMod.KmsKeyId] = js.native
}

object DataCaptureConfig {
  @scala.inline
  def apply(
    CaptureOptions: CaptureOptionList,
    DestinationS3Uri: DestinationS3Uri,
    InitialSamplingPercentage: SamplingPercentage,
    CaptureContentTypeHeader: CaptureContentTypeHeader = null,
    EnableCapture: js.UndefOr[EnableCapture] = js.undefined,
    KmsKeyId: KmsKeyId = null
  ): DataCaptureConfig = {
    val __obj = js.Dynamic.literal(CaptureOptions = CaptureOptions.asInstanceOf[js.Any], DestinationS3Uri = DestinationS3Uri.asInstanceOf[js.Any], InitialSamplingPercentage = InitialSamplingPercentage.asInstanceOf[js.Any])
    if (CaptureContentTypeHeader != null) __obj.updateDynamic("CaptureContentTypeHeader")(CaptureContentTypeHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableCapture)) __obj.updateDynamic("EnableCapture")(EnableCapture.get.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCaptureConfig]
  }
}

