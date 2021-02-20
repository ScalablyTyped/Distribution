package typings.awsSdk.ivsMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVS extends Service {
  
  /**
    * Performs GetChannel on multiple ARNs simultaneously.
    */
  def batchGetChannel(): Request[BatchGetChannelResponse, AWSError] = js.native
  def batchGetChannel(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetChannelResponse, Unit]): Request[BatchGetChannelResponse, AWSError] = js.native
  /**
    * Performs GetChannel on multiple ARNs simultaneously.
    */
  def batchGetChannel(params: BatchGetChannelRequest): Request[BatchGetChannelResponse, AWSError] = js.native
  def batchGetChannel(
    params: BatchGetChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetChannelResponse, Unit]
  ): Request[BatchGetChannelResponse, AWSError] = js.native
  
  /**
    * Performs GetStreamKey on multiple ARNs simultaneously.
    */
  def batchGetStreamKey(): Request[BatchGetStreamKeyResponse, AWSError] = js.native
  def batchGetStreamKey(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetStreamKeyResponse, Unit]): Request[BatchGetStreamKeyResponse, AWSError] = js.native
  /**
    * Performs GetStreamKey on multiple ARNs simultaneously.
    */
  def batchGetStreamKey(params: BatchGetStreamKeyRequest): Request[BatchGetStreamKeyResponse, AWSError] = js.native
  def batchGetStreamKey(
    params: BatchGetStreamKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetStreamKeyResponse, Unit]
  ): Request[BatchGetStreamKeyResponse, AWSError] = js.native
  
  @JSName("config")
  var config_IVS: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Creates a new channel and an associated stream key to start streaming.
    */
  def createChannel(): Request[CreateChannelResponse, AWSError] = js.native
  def createChannel(callback: js.Function2[/* err */ AWSError, /* data */ CreateChannelResponse, Unit]): Request[CreateChannelResponse, AWSError] = js.native
  /**
    * Creates a new channel and an associated stream key to start streaming.
    */
  def createChannel(params: CreateChannelRequest): Request[CreateChannelResponse, AWSError] = js.native
  def createChannel(
    params: CreateChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateChannelResponse, Unit]
  ): Request[CreateChannelResponse, AWSError] = js.native
  
  /**
    * Creates a stream key, used to initiate a stream, for the specified channel ARN. Note that CreateChannel creates a stream key. If you subsequently use CreateStreamKey on the same channel, it will fail because a stream key already exists and there is a limit of 1 stream key per channel. To reset the stream key on a channel, use DeleteStreamKey and then CreateStreamKey.
    */
  def createStreamKey(): Request[CreateStreamKeyResponse, AWSError] = js.native
  def createStreamKey(callback: js.Function2[/* err */ AWSError, /* data */ CreateStreamKeyResponse, Unit]): Request[CreateStreamKeyResponse, AWSError] = js.native
  /**
    * Creates a stream key, used to initiate a stream, for the specified channel ARN. Note that CreateChannel creates a stream key. If you subsequently use CreateStreamKey on the same channel, it will fail because a stream key already exists and there is a limit of 1 stream key per channel. To reset the stream key on a channel, use DeleteStreamKey and then CreateStreamKey.
    */
  def createStreamKey(params: CreateStreamKeyRequest): Request[CreateStreamKeyResponse, AWSError] = js.native
  def createStreamKey(
    params: CreateStreamKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStreamKeyResponse, Unit]
  ): Request[CreateStreamKeyResponse, AWSError] = js.native
  
  /**
    * Deletes the specified channel and its associated stream keys.
    */
  def deleteChannel(): Request[js.Object, AWSError] = js.native
  def deleteChannel(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified channel and its associated stream keys.
    */
  def deleteChannel(params: DeleteChannelRequest): Request[js.Object, AWSError] = js.native
  def deleteChannel(
    params: DeleteChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a specified authorization key pair. This invalidates future viewer tokens generated using the key pair’s privateKey.
    */
  def deletePlaybackKeyPair(): Request[DeletePlaybackKeyPairResponse, AWSError] = js.native
  def deletePlaybackKeyPair(callback: js.Function2[/* err */ AWSError, /* data */ DeletePlaybackKeyPairResponse, Unit]): Request[DeletePlaybackKeyPairResponse, AWSError] = js.native
  /**
    * Deletes a specified authorization key pair. This invalidates future viewer tokens generated using the key pair’s privateKey.
    */
  def deletePlaybackKeyPair(params: DeletePlaybackKeyPairRequest): Request[DeletePlaybackKeyPairResponse, AWSError] = js.native
  def deletePlaybackKeyPair(
    params: DeletePlaybackKeyPairRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePlaybackKeyPairResponse, Unit]
  ): Request[DeletePlaybackKeyPairResponse, AWSError] = js.native
  
  /**
    * Deletes the stream key for the specified ARN, so it can no longer be used to stream.
    */
  def deleteStreamKey(): Request[js.Object, AWSError] = js.native
  def deleteStreamKey(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the stream key for the specified ARN, so it can no longer be used to stream.
    */
  def deleteStreamKey(params: DeleteStreamKeyRequest): Request[js.Object, AWSError] = js.native
  def deleteStreamKey(
    params: DeleteStreamKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Gets the channel configuration for the specified channel ARN. See also BatchGetChannel.
    */
  def getChannel(): Request[GetChannelResponse, AWSError] = js.native
  def getChannel(callback: js.Function2[/* err */ AWSError, /* data */ GetChannelResponse, Unit]): Request[GetChannelResponse, AWSError] = js.native
  /**
    * Gets the channel configuration for the specified channel ARN. See also BatchGetChannel.
    */
  def getChannel(params: GetChannelRequest): Request[GetChannelResponse, AWSError] = js.native
  def getChannel(
    params: GetChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetChannelResponse, Unit]
  ): Request[GetChannelResponse, AWSError] = js.native
  
  /**
    * Gets a specified playback authorization key pair and returns the arn and fingerprint. The privateKey held by the caller can be used to generate viewer authorization tokens, to grant viewers access to authorized channels.
    */
  def getPlaybackKeyPair(): Request[GetPlaybackKeyPairResponse, AWSError] = js.native
  def getPlaybackKeyPair(callback: js.Function2[/* err */ AWSError, /* data */ GetPlaybackKeyPairResponse, Unit]): Request[GetPlaybackKeyPairResponse, AWSError] = js.native
  /**
    * Gets a specified playback authorization key pair and returns the arn and fingerprint. The privateKey held by the caller can be used to generate viewer authorization tokens, to grant viewers access to authorized channels.
    */
  def getPlaybackKeyPair(params: GetPlaybackKeyPairRequest): Request[GetPlaybackKeyPairResponse, AWSError] = js.native
  def getPlaybackKeyPair(
    params: GetPlaybackKeyPairRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPlaybackKeyPairResponse, Unit]
  ): Request[GetPlaybackKeyPairResponse, AWSError] = js.native
  
  /**
    * Gets information about the active (live) stream on a specified channel.
    */
  def getStream(): Request[GetStreamResponse, AWSError] = js.native
  def getStream(callback: js.Function2[/* err */ AWSError, /* data */ GetStreamResponse, Unit]): Request[GetStreamResponse, AWSError] = js.native
  /**
    * Gets information about the active (live) stream on a specified channel.
    */
  def getStream(params: GetStreamRequest): Request[GetStreamResponse, AWSError] = js.native
  def getStream(
    params: GetStreamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStreamResponse, Unit]
  ): Request[GetStreamResponse, AWSError] = js.native
  
  /**
    * Gets stream-key information for a specified ARN.
    */
  def getStreamKey(): Request[GetStreamKeyResponse, AWSError] = js.native
  def getStreamKey(callback: js.Function2[/* err */ AWSError, /* data */ GetStreamKeyResponse, Unit]): Request[GetStreamKeyResponse, AWSError] = js.native
  /**
    * Gets stream-key information for a specified ARN.
    */
  def getStreamKey(params: GetStreamKeyRequest): Request[GetStreamKeyResponse, AWSError] = js.native
  def getStreamKey(
    params: GetStreamKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStreamKeyResponse, Unit]
  ): Request[GetStreamKeyResponse, AWSError] = js.native
  
  /**
    * Imports the public portion of a new key pair and returns its arn and fingerprint. The privateKey can then be used to generate viewer authorization tokens, to grant viewers access to authorized channels.
    */
  def importPlaybackKeyPair(): Request[ImportPlaybackKeyPairResponse, AWSError] = js.native
  def importPlaybackKeyPair(callback: js.Function2[/* err */ AWSError, /* data */ ImportPlaybackKeyPairResponse, Unit]): Request[ImportPlaybackKeyPairResponse, AWSError] = js.native
  /**
    * Imports the public portion of a new key pair and returns its arn and fingerprint. The privateKey can then be used to generate viewer authorization tokens, to grant viewers access to authorized channels.
    */
  def importPlaybackKeyPair(params: ImportPlaybackKeyPairRequest): Request[ImportPlaybackKeyPairResponse, AWSError] = js.native
  def importPlaybackKeyPair(
    params: ImportPlaybackKeyPairRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportPlaybackKeyPairResponse, Unit]
  ): Request[ImportPlaybackKeyPairResponse, AWSError] = js.native
  
  /**
    * Gets summary information about all channels in your account, in the AWS region where the API request is processed. This list can be filtered to match a specified string.
    */
  def listChannels(): Request[ListChannelsResponse, AWSError] = js.native
  def listChannels(callback: js.Function2[/* err */ AWSError, /* data */ ListChannelsResponse, Unit]): Request[ListChannelsResponse, AWSError] = js.native
  /**
    * Gets summary information about all channels in your account, in the AWS region where the API request is processed. This list can be filtered to match a specified string.
    */
  def listChannels(params: ListChannelsRequest): Request[ListChannelsResponse, AWSError] = js.native
  def listChannels(
    params: ListChannelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListChannelsResponse, Unit]
  ): Request[ListChannelsResponse, AWSError] = js.native
  
  /**
    * Gets summary information about playback key pairs.
    */
  def listPlaybackKeyPairs(): Request[ListPlaybackKeyPairsResponse, AWSError] = js.native
  def listPlaybackKeyPairs(callback: js.Function2[/* err */ AWSError, /* data */ ListPlaybackKeyPairsResponse, Unit]): Request[ListPlaybackKeyPairsResponse, AWSError] = js.native
  /**
    * Gets summary information about playback key pairs.
    */
  def listPlaybackKeyPairs(params: ListPlaybackKeyPairsRequest): Request[ListPlaybackKeyPairsResponse, AWSError] = js.native
  def listPlaybackKeyPairs(
    params: ListPlaybackKeyPairsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPlaybackKeyPairsResponse, Unit]
  ): Request[ListPlaybackKeyPairsResponse, AWSError] = js.native
  
  /**
    * Gets summary information about stream keys for the specified channel.
    */
  def listStreamKeys(): Request[ListStreamKeysResponse, AWSError] = js.native
  def listStreamKeys(callback: js.Function2[/* err */ AWSError, /* data */ ListStreamKeysResponse, Unit]): Request[ListStreamKeysResponse, AWSError] = js.native
  /**
    * Gets summary information about stream keys for the specified channel.
    */
  def listStreamKeys(params: ListStreamKeysRequest): Request[ListStreamKeysResponse, AWSError] = js.native
  def listStreamKeys(
    params: ListStreamKeysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStreamKeysResponse, Unit]
  ): Request[ListStreamKeysResponse, AWSError] = js.native
  
  /**
    * Gets summary information about live streams in your account, in the AWS region where the API request is processed.
    */
  def listStreams(): Request[ListStreamsResponse, AWSError] = js.native
  def listStreams(callback: js.Function2[/* err */ AWSError, /* data */ ListStreamsResponse, Unit]): Request[ListStreamsResponse, AWSError] = js.native
  /**
    * Gets summary information about live streams in your account, in the AWS region where the API request is processed.
    */
  def listStreams(params: ListStreamsRequest): Request[ListStreamsResponse, AWSError] = js.native
  def listStreams(
    params: ListStreamsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStreamsResponse, Unit]
  ): Request[ListStreamsResponse, AWSError] = js.native
  
  /**
    * Gets information about AWS tags for the specified ARN.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Gets information about AWS tags for the specified ARN.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Inserts metadata into an RTMPS stream for the specified channel. A maximum of 5 requests per second per channel is allowed, each with a maximum 1KB payload.
    */
  def putMetadata(): Request[js.Object, AWSError] = js.native
  def putMetadata(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Inserts metadata into an RTMPS stream for the specified channel. A maximum of 5 requests per second per channel is allowed, each with a maximum 1KB payload.
    */
  def putMetadata(params: PutMetadataRequest): Request[js.Object, AWSError] = js.native
  def putMetadata(params: PutMetadataRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Disconnects the incoming RTMPS stream for the specified channel. Can be used in conjunction with DeleteStreamKey to prevent further streaming to a channel.  Many streaming client-software libraries automatically reconnect a dropped RTMPS session, so to stop the stream permanently, you may want to first revoke the streamKey attached to the channel. 
    */
  def stopStream(): Request[StopStreamResponse, AWSError] = js.native
  def stopStream(callback: js.Function2[/* err */ AWSError, /* data */ StopStreamResponse, Unit]): Request[StopStreamResponse, AWSError] = js.native
  /**
    * Disconnects the incoming RTMPS stream for the specified channel. Can be used in conjunction with DeleteStreamKey to prevent further streaming to a channel.  Many streaming client-software libraries automatically reconnect a dropped RTMPS session, so to stop the stream permanently, you may want to first revoke the streamKey attached to the channel. 
    */
  def stopStream(params: StopStreamRequest): Request[StopStreamResponse, AWSError] = js.native
  def stopStream(
    params: StopStreamRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopStreamResponse, Unit]
  ): Request[StopStreamResponse, AWSError] = js.native
  
  /**
    * Adds or updates tags for the AWS resource with the specified ARN.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds or updates tags for the AWS resource with the specified ARN.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes tags from the resource with the specified ARN.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes tags from the resource with the specified ARN.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates a channel's configuration. This does not affect an ongoing stream of this channel. You must stop and restart the stream for the changes to take effect.
    */
  def updateChannel(): Request[UpdateChannelResponse, AWSError] = js.native
  def updateChannel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateChannelResponse, Unit]): Request[UpdateChannelResponse, AWSError] = js.native
  /**
    * Updates a channel's configuration. This does not affect an ongoing stream of this channel. You must stop and restart the stream for the changes to take effect.
    */
  def updateChannel(params: UpdateChannelRequest): Request[UpdateChannelResponse, AWSError] = js.native
  def updateChannel(
    params: UpdateChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateChannelResponse, Unit]
  ): Request[UpdateChannelResponse, AWSError] = js.native
}
