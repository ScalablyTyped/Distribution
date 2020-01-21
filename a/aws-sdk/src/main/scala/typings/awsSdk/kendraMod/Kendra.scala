package typings.awsSdk.kendraMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Kendra extends Service {
  @JSName("config")
  var config_Kendra: ConfigBase with ClientConfiguration = js.native
  /**
    * Removes one or more documents from an index. The documents must have been added with the BatchPutDocument operation. The documents are deleted asynchronously. You can see the progress of the deletion by using AWS CloudWatch. Any error messages releated to the processing of the batch are sent to you CloudWatch log.
    */
  def batchDeleteDocument(): Request[BatchDeleteDocumentResponse, AWSError] = js.native
  def batchDeleteDocument(callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteDocumentResponse, Unit]): Request[BatchDeleteDocumentResponse, AWSError] = js.native
  /**
    * Removes one or more documents from an index. The documents must have been added with the BatchPutDocument operation. The documents are deleted asynchronously. You can see the progress of the deletion by using AWS CloudWatch. Any error messages releated to the processing of the batch are sent to you CloudWatch log.
    */
  def batchDeleteDocument(params: BatchDeleteDocumentRequest): Request[BatchDeleteDocumentResponse, AWSError] = js.native
  def batchDeleteDocument(
    params: BatchDeleteDocumentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteDocumentResponse, Unit]
  ): Request[BatchDeleteDocumentResponse, AWSError] = js.native
  /**
    * Adds one or more documents to an index. The BatchPutDocument operation enables you to ingest inline documents or a set of documents stored in an Amazon S3 bucket. Use this operation to ingest your text and unstructured text into an index, add custom attributes to the documents, and to attach an access control list to the documents added to the index. The documents are indexed asynchronously. You can see the progress of the batch using AWS CloudWatch. Any error messages related to processing the batch are sent to your AWS CloudWatch log.
    */
  def batchPutDocument(): Request[BatchPutDocumentResponse, AWSError] = js.native
  def batchPutDocument(callback: js.Function2[/* err */ AWSError, /* data */ BatchPutDocumentResponse, Unit]): Request[BatchPutDocumentResponse, AWSError] = js.native
  /**
    * Adds one or more documents to an index. The BatchPutDocument operation enables you to ingest inline documents or a set of documents stored in an Amazon S3 bucket. Use this operation to ingest your text and unstructured text into an index, add custom attributes to the documents, and to attach an access control list to the documents added to the index. The documents are indexed asynchronously. You can see the progress of the batch using AWS CloudWatch. Any error messages related to processing the batch are sent to your AWS CloudWatch log.
    */
  def batchPutDocument(params: BatchPutDocumentRequest): Request[BatchPutDocumentResponse, AWSError] = js.native
  def batchPutDocument(
    params: BatchPutDocumentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchPutDocumentResponse, Unit]
  ): Request[BatchPutDocumentResponse, AWSError] = js.native
  /**
    * Creates a data source that you use to with an Amazon Kendra index.  You specify a name, connector type and description for your data source. You can choose between an S3 connector, a SharePoint Online connector, and a database connector. You also specify configuration information such as document metadata (author, source URI, and so on) and user context information.  CreateDataSource is a synchronous operation. The operation returns 200 if the data source was successfully created. Otherwise, an exception is raised.
    */
  def createDataSource(): Request[CreateDataSourceResponse, AWSError] = js.native
  def createDataSource(callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSourceResponse, Unit]): Request[CreateDataSourceResponse, AWSError] = js.native
  /**
    * Creates a data source that you use to with an Amazon Kendra index.  You specify a name, connector type and description for your data source. You can choose between an S3 connector, a SharePoint Online connector, and a database connector. You also specify configuration information such as document metadata (author, source URI, and so on) and user context information.  CreateDataSource is a synchronous operation. The operation returns 200 if the data source was successfully created. Otherwise, an exception is raised.
    */
  def createDataSource(params: CreateDataSourceRequest): Request[CreateDataSourceResponse, AWSError] = js.native
  def createDataSource(
    params: CreateDataSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSourceResponse, Unit]
  ): Request[CreateDataSourceResponse, AWSError] = js.native
  /**
    * Creates an new set of frequently asked question (FAQ) questions and answers.
    */
  def createFaq(): Request[CreateFaqResponse, AWSError] = js.native
  def createFaq(callback: js.Function2[/* err */ AWSError, /* data */ CreateFaqResponse, Unit]): Request[CreateFaqResponse, AWSError] = js.native
  /**
    * Creates an new set of frequently asked question (FAQ) questions and answers.
    */
  def createFaq(params: CreateFaqRequest): Request[CreateFaqResponse, AWSError] = js.native
  def createFaq(
    params: CreateFaqRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFaqResponse, Unit]
  ): Request[CreateFaqResponse, AWSError] = js.native
  /**
    * Creates a new Amazon Kendra index. Index creation is an asynchronous operation. To determine if index creation has completed, check the Status field returned from a call to . The Status field is set to ACTIVE when the index is ready to use. Once the index is active you can index your documents using the operation or using one of the supported data sources. 
    */
  def createIndex(): Request[CreateIndexResponse, AWSError] = js.native
  def createIndex(callback: js.Function2[/* err */ AWSError, /* data */ CreateIndexResponse, Unit]): Request[CreateIndexResponse, AWSError] = js.native
  /**
    * Creates a new Amazon Kendra index. Index creation is an asynchronous operation. To determine if index creation has completed, check the Status field returned from a call to . The Status field is set to ACTIVE when the index is ready to use. Once the index is active you can index your documents using the operation or using one of the supported data sources. 
    */
  def createIndex(params: CreateIndexRequest): Request[CreateIndexResponse, AWSError] = js.native
  def createIndex(
    params: CreateIndexRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateIndexResponse, Unit]
  ): Request[CreateIndexResponse, AWSError] = js.native
  /**
    * Removes an FAQ from an index.
    */
  def deleteFaq(): Request[js.Object, AWSError] = js.native
  def deleteFaq(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes an FAQ from an index.
    */
  def deleteFaq(params: DeleteFaqRequest): Request[js.Object, AWSError] = js.native
  def deleteFaq(params: DeleteFaqRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an existing Amazon Kendra index. An exception is not thrown if the index is already being deleted. While the index is being deleted, the Status field returned by a call to the DescribeIndex operation is set to DELETING.
    */
  def deleteIndex(): Request[js.Object, AWSError] = js.native
  def deleteIndex(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an existing Amazon Kendra index. An exception is not thrown if the index is already being deleted. While the index is being deleted, the Status field returned by a call to the DescribeIndex operation is set to DELETING.
    */
  def deleteIndex(params: DeleteIndexRequest): Request[js.Object, AWSError] = js.native
  def deleteIndex(params: DeleteIndexRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Gets information about a Amazon Kendra data source.
    */
  def describeDataSource(): Request[DescribeDataSourceResponse, AWSError] = js.native
  def describeDataSource(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSourceResponse, Unit]): Request[DescribeDataSourceResponse, AWSError] = js.native
  /**
    * Gets information about a Amazon Kendra data source.
    */
  def describeDataSource(params: DescribeDataSourceRequest): Request[DescribeDataSourceResponse, AWSError] = js.native
  def describeDataSource(
    params: DescribeDataSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSourceResponse, Unit]
  ): Request[DescribeDataSourceResponse, AWSError] = js.native
  /**
    * Gets information about an FAQ list.
    */
  def describeFaq(): Request[DescribeFaqResponse, AWSError] = js.native
  def describeFaq(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFaqResponse, Unit]): Request[DescribeFaqResponse, AWSError] = js.native
  /**
    * Gets information about an FAQ list.
    */
  def describeFaq(params: DescribeFaqRequest): Request[DescribeFaqResponse, AWSError] = js.native
  def describeFaq(
    params: DescribeFaqRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFaqResponse, Unit]
  ): Request[DescribeFaqResponse, AWSError] = js.native
  /**
    * Describes an existing Amazon Kendra index
    */
  def describeIndex(): Request[DescribeIndexResponse, AWSError] = js.native
  def describeIndex(callback: js.Function2[/* err */ AWSError, /* data */ DescribeIndexResponse, Unit]): Request[DescribeIndexResponse, AWSError] = js.native
  /**
    * Describes an existing Amazon Kendra index
    */
  def describeIndex(params: DescribeIndexRequest): Request[DescribeIndexResponse, AWSError] = js.native
  def describeIndex(
    params: DescribeIndexRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeIndexResponse, Unit]
  ): Request[DescribeIndexResponse, AWSError] = js.native
  /**
    * Gets statistics about synchronizing Amazon Kendra with a data source.
    */
  def listDataSourceSyncJobs(): Request[ListDataSourceSyncJobsResponse, AWSError] = js.native
  def listDataSourceSyncJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListDataSourceSyncJobsResponse, Unit]): Request[ListDataSourceSyncJobsResponse, AWSError] = js.native
  /**
    * Gets statistics about synchronizing Amazon Kendra with a data source.
    */
  def listDataSourceSyncJobs(params: ListDataSourceSyncJobsRequest): Request[ListDataSourceSyncJobsResponse, AWSError] = js.native
  def listDataSourceSyncJobs(
    params: ListDataSourceSyncJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDataSourceSyncJobsResponse, Unit]
  ): Request[ListDataSourceSyncJobsResponse, AWSError] = js.native
  /**
    * Lists the data sources that you have created.
    */
  def listDataSources(): Request[ListDataSourcesResponse, AWSError] = js.native
  def listDataSources(callback: js.Function2[/* err */ AWSError, /* data */ ListDataSourcesResponse, Unit]): Request[ListDataSourcesResponse, AWSError] = js.native
  /**
    * Lists the data sources that you have created.
    */
  def listDataSources(params: ListDataSourcesRequest): Request[ListDataSourcesResponse, AWSError] = js.native
  def listDataSources(
    params: ListDataSourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDataSourcesResponse, Unit]
  ): Request[ListDataSourcesResponse, AWSError] = js.native
  /**
    * Gets a list of FAQ lists associated with an index.
    */
  def listFaqs(): Request[ListFaqsResponse, AWSError] = js.native
  def listFaqs(callback: js.Function2[/* err */ AWSError, /* data */ ListFaqsResponse, Unit]): Request[ListFaqsResponse, AWSError] = js.native
  /**
    * Gets a list of FAQ lists associated with an index.
    */
  def listFaqs(params: ListFaqsRequest): Request[ListFaqsResponse, AWSError] = js.native
  def listFaqs(
    params: ListFaqsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFaqsResponse, Unit]
  ): Request[ListFaqsResponse, AWSError] = js.native
  /**
    * Lists the Amazon Kendra indexes that you have created.
    */
  def listIndices(): Request[ListIndicesResponse, AWSError] = js.native
  def listIndices(callback: js.Function2[/* err */ AWSError, /* data */ ListIndicesResponse, Unit]): Request[ListIndicesResponse, AWSError] = js.native
  /**
    * Lists the Amazon Kendra indexes that you have created.
    */
  def listIndices(params: ListIndicesRequest): Request[ListIndicesResponse, AWSError] = js.native
  def listIndices(
    params: ListIndicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIndicesResponse, Unit]
  ): Request[ListIndicesResponse, AWSError] = js.native
  /**
    * Searches an active index. Use this API to search your documents using query. The Query operation enables to do faceted search and to filter results based on document attributes. It also enables you to provide user context that Amazon Kendra uses to enforce document access control in the search results.  Amazon Kendra searches your index for text content and question and answer (FAQ) content. By default the response contains three types of results.   Relevant passages   Matching FAQs   Relevant documents   You can specify that the query return only one type of result using the QueryResultTypeConfig parameter.
    */
  def query(): Request[QueryResult, AWSError] = js.native
  def query(callback: js.Function2[/* err */ AWSError, /* data */ QueryResult, Unit]): Request[QueryResult, AWSError] = js.native
  /**
    * Searches an active index. Use this API to search your documents using query. The Query operation enables to do faceted search and to filter results based on document attributes. It also enables you to provide user context that Amazon Kendra uses to enforce document access control in the search results.  Amazon Kendra searches your index for text content and question and answer (FAQ) content. By default the response contains three types of results.   Relevant passages   Matching FAQs   Relevant documents   You can specify that the query return only one type of result using the QueryResultTypeConfig parameter.
    */
  def query(params: QueryRequest): Request[QueryResult, AWSError] = js.native
  def query(params: QueryRequest, callback: js.Function2[/* err */ AWSError, /* data */ QueryResult, Unit]): Request[QueryResult, AWSError] = js.native
  /**
    * Starts a synchronization job for a data source. If a synchronization job is already in progress, Amazon Kendra returns a ResourceInUseException exception.
    */
  def startDataSourceSyncJob(): Request[StartDataSourceSyncJobResponse, AWSError] = js.native
  def startDataSourceSyncJob(callback: js.Function2[/* err */ AWSError, /* data */ StartDataSourceSyncJobResponse, Unit]): Request[StartDataSourceSyncJobResponse, AWSError] = js.native
  /**
    * Starts a synchronization job for a data source. If a synchronization job is already in progress, Amazon Kendra returns a ResourceInUseException exception.
    */
  def startDataSourceSyncJob(params: StartDataSourceSyncJobRequest): Request[StartDataSourceSyncJobResponse, AWSError] = js.native
  def startDataSourceSyncJob(
    params: StartDataSourceSyncJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartDataSourceSyncJobResponse, Unit]
  ): Request[StartDataSourceSyncJobResponse, AWSError] = js.native
  /**
    * Stops a running synchronization job. You can't stop a scheduled synchronization job.
    */
  def stopDataSourceSyncJob(): Request[js.Object, AWSError] = js.native
  def stopDataSourceSyncJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops a running synchronization job. You can't stop a scheduled synchronization job.
    */
  def stopDataSourceSyncJob(params: StopDataSourceSyncJobRequest): Request[js.Object, AWSError] = js.native
  def stopDataSourceSyncJob(
    params: StopDataSourceSyncJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Enables you to provide feedback to Amazon Kendra to improve the performance of the service. 
    */
  def submitFeedback(): Request[js.Object, AWSError] = js.native
  def submitFeedback(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Enables you to provide feedback to Amazon Kendra to improve the performance of the service. 
    */
  def submitFeedback(params: SubmitFeedbackRequest): Request[js.Object, AWSError] = js.native
  def submitFeedback(
    params: SubmitFeedbackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Updates an existing Amazon Kendra data source.
    */
  def updateDataSource(): Request[js.Object, AWSError] = js.native
  def updateDataSource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates an existing Amazon Kendra data source.
    */
  def updateDataSource(params: UpdateDataSourceRequest): Request[js.Object, AWSError] = js.native
  def updateDataSource(
    params: UpdateDataSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Updates an existing Amazon Kendra index.
    */
  def updateIndex(): Request[js.Object, AWSError] = js.native
  def updateIndex(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates an existing Amazon Kendra index.
    */
  def updateIndex(params: UpdateIndexRequest): Request[js.Object, AWSError] = js.native
  def updateIndex(params: UpdateIndexRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
}

