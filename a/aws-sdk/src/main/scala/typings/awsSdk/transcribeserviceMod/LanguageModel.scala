package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageModel extends StObject {
  
  /**
    * The Amazon Transcribe standard language model, or base model, used to create your custom language model.
    */
  var BaseModelName: js.UndefOr[typings.awsSdk.transcribeserviceMod.BaseModelName] = js.undefined
  
  /**
    * The date and time the specified custom language model was created. Timestamps are in the format YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC. For example, 2022-05-04T12:32:58.761000-07:00 represents 12:32 PM UTC-7 on May 4, 2022.
    */
  var CreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If ModelStatus is FAILED, FailureReason contains information about why the custom language model request failed. See also: Common Errors.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.transcribeserviceMod.FailureReason] = js.undefined
  
  /**
    * The Amazon S3 location of the input files used to train and tune your custom language model, in addition to the data access role ARN (Amazon Resource Name) that has permissions to access these data.
    */
  var InputDataConfig: js.UndefOr[typings.awsSdk.transcribeserviceMod.InputDataConfig] = js.undefined
  
  /**
    * The language code used to create your custom language model. Each language model must contain terms in only one language, and the language you select for your model must match the language of your training and tuning data. For a list of supported languages and their associated language codes, refer to the Supported languages table. Note that U.S. English (en-US) is the only language supported with Amazon Transcribe Medical.
    */
  var LanguageCode: js.UndefOr[CLMLanguageCode] = js.undefined
  
  /**
    * The date and time the specified language model was last modified. Timestamps are in the format YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC. For example, 2022-05-04T12:32:58.761000-07:00 represents 12:32 PM UTC-7 on May 4, 2022.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A unique name, chosen by you, for your custom language model. This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account.
    */
  var ModelName: js.UndefOr[typings.awsSdk.transcribeserviceMod.ModelName] = js.undefined
  
  /**
    * The status of the specified custom language model. When the status displays as COMPLETED the model is ready for use.
    */
  var ModelStatus: js.UndefOr[typings.awsSdk.transcribeserviceMod.ModelStatus] = js.undefined
  
  /**
    * Shows if a more current base model is available for use with the specified custom language model. If false, your language model is using the most up-to-date base model. If true, there is a newer base model available than the one your language model is using. Note that to update a base model, you must recreate the custom language model using the new base model. Base model upgrades for existing custom language models are not supported.
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
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfigUndefined: Self = StObject.set(x, "InputDataConfig", js.undefined)
    
    inline def setLanguageCode(value: CLMLanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setModelNameUndefined: Self = StObject.set(x, "ModelName", js.undefined)
    
    inline def setModelStatus(value: ModelStatus): Self = StObject.set(x, "ModelStatus", value.asInstanceOf[js.Any])
    
    inline def setModelStatusUndefined: Self = StObject.set(x, "ModelStatus", js.undefined)
    
    inline def setUpgradeAvailability(value: Boolean): Self = StObject.set(x, "UpgradeAvailability", value.asInstanceOf[js.Any])
    
    inline def setUpgradeAvailabilityUndefined: Self = StObject.set(x, "UpgradeAvailability", js.undefined)
  }
}
