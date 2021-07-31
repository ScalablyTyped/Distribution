package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicalTranscriptionJob extends StObject {
  
  /**
    * A timestamp that shows when the job was completed.
    */
  var CompletionTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * A timestamp that shows when the job was created.
    */
  var CreationTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * If the TranscriptionJobStatus field is FAILED, this field contains information about why the job failed. The FailureReason field contains one of the following values:    Unsupported media format- The media format specified in the MediaFormat field of the request isn't valid. See the description of the MediaFormat field for a list of valid values.    The media format provided does not match the detected media format- The media format of the audio file doesn't match the format specified in the MediaFormat field in the request. Check the media format of your media file and make sure the two values match.    Invalid sample rate for audio file- The sample rate specified in the MediaSampleRateHertz of the request isn't valid. The sample rate must be between 8000 and 48000 Hertz.    The sample rate provided does not match the detected sample rate- The sample rate in the audio file doesn't match the sample rate specified in the MediaSampleRateHertz field in the request. Check the sample rate of your media file and make sure that the two values match.    Invalid file size: file size too large- The size of your audio file is larger than what Amazon Transcribe Medical can process. For more information, see Guidelines and Quotas in the Amazon Transcribe Medical Guide     Invalid number of channels: number of channels too large- Your audio contains more channels than Amazon Transcribe Medical is configured to process. To request additional channels, see Amazon Transcribe Medical Endpoints and Quotas in the Amazon Web Services General Reference   
    */
  var FailureReason: js.UndefOr[typings.awsSdk.transcribeserviceMod.FailureReason] = js.undefined
  
  /**
    * The language code for the language spoken in the source audio file. US English (en-US) is the only supported language for medical transcriptions. Any other value you enter for language code results in a BadRequestException error.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageCode] = js.undefined
  
  var Media: js.UndefOr[typings.awsSdk.transcribeserviceMod.Media] = js.undefined
  
  /**
    * The format of the input media file.
    */
  var MediaFormat: js.UndefOr[typings.awsSdk.transcribeserviceMod.MediaFormat] = js.undefined
  
  /**
    * The sample rate, in Hertz, of the source audio containing medical information. If you don't specify the sample rate, Amazon Transcribe Medical determines it for you. If you choose to specify the sample rate, it must match the rate detected by Amazon Transcribe Medical. In most cases, you should leave the MediaSampleHertz blank and let Amazon Transcribe Medical determine the sample rate.
    */
  var MediaSampleRateHertz: js.UndefOr[typings.awsSdk.transcribeserviceMod.MediaSampleRateHertz] = js.undefined
  
  /**
    * The name for a given medical transcription job.
    */
  var MedicalTranscriptionJobName: js.UndefOr[TranscriptionJobName] = js.undefined
  
  /**
    * Object that contains object.
    */
  var Settings: js.UndefOr[MedicalTranscriptionSetting] = js.undefined
  
  /**
    * The medical specialty of any clinicians providing a dictation or having a conversation. PRIMARYCARE is the only available setting for this object. This specialty enables you to generate transcriptions for the following medical fields:   Family Medicine  
    */
  var Specialty: js.UndefOr[typings.awsSdk.transcribeserviceMod.Specialty] = js.undefined
  
  /**
    * A timestamp that shows when the job started processing.
    */
  var StartTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * An object that contains the MedicalTranscript. The MedicalTranscript contains the TranscriptFileUri.
    */
  var Transcript: js.UndefOr[MedicalTranscript] = js.undefined
  
  /**
    * The completion status of a medical transcription job.
    */
  var TranscriptionJobStatus: js.UndefOr[typings.awsSdk.transcribeserviceMod.TranscriptionJobStatus] = js.undefined
  
  /**
    * The type of speech in the transcription job. CONVERSATION is generally used for patient-physician dialogues. DICTATION is the setting for physicians speaking their notes after seeing a patient. For more information, see how-it-works-med 
    */
  var Type: js.UndefOr[typings.awsSdk.transcribeserviceMod.Type] = js.undefined
}
object MedicalTranscriptionJob {
  
  @scala.inline
  def apply(): MedicalTranscriptionJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicalTranscriptionJob]
  }
  
  @scala.inline
  implicit class MedicalTranscriptionJobMutableBuilder[Self <: MedicalTranscriptionJob] (val x: Self) extends AnyVal {
    
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
    def setMedia(value: Media): Self = StObject.set(x, "Media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaFormat(value: MediaFormat): Self = StObject.set(x, "MediaFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaFormatUndefined: Self = StObject.set(x, "MediaFormat", js.undefined)
    
    @scala.inline
    def setMediaSampleRateHertz(value: MediaSampleRateHertz): Self = StObject.set(x, "MediaSampleRateHertz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaSampleRateHertzUndefined: Self = StObject.set(x, "MediaSampleRateHertz", js.undefined)
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "Media", js.undefined)
    
    @scala.inline
    def setMedicalTranscriptionJobName(value: TranscriptionJobName): Self = StObject.set(x, "MedicalTranscriptionJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedicalTranscriptionJobNameUndefined: Self = StObject.set(x, "MedicalTranscriptionJobName", js.undefined)
    
    @scala.inline
    def setSettings(value: MedicalTranscriptionSetting): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
    
    @scala.inline
    def setSpecialty(value: Specialty): Self = StObject.set(x, "Specialty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialtyUndefined: Self = StObject.set(x, "Specialty", js.undefined)
    
    @scala.inline
    def setStartTime(value: DateTime): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setTranscript(value: MedicalTranscript): Self = StObject.set(x, "Transcript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscriptUndefined: Self = StObject.set(x, "Transcript", js.undefined)
    
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
