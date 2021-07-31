package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranscriptionJob extends StObject {
  
  /**
    * A timestamp that shows when the job was completed.
    */
  var CompletionTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * An object that describes content redaction settings for the transcription job.
    */
  var ContentRedaction: js.UndefOr[typings.awsSdk.transcribeserviceMod.ContentRedaction] = js.undefined
  
  /**
    * A timestamp that shows when the job was created.
    */
  var CreationTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * If the TranscriptionJobStatus field is FAILED, this field contains information about why the job failed. The FailureReason field can contain one of the following values:    Unsupported media format - The media format specified in the MediaFormat field of the request isn't valid. See the description of the MediaFormat field for a list of valid values.    The media format provided does not match the detected media format - The media format of the audio file doesn't match the format specified in the MediaFormat field in the request. Check the media format of your media file and make sure that the two values match.    Invalid sample rate for audio file - The sample rate specified in the MediaSampleRateHertz of the request isn't valid. The sample rate must be between 8000 and 48000 Hertz.    The sample rate provided does not match the detected sample rate - The sample rate in the audio file doesn't match the sample rate specified in the MediaSampleRateHertz field in the request. Check the sample rate of your media file and make sure that the two values match.    Invalid file size: file size too large - The size of your audio file is larger than Amazon Transcribe can process. For more information, see Limits in the Amazon Transcribe Developer Guide.    Invalid number of channels: number of channels too large - Your audio contains more channels than Amazon Transcribe is configured to process. To request additional channels, see Amazon Transcribe Limits in the Amazon Web Services General Reference.  
    */
  var FailureReason: js.UndefOr[typings.awsSdk.transcribeserviceMod.FailureReason] = js.undefined
  
  /**
    * A value between zero and one that Amazon Transcribe assigned to the language that it identified in the source audio. Larger values indicate that Amazon Transcribe has higher confidence in the language it identified.
    */
  var IdentifiedLanguageScore: js.UndefOr[typings.awsSdk.transcribeserviceMod.IdentifiedLanguageScore] = js.undefined
  
  /**
    * A value that shows if automatic language identification was enabled for a transcription job.
    */
  var IdentifyLanguage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Provides information about how a transcription job is executed.
    */
  var JobExecutionSettings: js.UndefOr[typings.awsSdk.transcribeserviceMod.JobExecutionSettings] = js.undefined
  
  /**
    * The language code for the input speech.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageCode] = js.undefined
  
  /**
    * An object that shows the optional array of languages inputted for transcription jobs with automatic language identification enabled.
    */
  var LanguageOptions: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageOptions] = js.undefined
  
  /**
    * An object that describes the input media for the transcription job.
    */
  var Media: js.UndefOr[typings.awsSdk.transcribeserviceMod.Media] = js.undefined
  
  /**
    * The format of the input media file.
    */
  var MediaFormat: js.UndefOr[typings.awsSdk.transcribeserviceMod.MediaFormat] = js.undefined
  
  /**
    * The sample rate, in Hertz, of the audio track in the input media file. 
    */
  var MediaSampleRateHertz: js.UndefOr[typings.awsSdk.transcribeserviceMod.MediaSampleRateHertz] = js.undefined
  
  /**
    * An object containing the details of your custom language model.
    */
  var ModelSettings: js.UndefOr[typings.awsSdk.transcribeserviceMod.ModelSettings] = js.undefined
  
  /**
    * Optional settings for the transcription job. Use these settings to turn on speaker recognition, to set the maximum number of speakers that should be identified and to specify a custom vocabulary to use when processing the transcription job.
    */
  var Settings: js.UndefOr[typings.awsSdk.transcribeserviceMod.Settings] = js.undefined
  
  /**
    * A timestamp that shows with the job was started processing.
    */
  var StartTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * An object that describes the output of the transcription job.
    */
  var Transcript: js.UndefOr[typings.awsSdk.transcribeserviceMod.Transcript] = js.undefined
  
  /**
    * The name of the transcription job.
    */
  var TranscriptionJobName: js.UndefOr[typings.awsSdk.transcribeserviceMod.TranscriptionJobName] = js.undefined
  
  /**
    * The status of the transcription job.
    */
  var TranscriptionJobStatus: js.UndefOr[typings.awsSdk.transcribeserviceMod.TranscriptionJobStatus] = js.undefined
}
object TranscriptionJob {
  
  @scala.inline
  def apply(): TranscriptionJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranscriptionJob]
  }
  
  @scala.inline
  implicit class TranscriptionJobMutableBuilder[Self <: TranscriptionJob] (val x: Self) extends AnyVal {
    
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
    def setJobExecutionSettings(value: JobExecutionSettings): Self = StObject.set(x, "JobExecutionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobExecutionSettingsUndefined: Self = StObject.set(x, "JobExecutionSettings", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    @scala.inline
    def setLanguageOptions(value: LanguageOptions): Self = StObject.set(x, "LanguageOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageOptionsUndefined: Self = StObject.set(x, "LanguageOptions", js.undefined)
    
    @scala.inline
    def setLanguageOptionsVarargs(value: LanguageCode*): Self = StObject.set(x, "LanguageOptions", js.Array(value :_*))
    
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
    def setModelSettings(value: ModelSettings): Self = StObject.set(x, "ModelSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelSettingsUndefined: Self = StObject.set(x, "ModelSettings", js.undefined)
    
    @scala.inline
    def setSettings(value: Settings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
    
    @scala.inline
    def setStartTime(value: DateTime): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setTranscript(value: Transcript): Self = StObject.set(x, "Transcript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscriptUndefined: Self = StObject.set(x, "Transcript", js.undefined)
    
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
