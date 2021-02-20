package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextTranslationJobProperties extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an AWS Identity Access and Management (IAM) role that granted Amazon Translate read access to the job's input data.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.native
  
  /**
    * The time at which the translation job ended.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The input configuration properties that were specified when the job was requested.
    */
  var InputDataConfig: js.UndefOr[typings.awsSdk.translateMod.InputDataConfig] = js.native
  
  /**
    * The number of documents successfully and unsuccessfully processed during the translation job.
    */
  var JobDetails: js.UndefOr[typings.awsSdk.translateMod.JobDetails] = js.native
  
  /**
    * The ID of the translation job.
    */
  var JobId: js.UndefOr[typings.awsSdk.translateMod.JobId] = js.native
  
  /**
    * The user-defined name of the translation job.
    */
  var JobName: js.UndefOr[typings.awsSdk.translateMod.JobName] = js.native
  
  /**
    * The status of the translation job.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.translateMod.JobStatus] = js.native
  
  /**
    * An explanation of any errors that may have occured during the translation job.
    */
  var Message: js.UndefOr[UnboundedLengthString] = js.native
  
  /**
    * The output configuration properties that were specified when the job was requested.
    */
  var OutputDataConfig: js.UndefOr[typings.awsSdk.translateMod.OutputDataConfig] = js.native
  
  /**
    * The language code of the language of the source text. The language must be a language supported by Amazon Translate.
    */
  var SourceLanguageCode: js.UndefOr[LanguageCodeString] = js.native
  
  /**
    * The time at which the translation job was submitted.
    */
  var SubmittedTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The language code of the language of the target text. The language must be a language supported by Amazon Translate.
    */
  var TargetLanguageCodes: js.UndefOr[TargetLanguageCodeStringList] = js.native
  
  /**
    * A list containing the names of the terminologies applied to a translation job. Only one terminology can be applied per StartTextTranslationJob request at this time.
    */
  var TerminologyNames: js.UndefOr[ResourceNameList] = js.native
}
object TextTranslationJobProperties {
  
  @scala.inline
  def apply(): TextTranslationJobProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextTranslationJobProperties]
  }
  
  @scala.inline
  implicit class TextTranslationJobPropertiesMutableBuilder[Self <: TextTranslationJobProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataAccessRoleArnUndefined: Self = StObject.set(x, "DataAccessRoleArn", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDataConfigUndefined: Self = StObject.set(x, "InputDataConfig", js.undefined)
    
    @scala.inline
    def setJobDetails(value: JobDetails): Self = StObject.set(x, "JobDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobDetailsUndefined: Self = StObject.set(x, "JobDetails", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    @scala.inline
    def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    @scala.inline
    def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    @scala.inline
    def setMessage(value: UnboundedLengthString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputDataConfigUndefined: Self = StObject.set(x, "OutputDataConfig", js.undefined)
    
    @scala.inline
    def setSourceLanguageCode(value: LanguageCodeString): Self = StObject.set(x, "SourceLanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLanguageCodeUndefined: Self = StObject.set(x, "SourceLanguageCode", js.undefined)
    
    @scala.inline
    def setSubmittedTime(value: Timestamp): Self = StObject.set(x, "SubmittedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmittedTimeUndefined: Self = StObject.set(x, "SubmittedTime", js.undefined)
    
    @scala.inline
    def setTargetLanguageCodes(value: TargetLanguageCodeStringList): Self = StObject.set(x, "TargetLanguageCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetLanguageCodesUndefined: Self = StObject.set(x, "TargetLanguageCodes", js.undefined)
    
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
