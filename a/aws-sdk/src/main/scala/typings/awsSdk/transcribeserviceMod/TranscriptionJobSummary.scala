package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranscriptionJobSummary extends StObject {
  
  /**
    * A timestamp that shows when the job was completed.
    */
  var CompletionTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The content redaction settings of the transcription job.
    */
  var ContentRedaction: js.UndefOr[typings.awsSdk.transcribeserviceMod.ContentRedaction] = js.undefined
  
  /**
    * A timestamp that shows when the job was created.
    */
  var CreationTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * If the TranscriptionJobStatus field is FAILED, a description of the error.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.transcribeserviceMod.FailureReason] = js.undefined
  
  /**
    * A value between zero and one that Amazon Transcribe assigned to the language it identified in the source audio. A higher score indicates that Amazon Transcribe is more confident in the language it identified.
    */
  var IdentifiedLanguageScore: js.UndefOr[typings.awsSdk.transcribeserviceMod.IdentifiedLanguageScore] = js.undefined
  
  /**
    * Whether automatic language identification was enabled for a transcription job.
    */
  var IdentifyLanguage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The language code for the input speech.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageCode] = js.undefined
  
  var ModelSettings: js.UndefOr[typings.awsSdk.transcribeserviceMod.ModelSettings] = js.undefined
  
  /**
    * Indicates the location of the output of the transcription job. If the value is CUSTOMER_BUCKET then the location is the S3 bucket specified in the outputBucketName field when the transcription job was started with the StartTranscriptionJob operation. If the value is SERVICE_BUCKET then the output is stored by Amazon Transcribe and can be retrieved using the URI in the GetTranscriptionJob response's TranscriptFileUri field.
    */
  var OutputLocationType: js.UndefOr[typings.awsSdk.transcribeserviceMod.OutputLocationType] = js.undefined
  
  /**
    * A timestamp that shows when the job started processing.
    */
  var StartTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The name of the transcription job.
    */
  var TranscriptionJobName: js.UndefOr[typings.awsSdk.transcribeserviceMod.TranscriptionJobName] = js.undefined
  
  /**
    * The status of the transcription job. When the status is COMPLETED, use the GetTranscriptionJob operation to get the results of the transcription.
    */
  var TranscriptionJobStatus: js.UndefOr[typings.awsSdk.transcribeserviceMod.TranscriptionJobStatus] = js.undefined
}
object TranscriptionJobSummary {
  
  @scala.inline
  def apply(): TranscriptionJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranscriptionJobSummary]
  }
  
  @scala.inline
  implicit class TranscriptionJobSummaryMutableBuilder[Self <: TranscriptionJobSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletionTime(value: DateTime): Self = StObject.set(x, "CompletionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionTimeUndefined: Self = StObject.set(x, "CompletionTime", js.undefined)
    
    @scala.inline
    def setContentRedaction(value: ContentRedaction): Self = StObject.set(x, "ContentRedaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentRedactionUndefined: Self = StObject.set(x, "ContentRedaction", js.undefined)
    
    @scala.inline
    def setCreationTime(value: DateTime): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setIdentifiedLanguageScore(value: IdentifiedLanguageScore): Self = StObject.set(x, "IdentifiedLanguageScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifiedLanguageScoreUndefined: Self = StObject.set(x, "IdentifiedLanguageScore", js.undefined)
    
    @scala.inline
    def setIdentifyLanguage(value: Boolean): Self = StObject.set(x, "IdentifyLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifyLanguageUndefined: Self = StObject.set(x, "IdentifyLanguage", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    @scala.inline
    def setModelSettings(value: ModelSettings): Self = StObject.set(x, "ModelSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelSettingsUndefined: Self = StObject.set(x, "ModelSettings", js.undefined)
    
    @scala.inline
    def setOutputLocationType(value: OutputLocationType): Self = StObject.set(x, "OutputLocationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputLocationTypeUndefined: Self = StObject.set(x, "OutputLocationType", js.undefined)
    
    @scala.inline
    def setStartTime(value: DateTime): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setTranscriptionJobName(value: TranscriptionJobName): Self = StObject.set(x, "TranscriptionJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscriptionJobNameUndefined: Self = StObject.set(x, "TranscriptionJobName", js.undefined)
    
    @scala.inline
    def setTranscriptionJobStatus(value: TranscriptionJobStatus): Self = StObject.set(x, "TranscriptionJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscriptionJobStatusUndefined: Self = StObject.set(x, "TranscriptionJobStatus", js.undefined)
  }
}
