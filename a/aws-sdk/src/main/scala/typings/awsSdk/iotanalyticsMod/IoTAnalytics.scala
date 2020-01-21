package typings.awsSdk.iotanalyticsMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IoTAnalytics extends Service {
  @JSName("config")
  var config_IoTAnalytics: ConfigBase with ClientConfiguration = js.native
  /**
    * Sends messages to a channel.
    */
  def batchPutMessage(): Request[BatchPutMessageResponse, AWSError] = js.native
  def batchPutMessage(callback: js.Function2[/* err */ AWSError, /* data */ BatchPutMessageResponse, Unit]): Request[BatchPutMessageResponse, AWSError] = js.native
  /**
    * Sends messages to a channel.
    */
  def batchPutMessage(params: BatchPutMessageRequest): Request[BatchPutMessageResponse, AWSError] = js.native
  def batchPutMessage(
    params: BatchPutMessageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchPutMessageResponse, Unit]
  ): Request[BatchPutMessageResponse, AWSError] = js.native
  /**
    * Cancels the reprocessing of data through the pipeline.
    */
  def cancelPipelineReprocessing(): Request[CancelPipelineReprocessingResponse, AWSError] = js.native
  def cancelPipelineReprocessing(callback: js.Function2[/* err */ AWSError, /* data */ CancelPipelineReprocessingResponse, Unit]): Request[CancelPipelineReprocessingResponse, AWSError] = js.native
  /**
    * Cancels the reprocessing of data through the pipeline.
    */
  def cancelPipelineReprocessing(params: CancelPipelineReprocessingRequest): Request[CancelPipelineReprocessingResponse, AWSError] = js.native
  def cancelPipelineReprocessing(
    params: CancelPipelineReprocessingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelPipelineReprocessingResponse, Unit]
  ): Request[CancelPipelineReprocessingResponse, AWSError] = js.native
  /**
    * Creates a channel. A channel collects data from an MQTT topic and archives the raw, unprocessed messages before publishing the data to a pipeline.
    */
  def createChannel(): Request[CreateChannelResponse, AWSError] = js.native
  def createChannel(callback: js.Function2[/* err */ AWSError, /* data */ CreateChannelResponse, Unit]): Request[CreateChannelResponse, AWSError] = js.native
  /**
    * Creates a channel. A channel collects data from an MQTT topic and archives the raw, unprocessed messages before publishing the data to a pipeline.
    */
  def createChannel(params: CreateChannelRequest): Request[CreateChannelResponse, AWSError] = js.native
  def createChannel(
    params: CreateChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateChannelResponse, Unit]
  ): Request[CreateChannelResponse, AWSError] = js.native
  /**
    * Creates a data set. A data set stores data retrieved from a data store by applying a "queryAction" (a SQL query) or a "containerAction" (executing a containerized application). This operation creates the skeleton of a data set. The data set can be populated manually by calling "CreateDatasetContent" or automatically according to a "trigger" you specify.
    */
  def createDataset(): Request[CreateDatasetResponse, AWSError] = js.native
  def createDataset(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetResponse, Unit]): Request[CreateDatasetResponse, AWSError] = js.native
  /**
    * Creates a data set. A data set stores data retrieved from a data store by applying a "queryAction" (a SQL query) or a "containerAction" (executing a containerized application). This operation creates the skeleton of a data set. The data set can be populated manually by calling "CreateDatasetContent" or automatically according to a "trigger" you specify.
    */
  def createDataset(params: CreateDatasetRequest): Request[CreateDatasetResponse, AWSError] = js.native
  def createDataset(
    params: CreateDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetResponse, Unit]
  ): Request[CreateDatasetResponse, AWSError] = js.native
  /**
    * Creates the content of a data set by applying a "queryAction" (a SQL query) or a "containerAction" (executing a containerized application).
    */
  def createDatasetContent(): Request[CreateDatasetContentResponse, AWSError] = js.native
  def createDatasetContent(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetContentResponse, Unit]): Request[CreateDatasetContentResponse, AWSError] = js.native
  /**
    * Creates the content of a data set by applying a "queryAction" (a SQL query) or a "containerAction" (executing a containerized application).
    */
  def createDatasetContent(params: CreateDatasetContentRequest): Request[CreateDatasetContentResponse, AWSError] = js.native
  def createDatasetContent(
    params: CreateDatasetContentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetContentResponse, Unit]
  ): Request[CreateDatasetContentResponse, AWSError] = js.native
  /**
    * Creates a data store, which is a repository for messages.
    */
  def createDatastore(): Request[CreateDatastoreResponse, AWSError] = js.native
  def createDatastore(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatastoreResponse, Unit]): Request[CreateDatastoreResponse, AWSError] = js.native
  /**
    * Creates a data store, which is a repository for messages.
    */
  def createDatastore(params: CreateDatastoreRequest): Request[CreateDatastoreResponse, AWSError] = js.native
  def createDatastore(
    params: CreateDatastoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatastoreResponse, Unit]
  ): Request[CreateDatastoreResponse, AWSError] = js.native
  /**
    * Creates a pipeline. A pipeline consumes messages from a channel and allows you to process the messages before storing them in a data store. You must specify both a channel and a datastore activity and, optionally, as many as 23 additional activities in the pipelineActivities array.
    */
  def createPipeline(): Request[CreatePipelineResponse, AWSError] = js.native
  def createPipeline(callback: js.Function2[/* err */ AWSError, /* data */ CreatePipelineResponse, Unit]): Request[CreatePipelineResponse, AWSError] = js.native
  /**
    * Creates a pipeline. A pipeline consumes messages from a channel and allows you to process the messages before storing them in a data store. You must specify both a channel and a datastore activity and, optionally, as many as 23 additional activities in the pipelineActivities array.
    */
  def createPipeline(params: CreatePipelineRequest): Request[CreatePipelineResponse, AWSError] = js.native
  def createPipeline(
    params: CreatePipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePipelineResponse, Unit]
  ): Request[CreatePipelineResponse, AWSError] = js.native
  /**
    * Deletes the specified channel.
    */
  def deleteChannel(): Request[js.Object, AWSError] = js.native
  def deleteChannel(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified channel.
    */
  def deleteChannel(params: DeleteChannelRequest): Request[js.Object, AWSError] = js.native
  def deleteChannel(
    params: DeleteChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified data set. You do not have to delete the content of the data set before you perform this operation.
    */
  def deleteDataset(): Request[js.Object, AWSError] = js.native
  def deleteDataset(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified data set. You do not have to delete the content of the data set before you perform this operation.
    */
  def deleteDataset(params: DeleteDatasetRequest): Request[js.Object, AWSError] = js.native
  def deleteDataset(
    params: DeleteDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the content of the specified data set.
    */
  def deleteDatasetContent(): Request[js.Object, AWSError] = js.native
  def deleteDatasetContent(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the content of the specified data set.
    */
  def deleteDatasetContent(params: DeleteDatasetContentRequest): Request[js.Object, AWSError] = js.native
  def deleteDatasetContent(
    params: DeleteDatasetContentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified data store.
    */
  def deleteDatastore(): Request[js.Object, AWSError] = js.native
  def deleteDatastore(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified data store.
    */
  def deleteDatastore(params: DeleteDatastoreRequest): Request[js.Object, AWSError] = js.native
  def deleteDatastore(
    params: DeleteDatastoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified pipeline.
    */
  def deletePipeline(): Request[js.Object, AWSError] = js.native
  def deletePipeline(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified pipeline.
    */
  def deletePipeline(params: DeletePipelineRequest): Request[js.Object, AWSError] = js.native
  def deletePipeline(
    params: DeletePipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Retrieves information about a channel.
    */
  def describeChannel(): Request[DescribeChannelResponse, AWSError] = js.native
  def describeChannel(callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelResponse, Unit]): Request[DescribeChannelResponse, AWSError] = js.native
  /**
    * Retrieves information about a channel.
    */
  def describeChannel(params: DescribeChannelRequest): Request[DescribeChannelResponse, AWSError] = js.native
  def describeChannel(
    params: DescribeChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelResponse, Unit]
  ): Request[DescribeChannelResponse, AWSError] = js.native
  /**
    * Retrieves information about a data set.
    */
  def describeDataset(): Request[DescribeDatasetResponse, AWSError] = js.native
  def describeDataset(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetResponse, Unit]): Request[DescribeDatasetResponse, AWSError] = js.native
  /**
    * Retrieves information about a data set.
    */
  def describeDataset(params: DescribeDatasetRequest): Request[DescribeDatasetResponse, AWSError] = js.native
  def describeDataset(
    params: DescribeDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetResponse, Unit]
  ): Request[DescribeDatasetResponse, AWSError] = js.native
  /**
    * Retrieves information about a data store.
    */
  def describeDatastore(): Request[DescribeDatastoreResponse, AWSError] = js.native
  def describeDatastore(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatastoreResponse, Unit]): Request[DescribeDatastoreResponse, AWSError] = js.native
  /**
    * Retrieves information about a data store.
    */
  def describeDatastore(params: DescribeDatastoreRequest): Request[DescribeDatastoreResponse, AWSError] = js.native
  def describeDatastore(
    params: DescribeDatastoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatastoreResponse, Unit]
  ): Request[DescribeDatastoreResponse, AWSError] = js.native
  /**
    * Retrieves the current settings of the AWS IoT Analytics logging options.
    */
  def describeLoggingOptions(): Request[DescribeLoggingOptionsResponse, AWSError] = js.native
  def describeLoggingOptions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoggingOptionsResponse, Unit]): Request[DescribeLoggingOptionsResponse, AWSError] = js.native
  /**
    * Retrieves the current settings of the AWS IoT Analytics logging options.
    */
  def describeLoggingOptions(params: DescribeLoggingOptionsRequest): Request[DescribeLoggingOptionsResponse, AWSError] = js.native
  def describeLoggingOptions(
    params: DescribeLoggingOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoggingOptionsResponse, Unit]
  ): Request[DescribeLoggingOptionsResponse, AWSError] = js.native
  /**
    * Retrieves information about a pipeline.
    */
  def describePipeline(): Request[DescribePipelineResponse, AWSError] = js.native
  def describePipeline(callback: js.Function2[/* err */ AWSError, /* data */ DescribePipelineResponse, Unit]): Request[DescribePipelineResponse, AWSError] = js.native
  /**
    * Retrieves information about a pipeline.
    */
  def describePipeline(params: DescribePipelineRequest): Request[DescribePipelineResponse, AWSError] = js.native
  def describePipeline(
    params: DescribePipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePipelineResponse, Unit]
  ): Request[DescribePipelineResponse, AWSError] = js.native
  /**
    * Retrieves the contents of a data set as pre-signed URIs.
    */
  def getDatasetContent(): Request[GetDatasetContentResponse, AWSError] = js.native
  def getDatasetContent(callback: js.Function2[/* err */ AWSError, /* data */ GetDatasetContentResponse, Unit]): Request[GetDatasetContentResponse, AWSError] = js.native
  /**
    * Retrieves the contents of a data set as pre-signed URIs.
    */
  def getDatasetContent(params: GetDatasetContentRequest): Request[GetDatasetContentResponse, AWSError] = js.native
  def getDatasetContent(
    params: GetDatasetContentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDatasetContentResponse, Unit]
  ): Request[GetDatasetContentResponse, AWSError] = js.native
  /**
    * Retrieves a list of channels.
    */
  def listChannels(): Request[ListChannelsResponse, AWSError] = js.native
  def listChannels(callback: js.Function2[/* err */ AWSError, /* data */ ListChannelsResponse, Unit]): Request[ListChannelsResponse, AWSError] = js.native
  /**
    * Retrieves a list of channels.
    */
  def listChannels(params: ListChannelsRequest): Request[ListChannelsResponse, AWSError] = js.native
  def listChannels(
    params: ListChannelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListChannelsResponse, Unit]
  ): Request[ListChannelsResponse, AWSError] = js.native
  /**
    * Lists information about data set contents that have been created.
    */
  def listDatasetContents(): Request[ListDatasetContentsResponse, AWSError] = js.native
  def listDatasetContents(callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetContentsResponse, Unit]): Request[ListDatasetContentsResponse, AWSError] = js.native
  /**
    * Lists information about data set contents that have been created.
    */
  def listDatasetContents(params: ListDatasetContentsRequest): Request[ListDatasetContentsResponse, AWSError] = js.native
  def listDatasetContents(
    params: ListDatasetContentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetContentsResponse, Unit]
  ): Request[ListDatasetContentsResponse, AWSError] = js.native
  /**
    * Retrieves information about data sets.
    */
  def listDatasets(): Request[ListDatasetsResponse, AWSError] = js.native
  def listDatasets(callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetsResponse, Unit]): Request[ListDatasetsResponse, AWSError] = js.native
  /**
    * Retrieves information about data sets.
    */
  def listDatasets(params: ListDatasetsRequest): Request[ListDatasetsResponse, AWSError] = js.native
  def listDatasets(
    params: ListDatasetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetsResponse, Unit]
  ): Request[ListDatasetsResponse, AWSError] = js.native
  /**
    * Retrieves a list of data stores.
    */
  def listDatastores(): Request[ListDatastoresResponse, AWSError] = js.native
  def listDatastores(callback: js.Function2[/* err */ AWSError, /* data */ ListDatastoresResponse, Unit]): Request[ListDatastoresResponse, AWSError] = js.native
  /**
    * Retrieves a list of data stores.
    */
  def listDatastores(params: ListDatastoresRequest): Request[ListDatastoresResponse, AWSError] = js.native
  def listDatastores(
    params: ListDatastoresRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatastoresResponse, Unit]
  ): Request[ListDatastoresResponse, AWSError] = js.native
  /**
    * Retrieves a list of pipelines.
    */
  def listPipelines(): Request[ListPipelinesResponse, AWSError] = js.native
  def listPipelines(callback: js.Function2[/* err */ AWSError, /* data */ ListPipelinesResponse, Unit]): Request[ListPipelinesResponse, AWSError] = js.native
  /**
    * Retrieves a list of pipelines.
    */
  def listPipelines(params: ListPipelinesRequest): Request[ListPipelinesResponse, AWSError] = js.native
  def listPipelines(
    params: ListPipelinesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPipelinesResponse, Unit]
  ): Request[ListPipelinesResponse, AWSError] = js.native
  /**
    * Lists the tags (metadata) which you have assigned to the resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags (metadata) which you have assigned to the resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Sets or updates the AWS IoT Analytics logging options. Note that if you update the value of any loggingOptions field, it takes up to one minute for the change to take effect. Also, if you change the policy attached to the role you specified in the roleArn field (for example, to correct an invalid policy) it takes up to 5 minutes for that change to take effect. 
    */
  def putLoggingOptions(): Request[js.Object, AWSError] = js.native
  def putLoggingOptions(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets or updates the AWS IoT Analytics logging options. Note that if you update the value of any loggingOptions field, it takes up to one minute for the change to take effect. Also, if you change the policy attached to the role you specified in the roleArn field (for example, to correct an invalid policy) it takes up to 5 minutes for that change to take effect. 
    */
  def putLoggingOptions(params: PutLoggingOptionsRequest): Request[js.Object, AWSError] = js.native
  def putLoggingOptions(
    params: PutLoggingOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Simulates the results of running a pipeline activity on a message payload.
    */
  def runPipelineActivity(): Request[RunPipelineActivityResponse, AWSError] = js.native
  def runPipelineActivity(callback: js.Function2[/* err */ AWSError, /* data */ RunPipelineActivityResponse, Unit]): Request[RunPipelineActivityResponse, AWSError] = js.native
  /**
    * Simulates the results of running a pipeline activity on a message payload.
    */
  def runPipelineActivity(params: RunPipelineActivityRequest): Request[RunPipelineActivityResponse, AWSError] = js.native
  def runPipelineActivity(
    params: RunPipelineActivityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RunPipelineActivityResponse, Unit]
  ): Request[RunPipelineActivityResponse, AWSError] = js.native
  /**
    * Retrieves a sample of messages from the specified channel ingested during the specified timeframe. Up to 10 messages can be retrieved.
    */
  def sampleChannelData(): Request[SampleChannelDataResponse, AWSError] = js.native
  def sampleChannelData(callback: js.Function2[/* err */ AWSError, /* data */ SampleChannelDataResponse, Unit]): Request[SampleChannelDataResponse, AWSError] = js.native
  /**
    * Retrieves a sample of messages from the specified channel ingested during the specified timeframe. Up to 10 messages can be retrieved.
    */
  def sampleChannelData(params: SampleChannelDataRequest): Request[SampleChannelDataResponse, AWSError] = js.native
  def sampleChannelData(
    params: SampleChannelDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SampleChannelDataResponse, Unit]
  ): Request[SampleChannelDataResponse, AWSError] = js.native
  /**
    * Starts the reprocessing of raw message data through the pipeline.
    */
  def startPipelineReprocessing(): Request[StartPipelineReprocessingResponse, AWSError] = js.native
  def startPipelineReprocessing(callback: js.Function2[/* err */ AWSError, /* data */ StartPipelineReprocessingResponse, Unit]): Request[StartPipelineReprocessingResponse, AWSError] = js.native
  /**
    * Starts the reprocessing of raw message data through the pipeline.
    */
  def startPipelineReprocessing(params: StartPipelineReprocessingRequest): Request[StartPipelineReprocessingResponse, AWSError] = js.native
  def startPipelineReprocessing(
    params: StartPipelineReprocessingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartPipelineReprocessingResponse, Unit]
  ): Request[StartPipelineReprocessingResponse, AWSError] = js.native
  /**
    * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Removes the given tags (metadata) from the resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the given tags (metadata) from the resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Updates the settings of a channel.
    */
  def updateChannel(): Request[js.Object, AWSError] = js.native
  def updateChannel(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the settings of a channel.
    */
  def updateChannel(params: UpdateChannelRequest): Request[js.Object, AWSError] = js.native
  def updateChannel(
    params: UpdateChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Updates the settings of a data set.
    */
  def updateDataset(): Request[js.Object, AWSError] = js.native
  def updateDataset(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the settings of a data set.
    */
  def updateDataset(params: UpdateDatasetRequest): Request[js.Object, AWSError] = js.native
  def updateDataset(
    params: UpdateDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Updates the settings of a data store.
    */
  def updateDatastore(): Request[js.Object, AWSError] = js.native
  def updateDatastore(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the settings of a data store.
    */
  def updateDatastore(params: UpdateDatastoreRequest): Request[js.Object, AWSError] = js.native
  def updateDatastore(
    params: UpdateDatastoreRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Updates the settings of a pipeline. You must specify both a channel and a datastore activity and, optionally, as many as 23 additional activities in the pipelineActivities array.
    */
  def updatePipeline(): Request[js.Object, AWSError] = js.native
  def updatePipeline(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the settings of a pipeline. You must specify both a channel and a datastore activity and, optionally, as many as 23 additional activities in the pipelineActivities array.
    */
  def updatePipeline(params: UpdatePipelineRequest): Request[js.Object, AWSError] = js.native
  def updatePipeline(
    params: UpdatePipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
}

