package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SageMakerMachineLearningModelResourceData extends StObject {
  
  /**
    * The absolute local path of the resource inside the Lambda environment.
    */
  var DestinationPath: js.UndefOr[string] = js.undefined
  
  var OwnerSetting: js.UndefOr[ResourceDownloadOwnerSetting] = js.undefined
  
  /**
    * The ARN of the Amazon SageMaker training job that represents the source model.
    */
  var SageMakerJobArn: js.UndefOr[string] = js.undefined
}
object SageMakerMachineLearningModelResourceData {
  
  @scala.inline
  def apply(): SageMakerMachineLearningModelResourceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SageMakerMachineLearningModelResourceData]
  }
  
  @scala.inline
  implicit class SageMakerMachineLearningModelResourceDataMutableBuilder[Self <: SageMakerMachineLearningModelResourceData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationPath(value: string): Self = StObject.set(x, "DestinationPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationPathUndefined: Self = StObject.set(x, "DestinationPath", js.undefined)
    
    @scala.inline
    def setOwnerSetting(value: ResourceDownloadOwnerSetting): Self = StObject.set(x, "OwnerSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerSettingUndefined: Self = StObject.set(x, "OwnerSetting", js.undefined)
    
    @scala.inline
    def setSageMakerJobArn(value: string): Self = StObject.set(x, "SageMakerJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSageMakerJobArnUndefined: Self = StObject.set(x, "SageMakerJobArn", js.undefined)
  }
}
