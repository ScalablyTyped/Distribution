package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageModel extends js.Object {
  
  /**
    * The Amazon Transcribe standard language model, or base model used to create the custom language model.
    */
  var BaseModelName: js.UndefOr[typings.awsSdk.transcribeserviceMod.BaseModelName] = js.native
  
  /**
    * The time the custom language model was created.
    */
  var CreateTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The reason why the custom language model couldn't be created.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.transcribeserviceMod.FailureReason] = js.native
  
  /**
    * The data access role and Amazon S3 prefixes for the input files used to train the custom language model.
    */
  var InputDataConfig: js.UndefOr[typings.awsSdk.transcribeserviceMod.InputDataConfig] = js.native
  
  /**
    * The language code you used to create your custom language model.
    */
  var LanguageCode: js.UndefOr[CLMLanguageCode] = js.native
  
  /**
    * The most recent time the custom language model was modified.
    */
  var LastModifiedTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The name of the custom language model.
    */
  var ModelName: js.UndefOr[typings.awsSdk.transcribeserviceMod.ModelName] = js.native
  
  /**
    * The creation status of a custom language model. When the status is COMPLETED the model is ready for use.
    */
  var ModelStatus: js.UndefOr[typings.awsSdk.transcribeserviceMod.ModelStatus] = js.native
  
  /**
    * Whether the base model used for the custom language model is up to date. If this field is true then you are running the most up-to-date version of the base model in your custom language model.
    */
  var UpgradeAvailability: js.UndefOr[Boolean] = js.native
}
object LanguageModel {
  
  @scala.inline
  def apply(): LanguageModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageModel]
  }
  
  @scala.inline
  implicit class LanguageModelOps[Self <: LanguageModel] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: DateTime): Self = this.set("CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("CreateTime", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    
    @scala.inline
    def setInputDataConfig(value: InputDataConfig): Self = this.set("InputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputDataConfig: Self = this.set("InputDataConfig", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: CLMLanguageCode): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("LanguageCode", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: DateTime): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    
    @scala.inline
    def setModelName(value: ModelName): Self = this.set("ModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelName: Self = this.set("ModelName", js.undefined)
    
    @scala.inline
    def setModelStatus(value: ModelStatus): Self = this.set("ModelStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelStatus: Self = this.set("ModelStatus", js.undefined)
    
    @scala.inline
    def setUpgradeAvailability(value: Boolean): Self = this.set("UpgradeAvailability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpgradeAvailability: Self = this.set("UpgradeAvailability", js.undefined)
  }
}
