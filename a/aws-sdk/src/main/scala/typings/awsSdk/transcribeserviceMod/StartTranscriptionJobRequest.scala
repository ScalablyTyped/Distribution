package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartTranscriptionJobRequest extends js.Object {
  
  /**
    * An object that contains the request parameters for content redaction.
    */
  var ContentRedaction: js.UndefOr[typings.awsSdk.transcribeserviceMod.ContentRedaction] = js.native
  
  /**
    * Set this field to true to enable automatic language identification. Automatic language identification is disabled by default. You receive a BadRequestException error if you enter a value for a LanguageCode.
    */
  var IdentifyLanguage: js.UndefOr[Boolean] = js.native
  
  /**
    * Provides information about how a transcription job is executed. Use this field to indicate that the job can be queued for deferred execution if the concurrency limit is reached and there are no slots available to immediately run the job.
    */
  var JobExecutionSettings: js.UndefOr[typings.awsSdk.transcribeserviceMod.JobExecutionSettings] = js.native
  
  /**
    * The language code for the language used in the input media file.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageCode] = js.native
  
  /**
    * An object containing a list of languages that might be present in your collection of audio files. Automatic language identification chooses a language that best matches the source audio from that list.
    */
  var LanguageOptions: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageOptions] = js.native
  
  /**
    * An object that describes the input media for a transcription job.
    */
  var Media: typings.awsSdk.transcribeserviceMod.Media = js.native
  
  /**
    * The format of the input media file.
    */
  var MediaFormat: js.UndefOr[typings.awsSdk.transcribeserviceMod.MediaFormat] = js.native
  
  /**
    * The sample rate, in Hertz, of the audio track in the input media file.  If you do not specify the media sample rate, Amazon Transcribe determines the sample rate. If you specify the sample rate, it must match the sample rate detected by Amazon Transcribe. In most cases, you should leave the MediaSampleRateHertz field blank and let Amazon Transcribe determine the sample rate.
    */
  var MediaSampleRateHertz: js.UndefOr[typings.awsSdk.transcribeserviceMod.MediaSampleRateHertz] = js.native
  
  /**
    * Choose the custom language model you use for your transcription job in this parameter.
    */
  var ModelSettings: js.UndefOr[typings.awsSdk.transcribeserviceMod.ModelSettings] = js.native
  
  /**
    * The location where the transcription is stored. If you set the OutputBucketName, Amazon Transcribe puts the transcript in the specified S3 bucket. When you call the GetTranscriptionJob operation, the operation returns this location in the TranscriptFileUri field. If you enable content redaction, the redacted transcript appears in RedactedTranscriptFileUri. If you enable content redaction and choose to output an unredacted transcript, that transcript's location still appears in the TranscriptFileUri. The S3 bucket must have permissions that allow Amazon Transcribe to put files in the bucket. For more information, see Permissions Required for IAM User Roles. You can specify an AWS Key Management Service (KMS) key to encrypt the output of your transcription using the OutputEncryptionKMSKeyId parameter. If you don't specify a KMS key, Amazon Transcribe uses the default Amazon S3 key for server-side encryption of transcripts that are placed in your S3 bucket. If you don't set the OutputBucketName, Amazon Transcribe generates a pre-signed URL, a shareable URL that provides secure access to your transcription, and returns it in the TranscriptFileUri field. Use this URL to download the transcription.
    */
  var OutputBucketName: js.UndefOr[typings.awsSdk.transcribeserviceMod.OutputBucketName] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key used to encrypt the output of the transcription job. The user calling the StartTranscriptionJob operation must have permission to use the specified KMS key. You can use either of the following to identify a KMS key in the current account:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"   KMS Key Alias: "alias/ExampleAlias"   You can use either of the following to identify a KMS key in the current account or another account:   Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"   ARN of a KMS Key Alias: "arn:aws:kms:region:account ID:alias/ExampleAlias"   If you don't specify an encryption key, the output of the transcription job is encrypted with the default Amazon S3 key (SSE-S3).  If you specify a KMS key to encrypt your output, you must also specify an output location in the OutputBucketName parameter.
    */
  var OutputEncryptionKMSKeyId: js.UndefOr[KMSKeyId] = js.native
  
  /**
    * You can specify a location in an Amazon S3 bucket to store the output of your transcription job. If you don't specify an output key, Amazon Transcribe stores the output of your transcription job in the Amazon S3 bucket you specified. By default, the object key is "your-transcription-job-name.json". You can use output keys to specify the Amazon S3 prefix and file name of the transcription output. For example, specifying the Amazon S3 prefix, "folder1/folder2/", as an output key would lead to the output being stored as "folder1/folder2/your-transcription-job-name.json". If you specify "my-other-job-name.json" as the output key, the object key is changed to "my-other-job-name.json". You can use an output key to change both the prefix and the file name, for example "folder/my-other-job-name.json". If you specify an output key, you must also specify an S3 bucket in the OutputBucketName parameter.
    */
  var OutputKey: js.UndefOr[typings.awsSdk.transcribeserviceMod.OutputKey] = js.native
  
  /**
    * A Settings object that provides optional settings for a transcription job.
    */
  var Settings: js.UndefOr[typings.awsSdk.transcribeserviceMod.Settings] = js.native
  
  /**
    * The name of the job. You can't use the strings "." or ".." by themselves as the job name. The name must also be unique within an AWS account. If you try to create a transcription job with the same name as a previous transcription job, you get a ConflictException error.
    */
  var TranscriptionJobName: typings.awsSdk.transcribeserviceMod.TranscriptionJobName = js.native
}
object StartTranscriptionJobRequest {
  
  @scala.inline
  def apply(Media: Media, TranscriptionJobName: TranscriptionJobName): StartTranscriptionJobRequest = {
    val __obj = js.Dynamic.literal(Media = Media.asInstanceOf[js.Any], TranscriptionJobName = TranscriptionJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTranscriptionJobRequest]
  }
  
  @scala.inline
  implicit class StartTranscriptionJobRequestOps[Self <: StartTranscriptionJobRequest] (val x: Self) extends AnyVal {
    
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
    def setMedia(value: Media): Self = this.set("Media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscriptionJobName(value: TranscriptionJobName): Self = this.set("TranscriptionJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentRedaction(value: ContentRedaction): Self = this.set("ContentRedaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentRedaction: Self = this.set("ContentRedaction", js.undefined)
    
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
    def setOutputBucketName(value: OutputBucketName): Self = this.set("OutputBucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputBucketName: Self = this.set("OutputBucketName", js.undefined)
    
    @scala.inline
    def setOutputEncryptionKMSKeyId(value: KMSKeyId): Self = this.set("OutputEncryptionKMSKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputEncryptionKMSKeyId: Self = this.set("OutputEncryptionKMSKeyId", js.undefined)
    
    @scala.inline
    def setOutputKey(value: OutputKey): Self = this.set("OutputKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputKey: Self = this.set("OutputKey", js.undefined)
    
    @scala.inline
    def setSettings(value: Settings): Self = this.set("Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("Settings", js.undefined)
  }
}
