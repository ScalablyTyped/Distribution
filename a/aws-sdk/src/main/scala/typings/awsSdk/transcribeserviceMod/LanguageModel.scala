package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageModel extends StObject {
  
  /**
    * The Amazon Transcribe standard language model, or base model used to create the custom language model.
    */
  var BaseModelName: js.UndefOr[typings.awsSdk.transcribeserviceMod.BaseModelName] = js.undefined
  
  /**
    * The time the custom language model was created.
    */
  var CreateTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The reason why the custom language model couldn't be created.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.transcribeserviceMod.FailureReason] = js.undefined
  
  /**
    * The data access role and Amazon S3 prefixes for the input files used to train the custom language model.
    */
  var InputDataConfig: js.UndefOr[typings.awsSdk.transcribeserviceMod.InputDataConfig] = js.undefined
  
  /**
    * The language code you used to create your custom language model.
    */
  var LanguageCode: js.UndefOr[CLMLanguageCode] = js.undefined
  
  /**
    * The most recent time the custom language model was modified.
    */
  var LastModifiedTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The name of the custom language model.
    */
  var ModelName: js.UndefOr[typings.awsSdk.transcribeserviceMod.ModelName] = js.undefined
  
  /**
    * The creation status of a custom language model. When the status is COMPLETED the model is ready for use.
    */
  var ModelStatus: js.UndefOr[typings.awsSdk.transcribeserviceMod.ModelStatus] = js.undefined
  
  /**
    * Whether the base model used for the custom language model is up to date. If this field is true then you are running the most up-to-date version of the base model in your custom language model.
    */
  var UpgradeAvailability: js.UndefOr[Boolean] = js.undefined
}
object LanguageModel {
  
  inline def apply(): LanguageModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageModel]
  }
  
  extension [Self <: LanguageModel](x: Self) {
    
    inline def setBaseModelName(value: BaseModelName): Self = StObject.set(x, "BaseModelName", value.asInstanceOf[js.Any])
    
    inline def setBaseModelNameUndefined: Self = StObject.set(x, "BaseModelName", js.undefined)
    
    inline def setCreateTime(value: DateTime): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfigUndefined: Self = StObject.set(x, "InputDataConfig", js.undefined)
    
    inline def setLanguageCode(value: CLMLanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setLastModifiedTime(value: DateTime): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setModelNameUndefined: Self = StObject.set(x, "ModelName", js.undefined)
    
    inline def setModelStatus(value: ModelStatus): Self = StObject.set(x, "ModelStatus", value.asInstanceOf[js.Any])
    
    inline def setModelStatusUndefined: Self = StObject.set(x, "ModelStatus", js.undefined)
    
    inline def setUpgradeAvailability(value: Boolean): Self = StObject.set(x, "UpgradeAvailability", value.asInstanceOf[js.Any])
    
    inline def setUpgradeAvailabilityUndefined: Self = StObject.set(x, "UpgradeAvailability", js.undefined)
  }
}
