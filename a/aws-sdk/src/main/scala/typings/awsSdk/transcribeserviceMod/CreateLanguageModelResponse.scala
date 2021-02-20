package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLanguageModelResponse extends StObject {
  
  /**
    * The Amazon Transcribe standard language model, or base model you've used to create a custom language model.
    */
  var BaseModelName: js.UndefOr[typings.awsSdk.transcribeserviceMod.BaseModelName] = js.native
  
  /**
    * The data access role and Amazon S3 prefixes you've chosen to create your custom language model.
    */
  var InputDataConfig: js.UndefOr[typings.awsSdk.transcribeserviceMod.InputDataConfig] = js.native
  
  /**
    * The language code of the text you've used to create a custom language model.
    */
  var LanguageCode: js.UndefOr[CLMLanguageCode] = js.native
  
  /**
    * The name you've chosen for your custom language model.
    */
  var ModelName: js.UndefOr[typings.awsSdk.transcribeserviceMod.ModelName] = js.native
  
  /**
    * The status of the custom language model. When the status is COMPLETED the model is ready to use.
    */
  var ModelStatus: js.UndefOr[typings.awsSdk.transcribeserviceMod.ModelStatus] = js.native
}
object CreateLanguageModelResponse {
  
  @scala.inline
  def apply(): CreateLanguageModelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLanguageModelResponse]
  }
  
  @scala.inline
  implicit class CreateLanguageModelResponseMutableBuilder[Self <: CreateLanguageModelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseModelName(value: BaseModelName): Self = StObject.set(x, "BaseModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseModelNameUndefined: Self = StObject.set(x, "BaseModelName", js.undefined)
    
    @scala.inline
    def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDataConfigUndefined: Self = StObject.set(x, "InputDataConfig", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: CLMLanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    @scala.inline
    def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelNameUndefined: Self = StObject.set(x, "ModelName", js.undefined)
    
    @scala.inline
    def setModelStatus(value: ModelStatus): Self = StObject.set(x, "ModelStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelStatusUndefined: Self = StObject.set(x, "ModelStatus", js.undefined)
  }
}
