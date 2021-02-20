package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartTextTranslationJobRequest extends StObject {
  
  /**
    * A unique identifier for the request. This token is auto-generated when using the Amazon Translate SDK.
    */
  var ClientToken: ClientTokenString = js.native
  
  /**
    * The Amazon Resource Name (ARN) of an AWS Identity Access and Management (IAM) role that grants Amazon Translate read access to your input data. For more nformation, see identity-and-access-management.
    */
  var DataAccessRoleArn: IamRoleArn = js.native
  
  /**
    * Specifies the format and S3 location of the input documents for the translation job.
    */
  var InputDataConfig: typings.awsSdk.translateMod.InputDataConfig = js.native
  
  /**
    * The name of the batch translation job to be performed.
    */
  var JobName: js.UndefOr[typings.awsSdk.translateMod.JobName] = js.native
  
  /**
    * Specifies the S3 folder to which your job output will be saved. 
    */
  var OutputDataConfig: typings.awsSdk.translateMod.OutputDataConfig = js.native
  
  /**
    * The language code of the input language. For a list of language codes, see what-is-languages. Amazon Translate does not automatically detect a source language during batch translation jobs.
    */
  var SourceLanguageCode: LanguageCodeString = js.native
  
  /**
    * The language code of the output language.
    */
  var TargetLanguageCodes: TargetLanguageCodeStringList = js.native
  
  /**
    * The name of the terminology to use in the batch translation job. For a list of available terminologies, use the ListTerminologies operation.
    */
  var TerminologyNames: js.UndefOr[ResourceNameList] = js.native
}
object StartTextTranslationJobRequest {
  
  @scala.inline
  def apply(
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
  implicit class StartTextTranslationJobRequestMutableBuilder[Self <: StartTextTranslationJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientTokenString): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    @scala.inline
    def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLanguageCode(value: LanguageCodeString): Self = StObject.set(x, "SourceLanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetLanguageCodes(value: TargetLanguageCodeStringList): Self = StObject.set(x, "TargetLanguageCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetLanguageCodesVarargs(value: LanguageCodeString*): Self = StObject.set(x, "TargetLanguageCodes", js.Array(value :_*))
    
    @scala.inline
    def setTerminologyNames(value: ResourceNameList): Self = StObject.set(x, "TerminologyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminologyNamesUndefined: Self = StObject.set(x, "TerminologyNames", js.undefined)
    
    @scala.inline
    def setTerminologyNamesVarargs(value: ResourceName*): Self = StObject.set(x, "TerminologyNames", js.Array(value :_*))
  }
}
