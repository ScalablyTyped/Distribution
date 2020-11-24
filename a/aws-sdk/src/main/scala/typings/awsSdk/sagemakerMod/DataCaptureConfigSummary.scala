package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataCaptureConfigSummary extends js.Object {
  
  /**
    * 
    */
  var CaptureStatus: typings.awsSdk.sagemakerMod.CaptureStatus = js.native
  
  /**
    * 
    */
  var CurrentSamplingPercentage: SamplingPercentage = js.native
  
  /**
    * 
    */
  var DestinationS3Uri: typings.awsSdk.sagemakerMod.DestinationS3Uri = js.native
  
  /**
    * 
    */
  var EnableCapture: typings.awsSdk.sagemakerMod.EnableCapture = js.native
  
  /**
    * 
    */
  var KmsKeyId: typings.awsSdk.sagemakerMod.KmsKeyId = js.native
}
object DataCaptureConfigSummary {
  
  @scala.inline
  def apply(
    CaptureStatus: CaptureStatus,
    CurrentSamplingPercentage: SamplingPercentage,
    DestinationS3Uri: DestinationS3Uri,
    EnableCapture: EnableCapture,
    KmsKeyId: KmsKeyId
  ): DataCaptureConfigSummary = {
    val __obj = js.Dynamic.literal(CaptureStatus = CaptureStatus.asInstanceOf[js.Any], CurrentSamplingPercentage = CurrentSamplingPercentage.asInstanceOf[js.Any], DestinationS3Uri = DestinationS3Uri.asInstanceOf[js.Any], EnableCapture = EnableCapture.asInstanceOf[js.Any], KmsKeyId = KmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCaptureConfigSummary]
  }
  
  @scala.inline
  implicit class DataCaptureConfigSummaryOps[Self <: DataCaptureConfigSummary] (val x: Self) extends AnyVal {
    
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
    def setCaptureStatus(value: CaptureStatus): Self = this.set("CaptureStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentSamplingPercentage(value: SamplingPercentage): Self = this.set("CurrentSamplingPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationS3Uri(value: DestinationS3Uri): Self = this.set("DestinationS3Uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCapture(value: EnableCapture): Self = this.set("EnableCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
  }
}
