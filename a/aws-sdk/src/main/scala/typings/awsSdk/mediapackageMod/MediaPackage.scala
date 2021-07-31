package typings.awsSdk.mediapackageMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaPackage extends Service {
  
  @JSName("config")
  var config_MediaPackage: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Changes the Channel's properities to configure log subscription
    */
  def configureLogs(): Request[ConfigureLogsResponse, AWSError] = js.native
  def configureLogs(callback: js.Function2[/* err */ AWSError, /* data */ ConfigureLogsResponse, Unit]): Request[ConfigureLogsResponse, AWSError] = js.native
  /**
    * Changes the Channel's properities to configure log subscription
    */
  def configureLogs(params: ConfigureLogsRequest): Request[ConfigureLogsResponse, AWSError] = js.native
  def configureLogs(
    params: ConfigureLogsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ConfigureLogsResponse, Unit]
  ): Request[ConfigureLogsResponse, AWSError] = js.native
  
  /**
    * Creates a new Channel.
    */
  def createChannel(): Request[CreateChannelResponse, AWSError] = js.native
  def createChannel(callback: js.Function2[/* err */ AWSError, /* data */ CreateChannelResponse, Unit]): Request[CreateChannelResponse, AWSError] = js.native
  /**
    * Creates a new Channel.
    */
  def createChannel(params: CreateChannelRequest): Request[CreateChannelResponse, AWSError] = js.native
  def createChannel(
    params: CreateChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateChannelResponse, Unit]
  ): Request[CreateChannelResponse, AWSError] = js.native
  
  /**
    * Creates a new HarvestJob record.
    */
  def createHarvestJob(): Request[CreateHarvestJobResponse, AWSError] = js.native
  def createHarvestJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateHarvestJobResponse, Unit]): Request[CreateHarvestJobResponse, AWSError] = js.native
  /**
    * Creates a new HarvestJob record.
    */
  def createHarvestJob(params: CreateHarvestJobRequest): Request[CreateHarvestJobResponse, AWSError] = js.native
  def createHarvestJob(
    params: CreateHarvestJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateHarvestJobResponse, Unit]
  ): Request[CreateHarvestJobResponse, AWSError] = js.native
  
  /**
    * Creates a new OriginEndpoint record.
    */
  def createOriginEndpoint(): Request[CreateOriginEndpointResponse, AWSError] = js.native
  def createOriginEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ CreateOriginEndpointResponse, Unit]): Request[CreateOriginEndpointResponse, AWSError] = js.native
  /**
    * Creates a new OriginEndpoint record.
    */
  def createOriginEndpoint(params: CreateOriginEndpointRequest): Request[CreateOriginEndpointResponse, AWSError] = js.native
  def createOriginEndpoint(
    params: CreateOriginEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateOriginEndpointResponse, Unit]
  ): Request[CreateOriginEndpointResponse, AWSError] = js.native
  
  /**
    * Deletes an existing Channel.
    */
  def deleteChannel(): Request[DeleteChannelResponse, AWSError] = js.native
  def deleteChannel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteChannelResponse, Unit]): Request[DeleteChannelResponse, AWSError] = js.native
  /**
    * Deletes an existing Channel.
    */
  def deleteChannel(params: DeleteChannelRequest): Request[DeleteChannelResponse, AWSError] = js.native
  def deleteChannel(
    params: DeleteChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteChannelResponse, Unit]
  ): Request[DeleteChannelResponse, AWSError] = js.native
  
  /**
    * Deletes an existing OriginEndpoint.
    */
  def deleteOriginEndpoint(): Request[DeleteOriginEndpointResponse, AWSError] = js.native
  def deleteOriginEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ DeleteOriginEndpointResponse, Unit]): Request[DeleteOriginEndpointResponse, AWSError] = js.native
  /**
    * Deletes an existing OriginEndpoint.
    */
  def deleteOriginEndpoint(params: DeleteOriginEndpointRequest): Request[DeleteOriginEndpointResponse, AWSError] = js.native
  def deleteOriginEndpoint(
    params: DeleteOriginEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteOriginEndpointResponse, Unit]
  ): Request[DeleteOriginEndpointResponse, AWSError] = js.native
  
  /**
    * Gets details about a Channel.
    */
  def describeChannel(): Request[DescribeChannelResponse, AWSError] = js.native
  def describeChannel(callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelResponse, Unit]): Request[DescribeChannelResponse, AWSError] = js.native
  /**
    * Gets details about a Channel.
    */
  def describeChannel(params: DescribeChannelRequest): Request[DescribeChannelResponse, AWSError] = js.native
  def describeChannel(
    params: DescribeChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelResponse, Unit]
  ): Request[DescribeChannelResponse, AWSError] = js.native
  
  /**
    * Gets details about an existing HarvestJob.
    */
  def describeHarvestJob(): Request[DescribeHarvestJobResponse, AWSError] = js.native
  def describeHarvestJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeHarvestJobResponse, Unit]): Request[DescribeHarvestJobResponse, AWSError] = js.native
  /**
    * Gets details about an existing HarvestJob.
    */
  def describeHarvestJob(params: DescribeHarvestJobRequest): Request[DescribeHarvestJobResponse, AWSError] = js.native
  def describeHarvestJob(
    params: DescribeHarvestJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeHarvestJobResponse, Unit]
  ): Request[DescribeHarvestJobResponse, AWSError] = js.native
  
  /**
    * Gets details about an existing OriginEndpoint.
    */
  def describeOriginEndpoint(): Request[DescribeOriginEndpointResponse, AWSError] = js.native
  def describeOriginEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ DescribeOriginEndpointResponse, Unit]): Request[DescribeOriginEndpointResponse, AWSError] = js.native
  /**
    * Gets details about an existing OriginEndpoint.
    */
  def describeOriginEndpoint(params: DescribeOriginEndpointRequest): Request[DescribeOriginEndpointResponse, AWSError] = js.native
  def describeOriginEndpoint(
    params: DescribeOriginEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOriginEndpointResponse, Unit]
  ): Request[DescribeOriginEndpointResponse, AWSError] = js.native
  
  /**
    * Returns a collection of Channels.
    */
  def listChannels(): Request[ListChannelsResponse, AWSError] = js.native
  def listChannels(callback: js.Function2[/* err */ AWSError, /* data */ ListChannelsResponse, Unit]): Request[ListChannelsResponse, AWSError] = js.native
  /**
    * Returns a collection of Channels.
    */
  def listChannels(params: ListChannelsRequest): Request[ListChannelsResponse, AWSError] = js.native
  def listChannels(
    params: ListChannelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListChannelsResponse, Unit]
  ): Request[ListChannelsResponse, AWSError] = js.native
  
  /**
    * Returns a collection of HarvestJob records.
    */
  def listHarvestJobs(): Request[ListHarvestJobsResponse, AWSError] = js.native
  def listHarvestJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListHarvestJobsResponse, Unit]): Request[ListHarvestJobsResponse, AWSError] = js.native
  /**
    * Returns a collection of HarvestJob records.
    */
  def listHarvestJobs(params: ListHarvestJobsRequest): Request[ListHarvestJobsResponse, AWSError] = js.native
  def listHarvestJobs(
    params: ListHarvestJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListHarvestJobsResponse, Unit]
  ): Request[ListHarvestJobsResponse, AWSError] = js.native
  
  /**
    * Returns a collection of OriginEndpoint records.
    */
  def listOriginEndpoints(): Request[ListOriginEndpointsResponse, AWSError] = js.native
  def listOriginEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ ListOriginEndpointsResponse, Unit]): Request[ListOriginEndpointsResponse, AWSError] = js.native
  /**
    * Returns a collection of OriginEndpoint records.
    */
  def listOriginEndpoints(params: ListOriginEndpointsRequest): Request[ListOriginEndpointsResponse, AWSError] = js.native
  def listOriginEndpoints(
    params: ListOriginEndpointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOriginEndpointsResponse, Unit]
  ): Request[ListOriginEndpointsResponse, AWSError] = js.native
  
  /**
    * 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Changes the Channel's first IngestEndpoint's username and password. WARNING - This API is deprecated. Please use RotateIngestEndpointCredentials instead
    */
  def rotateChannelCredentials(): Request[RotateChannelCredentialsResponse, AWSError] = js.native
  def rotateChannelCredentials(callback: js.Function2[/* err */ AWSError, /* data */ RotateChannelCredentialsResponse, Unit]): Request[RotateChannelCredentialsResponse, AWSError] = js.native
  /**
    * Changes the Channel's first IngestEndpoint's username and password. WARNING - This API is deprecated. Please use RotateIngestEndpointCredentials instead
    */
  def rotateChannelCredentials(params: RotateChannelCredentialsRequest): Request[RotateChannelCredentialsResponse, AWSError] = js.native
  def rotateChannelCredentials(
    params: RotateChannelCredentialsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RotateChannelCredentialsResponse, Unit]
  ): Request[RotateChannelCredentialsResponse, AWSError] = js.native
  
  /**
    * Rotate the IngestEndpoint's username and password, as specified by the IngestEndpoint's id.
    */
  def rotateIngestEndpointCredentials(): Request[RotateIngestEndpointCredentialsResponse, AWSError] = js.native
  def rotateIngestEndpointCredentials(
    callback: js.Function2[/* err */ AWSError, /* data */ RotateIngestEndpointCredentialsResponse, Unit]
  ): Request[RotateIngestEndpointCredentialsResponse, AWSError] = js.native
  /**
    * Rotate the IngestEndpoint's username and password, as specified by the IngestEndpoint's id.
    */
  def rotateIngestEndpointCredentials(params: RotateIngestEndpointCredentialsRequest): Request[RotateIngestEndpointCredentialsResponse, AWSError] = js.native
  def rotateIngestEndpointCredentials(
    params: RotateIngestEndpointCredentialsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RotateIngestEndpointCredentialsResponse, Unit]
  ): Request[RotateIngestEndpointCredentialsResponse, AWSError] = js.native
  
  /**
    * 
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * 
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * 
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * 
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates an existing Channel.
    */
  def updateChannel(): Request[UpdateChannelResponse, AWSError] = js.native
  def updateChannel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateChannelResponse, Unit]): Request[UpdateChannelResponse, AWSError] = js.native
  /**
    * Updates an existing Channel.
    */
  def updateChannel(params: UpdateChannelRequest): Request[UpdateChannelResponse, AWSError] = js.native
  def updateChannel(
    params: UpdateChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateChannelResponse, Unit]
  ): Request[UpdateChannelResponse, AWSError] = js.native
  
  /**
    * Updates an existing OriginEndpoint.
    */
  def updateOriginEndpoint(): Request[UpdateOriginEndpointResponse, AWSError] = js.native
  def updateOriginEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ UpdateOriginEndpointResponse, Unit]): Request[UpdateOriginEndpointResponse, AWSError] = js.native
  /**
    * Updates an existing OriginEndpoint.
    */
  def updateOriginEndpoint(params: UpdateOriginEndpointRequest): Request[UpdateOriginEndpointResponse, AWSError] = js.native
  def updateOriginEndpoint(
    params: UpdateOriginEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateOriginEndpointResponse, Unit]
  ): Request[UpdateOriginEndpointResponse, AWSError] = js.native
}
