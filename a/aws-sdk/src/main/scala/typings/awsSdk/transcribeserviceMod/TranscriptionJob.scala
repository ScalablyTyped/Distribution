package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranscriptionJob extends js.Object {
  
  /**
    * A timestamp that shows when the job was completed.
    */
  var CompletionTime: js.UndefOr[DateTime] = js.native
  
  /**
    * An object that describes content redaction settings for the transcription job.
    */
  var ContentRedaction: js.UndefOr[typings.awsSdk.transcribeserviceMod.ContentRedaction] = js.native
  
  /**
    * A timestamp that shows when the job was created.
    */
  var CreationTime: js.UndefOr[DateTime] = js.native
  
  /**
    * If the TranscriptionJobStatus field is FAILED, this field contains information about why the job failed. The FailureReason field can contain one of the following values:    Unsupported media format - The media format specified in the MediaFormat field of the request isn't valid. See the description of the MediaFormat field for a list of valid values.    The media format provided does not match the detected media format - The media format of the audio file doesn't match the format specified in the MediaFormat field in the request. Check the media format of your media file and make sure that the two values match.    Invalid sample rate for audio file - The sample rate specified in the MediaSampleRateHertz of the request isn't valid. The sample rate must be between 8000 and 48000 Hertz.    The sample rate provided does not match the detected sample rate - The sample rate in the audio file doesn't match the sample rate specified in the MediaSampleRateHertz field in the request. Check the sample rate of your media file and make sure that the two values match.    Invalid file size: file size too large - The size of your audio file is larger than Amazon Transcribe can process. For more information, see Limits in the Amazon Transcribe Developer Guide.    Invalid number of channels: number of channels too large - Your audio contains more channels than Amazon Transcribe is configured to process. To request additional channels, see Amazon Transcribe Limits in the Amazon Web Services General Reference.  
    */
  var FailureReason: js.UndefOr[typings.awsSdk.transcribeserviceMod.FailureReason] = js.native
  
  /**
    * A value between zero and one that Amazon Transcribe assigned to the language that it identified in the source audio. Larger values indicate that Amazon Transcribe has higher confidence in the language it identified.
    */
  var IdentifiedLanguageScore: js.UndefOr[typings.awsSdk.transcribeserviceMod.IdentifiedLanguageScore] = js.native
  
  /**
    * A value that shows if automatic language identification was enabled for a transcription job.
    */
  var IdentifyLanguage: js.UndefOr[Boolean] = js.native
  
  /**
    * Provides information about how a transcription job is executed.
    */
  var JobExecutionSettings: js.UndefOr[typings.awsSdk.transcribeserviceMod.JobExecutionSettings] = js.native
  
  /**
    * The language code for the input speech.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageCode] = js.native
  
  /**
    * An object that shows the optional array of languages inputted for transcription jobs with automatic language identification enabled.
    */
  var LanguageOptions: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageOptions] = js.native
  
  /**
    * An object that describes the input media for the transcription job.
    */
  var Media: js.UndefOr[typings.awsSdk.transcribeserviceMod.Media] = js.native
  
  /**
    * The format of the input media file.
    */
  var MediaFormat: js.UndefOr[typings.awsSdk.transcribeserviceMod.MediaFormat] = js.native
  
  /**
    * The sample rate, in Hertz, of the audio track in the input media file. 
    */
  var MediaSampleRateHertz: js.UndefOr[typings.awsSdk.transcribeserviceMod.MediaSampleRateHertz] = js.native
  
  /**
    * An object containing the details of your custom language model.
    */
  var ModelSettings: js.UndefOr[typings.awsSdk.transcribeserviceMod.ModelSettings] = js.native
  
  /**
    * Optional settings for the transcription job. Use these settings to turn on speaker recognition, to set the maximum number of speakers that should be identified and to specify a custom vocabulary to use when processing the transcription job.
    */
  var Settings: js.UndefOr[typings.awsSdk.transcribeserviceMod.Settings] = js.native
  
  /**
    * A timestamp that shows with the job was started processing.
    */
  var StartTime: js.UndefOr[DateTime] = js.native
  
  /**
    * An object that describes the output of the transcription job.
    */
  var Transcript: js.UndefOr[typings.awsSdk.transcribeserviceMod.Transcript] = js.native
  
  /**
    * The name of the transcription job.
    */
  var TranscriptionJobName: js.UndefOr[typings.awsSdk.transcribeserviceMod.TranscriptionJobName] = js.native
  
  /**
    * The status of the transcription job.
    */
  var TranscriptionJobStatus: js.UndefOr[typings.awsSdk.transcribeserviceMod.TranscriptionJobStatus] = js.native
}
object TranscriptionJob {
  
  @scala.inline
  def apply(): TranscriptionJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranscriptionJob]
  }
  
  @scala.inline
  implicit class TranscriptionJobOps[Self <: TranscriptionJob] (val x: Self) extends AnyVal {
    
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
    def setContentRedaction(value: ContentRedaction): Self = this.set("ContentRedaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentRedaction: Self = this.set("ContentRedaction", js.undefined)
    
    @scala.inline
    def setCreationTime(value: DateTime): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    
    @scala.inline
    def setIdentifiedLanguageScore(value: IdentifiedLanguageScore): Self = this.set("IdentifiedLanguageScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifiedLanguageScore: Self = this.set("IdentifiedLanguageScore", js.undefined)
    
    @scala.inline
    def setIdentifyLanguage(value: Boolean): Self = this.set("IdentifyLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifyLanguage: Self = this.set("IdentifyLanguage", js.undefined)
    
    @scala.inline
    def setJobExecutionSettings(value: JobExecutionSettings): Self = this.set("JobExecutionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobExecutionSettings: Self = this.set("JobExecutionSettings", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("LanguageCode", js.undefined)
    
    @scala.inline
    def setLanguageOptionsVarargs(value: LanguageCode*): Self = this.set("LanguageOptions", js.Array(value :_*))
    
    @scala.inline
    def setLanguageOptions(value: LanguageOptions): Self = this.set("LanguageOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageOptions: Self = this.set("LanguageOptions", js.undefined)
    
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
    def setModelSettings(value: ModelSettings): Self = this.set("ModelSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelSettings: Self = this.set("ModelSettings", js.undefined)
    
    @scala.inline
    def setSettings(value: Settings): Self = this.set("Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("Settings", js.undefined)
    
    @scala.inline
    def setStartTime(value: DateTime): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    
    @scala.inline
    def setTranscript(value: Transcript): Self = this.set("Transcript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranscript: Self = this.set("Transcript", js.undefined)
    
    @scala.inline
    def setTranscriptionJobName(value: TranscriptionJobName): Self = this.set("TranscriptionJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranscriptionJobName: Self = this.set("TranscriptionJobName", js.undefined)
    
    @scala.inline
    def setTranscriptionJobStatus(value: TranscriptionJobStatus): Self = this.set("TranscriptionJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranscriptionJobStatus: Self = this.set("TranscriptionJobStatus", js.undefined)
  }
}
