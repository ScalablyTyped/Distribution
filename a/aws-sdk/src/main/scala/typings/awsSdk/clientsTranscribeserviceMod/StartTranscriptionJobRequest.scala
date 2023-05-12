package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTranscriptionJobRequest extends StObject {
  
  /**
    * Makes it possible to redact or flag specified personally identifiable information (PII) in your transcript. If you use ContentRedaction, you must also include the sub-parameters: PiiEntityTypes, RedactionOutput, and RedactionType.
    */
  var ContentRedaction: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.ContentRedaction] = js.undefined
  
  /**
    * Enables automatic language identification in your transcription job request. Use this parameter if your media file contains only one language. If your media contains multiple languages, use IdentifyMultipleLanguages instead. If you include IdentifyLanguage, you can optionally include a list of language codes, using LanguageOptions, that you think may be present in your media file. Including LanguageOptions restricts IdentifyLanguage to only the language options that you specify, which can improve transcription accuracy. If you want to apply a custom language model, a custom vocabulary, or a custom vocabulary filter to your automatic language identification request, include LanguageIdSettings with the relevant sub-parameters (VocabularyName, LanguageModelName, and VocabularyFilterName). If you include LanguageIdSettings, also include LanguageOptions. Note that you must include one of LanguageCode, IdentifyLanguage, or IdentifyMultipleLanguages in your request. If you include more than one of these parameters, your transcription job fails.
    */
  var IdentifyLanguage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables automatic multi-language identification in your transcription job request. Use this parameter if your media file contains more than one language. If your media contains only one language, use IdentifyLanguage instead. If you include IdentifyMultipleLanguages, you can optionally include a list of language codes, using LanguageOptions, that you think may be present in your media file. Including LanguageOptions restricts IdentifyLanguage to only the language options that you specify, which can improve transcription accuracy. If you want to apply a custom vocabulary or a custom vocabulary filter to your automatic language identification request, include LanguageIdSettings with the relevant sub-parameters (VocabularyName and VocabularyFilterName). If you include LanguageIdSettings, also include LanguageOptions. Note that you must include one of LanguageCode, IdentifyLanguage, or IdentifyMultipleLanguages in your request. If you include more than one of these parameters, your transcription job fails.
    */
  var IdentifyMultipleLanguages: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Makes it possible to control how your transcription job is processed. Currently, the only JobExecutionSettings modification you can choose is enabling job queueing using the AllowDeferredExecution sub-parameter. If you include JobExecutionSettings in your request, you must also include the sub-parameters: AllowDeferredExecution and DataAccessRoleArn.
    */
  var JobExecutionSettings: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.JobExecutionSettings] = js.undefined
  
  /**
    * A map of plain text, non-secret key:value pairs, known as encryption context pairs, that provide an added layer of security for your data. For more information, see KMS encryption context and Asymmetric keys in KMS.
    */
  var KMSEncryptionContext: js.UndefOr[KMSEncryptionContextMap] = js.undefined
  
  /**
    * The language code that represents the language spoken in the input media file. If you're unsure of the language spoken in your media file, consider using IdentifyLanguage or IdentifyMultipleLanguages to enable automatic language identification. Note that you must include one of LanguageCode, IdentifyLanguage, or IdentifyMultipleLanguages in your request. If you include more than one of these parameters, your transcription job fails. For a list of supported languages and their associated language codes, refer to the Supported languages table.  To transcribe speech in Modern Standard Arabic (ar-SA), your media file must be encoded at a sample rate of 16,000 Hz or higher. 
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.LanguageCode] = js.undefined
  
  /**
    * If using automatic language identification in your request and you want to apply a custom language model, a custom vocabulary, or a custom vocabulary filter, include LanguageIdSettings with the relevant sub-parameters (VocabularyName, LanguageModelName, and VocabularyFilterName). Note that multi-language identification (IdentifyMultipleLanguages) doesn't support custom language models.  LanguageIdSettings supports two to five language codes. Each language code you include can have an associated custom language model, custom vocabulary, and custom vocabulary filter. The language codes that you specify must match the languages of the associated custom language models, custom vocabularies, and custom vocabulary filters. It's recommended that you include LanguageOptions when using LanguageIdSettings to ensure that the correct language dialect is identified. For example, if you specify a custom vocabulary that is in en-US but Amazon Transcribe determines that the language spoken in your media is en-AU, your custom vocabulary is not applied to your transcription. If you include LanguageOptions and include en-US as the only English language dialect, your custom vocabulary is applied to your transcription. If you want to include a custom language model with your request but do not want to use automatic language identification, use instead the  parameter with the LanguageModelName sub-parameter. If you want to include a custom vocabulary or a custom vocabulary filter (or both) with your request but do not want to use automatic language identification, use instead the  parameter with the VocabularyName or VocabularyFilterName (or both) sub-parameter.
    */
  var LanguageIdSettings: js.UndefOr[LanguageIdSettingsMap] = js.undefined
  
  /**
    * You can specify two or more language codes that represent the languages you think may be present in your media. Including more than five is not recommended. If you're unsure what languages are present, do not include this parameter. If you include LanguageOptions in your request, you must also include IdentifyLanguage. For more information, refer to Supported languages. To transcribe speech in Modern Standard Arabic (ar-SA), your media file must be encoded at a sample rate of 16,000 Hz or higher.
    */
  var LanguageOptions: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.LanguageOptions] = js.undefined
  
  /**
    * Describes the Amazon S3 location of the media file you want to use in your request.
    */
  var Media: typings.awsSdk.clientsTranscribeserviceMod.Media
  
  /**
    * Specify the format of your input media file.
    */
  var MediaFormat: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.MediaFormat] = js.undefined
  
  /**
    * The sample rate, in hertz, of the audio track in your input media file. If you don't specify the media sample rate, Amazon Transcribe determines it for you. If you specify the sample rate, it must match the rate detected by Amazon Transcribe. If there's a mismatch between the value that you specify and the value detected, your job fails. In most cases, you can omit MediaSampleRateHertz and let Amazon Transcribe determine the sample rate.
    */
  var MediaSampleRateHertz: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.MediaSampleRateHertz] = js.undefined
  
  /**
    * Specify the custom language model you want to include with your transcription job. If you include ModelSettings in your request, you must include the LanguageModelName sub-parameter. For more information, see Custom language models.
    */
  var ModelSettings: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.ModelSettings] = js.undefined
  
  /**
    * The name of the Amazon S3 bucket where you want your transcription output stored. Do not include the S3:// prefix of the specified bucket. If you want your output to go to a sub-folder of this bucket, specify it using the OutputKey parameter; OutputBucketName only accepts the name of a bucket. For example, if you want your output stored in S3://DOC-EXAMPLE-BUCKET, set OutputBucketName to DOC-EXAMPLE-BUCKET. However, if you want your output stored in S3://DOC-EXAMPLE-BUCKET/test-files/, set OutputBucketName to DOC-EXAMPLE-BUCKET and OutputKey to test-files/. Note that Amazon Transcribe must have permission to use the specified location. You can change Amazon S3 permissions using the Amazon Web Services Management Console. See also Permissions Required for IAM User Roles. If you don't specify OutputBucketName, your transcript is placed in a service-managed Amazon S3 bucket and you are provided with a URI to access your transcript.
    */
  var OutputBucketName: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.OutputBucketName] = js.undefined
  
  /**
    * The KMS key you want to use to encrypt your transcription output. If using a key located in the current Amazon Web Services account, you can specify your KMS key in one of four ways:   Use the KMS key ID itself. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.   Use an alias for the KMS key ID. For example, alias/ExampleAlias.   Use the Amazon Resource Name (ARN) for the KMS key ID. For example, arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab.   Use the ARN for the KMS key alias. For example, arn:aws:kms:region:account-ID:alias/ExampleAlias.   If using a key located in a different Amazon Web Services account than the current Amazon Web Services account, you can specify your KMS key in one of two ways:   Use the ARN for the KMS key ID. For example, arn:aws:kms:region:account-ID:key/1234abcd-12ab-34cd-56ef-1234567890ab.   Use the ARN for the KMS key alias. For example, arn:aws:kms:region:account-ID:alias/ExampleAlias.   If you don't specify an encryption key, your output is encrypted with the default Amazon S3 key (SSE-S3). If you specify a KMS key to encrypt your output, you must also specify an output location using the OutputLocation parameter. Note that the role making the request must have permission to use the specified KMS key.
    */
  var OutputEncryptionKMSKeyId: js.UndefOr[KMSKeyId] = js.undefined
  
  /**
    * Use in combination with OutputBucketName to specify the output location of your transcript and, optionally, a unique name for your output file. The default name for your transcription output is the same as the name you specified for your transcription job (TranscriptionJobName). Here are some examples of how you can use OutputKey:   If you specify 'DOC-EXAMPLE-BUCKET' as the OutputBucketName and 'my-transcript.json' as the OutputKey, your transcription output path is s3://DOC-EXAMPLE-BUCKET/my-transcript.json.   If you specify 'my-first-transcription' as the TranscriptionJobName, 'DOC-EXAMPLE-BUCKET' as the OutputBucketName, and 'my-transcript' as the OutputKey, your transcription output path is s3://DOC-EXAMPLE-BUCKET/my-transcript/my-first-transcription.json.   If you specify 'DOC-EXAMPLE-BUCKET' as the OutputBucketName and 'test-files/my-transcript.json' as the OutputKey, your transcription output path is s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript.json.   If you specify 'my-first-transcription' as the TranscriptionJobName, 'DOC-EXAMPLE-BUCKET' as the OutputBucketName, and 'test-files/my-transcript' as the OutputKey, your transcription output path is s3://DOC-EXAMPLE-BUCKET/test-files/my-transcript/my-first-transcription.json.   If you specify the name of an Amazon S3 bucket sub-folder that doesn't exist, one is created for you.
    */
  var OutputKey: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.OutputKey] = js.undefined
  
  /**
    * Specify additional optional settings in your request, including channel identification, alternative transcriptions, speaker partitioning. You can use that to apply custom vocabularies and vocabulary filters. If you want to include a custom vocabulary or a custom vocabulary filter (or both) with your request but do not want to use automatic language identification, use Settings with the VocabularyName or VocabularyFilterName (or both) sub-parameter. If you're using automatic language identification with your request and want to include a custom language model, a custom vocabulary, or a custom vocabulary filter, use instead the  parameter with the LanguageModelName, VocabularyName or VocabularyFilterName sub-parameters.
    */
  var Settings: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.Settings] = js.undefined
  
  /**
    * Produces subtitle files for your input media. You can specify WebVTT (*.vtt) and SubRip (*.srt) formats.
    */
  var Subtitles: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.Subtitles] = js.undefined
  
  /**
    * Adds one or more custom tags, each in the form of a key:value pair, to a new transcription job at the time you start this new job. To learn more about using tags with Amazon Transcribe, refer to Tagging resources.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A unique name, chosen by you, for your transcription job. The name that you specify is also used as the default name of your transcription output file. If you want to specify a different name for your transcription output, use the OutputKey parameter. This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If you try to create a new job with the same name as an existing job, you get a ConflictException error.
    */
  var TranscriptionJobName: typings.awsSdk.clientsTranscribeserviceMod.TranscriptionJobName
}
object StartTranscriptionJobRequest {
  
  inline def apply(Media: Media, TranscriptionJobName: TranscriptionJobName): StartTranscriptionJobRequest = {
    val __obj = js.Dynamic.literal(Media = Media.asInstanceOf[js.Any], TranscriptionJobName = TranscriptionJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTranscriptionJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartTranscriptionJobRequest] (val x: Self) extends AnyVal {
    
    inline def setContentRedaction(value: ContentRedaction): Self = StObject.set(x, "ContentRedaction", value.asInstanceOf[js.Any])
    
    inline def setContentRedactionUndefined: Self = StObject.set(x, "ContentRedaction", js.undefined)
    
    inline def setIdentifyLanguage(value: Boolean): Self = StObject.set(x, "IdentifyLanguage", value.asInstanceOf[js.Any])
    
    inline def setIdentifyLanguageUndefined: Self = StObject.set(x, "IdentifyLanguage", js.undefined)
    
    inline def setIdentifyMultipleLanguages(value: Boolean): Self = StObject.set(x, "IdentifyMultipleLanguages", value.asInstanceOf[js.Any])
    
    inline def setIdentifyMultipleLanguagesUndefined: Self = StObject.set(x, "IdentifyMultipleLanguages", js.undefined)
    
    inline def setJobExecutionSettings(value: JobExecutionSettings): Self = StObject.set(x, "JobExecutionSettings", value.asInstanceOf[js.Any])
    
    inline def setJobExecutionSettingsUndefined: Self = StObject.set(x, "JobExecutionSettings", js.undefined)
    
    inline def setKMSEncryptionContext(value: KMSEncryptionContextMap): Self = StObject.set(x, "KMSEncryptionContext", value.asInstanceOf[js.Any])
    
    inline def setKMSEncryptionContextUndefined: Self = StObject.set(x, "KMSEncryptionContext", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
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
    
    inline def setModelSettings(value: ModelSettings): Self = StObject.set(x, "ModelSettings", value.asInstanceOf[js.Any])
    
    inline def setModelSettingsUndefined: Self = StObject.set(x, "ModelSettings", js.undefined)
    
    inline def setOutputBucketName(value: OutputBucketName): Self = StObject.set(x, "OutputBucketName", value.asInstanceOf[js.Any])
    
    inline def setOutputBucketNameUndefined: Self = StObject.set(x, "OutputBucketName", js.undefined)
    
    inline def setOutputEncryptionKMSKeyId(value: KMSKeyId): Self = StObject.set(x, "OutputEncryptionKMSKeyId", value.asInstanceOf[js.Any])
    
    inline def setOutputEncryptionKMSKeyIdUndefined: Self = StObject.set(x, "OutputEncryptionKMSKeyId", js.undefined)
    
    inline def setOutputKey(value: OutputKey): Self = StObject.set(x, "OutputKey", value.asInstanceOf[js.Any])
    
    inline def setOutputKeyUndefined: Self = StObject.set(x, "OutputKey", js.undefined)
    
    inline def setSettings(value: Settings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
    
    inline def setSubtitles(value: Subtitles): Self = StObject.set(x, "Subtitles", value.asInstanceOf[js.Any])
    
    inline def setSubtitlesUndefined: Self = StObject.set(x, "Subtitles", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTranscriptionJobName(value: TranscriptionJobName): Self = StObject.set(x, "TranscriptionJobName", value.asInstanceOf[js.Any])
  }
}
