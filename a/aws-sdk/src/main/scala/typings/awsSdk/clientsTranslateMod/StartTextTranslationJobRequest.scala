package typings.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTextTranslationJobRequest extends StObject {
  
  /**
    * A unique identifier for the request. This token is generated for you when using the Amazon Translate SDK.
    */
  var ClientToken: ClientTokenString
  
  /**
    * The Amazon Resource Name (ARN) of an AWS Identity Access and Management (IAM) role that grants Amazon Translate read access to your input data. For more information, see Identity and access management .
    */
  var DataAccessRoleArn: IamRoleArn
  
  /**
    * Specifies the format and location of the input documents for the translation job.
    */
  var InputDataConfig: typings.awsSdk.clientsTranslateMod.InputDataConfig
  
  /**
    * The name of the batch translation job to be performed.
    */
  var JobName: js.UndefOr[typings.awsSdk.clientsTranslateMod.JobName] = js.undefined
  
  /**
    * Specifies the S3 folder to which your job output will be saved. 
    */
  var OutputDataConfig: typings.awsSdk.clientsTranslateMod.OutputDataConfig
  
  /**
    * The name of a parallel data resource to add to the translation job. This resource consists of examples that show how you want segments of text to be translated. If you specify multiple target languages for the job, the parallel data file must include translations for all the target languages. When you add parallel data to a translation job, you create an Active Custom Translation job.  This parameter accepts only one parallel data resource.  Active Custom Translation jobs are priced at a higher rate than other jobs that don't use parallel data. For more information, see Amazon Translate pricing.  For a list of available parallel data resources, use the ListParallelData operation. For more information, see  Customizing your translations with parallel data.
    */
  var ParallelDataNames: js.UndefOr[ResourceNameList] = js.undefined
  
  /**
    * Settings to configure your translation output, including the option to set the formality level of the output text and the option to mask profane words and phrases.
    */
  var Settings: js.UndefOr[TranslationSettings] = js.undefined
  
  /**
    * The language code of the input language. For a list of language codes, see Supported languages. Amazon Translate does not automatically detect a source language during batch translation jobs.
    */
  var SourceLanguageCode: LanguageCodeString
  
  /**
    * The target languages of the translation job. Enter up to 10 language codes. Each input file is translated into each target language. Each language code is two or five characters long. For a list of language codes, see Supported languages.
    */
  var TargetLanguageCodes: TargetLanguageCodeStringList
  
  /**
    * The name of a custom terminology resource to add to the translation job. This resource lists examples source terms and the desired translation for each term. This parameter accepts only one custom terminology resource. If you specify multiple target languages for the job, translate uses the designated terminology for each requested target language that has an entry for the source term in the terminology file. For a list of available custom terminology resources, use the ListTerminologies operation. For more information, see Custom terminology.
    */
  var TerminologyNames: js.UndefOr[ResourceNameList] = js.undefined
}
object StartTextTranslationJobRequest {
  
  inline def apply(
    ClientToken: ClientTokenString,
    DataAccessRoleArn: IamRoleArn,
    InputDataConfig: InputDataConfig,
    OutputDataConfig: OutputDataConfig,
    SourceLanguageCode: LanguageCodeString,
    TargetLanguageCodes: TargetLanguageCodeStringList
  ): StartTextTranslationJobRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], DataAccessRoleArn = DataAccessRoleArn.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any], SourceLanguageCode = SourceLanguageCode.asInstanceOf[js.Any], TargetLanguageCodes = TargetLanguageCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTextTranslationJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartTextTranslationJobRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientTokenString): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setParallelDataNames(value: ResourceNameList): Self = StObject.set(x, "ParallelDataNames", value.asInstanceOf[js.Any])
    
    inline def setParallelDataNamesUndefined: Self = StObject.set(x, "ParallelDataNames", js.undefined)
    
    inline def setParallelDataNamesVarargs(value: ResourceName*): Self = StObject.set(x, "ParallelDataNames", js.Array(value*))
    
    inline def setSettings(value: TranslationSettings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
    
    inline def setSourceLanguageCode(value: LanguageCodeString): Self = StObject.set(x, "SourceLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setTargetLanguageCodes(value: TargetLanguageCodeStringList): Self = StObject.set(x, "TargetLanguageCodes", value.asInstanceOf[js.Any])
    
    inline def setTargetLanguageCodesVarargs(value: LanguageCodeString*): Self = StObject.set(x, "TargetLanguageCodes", js.Array(value*))
    
    inline def setTerminologyNames(value: ResourceNameList): Self = StObject.set(x, "TerminologyNames", value.asInstanceOf[js.Any])
    
    inline def setTerminologyNamesUndefined: Self = StObject.set(x, "TerminologyNames", js.undefined)
    
    inline def setTerminologyNamesVarargs(value: ResourceName*): Self = StObject.set(x, "TerminologyNames", js.Array(value*))
  }
}
