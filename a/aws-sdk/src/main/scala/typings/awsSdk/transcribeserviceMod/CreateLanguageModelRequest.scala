package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLanguageModelRequest extends js.Object {
  
  /**
    * The Amazon Transcribe standard language model, or base model used to create your custom language model. If you want to use your custom language model to transcribe audio with a sample rate of 16 kHz or greater, choose Wideband. If you want to use your custom language model to transcribe audio with a sample rate that is less than 16 kHz, choose Narrowband.
    */
  var BaseModelName: typings.awsSdk.transcribeserviceMod.BaseModelName = js.native
  
  /**
    * Contains the data access role and the Amazon S3 prefixes to read the required input files to create a custom language model.
    */
  var InputDataConfig: typings.awsSdk.transcribeserviceMod.InputDataConfig = js.native
  
  /**
    * The language of the input text you're using to train your custom language model.
    */
  var LanguageCode: CLMLanguageCode = js.native
  
  /**
    * The name you choose for your custom language model when you create it.
    */
  var ModelName: typings.awsSdk.transcribeserviceMod.ModelName = js.native
}
object CreateLanguageModelRequest {
  
  @scala.inline
  def apply(
    BaseModelName: BaseModelName,
    InputDataConfig: InputDataConfig,
    LanguageCode: CLMLanguageCode,
    ModelName: ModelName
  ): CreateLanguageModelRequest = {
    val __obj = js.Dynamic.literal(BaseModelName = BaseModelName.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], LanguageCode = LanguageCode.asInstanceOf[js.Any], ModelName = ModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLanguageModelRequest]
  }
  
  @scala.inline
  implicit class CreateLanguageModelRequestOps[Self <: CreateLanguageModelRequest] (val x: Self) extends AnyVal {
    
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
    def setInputDataConfig(value: InputDataConfig): Self = this.set("InputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCode(value: CLMLanguageCode): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelName(value: ModelName): Self = this.set("ModelName", value.asInstanceOf[js.Any])
  }
}
