package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextTranslationJobProperties extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an AWS Identity Access and Management (IAM) role that granted Amazon Translate read access to the job's input data.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * The time at which the translation job ended.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The input configuration properties that were specified when the job was requested.
    */
  var InputDataConfig: js.UndefOr[typings.awsSdk.translateMod.InputDataConfig] = js.undefined
  
  /**
    * The number of documents successfully and unsuccessfully processed during the translation job.
    */
  var JobDetails: js.UndefOr[typings.awsSdk.translateMod.JobDetails] = js.undefined
  
  /**
    * The ID of the translation job.
    */
  var JobId: js.UndefOr[typings.awsSdk.translateMod.JobId] = js.undefined
  
  /**
    * The user-defined name of the translation job.
    */
  var JobName: js.UndefOr[typings.awsSdk.translateMod.JobName] = js.undefined
  
  /**
    * The status of the translation job.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.translateMod.JobStatus] = js.undefined
  
  /**
    * An explanation of any errors that may have occurred during the translation job.
    */
  var Message: js.UndefOr[UnboundedLengthString] = js.undefined
  
  /**
    * The output configuration properties that were specified when the job was requested.
    */
  var OutputDataConfig: js.UndefOr[typings.awsSdk.translateMod.OutputDataConfig] = js.undefined
  
  /**
    * A list containing the names of the parallel data resources applied to the translation job.
    */
  var ParallelDataNames: js.UndefOr[ResourceNameList] = js.undefined
  
  /**
    * Settings that configure the translation output.
    */
  var Settings: js.UndefOr[TranslationSettings] = js.undefined
  
  /**
    * The language code of the language of the source text. The language must be a language supported by Amazon Translate.
    */
  var SourceLanguageCode: js.UndefOr[LanguageCodeString] = js.undefined
  
  /**
    * The time at which the translation job was submitted.
    */
  var SubmittedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The language code of the language of the target text. The language must be a language supported by Amazon Translate.
    */
  var TargetLanguageCodes: js.UndefOr[TargetLanguageCodeStringList] = js.undefined
  
  /**
    * A list containing the names of the terminologies applied to a translation job. Only one terminology can be applied per StartTextTranslationJob request at this time.
    */
  var TerminologyNames: js.UndefOr[ResourceNameList] = js.undefined
}
object TextTranslationJobProperties {
  
  inline def apply(): TextTranslationJobProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextTranslationJobProperties]
  }
  
  extension [Self <: TextTranslationJobProperties](x: Self) {
    
    inline def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDataAccessRoleArnUndefined: Self = StObject.set(x, "DataAccessRoleArn", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfigUndefined: Self = StObject.set(x, "InputDataConfig", js.undefined)
    
    inline def setJobDetails(value: JobDetails): Self = StObject.set(x, "JobDetails", value.asInstanceOf[js.Any])
    
    inline def setJobDetailsUndefined: Self = StObject.set(x, "JobDetails", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    inline def setMessage(value: UnboundedLengthString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputDataConfigUndefined: Self = StObject.set(x, "OutputDataConfig", js.undefined)
    
    inline def setParallelDataNames(value: ResourceNameList): Self = StObject.set(x, "ParallelDataNames", value.asInstanceOf[js.Any])
    
    inline def setParallelDataNamesUndefined: Self = StObject.set(x, "ParallelDataNames", js.undefined)
    
    inline def setParallelDataNamesVarargs(value: ResourceName*): Self = StObject.set(x, "ParallelDataNames", js.Array(value*))
    
    inline def setSettings(value: TranslationSettings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
    
    inline def setSourceLanguageCode(value: LanguageCodeString): Self = StObject.set(x, "SourceLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setSourceLanguageCodeUndefined: Self = StObject.set(x, "SourceLanguageCode", js.undefined)
    
    inline def setSubmittedTime(value: js.Date): Self = StObject.set(x, "SubmittedTime", value.asInstanceOf[js.Any])
    
    inline def setSubmittedTimeUndefined: Self = StObject.set(x, "SubmittedTime", js.undefined)
    
    inline def setTargetLanguageCodes(value: TargetLanguageCodeStringList): Self = StObject.set(x, "TargetLanguageCodes", value.asInstanceOf[js.Any])
    
    inline def setTargetLanguageCodesUndefined: Self = StObject.set(x, "TargetLanguageCodes", js.undefined)
    
    inline def setTargetLanguageCodesVarargs(value: LanguageCodeString*): Self = StObject.set(x, "TargetLanguageCodes", js.Array(value*))
    
    inline def setTerminologyNames(value: ResourceNameList): Self = StObject.set(x, "TerminologyNames", value.asInstanceOf[js.Any])
    
    inline def setTerminologyNamesUndefined: Self = StObject.set(x, "TerminologyNames", js.undefined)
    
    inline def setTerminologyNamesVarargs(value: ResourceName*): Self = StObject.set(x, "TerminologyNames", js.Array(value*))
  }
}
