package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranscriptionJob extends StObject {
  
  /**
    * The date and time the specified transcription job finished processing. Timestamps are in the format YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC. For example, 2022-05-04T12:33:13.922000-07:00 represents a transcription job that started processing at 12:33 PM UTC-7 on May 4, 2022.
    */
  var CompletionTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates whether redaction was enabled in your transcript.
    */
  var ContentRedaction: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.ContentRedaction] = js.undefined
  
  /**
    * The date and time the specified transcription job request was made. Timestamps are in the format YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC. For example, 2022-05-04T12:32:58.761000-07:00 represents a transcription job that started processing at 12:32 PM UTC-7 on May 4, 2022.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If TranscriptionJobStatus is FAILED, FailureReason contains information about why the transcription job request failed. The FailureReason field contains one of the following values:    Unsupported media format. The media format specified in MediaFormat isn't valid. Refer to MediaFormat for a list of supported formats.    The media format provided does not match the detected media format. The media format specified in MediaFormat doesn't match the format of the input file. Check the media format of your media file and correct the specified value.    Invalid sample rate for audio file. The sample rate specified in MediaSampleRateHertz isn't valid. The sample rate must be between 8,000 and 48,000 hertz.    The sample rate provided does not match the detected sample rate. The sample rate specified in MediaSampleRateHertz doesn't match the sample rate detected in your input media file. Check the sample rate of your media file and correct the specified value.    Invalid file size: file size too large. The size of your media file is larger than what Amazon Transcribe can process. For more information, refer to Guidelines and quotas.    Invalid number of channels: number of channels too large. Your audio contains more channels than Amazon Transcribe is able to process. For more information, refer to Guidelines and quotas.  
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
    * Provides information about how your transcription job was processed. This parameter shows if your request was queued and what data access role was used.
    */
  var JobExecutionSettings: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.JobExecutionSettings] = js.undefined
  
  /**
    * The language code used to create your transcription job. This parameter is used with single-language identification. For multi-language identification requests, refer to the plural version of this parameter, LanguageCodes.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.LanguageCode] = js.undefined
  
  /**
    * The language codes used to create your transcription job. This parameter is used with multi-language identification. For single-language identification requests, refer to the singular version of this parameter, LanguageCode.
    */
  var LanguageCodes: js.UndefOr[LanguageCodeList] = js.undefined
  
  /**
    * Provides the name and language of all custom language models, custom vocabularies, and custom vocabulary filters that you included in your request.
    */
  var LanguageIdSettings: js.UndefOr[LanguageIdSettingsMap] = js.undefined
  
  /**
    * Provides the language codes you specified in your request.
    */
  var LanguageOptions: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.LanguageOptions] = js.undefined
  
  /**
    * Provides the Amazon S3 location of the media file you used in your request.
    */
  var Media: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.Media] = js.undefined
  
  /**
    * The format of the input media file.
    */
  var MediaFormat: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.MediaFormat] = js.undefined
  
  /**
    * The sample rate, in hertz, of the audio track in your input media file.
    */
  var MediaSampleRateHertz: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.MediaSampleRateHertz] = js.undefined
  
  /**
    * Provides information on the custom language model you included in your request.
    */
  var ModelSettings: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.ModelSettings] = js.undefined
  
  /**
    * Provides information on any additional settings that were included in your request. Additional settings include channel identification, alternative transcriptions, speaker partitioning, custom vocabularies, and custom vocabulary filters.
    */
  var Settings: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.Settings] = js.undefined
  
  /**
    * The date and time the specified transcription job began processing. Timestamps are in the format YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC. For example, 2022-05-04T12:32:58.789000-07:00 represents a transcription job that started processing at 12:32 PM UTC-7 on May 4, 2022.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates whether subtitles were generated with your transcription.
    */
  var Subtitles: js.UndefOr[SubtitlesOutput] = js.undefined
  
  /**
    * The tags, each in the form of a key:value pair, assigned to the specified transcription job.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Provides you with the Amazon S3 URI you can use to access your transcript.
    */
  var Transcript: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.Transcript] = js.undefined
  
  /**
    * The name of the transcription job. Job names are case sensitive and must be unique within an Amazon Web Services account.
    */
  var TranscriptionJobName: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.TranscriptionJobName] = js.undefined
  
  /**
    * Provides the status of the specified transcription job. If the status is COMPLETED, the job is finished and you can find the results at the location specified in TranscriptFileUri (or RedactedTranscriptFileUri, if you requested transcript redaction). If the status is FAILED, FailureReason provides details on why your transcription job failed.
    */
  var TranscriptionJobStatus: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.TranscriptionJobStatus] = js.undefined
}
object TranscriptionJob {
  
  inline def apply(): TranscriptionJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranscriptionJob]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TranscriptionJob] (val x: Self) extends AnyVal {
    
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
    
    inline def setJobExecutionSettings(value: JobExecutionSettings): Self = StObject.set(x, "JobExecutionSettings", value.asInstanceOf[js.Any])
    
    inline def setJobExecutionSettingsUndefined: Self = StObject.set(x, "JobExecutionSettings", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setLanguageCodes(value: LanguageCodeList): Self = StObject.set(x, "LanguageCodes", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodesUndefined: Self = StObject.set(x, "LanguageCodes", js.undefined)
    
    inline def setLanguageCodesVarargs(value: LanguageCodeItem*): Self = StObject.set(x, "LanguageCodes", js.Array(value*))
    
    inline def setLanguageIdSettings(value: LanguageIdSettingsMap): Self = StObject.set(x, "LanguageIdSettings", value.asInstanceOf[js.Any])
    
    inline def setLanguageIdSettingsUndefined: Self = StObject.set(x, "LanguageIdSettings", js.undefined)
    
    inline def setLanguageOptions(value: LanguageOptions): Self = StObject.set(x, "LanguageOptions", value.asInstanceOf[js.Any])
    
    inline def setLanguageOptionsUndefined: Self = StObject.set(x, "LanguageOptions", js.undefined)
    
    inline def setLanguageOptionsVarargs(value: LanguageCode*): Self = StObject.set(x, "LanguageOptions", js.Array(value*))
    
    inline def setMedia(value: Media): Self = StObject.set(x, "Media", value.asInstanceOf[js.Any])
    
    inline def setMediaFormat(value: MediaFormat): Self = StObject.set(x, "MediaFormat", value.asInstanceOf[js.Any])
    
    inline def setMediaFormatUndefined: Self = StObject.set(x, "MediaFormat", js.undefined)
    
    inline def setMediaSampleRateHertz(value: MediaSampleRateHertz): Self = StObject.set(x, "MediaSampleRateHertz", value.asInstanceOf[js.Any])
    
    inline def setMediaSampleRateHertzUndefined: Self = StObject.set(x, "MediaSampleRateHertz", js.undefined)
    
    inline def setMediaUndefined: Self = StObject.set(x, "Media", js.undefined)
    
    inline def setModelSettings(value: ModelSettings): Self = StObject.set(x, "ModelSettings", value.asInstanceOf[js.Any])
    
    inline def setModelSettingsUndefined: Self = StObject.set(x, "ModelSettings", js.undefined)
    
    inline def setSettings(value: Settings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setSubtitles(value: SubtitlesOutput): Self = StObject.set(x, "Subtitles", value.asInstanceOf[js.Any])
    
    inline def setSubtitlesUndefined: Self = StObject.set(x, "Subtitles", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTranscript(value: Transcript): Self = StObject.set(x, "Transcript", value.asInstanceOf[js.Any])
    
    inline def setTranscriptUndefined: Self = StObject.set(x, "Transcript", js.undefined)
    
    inline def setTranscriptionJobName(value: TranscriptionJobName): Self = StObject.set(x, "TranscriptionJobName", value.asInstanceOf[js.Any])
    
    inline def setTranscriptionJobNameUndefined: Self = StObject.set(x, "TranscriptionJobName", js.undefined)
    
    inline def setTranscriptionJobStatus(value: TranscriptionJobStatus): Self = StObject.set(x, "TranscriptionJobStatus", value.asInstanceOf[js.Any])
    
    inline def setTranscriptionJobStatusUndefined: Self = StObject.set(x, "TranscriptionJobStatus", js.undefined)
  }
}
