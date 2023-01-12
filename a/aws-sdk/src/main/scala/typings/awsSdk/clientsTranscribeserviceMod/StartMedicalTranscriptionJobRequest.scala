package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartMedicalTranscriptionJobRequest extends StObject {
  
  /**
    * Labels all personal health information (PHI) identified in your transcript. For more information, see Identifying personal health information (PHI) in a transcription.
    */
  var ContentIdentificationType: js.UndefOr[MedicalContentIdentificationType] = js.undefined
  
  /**
    * A map of plain text, non-secret key:value pairs, known as encryption context pairs, that provide an added layer of security for your data. For more information, see KMS encryption context and Asymmetric keys in KMS.
    */
  var KMSEncryptionContext: js.UndefOr[KMSEncryptionContextMap] = js.undefined
  
  /**
    * The language code that represents the language spoken in the input media file. US English (en-US) is the only valid value for medical transcription jobs. Any other value you enter for language code results in a BadRequestException error.
    */
  var LanguageCode: typings.awsSdk.clientsTranscribeserviceMod.LanguageCode
  
  var Media: typings.awsSdk.clientsTranscribeserviceMod.Media
  
  /**
    * Specify the format of your input media file.
    */
  var MediaFormat: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.MediaFormat] = js.undefined
  
  /**
    * The sample rate, in Hertz, of the audio track in your input media file. If you don't specify the media sample rate, Amazon Transcribe Medical determines it for you. If you specify the sample rate, it must match the rate detected by Amazon Transcribe Medical; if there's a mismatch between the value you specify and the value detected, your job fails. Therefore, in most cases, it's advised to omit MediaSampleRateHertz and let Amazon Transcribe Medical determine the sample rate.
    */
  var MediaSampleRateHertz: js.UndefOr[MedicalMediaSampleRateHertz] = js.undefined
  
  /**
    * A unique name, chosen by you, for your medical transcription job. The name you specify is also used as the default name of your transcription output file. If you want to specify a different name for your transcription output, use the OutputKey parameter. This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If you try to create a new job with the same name as an existing job, you get a ConflictException error.
    */
  var MedicalTranscriptionJobName: TranscriptionJobName
  
  /**
    * The name of the Amazon S3 bucket where you want your medical transcription output stored. Do not include the S3:// prefix of the specified bucket. If you want your output to go to a sub-folder of this bucket, specify it using the OutputKey parameter; OutputBucketName only accepts the name of a bucket. For example, if you want your output stored in S3://DOC-EXAMPLE-BUCKET, set OutputBucketName to DOC-EXAMPLE-BUCKET. However, if you want your output stored in S3://DOC-EXAMPLE-BUCKET/test-files/, set OutputBucketName to DOC-EXAMPLE-BUCKET and OutputKey to test-files/. Note that Amazon Transcribe must have permission to use the specified location. You can change Amazon S3 permissions using the Amazon Web Services Management Console. See also Permissions Required for IAM User Roles. If you don't specify OutputBucketName, your transcript is placed in a service-managed Amazon S3 bucket and you are provided with a URI to access your transcript.
    */
  var OutputBucketName: typings.awsSdk.clientsTranscribeserviceMod.OutputBucketName
  
  /**
    * The KMS key you want to use to encrypt your medical transcription output. If using a key located in the current Amazon Web Services account, you can specify your KMS key in one of four ways:   Use the KMS key ID itself. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.   Use an alias for the KMS key ID. For example, alias/ExampleAlias.   Use the Amazon Resource Name (ARN) for the KMS key ID. For example, arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab.   Use the ARN for the KMS key alias. For example, arn:aws:kms:region:account-ID:alias/ExampleAlias.   If using a key located in a different Amazon Web Services account than the current Amazon Web Services account, you can specify your KMS key in one of two ways:   Use the ARN for the KMS key ID. For example, arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab.   Use the ARN for the KMS key alias. For example, arn:aws:kms:region:account-ID:alias/ExampleAlias.   If you don't specify an encryption key, your output is encrypted with the default Amazon S3 key (SSE-S3). If you specify a KMS key to encrypt your output, you must also specify an output location using the OutputLocation parameter. Note that the user making the request must have permission to use the specified KMS key.
    */
  var OutputEncryptionKMSKeyId: js.UndefOr[KMSKeyId] = js.undefined
  
  /**
    * Use in combination with OutputBucketName to specify the output location of your transcript and, optionally, a unique name for your output file. The default name for your transcription output is the same as the name you specified for your medical transcription job (MedicalTranscriptionJobName). Here are some examples of how you can use OutputKey:   If you specify 'DOC-EXAMPLE-BUCKET' as the OutputBucketName and 'my-transcript.json' as the OutputKey, your transcription output path is s3://DOC-EXAMPLE-BUCKET/my-transcript.json.   If you specify 'my-first-transcription' as the MedicalTranscriptionJobName, 'DOC-EXAMPLE-BUCKET' as the OutputBucketName, and 'my-transcript' as the OutputKey, your transcription output path is s3://DOC-EXAMPLE-BUCKET/my-transcript/my-first-transcription.json.   If you specify 'DOC-EXAMPLE-BUCKET' as the OutputBucketName and 'test-files/my-transcript.json' as the OutputKey, your transcription output path is s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript.json.   If you specify 'my-first-transcription' as the MedicalTranscriptionJobName, 'DOC-EXAMPLE-BUCKET' as the OutputBucketName, and 'test-files/my-transcript' as the OutputKey, your transcription output path is s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript/my-first-transcription.json.   If you specify the name of an Amazon S3 bucket sub-folder that doesn't exist, one is created for you.
    */
  var OutputKey: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.OutputKey] = js.undefined
  
  /**
    * Specify additional optional settings in your request, including channel identification, alternative transcriptions, and speaker labeling; allows you to apply custom vocabularies to your transcription job.
    */
  var Settings: js.UndefOr[MedicalTranscriptionSetting] = js.undefined
  
  /**
    * Specify the predominant medical specialty represented in your media. For batch transcriptions, PRIMARYCARE is the only valid value. If you require additional specialties, refer to .
    */
  var Specialty: typings.awsSdk.clientsTranscribeserviceMod.Specialty
  
  /**
    * Adds one or more custom tags, each in the form of a key:value pair, to a new medical transcription job at the time you start this new job. To learn more about using tags with Amazon Transcribe, refer to Tagging resources.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Specify whether your input media contains only one person (DICTATION) or contains a conversation between two people (CONVERSATION). For example, DICTATION could be used for a medical professional wanting to transcribe voice memos; CONVERSATION could be used for transcribing the doctor-patient dialogue during the patient's office visit.
    */
  var Type: typings.awsSdk.clientsTranscribeserviceMod.Type
}
object StartMedicalTranscriptionJobRequest {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: StartMedicalTranscriptionJobRequest] (val x: Self) extends AnyVal {
    
    inline def setContentIdentificationType(value: MedicalContentIdentificationType): Self = StObject.set(x, "ContentIdentificationType", value.asInstanceOf[js.Any])
    
    inline def setContentIdentificationTypeUndefined: Self = StObject.set(x, "ContentIdentificationType", js.undefined)
    
    inline def setKMSEncryptionContext(value: KMSEncryptionContextMap): Self = StObject.set(x, "KMSEncryptionContext", value.asInstanceOf[js.Any])
    
    inline def setKMSEncryptionContextUndefined: Self = StObject.set(x, "KMSEncryptionContext", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: Media): Self = StObject.set(x, "Media", value.asInstanceOf[js.Any])
    
    inline def setMediaFormat(value: MediaFormat): Self = StObject.set(x, "MediaFormat", value.asInstanceOf[js.Any])
    
    inline def setMediaFormatUndefined: Self = StObject.set(x, "MediaFormat", js.undefined)
    
    inline def setMediaSampleRateHertz(value: MedicalMediaSampleRateHertz): Self = StObject.set(x, "MediaSampleRateHertz", value.asInstanceOf[js.Any])
    
    inline def setMediaSampleRateHertzUndefined: Self = StObject.set(x, "MediaSampleRateHertz", js.undefined)
    
    inline def setMedicalTranscriptionJobName(value: TranscriptionJobName): Self = StObject.set(x, "MedicalTranscriptionJobName", value.asInstanceOf[js.Any])
    
    inline def setOutputBucketName(value: OutputBucketName): Self = StObject.set(x, "OutputBucketName", value.asInstanceOf[js.Any])
    
    inline def setOutputEncryptionKMSKeyId(value: KMSKeyId): Self = StObject.set(x, "OutputEncryptionKMSKeyId", value.asInstanceOf[js.Any])
    
    inline def setOutputEncryptionKMSKeyIdUndefined: Self = StObject.set(x, "OutputEncryptionKMSKeyId", js.undefined)
    
    inline def setOutputKey(value: OutputKey): Self = StObject.set(x, "OutputKey", value.asInstanceOf[js.Any])
    
    inline def setOutputKeyUndefined: Self = StObject.set(x, "OutputKey", js.undefined)
    
    inline def setSettings(value: MedicalTranscriptionSetting): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
    
    inline def setSpecialty(value: Specialty): Self = StObject.set(x, "Specialty", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
