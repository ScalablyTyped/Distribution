package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MedicalTranscriptionJob extends js.Object {
  
  /**
    * A timestamp that shows when the job was completed.
    */
  var CompletionTime: js.UndefOr[DateTime] = js.native
  
  /**
    * A timestamp that shows when the job was created.
    */
  var CreationTime: js.UndefOr[DateTime] = js.native
  
  /**
    * If the TranscriptionJobStatus field is FAILED, this field contains information about why the job failed. The FailureReason field contains one of the following values:    Unsupported media format- The media format specified in the MediaFormat field of the request isn't valid. See the description of the MediaFormat field for a list of valid values.    The media format provided does not match the detected media format- The media format of the audio file doesn't match the format specified in the MediaFormat field in the request. Check the media format of your media file and make sure the two values match.    Invalid sample rate for audio file- The sample rate specified in the MediaSampleRateHertz of the request isn't valid. The sample rate must be between 8000 and 48000 Hertz.    The sample rate provided does not match the detected sample rate- The sample rate in the audio file doesn't match the sample rate specified in the MediaSampleRateHertz field in the request. Check the sample rate of your media file and make sure that the two values match.    Invalid file size: file size too large- The size of your audio file is larger than what Amazon Transcribe Medical can process. For more information, see Guidelines and Quotas in the Amazon Transcribe Medical Guide     Invalid number of channels: number of channels too large- Your audio contains more channels than Amazon Transcribe Medical is configured to process. To request additional channels, see Amazon Transcribe Medical Endpoints and Quotas in the Amazon Web Services General Reference   
    */
  var FailureReason: js.UndefOr[typings.awsSdk.transcribeserviceMod.FailureReason] = js.native
  
  /**
    * The language code for the language spoken in the source audio file. US English (en-US) is the only supported language for medical transcriptions. Any other value you enter for language code results in a BadRequestException error.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageCode] = js.native
  
  var Media: js.UndefOr[typings.awsSdk.transcribeserviceMod.Media] = js.native
  
  /**
    * The format of the input media file.
    */
  var MediaFormat: js.UndefOr[typings.awsSdk.transcribeserviceMod.MediaFormat] = js.native
  
  /**
    * The sample rate, in Hertz, of the source audio containing medical information. If you don't specify the sample rate, Amazon Transcribe Medical determines it for you. If you choose to specify the sample rate, it must match the rate detected by Amazon Transcribe Medical. In most cases, you should leave the MediaSampleHertz blank and let Amazon Transcribe Medical determine the sample rate.
    */
  var MediaSampleRateHertz: js.UndefOr[typings.awsSdk.transcribeserviceMod.MediaSampleRateHertz] = js.native
  
  /**
    * The name for a given medical transcription job.
    */
  var MedicalTranscriptionJobName: js.UndefOr[TranscriptionJobName] = js.native
  
  /**
    * Object that contains object.
    */
  var Settings: js.UndefOr[MedicalTranscriptionSetting] = js.native
  
  /**
    * The medical specialty of any clinicians providing a dictation or having a conversation. PRIMARYCARE is the only available setting for this object. This specialty enables you to generate transcriptions for the following medical fields:   Family Medicine  
    */
  var Specialty: js.UndefOr[typings.awsSdk.transcribeserviceMod.Specialty] = js.native
  
  /**
    * A timestamp that shows when the job started processing.
    */
  var StartTime: js.UndefOr[DateTime] = js.native
  
  /**
    * An object that contains the MedicalTranscript. The MedicalTranscript contains the TranscriptFileUri.
    */
  var Transcript: js.UndefOr[MedicalTranscript] = js.native
  
  /**
    * The completion status of a medical transcription job.
    */
  var TranscriptionJobStatus: js.UndefOr[typings.awsSdk.transcribeserviceMod.TranscriptionJobStatus] = js.native
  
  /**
    * The type of speech in the transcription job. CONVERSATION is generally used for patient-physician dialogues. DICTATION is the setting for physicians speaking their notes after seeing a patient. For more information, see how-it-works-med 
    */
  var Type: js.UndefOr[typings.awsSdk.transcribeserviceMod.Type] = js.native
}
object MedicalTranscriptionJob {
  
  @scala.inline
  def apply(): MedicalTranscriptionJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicalTranscriptionJob]
  }
  
  @scala.inline
  implicit class MedicalTranscriptionJobOps[Self <: MedicalTranscriptionJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompletionTime(value: DateTime): Self = this.set("CompletionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletionTime: Self = this.set("CompletionTime", js.undefined)
    
    @scala.inline
    def setCreationTime(value: DateTime): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("LanguageCode", js.undefined)
    
    @scala.inline
    def setMedia(value: Media): Self = this.set("Media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("Media", js.undefined)
    
    @scala.inline
    def setMediaFormat(value: MediaFormat): Self = this.set("MediaFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaFormat: Self = this.set("MediaFormat", js.undefined)
    
    @scala.inline
    def setMediaSampleRateHertz(value: MediaSampleRateHertz): Self = this.set("MediaSampleRateHertz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaSampleRateHertz: Self = this.set("MediaSampleRateHertz", js.undefined)
    
    @scala.inline
    def setMedicalTranscriptionJobName(value: TranscriptionJobName): Self = this.set("MedicalTranscriptionJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedicalTranscriptionJobName: Self = this.set("MedicalTranscriptionJobName", js.undefined)
    
    @scala.inline
    def setSettings(value: MedicalTranscriptionSetting): Self = this.set("Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("Settings", js.undefined)
    
    @scala.inline
    def setSpecialty(value: Specialty): Self = this.set("Specialty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecialty: Self = this.set("Specialty", js.undefined)
    
    @scala.inline
    def setStartTime(value: DateTime): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    
    @scala.inline
    def setTranscript(value: MedicalTranscript): Self = this.set("Transcript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranscript: Self = this.set("Transcript", js.undefined)
    
    @scala.inline
    def setTranscriptionJobStatus(value: TranscriptionJobStatus): Self = this.set("TranscriptionJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranscriptionJobStatus: Self = this.set("TranscriptionJobStatus", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
