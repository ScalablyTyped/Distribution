package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageModel extends StObject {
  
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
  implicit class LanguageModelMutableBuilder[Self <: LanguageModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseModelName(value: BaseModelName): Self = StObject.set(x, "BaseModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseModelNameUndefined: Self = StObject.set(x, "BaseModelName", js.undefined)
    
    @scala.inline
    def setCreateTime(value: DateTime): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDataConfigUndefined: Self = StObject.set(x, "InputDataConfig", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: CLMLanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: DateTime): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelNameUndefined: Self = StObject.set(x, "ModelName", js.undefined)
    
    @scala.inline
    def setModelStatus(value: ModelStatus): Self = StObject.set(x, "ModelStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelStatusUndefined: Self = StObject.set(x, "ModelStatus", js.undefined)
    
    @scala.inline
    def setUpgradeAvailability(value: Boolean): Self = StObject.set(x, "UpgradeAvailability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgradeAvailabilityUndefined: Self = StObject.set(x, "UpgradeAvailability", js.undefined)
  }
}
