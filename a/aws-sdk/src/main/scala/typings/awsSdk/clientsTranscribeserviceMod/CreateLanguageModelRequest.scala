package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLanguageModelRequest extends StObject {
  
  /**
    * The Amazon Transcribe standard language model, or base model, used to create your custom language model. Amazon Transcribe offers two options for base models: Wideband and Narrowband. If the audio you want to transcribe has a sample rate of 16,000 Hz or greater, choose WideBand. To transcribe audio with a sample rate less than 16,000 Hz, choose NarrowBand.
    */
  var BaseModelName: typings.awsSdk.clientsTranscribeserviceMod.BaseModelName
  
  /**
    * Contains the Amazon S3 location of the training data you want to use to create a new custom language model, and permissions to access this location. When using InputDataConfig, you must include these sub-parameters: S3Uri, which is the Amazon S3 location of your training data, and DataAccessRoleArn, which is the Amazon Resource Name (ARN) of the role that has permission to access your specified Amazon S3 location. You can optionally include TuningDataS3Uri, which is the Amazon S3 location of your tuning data. If you specify different Amazon S3 locations for training and tuning data, the ARN you use must have permissions to access both locations.
    */
  var InputDataConfig: typings.awsSdk.clientsTranscribeserviceMod.InputDataConfig
  
  /**
    * The language code that represents the language of your model. Each language model must contain terms in only one language, and the language you select for your model must match the language of your training and tuning data. For a list of supported languages and their associated language codes, refer to the Supported languages table. Note that U.S. English (en-US) is the only language supported with Amazon Transcribe Medical. A custom language model can only be used to transcribe files in the same language as the model. For example, if you create a language model using US English (en-US), you can only apply this model to files that contain English audio.
    */
  var LanguageCode: CLMLanguageCode
  
  /**
    * A unique name, chosen by you, for your custom language model. This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If you try to create a new language model with the same name as an existing language model, you get a ConflictException error.
    */
  var ModelName: typings.awsSdk.clientsTranscribeserviceMod.ModelName
  
  /**
    * Adds one or more custom tags, each in the form of a key:value pair, to a new custom language model at the time you create this new model. To learn more about using tags with Amazon Transcribe, refer to Tagging resources.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateLanguageModelRequest {
  
  inline def apply(
    BaseModelName: BaseModelName,
    InputDataConfig: InputDataConfig,
    LanguageCode: CLMLanguageCode,
    ModelName: ModelName
  ): CreateLanguageModelRequest = {
    val __obj = js.Dynamic.literal(BaseModelName = BaseModelName.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], LanguageCode = LanguageCode.asInstanceOf[js.Any], ModelName = ModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLanguageModelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLanguageModelRequest] (val x: Self) extends AnyVal {
    
    inline def setBaseModelName(value: BaseModelName): Self = StObject.set(x, "BaseModelName", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setLanguageCode(value: CLMLanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
