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
    InitialSamplingPercentage: SamplingPercentage
  ): DataCaptureConfig = {
    val __obj = js.Dynamic.literal(CaptureOptions = CaptureOptions.asInstanceOf[js.Any], DestinationS3Uri = DestinationS3Uri.asInstanceOf[js.Any], InitialSamplingPercentage = InitialSamplingPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCaptureConfig]
  }
  @scala.inline
  implicit class DataCaptureConfigOps[Self <: DataCaptureConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCaptureOptionsVarargs(value: CaptureOption*): Self = this.set("CaptureOptions", js.Array(value :_*))
    @scala.inline
    def setCaptureOptions(value: CaptureOptionList): Self = this.set("CaptureOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationS3Uri(value: DestinationS3Uri): Self = this.set("DestinationS3Uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialSamplingPercentage(value: SamplingPercentage): Self = this.set("InitialSamplingPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaptureContentTypeHeader(value: CaptureContentTypeHeader): Self = this.set("CaptureContentTypeHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptureContentTypeHeader: Self = this.set("CaptureContentTypeHeader", js.undefined)
    @scala.inline
    def setEnableCapture(value: EnableCapture): Self = this.set("EnableCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCapture: Self = this.set("EnableCapture", js.undefined)
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
  }
  
}

