package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicalTranscriptionJobSummary extends StObject {
  
  /**
    * The date and time the specified medical transcription job finished processing. Timestamps are in the format YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC. For example, 2022-05-04T12:33:13.922000-07:00 represents a transcription job that started processing at 12:33 PM UTC-7 on May 4, 2022.
    */
  var CompletionTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Labels all personal health information (PHI) identified in your transcript. For more information, see Identifying personal health information (PHI) in a transcription.
    */
  var ContentIdentificationType: js.UndefOr[MedicalContentIdentificationType] = js.undefined
  
  /**
    * The date and time the specified medical transcription job request was made. Timestamps are in the format YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC. For example, 2022-05-04T12:32:58.761000-07:00 represents a transcription job that started processing at 12:32 PM UTC-7 on May 4, 2022.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If TranscriptionJobStatus is FAILED, FailureReason contains information about why the transcription job failed. See also: Common Errors.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.FailureReason] = js.undefined
  
  /**
    * The language code used to create your medical transcription. US English (en-US) is the only supported language for medical transcriptions.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.LanguageCode] = js.undefined
  
  /**
    * The name of the medical transcription job. Job names are case sensitive and must be unique within an Amazon Web Services account.
    */
  var MedicalTranscriptionJobName: js.UndefOr[TranscriptionJobName] = js.undefined
  
  /**
    * Indicates where the specified medical transcription output is stored. If the value is CUSTOMER_BUCKET, the location is the Amazon S3 bucket you specified using the OutputBucketName parameter in your request. If you also included OutputKey in your request, your output is located in the path you specified in your request. If the value is SERVICE_BUCKET, the location is a service-managed Amazon S3 bucket. To access a transcript stored in a service-managed bucket, use the URI shown in the TranscriptFileUri field.
    */
  var OutputLocationType: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.OutputLocationType] = js.undefined
  
  /**
    * Provides the medical specialty represented in your media.
    */
  var Specialty: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.Specialty] = js.undefined
  
  /**
    * The date and time your medical transcription job began processing. Timestamps are in the format YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC. For example, 2022-05-04T12:32:58.789000-07:00 represents a transcription job that started processing at 12:32 PM UTC-7 on May 4, 2022.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Provides the status of your medical transcription job. If the status is COMPLETED, the job is finished and you can find the results at the location specified in TranscriptFileUri. If the status is FAILED, FailureReason provides details on why your transcription job failed.
    */
  var TranscriptionJobStatus: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.TranscriptionJobStatus] = js.undefined
  
  /**
    * Indicates whether the input media is a dictation or a conversation, as specified in the StartMedicalTranscriptionJob request.
    */
  var Type: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.Type] = js.undefined
}
object MedicalTranscriptionJobSummary {
  
  inline def apply(): MedicalTranscriptionJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicalTranscriptionJobSummary]
  }
  
  extension [Self <: MedicalTranscriptionJobSummary](x: Self) {
    
    inline def setCompletionTime(value: js.Date): Self = StObject.set(x, "CompletionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "CompletionTime", js.undefined)
    
    inline def setContentIdentificationType(value: MedicalContentIdentificationType): Self = StObject.set(x, "ContentIdentificationType", value.asInstanceOf[js.Any])
    
    inline def setContentIdentificationTypeUndefined: Self = StObject.set(x, "ContentIdentificationType", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setMedicalTranscriptionJobName(value: TranscriptionJobName): Self = StObject.set(x, "MedicalTranscriptionJobName", value.asInstanceOf[js.Any])
    
    inline def setMedicalTranscriptionJobNameUndefined: Self = StObject.set(x, "MedicalTranscriptionJobName", js.undefined)
    
    inline def setOutputLocationType(value: OutputLocationType): Self = StObject.set(x, "OutputLocationType", value.asInstanceOf[js.Any])
    
    inline def setOutputLocationTypeUndefined: Self = StObject.set(x, "OutputLocationType", js.undefined)
    
    inline def setSpecialty(value: Specialty): Self = StObject.set(x, "Specialty", value.asInstanceOf[js.Any])
    
    inline def setSpecialtyUndefined: Self = StObject.set(x, "Specialty", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setTranscriptionJobStatus(value: TranscriptionJobStatus): Self = StObject.set(x, "TranscriptionJobStatus", value.asInstanceOf[js.Any])
    
    inline def setTranscriptionJobStatusUndefined: Self = StObject.set(x, "TranscriptionJobStatus", js.undefined)
    
    inline def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
