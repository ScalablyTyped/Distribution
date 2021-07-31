package typings.awsSdk.translateMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Translate extends Service {
  
  @JSName("config")
  var config_Translate: ConfigBase & ClientConfiguration = js.native
  
  /**
    * A synchronous action that deletes a custom terminology.
    */
  def deleteTerminology(): Request[js.Object, AWSError] = js.native
  def deleteTerminology(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * A synchronous action that deletes a custom terminology.
    */
  def deleteTerminology(params: DeleteTerminologyRequest): Request[js.Object, AWSError] = js.native
  def deleteTerminology(
    params: DeleteTerminologyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Gets the properties associated with an asycnhronous batch translation job including name, ID, status, source and target languages, input/output S3 buckets, and so on.
    */
  def describeTextTranslationJob(): Request[DescribeTextTranslationJobResponse, AWSError] = js.native
  def describeTextTranslationJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTextTranslationJobResponse, Unit]): Request[DescribeTextTranslationJobResponse, AWSError] = js.native
  /**
    * Gets the properties associated with an asycnhronous batch translation job including name, ID, status, source and target languages, input/output S3 buckets, and so on.
    */
  def describeTextTranslationJob(params: DescribeTextTranslationJobRequest): Request[DescribeTextTranslationJobResponse, AWSError] = js.native
  def describeTextTranslationJob(
    params: DescribeTextTranslationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTextTranslationJobResponse, Unit]
  ): Request[DescribeTextTranslationJobResponse, AWSError] = js.native
  
  /**
    * Retrieves a custom terminology.
    */
  def getTerminology(): Request[GetTerminologyResponse, AWSError] = js.native
  def getTerminology(callback: js.Function2[/* err */ AWSError, /* data */ GetTerminologyResponse, Unit]): Request[GetTerminologyResponse, AWSError] = js.native
  /**
    * Retrieves a custom terminology.
    */
  def getTerminology(params: GetTerminologyRequest): Request[GetTerminologyResponse, AWSError] = js.native
  def getTerminology(
    params: GetTerminologyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTerminologyResponse, Unit]
  ): Request[GetTerminologyResponse, AWSError] = js.native
  
  /**
    * Creates or updates a custom terminology, depending on whether or not one already exists for the given terminology name. Importing a terminology with the same name as an existing one will merge the terminologies based on the chosen merge strategy. Currently, the only supported merge strategy is OVERWRITE, and so the imported terminology will overwrite an existing terminology of the same name. If you import a terminology that overwrites an existing one, the new terminology take up to 10 minutes to fully propagate and be available for use in a translation due to cache policies with the DataPlane service that performs the translations.
    */
  def importTerminology(): Request[ImportTerminologyResponse, AWSError] = js.native
  def importTerminology(callback: js.Function2[/* err */ AWSError, /* data */ ImportTerminologyResponse, Unit]): Request[ImportTerminologyResponse, AWSError] = js.native
  /**
    * Creates or updates a custom terminology, depending on whether or not one already exists for the given terminology name. Importing a terminology with the same name as an existing one will merge the terminologies based on the chosen merge strategy. Currently, the only supported merge strategy is OVERWRITE, and so the imported terminology will overwrite an existing terminology of the same name. If you import a terminology that overwrites an existing one, the new terminology take up to 10 minutes to fully propagate and be available for use in a translation due to cache policies with the DataPlane service that performs the translations.
    */
  def importTerminology(params: ImportTerminologyRequest): Request[ImportTerminologyResponse, AWSError] = js.native
  def importTerminology(
    params: ImportTerminologyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportTerminologyResponse, Unit]
  ): Request[ImportTerminologyResponse, AWSError] = js.native
  
  /**
    * Provides a list of custom terminologies associated with your account.
    */
  def listTerminologies(): Request[ListTerminologiesResponse, AWSError] = js.native
  def listTerminologies(callback: js.Function2[/* err */ AWSError, /* data */ ListTerminologiesResponse, Unit]): Request[ListTerminologiesResponse, AWSError] = js.native
  /**
    * Provides a list of custom terminologies associated with your account.
    */
  def listTerminologies(params: ListTerminologiesRequest): Request[ListTerminologiesResponse, AWSError] = js.native
  def listTerminologies(
    params: ListTerminologiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTerminologiesResponse, Unit]
  ): Request[ListTerminologiesResponse, AWSError] = js.native
  
  /**
    * Gets a list of the batch translation jobs that you have submitted.
    */
  def listTextTranslationJobs(): Request[ListTextTranslationJobsResponse, AWSError] = js.native
  def listTextTranslationJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListTextTranslationJobsResponse, Unit]): Request[ListTextTranslationJobsResponse, AWSError] = js.native
  /**
    * Gets a list of the batch translation jobs that you have submitted.
    */
  def listTextTranslationJobs(params: ListTextTranslationJobsRequest): Request[ListTextTranslationJobsResponse, AWSError] = js.native
  def listTextTranslationJobs(
    params: ListTextTranslationJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTextTranslationJobsResponse, Unit]
  ): Request[ListTextTranslationJobsResponse, AWSError] = js.native
  
  /**
    * Starts an asynchronous batch translation job. Batch translation jobs can be used to translate large volumes of text across multiple documents at once. For more information, see async. Batch translation jobs can be described with the DescribeTextTranslationJob operation, listed with the ListTextTranslationJobs operation, and stopped with the StopTextTranslationJob operation.  Amazon Translate does not support batch translation of multiple source languages at once. 
    */
  def startTextTranslationJob(): Request[StartTextTranslationJobResponse, AWSError] = js.native
  def startTextTranslationJob(callback: js.Function2[/* err */ AWSError, /* data */ StartTextTranslationJobResponse, Unit]): Request[StartTextTranslationJobResponse, AWSError] = js.native
  /**
    * Starts an asynchronous batch translation job. Batch translation jobs can be used to translate large volumes of text across multiple documents at once. For more information, see async. Batch translation jobs can be described with the DescribeTextTranslationJob operation, listed with the ListTextTranslationJobs operation, and stopped with the StopTextTranslationJob operation.  Amazon Translate does not support batch translation of multiple source languages at once. 
    */
  def startTextTranslationJob(params: StartTextTranslationJobRequest): Request[StartTextTranslationJobResponse, AWSError] = js.native
  def startTextTranslationJob(
    params: StartTextTranslationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartTextTranslationJobResponse, Unit]
  ): Request[StartTextTranslationJobResponse, AWSError] = js.native
  
  /**
    * Stops an asynchronous batch translation job that is in progress. If the job's state is IN_PROGRESS, the job will be marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state. Otherwise, the job is put into the STOPPED state. Asynchronous batch translation jobs are started with the StartTextTranslationJob operation. You can use the DescribeTextTranslationJob or ListTextTranslationJobs operations to get a batch translation job's JobId.
    */
  def stopTextTranslationJob(): Request[StopTextTranslationJobResponse, AWSError] = js.native
  def stopTextTranslationJob(callback: js.Function2[/* err */ AWSError, /* data */ StopTextTranslationJobResponse, Unit]): Request[StopTextTranslationJobResponse, AWSError] = js.native
  /**
    * Stops an asynchronous batch translation job that is in progress. If the job's state is IN_PROGRESS, the job will be marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state. Otherwise, the job is put into the STOPPED state. Asynchronous batch translation jobs are started with the StartTextTranslationJob operation. You can use the DescribeTextTranslationJob or ListTextTranslationJobs operations to get a batch translation job's JobId.
    */
  def stopTextTranslationJob(params: StopTextTranslationJobRequest): Request[StopTextTranslationJobResponse, AWSError] = js.native
  def stopTextTranslationJob(
    params: StopTextTranslationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopTextTranslationJobResponse, Unit]
  ): Request[StopTextTranslationJobResponse, AWSError] = js.native
  
  /**
    * Translates input text from the source language to the target language. For a list of available languages and language codes, see what-is-languages.
    */
  def translateText(): Request[TranslateTextResponse, AWSError] = js.native
  def translateText(callback: js.Function2[/* err */ AWSError, /* data */ TranslateTextResponse, Unit]): Request[TranslateTextResponse, AWSError] = js.native
  /**
    * Translates input text from the source language to the target language. For a list of available languages and language codes, see what-is-languages.
    */
  def translateText(params: TranslateTextRequest): Request[TranslateTextResponse, AWSError] = js.native
  def translateText(
    params: TranslateTextRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TranslateTextResponse, Unit]
  ): Request[TranslateTextResponse, AWSError] = js.native
}
