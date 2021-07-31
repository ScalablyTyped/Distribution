package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicalTranscriptionJobSummary extends StObject {
  
  /**
    * A timestamp that shows when the job was completed.
    */
  var CompletionTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * A timestamp that shows when the medical transcription job was created.
    */
  var CreationTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * If the TranscriptionJobStatus field is FAILED, a description of the error.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.transcribeserviceMod.FailureReason] = js.undefined
  
  /**
    * The language of the transcript in the source audio file.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageCode] = js.undefined
  
  /**
    * The name of a medical transcription job.
    */
  var MedicalTranscriptionJobName: js.UndefOr[TranscriptionJobName] = js.undefined
  
  /**
    * Indicates the location of the transcription job's output. The CUSTOMER_BUCKET is the S3 location provided in the OutputBucketName field when the 
    */
  var OutputLocationType: js.UndefOr[typings.awsSdk.transcribeserviceMod.OutputLocationType] = js.undefined
  
  /**
    * The medical specialty of the transcription job. Primary care is the only valid value.
    */
  var Specialty: js.UndefOr[typings.awsSdk.transcribeserviceMod.Specialty] = js.undefined
  
  /**
    * A timestamp that shows when the job began processing.
    */
  var StartTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The status of the medical transcription job.
    */
  var TranscriptionJobStatus: js.UndefOr[typings.awsSdk.transcribeserviceMod.TranscriptionJobStatus] = js.undefined
  
  /**
    * The speech of the clinician in the input audio.
    */
  var Type: js.UndefOr[typings.awsSdk.transcribeserviceMod.Type] = js.undefined
}
object MedicalTranscriptionJobSummary {
  
  @scala.inline
  def apply(): MedicalTranscriptionJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicalTranscriptionJobSummary]
  }
  
  @scala.inline
  implicit class MedicalTranscriptionJobSummaryMutableBuilder[Self <: MedicalTranscriptionJobSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletionTime(value: DateTime): Self = StObject.set(x, "CompletionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionTimeUndefined: Self = StObject.set(x, "CompletionTime", js.undefined)
    
    @scala.inline
    def setCreationTime(value: DateTime): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    @scala.inline
    def setMedicalTranscriptionJobName(value: TranscriptionJobName): Self = StObject.set(x, "MedicalTranscriptionJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedicalTranscriptionJobNameUndefined: Self = StObject.set(x, "MedicalTranscriptionJobName", js.undefined)
    
    @scala.inline
    def setOutputLocationType(value: OutputLocationType): Self = StObject.set(x, "OutputLocationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputLocationTypeUndefined: Self = StObject.set(x, "OutputLocationType", js.undefined)
    
    @scala.inline
    def setSpecialty(value: Specialty): Self = StObject.set(x, "Specialty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialtyUndefined: Self = StObject.set(x, "Specialty", js.undefined)
    
    @scala.inline
    def setStartTime(value: DateTime): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setTranscriptionJobStatus(value: TranscriptionJobStatus): Self = StObject.set(x, "TranscriptionJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscriptionJobStatusUndefined: Self = StObject.set(x, "TranscriptionJobStatus", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
