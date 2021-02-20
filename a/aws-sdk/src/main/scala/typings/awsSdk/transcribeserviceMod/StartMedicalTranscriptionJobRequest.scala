package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartMedicalTranscriptionJobRequest extends StObject {
  
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
    * The name of the medical transcription job. You can't use the strings "." or ".." by themselves as the job name. The name must also be unique within an AWS account. If you try to create a medical transcription job with the same name as a previous medical transcription job, you get a ConflictException error.
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
    * You can specify a location in an Amazon S3 bucket to store the output of your medical transcription job. If you don't specify an output key, Amazon Transcribe Medical stores the output of your transcription job in the Amazon S3 bucket you specified. By default, the object key is "your-transcription-job-name.json". You can use output keys to specify the Amazon S3 prefix and file name of the transcription output. For example, specifying the Amazon S3 prefix, "folder1/folder2/", as an output key would lead to the output being stored as "folder1/folder2/your-transcription-job-name.json". If you specify "my-other-job-name.json" as the output key, the object key is changed to "my-other-job-name.json". You can use an output key to change both the prefix and the file name, for example "folder/my-other-job-name.json". If you specify an output key, you must also specify an S3 bucket in the OutputBucketName parameter.
    */
  var OutputKey: js.UndefOr[typings.awsSdk.transcribeserviceMod.OutputKey] = js.native
  
  /**
    * Optional settings for the medical transcription job.
    */
  var Settings: js.UndefOr[MedicalTranscriptionSetting] = js.native
  
  /**
    * The medical specialty of any clinician speaking in the input media.
    */
  var Specialty: typings.awsSdk.transcribeserviceMod.Specialty = js.native
  
  /**
    * The type of speech in the input audio. CONVERSATION refers to conversations between two or more speakers, e.g., a conversations between doctors and patients. DICTATION refers to single-speaker dictated speech, e.g., for clinical notes.
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
    Type: Type
  ): StartMedicalTranscriptionJobRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], Media = Media.asInstanceOf[js.Any], MedicalTranscriptionJobName = MedicalTranscriptionJobName.asInstanceOf[js.Any], OutputBucketName = OutputBucketName.asInstanceOf[js.Any], Specialty = Specialty.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMedicalTranscriptionJobRequest]
  }
  
  @scala.inline
  implicit class StartMedicalTranscriptionJobRequestMutableBuilder[Self <: StartMedicalTranscriptionJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
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
    def setMedicalTranscriptionJobName(value: TranscriptionJobName): Self = StObject.set(x, "MedicalTranscriptionJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputBucketName(value: OutputBucketName): Self = StObject.set(x, "OutputBucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputEncryptionKMSKeyId(value: KMSKeyId): Self = StObject.set(x, "OutputEncryptionKMSKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputEncryptionKMSKeyIdUndefined: Self = StObject.set(x, "OutputEncryptionKMSKeyId", js.undefined)
    
    @scala.inline
    def setOutputKey(value: OutputKey): Self = StObject.set(x, "OutputKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputKeyUndefined: Self = StObject.set(x, "OutputKey", js.undefined)
    
    @scala.inline
    def setSettings(value: MedicalTranscriptionSetting): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
    
    @scala.inline
    def setSpecialty(value: Specialty): Self = StObject.set(x, "Specialty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
