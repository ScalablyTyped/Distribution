package typings.awsSdk.clientsTranscribeserviceMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranscribeService extends Service {
  
  @JSName("config")
  var config_TranscribeService: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a new Call Analytics category. All categories are automatically applied to your Call Analytics transcriptions. Note that in order to apply categories to your transcriptions, you must create them before submitting your transcription request, as categories cannot be applied retroactively. When creating a new category, you can use the InputType parameter to label the category as a POST_CALL or a REAL_TIME category. POST_CALL categories can only be applied to post-call transcriptions and REAL_TIME categories can only be applied to real-time transcriptions. If you do not include InputType, your category is created as a POST_CALL category by default. Call Analytics categories are composed of rules. For each category, you must create between 1 and 20 rules. Rules can include these parameters: , , , and . To update an existing category, see . To learn more about Call Analytics categories, see Creating categories for post-call transcriptions and Creating categories for real-time transcriptions.
    */
  def createCallAnalyticsCategory(): Request[CreateCallAnalyticsCategoryResponse, AWSError] = js.native
  def createCallAnalyticsCategory(callback: js.Function2[/* err */ AWSError, /* data */ CreateCallAnalyticsCategoryResponse, Unit]): Request[CreateCallAnalyticsCategoryResponse, AWSError] = js.native
  /**
    * Creates a new Call Analytics category. All categories are automatically applied to your Call Analytics transcriptions. Note that in order to apply categories to your transcriptions, you must create them before submitting your transcription request, as categories cannot be applied retroactively. When creating a new category, you can use the InputType parameter to label the category as a POST_CALL or a REAL_TIME category. POST_CALL categories can only be applied to post-call transcriptions and REAL_TIME categories can only be applied to real-time transcriptions. If you do not include InputType, your category is created as a POST_CALL category by default. Call Analytics categories are composed of rules. For each category, you must create between 1 and 20 rules. Rules can include these parameters: , , , and . To update an existing category, see . To learn more about Call Analytics categories, see Creating categories for post-call transcriptions and Creating categories for real-time transcriptions.
    */
  def createCallAnalyticsCategory(params: CreateCallAnalyticsCategoryRequest): Request[CreateCallAnalyticsCategoryResponse, AWSError] = js.native
  def createCallAnalyticsCategory(
    params: CreateCallAnalyticsCategoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCallAnalyticsCategoryResponse, Unit]
  ): Request[CreateCallAnalyticsCategoryResponse, AWSError] = js.native
  
  /**
    * Creates a new custom language model. When creating a new custom language model, you must specify:   If you want a Wideband (audio sample rates over 16,000 Hz) or Narrowband (audio sample rates under 16,000 Hz) base model   The location of your training and tuning files (this must be an Amazon S3 URI)   The language of your model   A unique name for your model  
    */
  def createLanguageModel(): Request[CreateLanguageModelResponse, AWSError] = js.native
  def createLanguageModel(callback: js.Function2[/* err */ AWSError, /* data */ CreateLanguageModelResponse, Unit]): Request[CreateLanguageModelResponse, AWSError] = js.native
  /**
    * Creates a new custom language model. When creating a new custom language model, you must specify:   If you want a Wideband (audio sample rates over 16,000 Hz) or Narrowband (audio sample rates under 16,000 Hz) base model   The location of your training and tuning files (this must be an Amazon S3 URI)   The language of your model   A unique name for your model  
    */
  def createLanguageModel(params: CreateLanguageModelRequest): Request[CreateLanguageModelResponse, AWSError] = js.native
  def createLanguageModel(
    params: CreateLanguageModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLanguageModelResponse, Unit]
  ): Request[CreateLanguageModelResponse, AWSError] = js.native
  
  /**
    * Creates a new custom medical vocabulary. Before creating a new custom medical vocabulary, you must first upload a text file that contains your vocabulary table into an Amazon S3 bucket. Note that this differs from , where you can include a list of terms within your request using the Phrases flag; CreateMedicalVocabulary does not support the Phrases flag and only accepts vocabularies in table format. Each language has a character set that contains all allowed characters for that specific language. If you use unsupported characters, your custom vocabulary request fails. Refer to Character Sets for Custom Vocabularies to get the character set for your language. For more information, see Custom vocabularies.
    */
  def createMedicalVocabulary(): Request[CreateMedicalVocabularyResponse, AWSError] = js.native
  def createMedicalVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ CreateMedicalVocabularyResponse, Unit]): Request[CreateMedicalVocabularyResponse, AWSError] = js.native
  /**
    * Creates a new custom medical vocabulary. Before creating a new custom medical vocabulary, you must first upload a text file that contains your vocabulary table into an Amazon S3 bucket. Note that this differs from , where you can include a list of terms within your request using the Phrases flag; CreateMedicalVocabulary does not support the Phrases flag and only accepts vocabularies in table format. Each language has a character set that contains all allowed characters for that specific language. If you use unsupported characters, your custom vocabulary request fails. Refer to Character Sets for Custom Vocabularies to get the character set for your language. For more information, see Custom vocabularies.
    */
  def createMedicalVocabulary(params: CreateMedicalVocabularyRequest): Request[CreateMedicalVocabularyResponse, AWSError] = js.native
  def createMedicalVocabulary(
    params: CreateMedicalVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMedicalVocabularyResponse, Unit]
  ): Request[CreateMedicalVocabularyResponse, AWSError] = js.native
  
  /**
    * Creates a new custom vocabulary. When creating a new custom vocabulary, you can either upload a text file that contains your new entries, phrases, and terms into an Amazon S3 bucket and include the URI in your request. Or you can include a list of terms directly in your request using the Phrases flag. Each language has a character set that contains all allowed characters for that specific language. If you use unsupported characters, your custom vocabulary request fails. Refer to Character Sets for Custom Vocabularies to get the character set for your language. For more information, see Custom vocabularies.
    */
  def createVocabulary(): Request[CreateVocabularyResponse, AWSError] = js.native
  def createVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ CreateVocabularyResponse, Unit]): Request[CreateVocabularyResponse, AWSError] = js.native
  /**
    * Creates a new custom vocabulary. When creating a new custom vocabulary, you can either upload a text file that contains your new entries, phrases, and terms into an Amazon S3 bucket and include the URI in your request. Or you can include a list of terms directly in your request using the Phrases flag. Each language has a character set that contains all allowed characters for that specific language. If you use unsupported characters, your custom vocabulary request fails. Refer to Character Sets for Custom Vocabularies to get the character set for your language. For more information, see Custom vocabularies.
    */
  def createVocabulary(params: CreateVocabularyRequest): Request[CreateVocabularyResponse, AWSError] = js.native
  def createVocabulary(
    params: CreateVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVocabularyResponse, Unit]
  ): Request[CreateVocabularyResponse, AWSError] = js.native
  
  /**
    * Creates a new custom vocabulary filter. You can use custom vocabulary filters to mask, delete, or flag specific words from your transcript. Custom vocabulary filters are commonly used to mask profanity in transcripts. Each language has a character set that contains all allowed characters for that specific language. If you use unsupported characters, your custom vocabulary filter request fails. Refer to Character Sets for Custom Vocabularies to get the character set for your language. For more information, see Vocabulary filtering.
    */
  def createVocabularyFilter(): Request[CreateVocabularyFilterResponse, AWSError] = js.native
  def createVocabularyFilter(callback: js.Function2[/* err */ AWSError, /* data */ CreateVocabularyFilterResponse, Unit]): Request[CreateVocabularyFilterResponse, AWSError] = js.native
  /**
    * Creates a new custom vocabulary filter. You can use custom vocabulary filters to mask, delete, or flag specific words from your transcript. Custom vocabulary filters are commonly used to mask profanity in transcripts. Each language has a character set that contains all allowed characters for that specific language. If you use unsupported characters, your custom vocabulary filter request fails. Refer to Character Sets for Custom Vocabularies to get the character set for your language. For more information, see Vocabulary filtering.
    */
  def createVocabularyFilter(params: CreateVocabularyFilterRequest): Request[CreateVocabularyFilterResponse, AWSError] = js.native
  def createVocabularyFilter(
    params: CreateVocabularyFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVocabularyFilterResponse, Unit]
  ): Request[CreateVocabularyFilterResponse, AWSError] = js.native
  
  /**
    * Deletes a Call Analytics category. To use this operation, specify the name of the category you want to delete using CategoryName. Category names are case sensitive.
    */
  def deleteCallAnalyticsCategory(): Request[DeleteCallAnalyticsCategoryResponse, AWSError] = js.native
  def deleteCallAnalyticsCategory(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCallAnalyticsCategoryResponse, Unit]): Request[DeleteCallAnalyticsCategoryResponse, AWSError] = js.native
  /**
    * Deletes a Call Analytics category. To use this operation, specify the name of the category you want to delete using CategoryName. Category names are case sensitive.
    */
  def deleteCallAnalyticsCategory(params: DeleteCallAnalyticsCategoryRequest): Request[DeleteCallAnalyticsCategoryResponse, AWSError] = js.native
  def deleteCallAnalyticsCategory(
    params: DeleteCallAnalyticsCategoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCallAnalyticsCategoryResponse, Unit]
  ): Request[DeleteCallAnalyticsCategoryResponse, AWSError] = js.native
  
  /**
    * Deletes a Call Analytics job. To use this operation, specify the name of the job you want to delete using CallAnalyticsJobName. Job names are case sensitive.
    */
  def deleteCallAnalyticsJob(): Request[DeleteCallAnalyticsJobResponse, AWSError] = js.native
  def deleteCallAnalyticsJob(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCallAnalyticsJobResponse, Unit]): Request[DeleteCallAnalyticsJobResponse, AWSError] = js.native
  /**
    * Deletes a Call Analytics job. To use this operation, specify the name of the job you want to delete using CallAnalyticsJobName. Job names are case sensitive.
    */
  def deleteCallAnalyticsJob(params: DeleteCallAnalyticsJobRequest): Request[DeleteCallAnalyticsJobResponse, AWSError] = js.native
  def deleteCallAnalyticsJob(
    params: DeleteCallAnalyticsJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCallAnalyticsJobResponse, Unit]
  ): Request[DeleteCallAnalyticsJobResponse, AWSError] = js.native
  
  /**
    * Deletes a custom language model. To use this operation, specify the name of the language model you want to delete using ModelName. custom language model names are case sensitive.
    */
  def deleteLanguageModel(): Request[js.Object, AWSError] = js.native
  def deleteLanguageModel(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a custom language model. To use this operation, specify the name of the language model you want to delete using ModelName. custom language model names are case sensitive.
    */
  def deleteLanguageModel(params: DeleteLanguageModelRequest): Request[js.Object, AWSError] = js.native
  def deleteLanguageModel(
    params: DeleteLanguageModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a medical transcription job. To use this operation, specify the name of the job you want to delete using MedicalTranscriptionJobName. Job names are case sensitive.
    */
  def deleteMedicalTranscriptionJob(): Request[js.Object, AWSError] = js.native
  def deleteMedicalTranscriptionJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a medical transcription job. To use this operation, specify the name of the job you want to delete using MedicalTranscriptionJobName. Job names are case sensitive.
    */
  def deleteMedicalTranscriptionJob(params: DeleteMedicalTranscriptionJobRequest): Request[js.Object, AWSError] = js.native
  def deleteMedicalTranscriptionJob(
    params: DeleteMedicalTranscriptionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a custom medical vocabulary. To use this operation, specify the name of the custom vocabulary you want to delete using VocabularyName. Custom vocabulary names are case sensitive.
    */
  def deleteMedicalVocabulary(): Request[js.Object, AWSError] = js.native
  def deleteMedicalVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a custom medical vocabulary. To use this operation, specify the name of the custom vocabulary you want to delete using VocabularyName. Custom vocabulary names are case sensitive.
    */
  def deleteMedicalVocabulary(params: DeleteMedicalVocabularyRequest): Request[js.Object, AWSError] = js.native
  def deleteMedicalVocabulary(
    params: DeleteMedicalVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a transcription job. To use this operation, specify the name of the job you want to delete using TranscriptionJobName. Job names are case sensitive.
    */
  def deleteTranscriptionJob(): Request[js.Object, AWSError] = js.native
  def deleteTranscriptionJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a transcription job. To use this operation, specify the name of the job you want to delete using TranscriptionJobName. Job names are case sensitive.
    */
  def deleteTranscriptionJob(params: DeleteTranscriptionJobRequest): Request[js.Object, AWSError] = js.native
  def deleteTranscriptionJob(
    params: DeleteTranscriptionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a custom vocabulary. To use this operation, specify the name of the custom vocabulary you want to delete using VocabularyName. Custom vocabulary names are case sensitive.
    */
  def deleteVocabulary(): Request[js.Object, AWSError] = js.native
  def deleteVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a custom vocabulary. To use this operation, specify the name of the custom vocabulary you want to delete using VocabularyName. Custom vocabulary names are case sensitive.
    */
  def deleteVocabulary(params: DeleteVocabularyRequest): Request[js.Object, AWSError] = js.native
  def deleteVocabulary(
    params: DeleteVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a custom vocabulary filter. To use this operation, specify the name of the custom vocabulary filter you want to delete using VocabularyFilterName. Custom vocabulary filter names are case sensitive.
    */
  def deleteVocabularyFilter(): Request[js.Object, AWSError] = js.native
  def deleteVocabularyFilter(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a custom vocabulary filter. To use this operation, specify the name of the custom vocabulary filter you want to delete using VocabularyFilterName. Custom vocabulary filter names are case sensitive.
    */
  def deleteVocabularyFilter(params: DeleteVocabularyFilterRequest): Request[js.Object, AWSError] = js.native
  def deleteVocabularyFilter(
    params: DeleteVocabularyFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Provides information about the specified custom language model. This operation also shows if the base language model that you used to create your custom language model has been updated. If Amazon Transcribe has updated the base model, you can create a new custom language model using the updated base model. If you tried to create a new custom language model and the request wasn't successful, you can use DescribeLanguageModel to help identify the reason for this failure.
    */
  def describeLanguageModel(): Request[DescribeLanguageModelResponse, AWSError] = js.native
  def describeLanguageModel(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLanguageModelResponse, Unit]): Request[DescribeLanguageModelResponse, AWSError] = js.native
  /**
    * Provides information about the specified custom language model. This operation also shows if the base language model that you used to create your custom language model has been updated. If Amazon Transcribe has updated the base model, you can create a new custom language model using the updated base model. If you tried to create a new custom language model and the request wasn't successful, you can use DescribeLanguageModel to help identify the reason for this failure.
    */
  def describeLanguageModel(params: DescribeLanguageModelRequest): Request[DescribeLanguageModelResponse, AWSError] = js.native
  def describeLanguageModel(
    params: DescribeLanguageModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLanguageModelResponse, Unit]
  ): Request[DescribeLanguageModelResponse, AWSError] = js.native
  
  /**
    * Provides information about the specified Call Analytics category. To get a list of your Call Analytics categories, use the operation.
    */
  def getCallAnalyticsCategory(): Request[GetCallAnalyticsCategoryResponse, AWSError] = js.native
  def getCallAnalyticsCategory(callback: js.Function2[/* err */ AWSError, /* data */ GetCallAnalyticsCategoryResponse, Unit]): Request[GetCallAnalyticsCategoryResponse, AWSError] = js.native
  /**
    * Provides information about the specified Call Analytics category. To get a list of your Call Analytics categories, use the operation.
    */
  def getCallAnalyticsCategory(params: GetCallAnalyticsCategoryRequest): Request[GetCallAnalyticsCategoryResponse, AWSError] = js.native
  def getCallAnalyticsCategory(
    params: GetCallAnalyticsCategoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCallAnalyticsCategoryResponse, Unit]
  ): Request[GetCallAnalyticsCategoryResponse, AWSError] = js.native
  
  /**
    * Provides information about the specified Call Analytics job. To view the job's status, refer to CallAnalyticsJobStatus. If the status is COMPLETED, the job is finished. You can find your completed transcript at the URI specified in TranscriptFileUri. If the status is FAILED, FailureReason provides details on why your transcription job failed. If you enabled personally identifiable information (PII) redaction, the redacted transcript appears at the location specified in RedactedTranscriptFileUri. If you chose to redact the audio in your media file, you can find your redacted media file at the location specified in RedactedMediaFileUri. To get a list of your Call Analytics jobs, use the operation.
    */
  def getCallAnalyticsJob(): Request[GetCallAnalyticsJobResponse, AWSError] = js.native
  def getCallAnalyticsJob(callback: js.Function2[/* err */ AWSError, /* data */ GetCallAnalyticsJobResponse, Unit]): Request[GetCallAnalyticsJobResponse, AWSError] = js.native
  /**
    * Provides information about the specified Call Analytics job. To view the job's status, refer to CallAnalyticsJobStatus. If the status is COMPLETED, the job is finished. You can find your completed transcript at the URI specified in TranscriptFileUri. If the status is FAILED, FailureReason provides details on why your transcription job failed. If you enabled personally identifiable information (PII) redaction, the redacted transcript appears at the location specified in RedactedTranscriptFileUri. If you chose to redact the audio in your media file, you can find your redacted media file at the location specified in RedactedMediaFileUri. To get a list of your Call Analytics jobs, use the operation.
    */
  def getCallAnalyticsJob(params: GetCallAnalyticsJobRequest): Request[GetCallAnalyticsJobResponse, AWSError] = js.native
  def getCallAnalyticsJob(
    params: GetCallAnalyticsJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCallAnalyticsJobResponse, Unit]
  ): Request[GetCallAnalyticsJobResponse, AWSError] = js.native
  
  /**
    * Provides information about the specified medical transcription job. To view the status of the specified medical transcription job, check the TranscriptionJobStatus field. If the status is COMPLETED, the job is finished. You can find the results at the location specified in TranscriptFileUri. If the status is FAILED, FailureReason provides details on why your transcription job failed. To get a list of your medical transcription jobs, use the operation.
    */
  def getMedicalTranscriptionJob(): Request[GetMedicalTranscriptionJobResponse, AWSError] = js.native
  def getMedicalTranscriptionJob(callback: js.Function2[/* err */ AWSError, /* data */ GetMedicalTranscriptionJobResponse, Unit]): Request[GetMedicalTranscriptionJobResponse, AWSError] = js.native
  /**
    * Provides information about the specified medical transcription job. To view the status of the specified medical transcription job, check the TranscriptionJobStatus field. If the status is COMPLETED, the job is finished. You can find the results at the location specified in TranscriptFileUri. If the status is FAILED, FailureReason provides details on why your transcription job failed. To get a list of your medical transcription jobs, use the operation.
    */
  def getMedicalTranscriptionJob(params: GetMedicalTranscriptionJobRequest): Request[GetMedicalTranscriptionJobResponse, AWSError] = js.native
  def getMedicalTranscriptionJob(
    params: GetMedicalTranscriptionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMedicalTranscriptionJobResponse, Unit]
  ): Request[GetMedicalTranscriptionJobResponse, AWSError] = js.native
  
  /**
    * Provides information about the specified custom medical vocabulary. To view the status of the specified custom medical vocabulary, check the VocabularyState field. If the status is READY, your custom vocabulary is available to use. If the status is FAILED, FailureReason provides details on why your vocabulary failed. To get a list of your custom medical vocabularies, use the operation.
    */
  def getMedicalVocabulary(): Request[GetMedicalVocabularyResponse, AWSError] = js.native
  def getMedicalVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ GetMedicalVocabularyResponse, Unit]): Request[GetMedicalVocabularyResponse, AWSError] = js.native
  /**
    * Provides information about the specified custom medical vocabulary. To view the status of the specified custom medical vocabulary, check the VocabularyState field. If the status is READY, your custom vocabulary is available to use. If the status is FAILED, FailureReason provides details on why your vocabulary failed. To get a list of your custom medical vocabularies, use the operation.
    */
  def getMedicalVocabulary(params: GetMedicalVocabularyRequest): Request[GetMedicalVocabularyResponse, AWSError] = js.native
  def getMedicalVocabulary(
    params: GetMedicalVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMedicalVocabularyResponse, Unit]
  ): Request[GetMedicalVocabularyResponse, AWSError] = js.native
  
  /**
    * Provides information about the specified transcription job. To view the status of the specified transcription job, check the TranscriptionJobStatus field. If the status is COMPLETED, the job is finished. You can find the results at the location specified in TranscriptFileUri. If the status is FAILED, FailureReason provides details on why your transcription job failed. If you enabled content redaction, the redacted transcript can be found at the location specified in RedactedTranscriptFileUri. To get a list of your transcription jobs, use the operation.
    */
  def getTranscriptionJob(): Request[GetTranscriptionJobResponse, AWSError] = js.native
  def getTranscriptionJob(callback: js.Function2[/* err */ AWSError, /* data */ GetTranscriptionJobResponse, Unit]): Request[GetTranscriptionJobResponse, AWSError] = js.native
  /**
    * Provides information about the specified transcription job. To view the status of the specified transcription job, check the TranscriptionJobStatus field. If the status is COMPLETED, the job is finished. You can find the results at the location specified in TranscriptFileUri. If the status is FAILED, FailureReason provides details on why your transcription job failed. If you enabled content redaction, the redacted transcript can be found at the location specified in RedactedTranscriptFileUri. To get a list of your transcription jobs, use the operation.
    */
  def getTranscriptionJob(params: GetTranscriptionJobRequest): Request[GetTranscriptionJobResponse, AWSError] = js.native
  def getTranscriptionJob(
    params: GetTranscriptionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTranscriptionJobResponse, Unit]
  ): Request[GetTranscriptionJobResponse, AWSError] = js.native
  
  /**
    * Provides information about the specified custom vocabulary. To view the status of the specified custom vocabulary, check the VocabularyState field. If the status is READY, your custom vocabulary is available to use. If the status is FAILED, FailureReason provides details on why your custom vocabulary failed. To get a list of your custom vocabularies, use the operation.
    */
  def getVocabulary(): Request[GetVocabularyResponse, AWSError] = js.native
  def getVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ GetVocabularyResponse, Unit]): Request[GetVocabularyResponse, AWSError] = js.native
  /**
    * Provides information about the specified custom vocabulary. To view the status of the specified custom vocabulary, check the VocabularyState field. If the status is READY, your custom vocabulary is available to use. If the status is FAILED, FailureReason provides details on why your custom vocabulary failed. To get a list of your custom vocabularies, use the operation.
    */
  def getVocabulary(params: GetVocabularyRequest): Request[GetVocabularyResponse, AWSError] = js.native
  def getVocabulary(
    params: GetVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVocabularyResponse, Unit]
  ): Request[GetVocabularyResponse, AWSError] = js.native
  
  /**
    * Provides information about the specified custom vocabulary filter. To get a list of your custom vocabulary filters, use the operation.
    */
  def getVocabularyFilter(): Request[GetVocabularyFilterResponse, AWSError] = js.native
  def getVocabularyFilter(callback: js.Function2[/* err */ AWSError, /* data */ GetVocabularyFilterResponse, Unit]): Request[GetVocabularyFilterResponse, AWSError] = js.native
  /**
    * Provides information about the specified custom vocabulary filter. To get a list of your custom vocabulary filters, use the operation.
    */
  def getVocabularyFilter(params: GetVocabularyFilterRequest): Request[GetVocabularyFilterResponse, AWSError] = js.native
  def getVocabularyFilter(
    params: GetVocabularyFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVocabularyFilterResponse, Unit]
  ): Request[GetVocabularyFilterResponse, AWSError] = js.native
  
  /**
    * Provides a list of Call Analytics categories, including all rules that make up each category. To get detailed information about a specific Call Analytics category, use the operation.
    */
  def listCallAnalyticsCategories(): Request[ListCallAnalyticsCategoriesResponse, AWSError] = js.native
  def listCallAnalyticsCategories(callback: js.Function2[/* err */ AWSError, /* data */ ListCallAnalyticsCategoriesResponse, Unit]): Request[ListCallAnalyticsCategoriesResponse, AWSError] = js.native
  /**
    * Provides a list of Call Analytics categories, including all rules that make up each category. To get detailed information about a specific Call Analytics category, use the operation.
    */
  def listCallAnalyticsCategories(params: ListCallAnalyticsCategoriesRequest): Request[ListCallAnalyticsCategoriesResponse, AWSError] = js.native
  def listCallAnalyticsCategories(
    params: ListCallAnalyticsCategoriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCallAnalyticsCategoriesResponse, Unit]
  ): Request[ListCallAnalyticsCategoriesResponse, AWSError] = js.native
  
  /**
    * Provides a list of Call Analytics jobs that match the specified criteria. If no criteria are specified, all Call Analytics jobs are returned. To get detailed information about a specific Call Analytics job, use the operation.
    */
  def listCallAnalyticsJobs(): Request[ListCallAnalyticsJobsResponse, AWSError] = js.native
  def listCallAnalyticsJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListCallAnalyticsJobsResponse, Unit]): Request[ListCallAnalyticsJobsResponse, AWSError] = js.native
  /**
    * Provides a list of Call Analytics jobs that match the specified criteria. If no criteria are specified, all Call Analytics jobs are returned. To get detailed information about a specific Call Analytics job, use the operation.
    */
  def listCallAnalyticsJobs(params: ListCallAnalyticsJobsRequest): Request[ListCallAnalyticsJobsResponse, AWSError] = js.native
  def listCallAnalyticsJobs(
    params: ListCallAnalyticsJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCallAnalyticsJobsResponse, Unit]
  ): Request[ListCallAnalyticsJobsResponse, AWSError] = js.native
  
  /**
    * Provides a list of custom language models that match the specified criteria. If no criteria are specified, all custom language models are returned. To get detailed information about a specific custom language model, use the operation.
    */
  def listLanguageModels(): Request[ListLanguageModelsResponse, AWSError] = js.native
  def listLanguageModels(callback: js.Function2[/* err */ AWSError, /* data */ ListLanguageModelsResponse, Unit]): Request[ListLanguageModelsResponse, AWSError] = js.native
  /**
    * Provides a list of custom language models that match the specified criteria. If no criteria are specified, all custom language models are returned. To get detailed information about a specific custom language model, use the operation.
    */
  def listLanguageModels(params: ListLanguageModelsRequest): Request[ListLanguageModelsResponse, AWSError] = js.native
  def listLanguageModels(
    params: ListLanguageModelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLanguageModelsResponse, Unit]
  ): Request[ListLanguageModelsResponse, AWSError] = js.native
  
  /**
    * Provides a list of medical transcription jobs that match the specified criteria. If no criteria are specified, all medical transcription jobs are returned. To get detailed information about a specific medical transcription job, use the operation.
    */
  def listMedicalTranscriptionJobs(): Request[ListMedicalTranscriptionJobsResponse, AWSError] = js.native
  def listMedicalTranscriptionJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListMedicalTranscriptionJobsResponse, Unit]): Request[ListMedicalTranscriptionJobsResponse, AWSError] = js.native
  /**
    * Provides a list of medical transcription jobs that match the specified criteria. If no criteria are specified, all medical transcription jobs are returned. To get detailed information about a specific medical transcription job, use the operation.
    */
  def listMedicalTranscriptionJobs(params: ListMedicalTranscriptionJobsRequest): Request[ListMedicalTranscriptionJobsResponse, AWSError] = js.native
  def listMedicalTranscriptionJobs(
    params: ListMedicalTranscriptionJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMedicalTranscriptionJobsResponse, Unit]
  ): Request[ListMedicalTranscriptionJobsResponse, AWSError] = js.native
  
  /**
    * Provides a list of custom medical vocabularies that match the specified criteria. If no criteria are specified, all custom medical vocabularies are returned. To get detailed information about a specific custom medical vocabulary, use the operation.
    */
  def listMedicalVocabularies(): Request[ListMedicalVocabulariesResponse, AWSError] = js.native
  def listMedicalVocabularies(callback: js.Function2[/* err */ AWSError, /* data */ ListMedicalVocabulariesResponse, Unit]): Request[ListMedicalVocabulariesResponse, AWSError] = js.native
  /**
    * Provides a list of custom medical vocabularies that match the specified criteria. If no criteria are specified, all custom medical vocabularies are returned. To get detailed information about a specific custom medical vocabulary, use the operation.
    */
  def listMedicalVocabularies(params: ListMedicalVocabulariesRequest): Request[ListMedicalVocabulariesResponse, AWSError] = js.native
  def listMedicalVocabularies(
    params: ListMedicalVocabulariesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMedicalVocabulariesResponse, Unit]
  ): Request[ListMedicalVocabulariesResponse, AWSError] = js.native
  
  /**
    * Lists all tags associated with the specified transcription job, vocabulary, model, or resource. To learn more about using tags with Amazon Transcribe, refer to Tagging resources.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists all tags associated with the specified transcription job, vocabulary, model, or resource. To learn more about using tags with Amazon Transcribe, refer to Tagging resources.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Provides a list of transcription jobs that match the specified criteria. If no criteria are specified, all transcription jobs are returned. To get detailed information about a specific transcription job, use the operation.
    */
  def listTranscriptionJobs(): Request[ListTranscriptionJobsResponse, AWSError] = js.native
  def listTranscriptionJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListTranscriptionJobsResponse, Unit]): Request[ListTranscriptionJobsResponse, AWSError] = js.native
  /**
    * Provides a list of transcription jobs that match the specified criteria. If no criteria are specified, all transcription jobs are returned. To get detailed information about a specific transcription job, use the operation.
    */
  def listTranscriptionJobs(params: ListTranscriptionJobsRequest): Request[ListTranscriptionJobsResponse, AWSError] = js.native
  def listTranscriptionJobs(
    params: ListTranscriptionJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTranscriptionJobsResponse, Unit]
  ): Request[ListTranscriptionJobsResponse, AWSError] = js.native
  
  /**
    * Provides a list of custom vocabularies that match the specified criteria. If no criteria are specified, all custom vocabularies are returned. To get detailed information about a specific custom vocabulary, use the operation.
    */
  def listVocabularies(): Request[ListVocabulariesResponse, AWSError] = js.native
  def listVocabularies(callback: js.Function2[/* err */ AWSError, /* data */ ListVocabulariesResponse, Unit]): Request[ListVocabulariesResponse, AWSError] = js.native
  /**
    * Provides a list of custom vocabularies that match the specified criteria. If no criteria are specified, all custom vocabularies are returned. To get detailed information about a specific custom vocabulary, use the operation.
    */
  def listVocabularies(params: ListVocabulariesRequest): Request[ListVocabulariesResponse, AWSError] = js.native
  def listVocabularies(
    params: ListVocabulariesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVocabulariesResponse, Unit]
  ): Request[ListVocabulariesResponse, AWSError] = js.native
  
  /**
    * Provides a list of custom vocabulary filters that match the specified criteria. If no criteria are specified, all custom vocabularies are returned. To get detailed information about a specific custom vocabulary filter, use the operation.
    */
  def listVocabularyFilters(): Request[ListVocabularyFiltersResponse, AWSError] = js.native
  def listVocabularyFilters(callback: js.Function2[/* err */ AWSError, /* data */ ListVocabularyFiltersResponse, Unit]): Request[ListVocabularyFiltersResponse, AWSError] = js.native
  /**
    * Provides a list of custom vocabulary filters that match the specified criteria. If no criteria are specified, all custom vocabularies are returned. To get detailed information about a specific custom vocabulary filter, use the operation.
    */
  def listVocabularyFilters(params: ListVocabularyFiltersRequest): Request[ListVocabularyFiltersResponse, AWSError] = js.native
  def listVocabularyFilters(
    params: ListVocabularyFiltersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVocabularyFiltersResponse, Unit]
  ): Request[ListVocabularyFiltersResponse, AWSError] = js.native
  
  /**
    * Transcribes the audio from a customer service call and applies any additional Request Parameters you choose to include in your request. In addition to many standard transcription features, Call Analytics provides you with call characteristics, call summarization, speaker sentiment, and optional redaction of your text transcript and your audio file. You can also apply custom categories to flag specified conditions. To learn more about these features and insights, refer to Analyzing call center audio with Call Analytics. If you want to apply categories to your Call Analytics job, you must create them before submitting your job request. Categories cannot be retroactively applied to a job. To create a new category, use the operation. To learn more about Call Analytics categories, see Creating categories for post-call transcriptions and Creating categories for real-time transcriptions. To make a StartCallAnalyticsJob request, you must first upload your media file into an Amazon S3 bucket; you can then specify the Amazon S3 location of the file using the Media parameter. Note that job queuing is enabled by default for Call Analytics jobs. You must include the following parameters in your StartCallAnalyticsJob request:    region: The Amazon Web Services Region where you are making your request. For a list of Amazon Web Services Regions supported with Amazon Transcribe, refer to Amazon Transcribe endpoints and quotas.    CallAnalyticsJobName: A custom name that you create for your transcription job that's unique within your Amazon Web Services account.    DataAccessRoleArn: The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that contains your input files.    Media (MediaFileUri or RedactedMediaFileUri): The Amazon S3 location of your media file.    With Call Analytics, you can redact the audio contained in your media file by including RedactedMediaFileUri, instead of MediaFileUri, to specify the location of your input audio. If you choose to redact your audio, you can find your redacted media at the location specified in the RedactedMediaFileUri field of your response. 
    */
  def startCallAnalyticsJob(): Request[StartCallAnalyticsJobResponse, AWSError] = js.native
  def startCallAnalyticsJob(callback: js.Function2[/* err */ AWSError, /* data */ StartCallAnalyticsJobResponse, Unit]): Request[StartCallAnalyticsJobResponse, AWSError] = js.native
  /**
    * Transcribes the audio from a customer service call and applies any additional Request Parameters you choose to include in your request. In addition to many standard transcription features, Call Analytics provides you with call characteristics, call summarization, speaker sentiment, and optional redaction of your text transcript and your audio file. You can also apply custom categories to flag specified conditions. To learn more about these features and insights, refer to Analyzing call center audio with Call Analytics. If you want to apply categories to your Call Analytics job, you must create them before submitting your job request. Categories cannot be retroactively applied to a job. To create a new category, use the operation. To learn more about Call Analytics categories, see Creating categories for post-call transcriptions and Creating categories for real-time transcriptions. To make a StartCallAnalyticsJob request, you must first upload your media file into an Amazon S3 bucket; you can then specify the Amazon S3 location of the file using the Media parameter. Note that job queuing is enabled by default for Call Analytics jobs. You must include the following parameters in your StartCallAnalyticsJob request:    region: The Amazon Web Services Region where you are making your request. For a list of Amazon Web Services Regions supported with Amazon Transcribe, refer to Amazon Transcribe endpoints and quotas.    CallAnalyticsJobName: A custom name that you create for your transcription job that's unique within your Amazon Web Services account.    DataAccessRoleArn: The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that contains your input files.    Media (MediaFileUri or RedactedMediaFileUri): The Amazon S3 location of your media file.    With Call Analytics, you can redact the audio contained in your media file by including RedactedMediaFileUri, instead of MediaFileUri, to specify the location of your input audio. If you choose to redact your audio, you can find your redacted media at the location specified in the RedactedMediaFileUri field of your response. 
    */
  def startCallAnalyticsJob(params: StartCallAnalyticsJobRequest): Request[StartCallAnalyticsJobResponse, AWSError] = js.native
  def startCallAnalyticsJob(
    params: StartCallAnalyticsJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartCallAnalyticsJobResponse, Unit]
  ): Request[StartCallAnalyticsJobResponse, AWSError] = js.native
  
  /**
    * Transcribes the audio from a medical dictation or conversation and applies any additional Request Parameters you choose to include in your request. In addition to many standard transcription features, Amazon Transcribe Medical provides you with a robust medical vocabulary and, optionally, content identification, which adds flags to personal health information (PHI). To learn more about these features, refer to How Amazon Transcribe Medical works. To make a StartMedicalTranscriptionJob request, you must first upload your media file into an Amazon S3 bucket; you can then specify the S3 location of the file using the Media parameter. You must include the following parameters in your StartMedicalTranscriptionJob request:    region: The Amazon Web Services Region where you are making your request. For a list of Amazon Web Services Regions supported with Amazon Transcribe, refer to Amazon Transcribe endpoints and quotas.    MedicalTranscriptionJobName: A custom name you create for your transcription job that is unique within your Amazon Web Services account.    Media (MediaFileUri): The Amazon S3 location of your media file.    LanguageCode: This must be en-US.    OutputBucketName: The Amazon S3 bucket where you want your transcript stored. If you want your output stored in a sub-folder of this bucket, you must also include OutputKey.    Specialty: This must be PRIMARYCARE.    Type: Choose whether your audio is a conversation or a dictation.  
    */
  def startMedicalTranscriptionJob(): Request[StartMedicalTranscriptionJobResponse, AWSError] = js.native
  def startMedicalTranscriptionJob(callback: js.Function2[/* err */ AWSError, /* data */ StartMedicalTranscriptionJobResponse, Unit]): Request[StartMedicalTranscriptionJobResponse, AWSError] = js.native
  /**
    * Transcribes the audio from a medical dictation or conversation and applies any additional Request Parameters you choose to include in your request. In addition to many standard transcription features, Amazon Transcribe Medical provides you with a robust medical vocabulary and, optionally, content identification, which adds flags to personal health information (PHI). To learn more about these features, refer to How Amazon Transcribe Medical works. To make a StartMedicalTranscriptionJob request, you must first upload your media file into an Amazon S3 bucket; you can then specify the S3 location of the file using the Media parameter. You must include the following parameters in your StartMedicalTranscriptionJob request:    region: The Amazon Web Services Region where you are making your request. For a list of Amazon Web Services Regions supported with Amazon Transcribe, refer to Amazon Transcribe endpoints and quotas.    MedicalTranscriptionJobName: A custom name you create for your transcription job that is unique within your Amazon Web Services account.    Media (MediaFileUri): The Amazon S3 location of your media file.    LanguageCode: This must be en-US.    OutputBucketName: The Amazon S3 bucket where you want your transcript stored. If you want your output stored in a sub-folder of this bucket, you must also include OutputKey.    Specialty: This must be PRIMARYCARE.    Type: Choose whether your audio is a conversation or a dictation.  
    */
  def startMedicalTranscriptionJob(params: StartMedicalTranscriptionJobRequest): Request[StartMedicalTranscriptionJobResponse, AWSError] = js.native
  def startMedicalTranscriptionJob(
    params: StartMedicalTranscriptionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartMedicalTranscriptionJobResponse, Unit]
  ): Request[StartMedicalTranscriptionJobResponse, AWSError] = js.native
  
  /**
    * Transcribes the audio from a media file and applies any additional Request Parameters you choose to include in your request. To make a StartTranscriptionJob request, you must first upload your media file into an Amazon S3 bucket; you can then specify the Amazon S3 location of the file using the Media parameter. You must include the following parameters in your StartTranscriptionJob request:    region: The Amazon Web Services Region where you are making your request. For a list of Amazon Web Services Regions supported with Amazon Transcribe, refer to Amazon Transcribe endpoints and quotas.    TranscriptionJobName: A custom name you create for your transcription job that is unique within your Amazon Web Services account.    Media (MediaFileUri): The Amazon S3 location of your media file.   One of LanguageCode, IdentifyLanguage, or IdentifyMultipleLanguages: If you know the language of your media file, specify it using the LanguageCode parameter; you can find all valid language codes in the Supported languages table. If you don't know the languages spoken in your media, use either IdentifyLanguage or IdentifyMultipleLanguages and let Amazon Transcribe identify the languages for you.  
    */
  def startTranscriptionJob(): Request[StartTranscriptionJobResponse, AWSError] = js.native
  def startTranscriptionJob(callback: js.Function2[/* err */ AWSError, /* data */ StartTranscriptionJobResponse, Unit]): Request[StartTranscriptionJobResponse, AWSError] = js.native
  /**
    * Transcribes the audio from a media file and applies any additional Request Parameters you choose to include in your request. To make a StartTranscriptionJob request, you must first upload your media file into an Amazon S3 bucket; you can then specify the Amazon S3 location of the file using the Media parameter. You must include the following parameters in your StartTranscriptionJob request:    region: The Amazon Web Services Region where you are making your request. For a list of Amazon Web Services Regions supported with Amazon Transcribe, refer to Amazon Transcribe endpoints and quotas.    TranscriptionJobName: A custom name you create for your transcription job that is unique within your Amazon Web Services account.    Media (MediaFileUri): The Amazon S3 location of your media file.   One of LanguageCode, IdentifyLanguage, or IdentifyMultipleLanguages: If you know the language of your media file, specify it using the LanguageCode parameter; you can find all valid language codes in the Supported languages table. If you don't know the languages spoken in your media, use either IdentifyLanguage or IdentifyMultipleLanguages and let Amazon Transcribe identify the languages for you.  
    */
  def startTranscriptionJob(params: StartTranscriptionJobRequest): Request[StartTranscriptionJobResponse, AWSError] = js.native
  def startTranscriptionJob(
    params: StartTranscriptionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartTranscriptionJobResponse, Unit]
  ): Request[StartTranscriptionJobResponse, AWSError] = js.native
  
  /**
    * Adds one or more custom tags, each in the form of a key:value pair, to the specified resource. To learn more about using tags with Amazon Transcribe, refer to Tagging resources.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds one or more custom tags, each in the form of a key:value pair, to the specified resource. To learn more about using tags with Amazon Transcribe, refer to Tagging resources.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes the specified tags from the specified Amazon Transcribe resource. If you include UntagResource in your request, you must also include ResourceArn and TagKeys.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the specified tags from the specified Amazon Transcribe resource. If you include UntagResource in your request, you must also include ResourceArn and TagKeys.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates the specified Call Analytics category with new rules. Note that the UpdateCallAnalyticsCategory operation overwrites all existing rules contained in the specified category. You cannot append additional rules onto an existing category. To create a new category, see .
    */
  def updateCallAnalyticsCategory(): Request[UpdateCallAnalyticsCategoryResponse, AWSError] = js.native
  def updateCallAnalyticsCategory(callback: js.Function2[/* err */ AWSError, /* data */ UpdateCallAnalyticsCategoryResponse, Unit]): Request[UpdateCallAnalyticsCategoryResponse, AWSError] = js.native
  /**
    * Updates the specified Call Analytics category with new rules. Note that the UpdateCallAnalyticsCategory operation overwrites all existing rules contained in the specified category. You cannot append additional rules onto an existing category. To create a new category, see .
    */
  def updateCallAnalyticsCategory(params: UpdateCallAnalyticsCategoryRequest): Request[UpdateCallAnalyticsCategoryResponse, AWSError] = js.native
  def updateCallAnalyticsCategory(
    params: UpdateCallAnalyticsCategoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCallAnalyticsCategoryResponse, Unit]
  ): Request[UpdateCallAnalyticsCategoryResponse, AWSError] = js.native
  
  /**
    * Updates an existing custom medical vocabulary with new values. This operation overwrites all existing information with your new values; you cannot append new terms onto an existing custom vocabulary.
    */
  def updateMedicalVocabulary(): Request[UpdateMedicalVocabularyResponse, AWSError] = js.native
  def updateMedicalVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMedicalVocabularyResponse, Unit]): Request[UpdateMedicalVocabularyResponse, AWSError] = js.native
  /**
    * Updates an existing custom medical vocabulary with new values. This operation overwrites all existing information with your new values; you cannot append new terms onto an existing custom vocabulary.
    */
  def updateMedicalVocabulary(params: UpdateMedicalVocabularyRequest): Request[UpdateMedicalVocabularyResponse, AWSError] = js.native
  def updateMedicalVocabulary(
    params: UpdateMedicalVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMedicalVocabularyResponse, Unit]
  ): Request[UpdateMedicalVocabularyResponse, AWSError] = js.native
  
  /**
    * Updates an existing custom vocabulary with new values. This operation overwrites all existing information with your new values; you cannot append new terms onto an existing custom vocabulary.
    */
  def updateVocabulary(): Request[UpdateVocabularyResponse, AWSError] = js.native
  def updateVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVocabularyResponse, Unit]): Request[UpdateVocabularyResponse, AWSError] = js.native
  /**
    * Updates an existing custom vocabulary with new values. This operation overwrites all existing information with your new values; you cannot append new terms onto an existing custom vocabulary.
    */
  def updateVocabulary(params: UpdateVocabularyRequest): Request[UpdateVocabularyResponse, AWSError] = js.native
  def updateVocabulary(
    params: UpdateVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVocabularyResponse, Unit]
  ): Request[UpdateVocabularyResponse, AWSError] = js.native
  
  /**
    * Updates an existing custom vocabulary filter with a new list of words. The new list you provide overwrites all previous entries; you cannot append new terms onto an existing custom vocabulary filter.
    */
  def updateVocabularyFilter(): Request[UpdateVocabularyFilterResponse, AWSError] = js.native
  def updateVocabularyFilter(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVocabularyFilterResponse, Unit]): Request[UpdateVocabularyFilterResponse, AWSError] = js.native
  /**
    * Updates an existing custom vocabulary filter with a new list of words. The new list you provide overwrites all previous entries; you cannot append new terms onto an existing custom vocabulary filter.
    */
  def updateVocabularyFilter(params: UpdateVocabularyFilterRequest): Request[UpdateVocabularyFilterResponse, AWSError] = js.native
  def updateVocabularyFilter(
    params: UpdateVocabularyFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVocabularyFilterResponse, Unit]
  ): Request[UpdateVocabularyFilterResponse, AWSError] = js.native
}
