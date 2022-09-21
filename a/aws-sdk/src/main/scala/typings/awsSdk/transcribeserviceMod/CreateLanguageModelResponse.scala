package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLanguageModelResponse extends StObject {
  
  /**
    * The Amazon Transcribe standard language model, or base model, you specified when creating your custom language model.
    */
  var BaseModelName: js.UndefOr[typings.awsSdk.transcribeserviceMod.BaseModelName] = js.undefined
  
  /**
    * Lists your data access role ARN (Amazon Resource Name) and the Amazon S3 locations you provided for your training (S3Uri) and tuning (TuningDataS3Uri) data.
    */
  var InputDataConfig: js.UndefOr[typings.awsSdk.transcribeserviceMod.InputDataConfig] = js.undefined
  
  /**
    * The language code you selected for your custom language model.
    */
  var LanguageCode: js.UndefOr[CLMLanguageCode] = js.undefined
  
  /**
    * The name of your custom language model.
    */
  var ModelName: js.UndefOr[typings.awsSdk.transcribeserviceMod.ModelName] = js.undefined
  
  /**
    * The status of your custom language model. When the status displays as COMPLETED, your model is ready to use.
    */
  var ModelStatus: js.UndefOr[typings.awsSdk.transcribeserviceMod.ModelStatus] = js.undefined
}
object CreateLanguageModelResponse {
  
  inline def apply(): CreateLanguageModelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLanguageModelResponse]
  }
  
  extension [Self <: CreateLanguageModelResponse](x: Self) {
    
    inline def setBaseModelName(value: BaseModelName): Self = StObject.set(x, "BaseModelName", value.asInstanceOf[js.Any])
    
    inline def setBaseModelNameUndefined: Self = StObject.set(x, "BaseModelName", js.undefined)
    
    inline def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfigUndefined: Self = StObject.set(x, "InputDataConfig", js.undefined)
    
    inline def setLanguageCode(value: CLMLanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setModelNameUndefined: Self = StObject.set(x, "ModelName", js.undefined)
    
    inline def setModelStatus(value: ModelStatus): Self = StObject.set(x, "ModelStatus", value.asInstanceOf[js.Any])
    
    inline def setModelStatusUndefined: Self = StObject.set(x, "ModelStatus", js.undefined)
  }
}
