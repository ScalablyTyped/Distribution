package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTranscriptionJobRequest extends js.Object {
  /**
    * An object that contains the request parameters for content redaction.
    */
  var ContentRedaction: js.UndefOr[typings.awsSdk.transcribeserviceMod.ContentRedaction] = js.native
  /**
    * Provides information about how a transcription job is executed. Use this field to indicate that the job can be queued for deferred execution if the concurrency limit is reached and there are no slots available to immediately run the job.
    */
  var JobExecutionSettings: js.UndefOr[typings.awsSdk.transcribeserviceMod.JobExecutionSettings] = js.native
  /**
    * The language code for the language used in the input media file.
    */
  var LanguageCode: typings.awsSdk.transcribeserviceMod.LanguageCode = js.native
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
    * The location where the transcription is stored. If you set the OutputBucketName, Amazon Transcribe puts the transcript in the specified S3 bucket. When you call the GetTranscriptionJob operation, the operation returns this location in the TranscriptFileUri field. If you enable content redaction, the redacted transcript appears in RedactedTranscriptFileUri. If you enable content redaction and choose to output an unredacted transcript, that transcript's location still appears in the TranscriptFileUri. The S3 bucket must have permissions that allow Amazon Transcribe to put files in the bucket. For more information, see Permissions Required for IAM User Roles. You can specify an AWS Key Management Service (KMS) key to encrypt the output of your transcription using the OutputEncryptionKMSKeyId parameter. If you don't specify a KMS key, Amazon Transcribe uses the default Amazon S3 key for server-side encryption of transcripts that are placed in your S3 bucket. If you don't set the OutputBucketName, Amazon Transcribe generates a pre-signed URL, a shareable URL that provides secure access to your transcription, and returns it in the TranscriptFileUri field. Use this URL to download the transcription.
    */
  var OutputBucketName: js.UndefOr[typings.awsSdk.transcribeserviceMod.OutputBucketName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key used to encrypt the output of the transcription job. The user calling the StartTranscriptionJob operation must have permission to use the specified KMS key. You can use either of the following to identify a KMS key in the current account:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"   KMS Key Alias: "alias/ExampleAlias"   You can use either of the following to identify a KMS key in the current account or another account:   Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"   ARN of a KMS Key Alias: "arn:aws:kms:region:account ID:alias/ExampleAlias"   If you don't specify an encryption key, the output of the transcription job is encrypted with the default Amazon S3 key (SSE-S3).  If you specify a KMS key to encrypt your output, you must also specify an output location in the OutputBucketName parameter.
    */
  var OutputEncryptionKMSKeyId: js.UndefOr[KMSKeyId] = js.native
  /**
    * A Settings object that provides optional settings for a transcription job.
    */
  var Settings: js.UndefOr[typings.awsSdk.transcribeserviceMod.Settings] = js.native
  /**
    * The name of the job. Note that you can't use the strings "." or ".." by themselves as the job name. The name must also be unique within an AWS account. If you try to create a transcription job with the same name as a previous transcription job you will receive a ConflictException error.
    */
  var TranscriptionJobName: typings.awsSdk.transcribeserviceMod.TranscriptionJobName = js.native
}

object StartTranscriptionJobRequest {
  @scala.inline
  def apply(LanguageCode: LanguageCode, Media: Media, TranscriptionJobName: TranscriptionJobName): StartTranscriptionJobRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], Media = Media.asInstanceOf[js.Any], TranscriptionJobName = TranscriptionJobName.asInstanceOf[js.Any])
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
    def setLanguageCode(value: LanguageCode): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMedia(value: Media): Self = this.set("Media", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranscriptionJobName(value: TranscriptionJobName): Self = this.set("TranscriptionJobName", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentRedaction(value: ContentRedaction): Self = this.set("ContentRedaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentRedaction: Self = this.set("ContentRedaction", js.undefined)
    @scala.inline
    def setJobExecutionSettings(value: JobExecutionSettings): Self = this.set("JobExecutionSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobExecutionSettings: Self = this.set("JobExecutionSettings", js.undefined)
    @scala.inline
    def setMediaFormat(value: MediaFormat): Self = this.set("MediaFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaFormat: Self = this.set("MediaFormat", js.undefined)
    @scala.inline
    def setMediaSampleRateHertz(value: MediaSampleRateHertz): Self = this.set("MediaSampleRateHertz", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaSampleRateHertz: Self = this.set("MediaSampleRateHertz", js.undefined)
    @scala.inline
    def setOutputBucketName(value: OutputBucketName): Self = this.set("OutputBucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputBucketName: Self = this.set("OutputBucketName", js.undefined)
    @scala.inline
    def setOutputEncryptionKMSKeyId(value: KMSKeyId): Self = this.set("OutputEncryptionKMSKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputEncryptionKMSKeyId: Self = this.set("OutputEncryptionKMSKeyId", js.undefined)
    @scala.inline
    def setSettings(value: Settings): Self = this.set("Settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettings: Self = this.set("Settings", js.undefined)
  }
  
}

