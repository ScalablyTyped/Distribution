package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranscriptionJobSummary extends StObject {
  
  /**
    * The date and time the specified transcription job finished processing. Timestamps are in the format YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC. For example, 2022-05-04T12:33:13.922000-07:00 represents a transcription job that started processing at 12:33 PM UTC-7 on May 4, 2022.
    */
  var CompletionTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The content redaction settings of the transcription job.
    */
  var ContentRedaction: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.ContentRedaction] = js.undefined
  
  /**
    * The date and time the specified transcription job request was made. Timestamps are in the format YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC. For example, 2022-05-04T12:32:58.761000-07:00 represents a transcription job that started processing at 12:32 PM UTC-7 on May 4, 2022.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If TranscriptionJobStatus is FAILED, FailureReason contains information about why the transcription job failed. See also: Common Errors.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.FailureReason] = js.undefined
  
  /**
    * The confidence score associated with the language identified in your media file. Confidence scores are values between 0 and 1; a larger value indicates a higher probability that the identified language correctly matches the language spoken in your media.
    */
  var IdentifiedLanguageScore: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.IdentifiedLanguageScore] = js.undefined
  
  /**
    * Indicates whether automatic language identification was enabled (TRUE) for the specified transcription job.
    */
  var IdentifyLanguage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether automatic multi-language identification was enabled (TRUE) for the specified transcription job.
    */
  var IdentifyMultipleLanguages: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The language code used to create your transcription.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.LanguageCode] = js.undefined
  
  /**
    * The language codes used to create your transcription job. This parameter is used with multi-language identification. For single-language identification, the singular version of this parameter, LanguageCode, is present.
    */
  var LanguageCodes: js.UndefOr[LanguageCodeList] = js.undefined
  
  var ModelSettings: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.ModelSettings] = js.undefined
  
  /**
    * Indicates where the specified transcription output is stored. If the value is CUSTOMER_BUCKET, the location is the Amazon S3 bucket you specified using the OutputBucketName parameter in your request. If you also included OutputKey in your request, your output is located in the path you specified in your request. If the value is SERVICE_BUCKET, the location is a service-managed Amazon S3 bucket. To access a transcript stored in a service-managed bucket, use the URI shown in the TranscriptFileUri or RedactedTranscriptFileUri field.
    */
  var OutputLocationType: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.OutputLocationType] = js.undefined
  
  /**
    * The date and time your transcription job began processing. Timestamps are in the format YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC. For example, 2022-05-04T12:32:58.789000-07:00 represents a transcription job that started processing at 12:32 PM UTC-7 on May 4, 2022.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the transcription job. Job names are case sensitive and must be unique within an Amazon Web Services account.
    */
  var TranscriptionJobName: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.TranscriptionJobName] = js.undefined
  
  /**
    * Provides the status of your transcription job. If the status is COMPLETED, the job is finished and you can find the results at the location specified in TranscriptFileUri (or RedactedTranscriptFileUri, if you requested transcript redaction). If the status is FAILED, FailureReason provides details on why your transcription job failed.
    */
  var TranscriptionJobStatus: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.TranscriptionJobStatus] = js.undefined
}
object TranscriptionJobSummary {
  
  inline def apply(): TranscriptionJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranscriptionJobSummary]
  }
  
  extension [Self <: TranscriptionJobSummary](x: Self) {
    
    inline def setCompletionTime(value: js.Date): Self = StObject.set(x, "CompletionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "CompletionTime", js.undefined)
    
    inline def setContentRedaction(value: ContentRedaction): Self = StObject.set(x, "ContentRedaction", value.asInstanceOf[js.Any])
    
    inline def setContentRedactionUndefined: Self = StObject.set(x, "ContentRedaction", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setIdentifiedLanguageScore(value: IdentifiedLanguageScore): Self = StObject.set(x, "IdentifiedLanguageScore", value.asInstanceOf[js.Any])
    
    inline def setIdentifiedLanguageScoreUndefined: Self = StObject.set(x, "IdentifiedLanguageScore", js.undefined)
    
    inline def setIdentifyLanguage(value: Boolean): Self = StObject.set(x, "IdentifyLanguage", value.asInstanceOf[js.Any])
    
    inline def setIdentifyLanguageUndefined: Self = StObject.set(x, "IdentifyLanguage", js.undefined)
    
    inline def setIdentifyMultipleLanguages(value: Boolean): Self = StObject.set(x, "IdentifyMultipleLanguages", value.asInstanceOf[js.Any])
    
    inline def setIdentifyMultipleLanguagesUndefined: Self = StObject.set(x, "IdentifyMultipleLanguages", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setLanguageCodes(value: LanguageCodeList): Self = StObject.set(x, "LanguageCodes", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodesUndefined: Self = StObject.set(x, "LanguageCodes", js.undefined)
    
    inline def setLanguageCodesVarargs(value: LanguageCodeItem*): Self = StObject.set(x, "LanguageCodes", js.Array(value*))
    
    inline def setModelSettings(value: ModelSettings): Self = StObject.set(x, "ModelSettings", value.asInstanceOf[js.Any])
    
    inline def setModelSettingsUndefined: Self = StObject.set(x, "ModelSettings", js.undefined)
    
    inline def setOutputLocationType(value: OutputLocationType): Self = StObject.set(x, "OutputLocationType", value.asInstanceOf[js.Any])
    
    inline def setOutputLocationTypeUndefined: Self = StObject.set(x, "OutputLocationType", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setTranscriptionJobName(value: TranscriptionJobName): Self = StObject.set(x, "TranscriptionJobName", value.asInstanceOf[js.Any])
    
    inline def setTranscriptionJobNameUndefined: Self = StObject.set(x, "TranscriptionJobName", js.undefined)
    
    inline def setTranscriptionJobStatus(value: TranscriptionJobStatus): Self = StObject.set(x, "TranscriptionJobStatus", value.asInstanceOf[js.Any])
    
    inline def setTranscriptionJobStatusUndefined: Self = StObject.set(x, "TranscriptionJobStatus", js.undefined)
  }
}
