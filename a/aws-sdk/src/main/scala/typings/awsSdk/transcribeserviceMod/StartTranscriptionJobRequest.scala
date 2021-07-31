package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTranscriptionJobRequest extends StObject {
  
  /**
    * An object that contains the request parameters for content redaction.
    */
  var ContentRedaction: js.UndefOr[typings.awsSdk.transcribeserviceMod.ContentRedaction] = js.undefined
  
  /**
    * Set this field to true to enable automatic language identification. Automatic language identification is disabled by default. You receive a BadRequestException error if you enter a value for a LanguageCode.
    */
  var IdentifyLanguage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Provides information about how a transcription job is executed. Use this field to indicate that the job can be queued for deferred execution if the concurrency limit is reached and there are no slots available to immediately run the job.
    */
  var JobExecutionSettings: js.UndefOr[typings.awsSdk.transcribeserviceMod.JobExecutionSettings] = js.undefined
  
  /**
    * The language code for the language used in the input media file.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageCode] = js.undefined
  
  /**
    * An object containing a list of languages that might be present in your collection of audio files. Automatic language identification chooses a language that best matches the source audio from that list.
    */
  var LanguageOptions: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageOptions] = js.undefined
  
  /**
    * An object that describes the input media for a transcription job.
    */
  var Media: typings.awsSdk.transcribeserviceMod.Media
  
  /**
    * The format of the input media file.
    */
  var MediaFormat: js.UndefOr[typings.awsSdk.transcribeserviceMod.MediaFormat] = js.undefined
  
  /**
    * The sample rate, in Hertz, of the audio track in the input media file.  If you do not specify the media sample rate, Amazon Transcribe determines the sample rate. If you specify the sample rate, it must match the sample rate detected by Amazon Transcribe. In most cases, you should leave the MediaSampleRateHertz field blank and let Amazon Transcribe determine the sample rate.
    */
  var MediaSampleRateHertz: js.UndefOr[typings.awsSdk.transcribeserviceMod.MediaSampleRateHertz] = js.undefined
  
  /**
    * Choose the custom language model you use for your transcription job in this parameter.
    */
  var ModelSettings: js.UndefOr[typings.awsSdk.transcribeserviceMod.ModelSettings] = js.undefined
  
  /**
    * The location where the transcription is stored. If you set the OutputBucketName, Amazon Transcribe puts the transcript in the specified S3 bucket. When you call the GetTranscriptionJob operation, the operation returns this location in the TranscriptFileUri field. If you enable content redaction, the redacted transcript appears in RedactedTranscriptFileUri. If you enable content redaction and choose to output an unredacted transcript, that transcript's location still appears in the TranscriptFileUri. The S3 bucket must have permissions that allow Amazon Transcribe to put files in the bucket. For more information, see Permissions Required for IAM User Roles. You can specify an AWS Key Management Service (KMS) key to encrypt the output of your transcription using the OutputEncryptionKMSKeyId parameter. If you don't specify a KMS key, Amazon Transcribe uses the default Amazon S3 key for server-side encryption of transcripts that are placed in your S3 bucket. If you don't set the OutputBucketName, Amazon Transcribe generates a pre-signed URL, a shareable URL that provides secure access to your transcription, and returns it in the TranscriptFileUri field. Use this URL to download the transcription.
    */
  var OutputBucketName: js.UndefOr[typings.awsSdk.transcribeserviceMod.OutputBucketName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key used to encrypt the output of the transcription job. The user calling the StartTranscriptionJob operation must have permission to use the specified KMS key. You can use either of the following to identify a KMS key in the current account:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"   KMS Key Alias: "alias/ExampleAlias"   You can use either of the following to identify a KMS key in the current account or another account:   Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"   ARN of a KMS Key Alias: "arn:aws:kms:region:account ID:alias/ExampleAlias"   If you don't specify an encryption key, the output of the transcription job is encrypted with the default Amazon S3 key (SSE-S3).  If you specify a KMS key to encrypt your output, you must also specify an output location in the OutputBucketName parameter.
    */
  var OutputEncryptionKMSKeyId: js.UndefOr[KMSKeyId] = js.undefined
  
  /**
    * You can specify a location in an Amazon S3 bucket to store the output of your transcription job. If you don't specify an output key, Amazon Transcribe stores the output of your transcription job in the Amazon S3 bucket you specified. By default, the object key is "your-transcription-job-name.json". You can use output keys to specify the Amazon S3 prefix and file name of the transcription output. For example, specifying the Amazon S3 prefix, "folder1/folder2/", as an output key would lead to the output being stored as "folder1/folder2/your-transcription-job-name.json". If you specify "my-other-job-name.json" as the output key, the object key is changed to "my-other-job-name.json". You can use an output key to change both the prefix and the file name, for example "folder/my-other-job-name.json". If you specify an output key, you must also specify an S3 bucket in the OutputBucketName parameter.
    */
  var OutputKey: js.UndefOr[typings.awsSdk.transcribeserviceMod.OutputKey] = js.undefined
  
  /**
    * A Settings object that provides optional settings for a transcription job.
    */
  var Settings: js.UndefOr[typings.awsSdk.transcribeserviceMod.Settings] = js.undefined
  
  /**
    * The name of the job. You can't use the strings "." or ".." by themselves as the job name. The name must also be unique within an AWS account. If you try to create a transcription job with the same name as a previous transcription job, you get a ConflictException error.
    */
  var TranscriptionJobName: typings.awsSdk.transcribeserviceMod.TranscriptionJobName
}
object StartTranscriptionJobRequest {
  
  @scala.inline
  def apply(Media: Media, TranscriptionJobName: TranscriptionJobName): StartTranscriptionJobRequest = {
    val __obj = js.Dynamic.literal(Media = Media.asInstanceOf[js.Any], TranscriptionJobName = TranscriptionJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTranscriptionJobRequest]
  }
  
  @scala.inline
  implicit class StartTranscriptionJobRequestMutableBuilder[Self <: StartTranscriptionJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentRedaction(value: ContentRedaction): Self = StObject.set(x, "ContentRedaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentRedactionUndefined: Self = StObject.set(x, "ContentRedaction", js.undefined)
    
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
    def setModelSettings(value: ModelSettings): Self = StObject.set(x, "ModelSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelSettingsUndefined: Self = StObject.set(x, "ModelSettings", js.undefined)
    
    @scala.inline
    def setOutputBucketName(value: OutputBucketName): Self = StObject.set(x, "OutputBucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputBucketNameUndefined: Self = StObject.set(x, "OutputBucketName", js.undefined)
    
    @scala.inline
    def setOutputEncryptionKMSKeyId(value: KMSKeyId): Self = StObject.set(x, "OutputEncryptionKMSKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputEncryptionKMSKeyIdUndefined: Self = StObject.set(x, "OutputEncryptionKMSKeyId", js.undefined)
    
    @scala.inline
    def setOutputKey(value: OutputKey): Self = StObject.set(x, "OutputKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputKeyUndefined: Self = StObject.set(x, "OutputKey", js.undefined)
    
    @scala.inline
    def setSettings(value: Settings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
    
    @scala.inline
    def setTranscriptionJobName(value: TranscriptionJobName): Self = StObject.set(x, "TranscriptionJobName", value.asInstanceOf[js.Any])
  }
}
