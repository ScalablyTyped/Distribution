package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLanguageModelResponse extends js.Object {
  
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
  implicit class CreateLanguageModelResponseOps[Self <: CreateLanguageModelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBaseModelName(value: BaseModelName): Self = this.set("BaseModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseModelName: Self = this.set("BaseModelName", js.undefined)
    
    @scala.inline
    def setInputDataConfig(value: InputDataConfig): Self = this.set("InputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputDataConfig: Self = this.set("InputDataConfig", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: CLMLanguageCode): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("LanguageCode", js.undefined)
    
    @scala.inline
    def setModelName(value: ModelName): Self = this.set("ModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelName: Self = this.set("ModelName", js.undefined)
    
    @scala.inline
    def setModelStatus(value: ModelStatus): Self = this.set("ModelStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelStatus: Self = this.set("ModelStatus", js.undefined)
  }
}
