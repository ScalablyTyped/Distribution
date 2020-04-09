package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMedicalTranscriptionJobRequest extends js.Object {
  /**
    * The language code for the language spoken in the input media file. US English (en-US) is the valid value for medical transcription jobs. Any other value you enter for language code results in a BadRequestException error.
    */
  var LanguageCode: typings.awsSdk.transcribeserviceMod.LanguageCode = js.native
  var Media: typings.awsSdk.transcribeserviceMod.Media = js.native
  /**
    * The audio format of the input media file.
    */
  var MediaFormat: js.UndefOr[typings.awsSdk.transcribeserviceMod.MediaFormat] = js.native
  /**
    * The sample rate, in Hertz, of the audio track in the input media file. If you do not specify the media sample rate, Amazon Transcribe Medical determines the sample rate. If you specify the sample rate, it must match the rate detected by Amazon Transcribe Medical. In most cases, you should leave the MediaSampleRateHertz field blank and let Amazon Transcribe Medical determine the sample rate.
    */
  var MediaSampleRateHertz: js.UndefOr[typings.awsSdk.transcribeserviceMod.MediaSampleRateHertz] = js.native
  /**
    * The name of the medical transcription job. You can't use the strings "." or ".." by themselves as the job name. The name must also be unique within an AWS account.
    */
  var MedicalTranscriptionJobName: TranscriptionJobName = js.native
  /**
    * The Amazon S3 location where the transcription is stored. You must set OutputBucketName for Amazon Transcribe Medical to store the transcription results. Your transcript appears in the S3 location you specify. When you call the GetMedicalTranscriptionJob, the operation returns this location in the TranscriptFileUri field. The S3 bucket must have permissions that allow Amazon Transcribe Medical to put files in the bucket. For more information, see Permissions Required for IAM User Roles. You can specify an AWS Key Management Service (KMS) key to encrypt the output of your transcription using the OutputEncryptionKMSKeyId parameter. If you don't specify a KMS key, Amazon Transcribe Medical uses the default Amazon S3 key for server-side encryption of transcripts that are placed in your S3 bucket.
    */
  var OutputBucketName: typings.awsSdk.transcribeserviceMod.OutputBucketName = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key used to encrypt the output of the transcription job. The user calling the StartMedicalTranscriptionJob operation must have permission to use the specified KMS key. You use either of the following to identify a KMS key in the current account:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"   KMS Key Alias: "alias/ExampleAlias"   You can use either of the following to identify a KMS key in the current account or another account:   Amazon Resource Name (ARN) of a KMS key in the current account or another account: "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"   ARN of a KMS Key Alias: "arn:aws:kms:region:account ID:alias/ExampleAlias"   If you don't specify an encryption key, the output of the medical transcription job is encrypted with the default Amazon S3 key (SSE-S3). If you specify a KMS key to encrypt your output, you must also specify an output location in the OutputBucketName parameter.
    */
  var OutputEncryptionKMSKeyId: js.UndefOr[KMSKeyId] = js.native
  /**
    * Optional settings for the medical transcription job.
    */
  var Settings: js.UndefOr[MedicalTranscriptionSetting] = js.native
  /**
    * The medical specialty of any clinician speaking in the input media.
    */
  var Specialty: typings.awsSdk.transcribeserviceMod.Specialty = js.native
  /**
    * The speech of clinician in the input audio. CONVERSATION refers to conversations clinicians have with patients. DICTATION refers to medical professionals dictating their notes about a patient encounter.
    */
  var Type: typings.awsSdk.transcribeserviceMod.Type = js.native
}

object StartMedicalTranscriptionJobRequest {
  @scala.inline
  def apply(
    LanguageCode: LanguageCode,
    Media: Media,
    MedicalTranscriptionJobName: TranscriptionJobName,
    OutputBucketName: OutputBucketName,
    Specialty: Specialty,
    Type: Type,
    MediaFormat: MediaFormat = null,
    MediaSampleRateHertz: Int | Double = null,
    OutputEncryptionKMSKeyId: KMSKeyId = null,
    Settings: MedicalTranscriptionSetting = null
  ): StartMedicalTranscriptionJobRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], Media = Media.asInstanceOf[js.Any], MedicalTranscriptionJobName = MedicalTranscriptionJobName.asInstanceOf[js.Any], OutputBucketName = OutputBucketName.asInstanceOf[js.Any], Specialty = Specialty.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (MediaFormat != null) __obj.updateDynamic("MediaFormat")(MediaFormat.asInstanceOf[js.Any])
    if (MediaSampleRateHertz != null) __obj.updateDynamic("MediaSampleRateHertz")(MediaSampleRateHertz.asInstanceOf[js.Any])
    if (OutputEncryptionKMSKeyId != null) __obj.updateDynamic("OutputEncryptionKMSKeyId")(OutputEncryptionKMSKeyId.asInstanceOf[js.Any])
    if (Settings != null) __obj.updateDynamic("Settings")(Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMedicalTranscriptionJobRequest]
  }
}

