package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataCaptureConfig extends StObject {
  
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
  implicit class DataCaptureConfigMutableBuilder[Self <: DataCaptureConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptureContentTypeHeader(value: CaptureContentTypeHeader): Self = StObject.set(x, "CaptureContentTypeHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureContentTypeHeaderUndefined: Self = StObject.set(x, "CaptureContentTypeHeader", js.undefined)
    
    @scala.inline
    def setCaptureOptions(value: CaptureOptionList): Self = StObject.set(x, "CaptureOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureOptionsVarargs(value: CaptureOption*): Self = StObject.set(x, "CaptureOptions", js.Array(value :_*))
    
    @scala.inline
    def setDestinationS3Uri(value: DestinationS3Uri): Self = StObject.set(x, "DestinationS3Uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCapture(value: EnableCapture): Self = StObject.set(x, "EnableCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCaptureUndefined: Self = StObject.set(x, "EnableCapture", js.undefined)
    
    @scala.inline
    def setInitialSamplingPercentage(value: SamplingPercentage): Self = StObject.set(x, "InitialSamplingPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
  }
}
