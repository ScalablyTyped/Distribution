package typings.awsSdk

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import typings.awsSdk.serviceMod.ServiceConfigurationOptions
import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.std.Date
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kinesisvideomediaMod {
  
  @JSImport("aws-sdk/clients/kinesisvideomedia", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ^ () extends KinesisVideoMedia {
    def this(options: ClientConfiguration) = this()
  }
  
  trait Blob extends StObject
  
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.kinesisvideomediaMod.apiVersion] = js.undefined
  }
  object ClientApiVersions {
    
    @scala.inline
    def apply(): ClientApiVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientApiVersions]
    }
    
    @scala.inline
    implicit class ClientApiVersionsMutableBuilder[Self <: ClientApiVersions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: apiVersion): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    }
  }
  
  @js.native
  trait ClientConfiguration
    extends ServiceConfigurationOptions
       with ClientApiVersions
  
  type ContentType = String
  
  type ContinuationToken = String
  
  type FragmentNumberString = String
  
  trait GetMediaInput extends StObject {
    
    /**
      * Identifies the starting chunk to get from the specified stream. 
      */
    var StartSelector: typings.awsSdk.kinesisvideomediaMod.StartSelector
    
    /**
      * The ARN of the stream from where you want to get the media content. If you don't specify the streamARN, you must specify the streamName.
      */
    var StreamARN: js.UndefOr[ResourceARN] = js.undefined
    
    /**
      * The Kinesis video stream name from where you want to get the media content. If you don't specify the streamName, you must specify the streamARN.
      */
    var StreamName: js.UndefOr[typings.awsSdk.kinesisvideomediaMod.StreamName] = js.undefined
  }
  object GetMediaInput {
    
    @scala.inline
    def apply(StartSelector: StartSelector): GetMediaInput = {
      val __obj = js.Dynamic.literal(StartSelector = StartSelector.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetMediaInput]
    }
    
    @scala.inline
    implicit class GetMediaInputMutableBuilder[Self <: GetMediaInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStartSelector(value: StartSelector): Self = StObject.set(x, "StartSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
      
      @scala.inline
      def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
    }
  }
  
  trait GetMediaOutput extends StObject {
    
    /**
      * The content type of the requested media.
      */
    var ContentType: js.UndefOr[typings.awsSdk.kinesisvideomediaMod.ContentType] = js.undefined
    
    /**
      *  The payload Kinesis Video Streams returns is a sequence of chunks from the specified stream. For information about the chunks, see . The chunks that Kinesis Video Streams returns in the GetMedia call also include the following additional Matroska (MKV) tags:    AWS_KINESISVIDEO_CONTINUATION_TOKEN (UTF-8 string) - In the event your GetMedia call terminates, you can use this continuation token in your next request to get the next chunk where the last request terminated.   AWS_KINESISVIDEO_MILLIS_BEHIND_NOW (UTF-8 string) - Client applications can use this tag value to determine how far behind the chunk returned in the response is from the latest chunk on the stream.    AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in the chunk.   AWS_KINESISVIDEO_SERVER_TIMESTAMP - Server timestamp of the fragment.   AWS_KINESISVIDEO_PRODUCER_TIMESTAMP - Producer timestamp of the fragment.   The following tags will be present if an error occurs:   AWS_KINESISVIDEO_ERROR_CODE - String description of an error that caused GetMedia to stop.   AWS_KINESISVIDEO_ERROR_ID: Integer code of the error.   The error codes are as follows:   3002 - Error writing to the stream   4000 - Requested fragment is not found   4500 - Access denied for the stream's KMS key   4501 - Stream's KMS key is disabled   4502 - Validation error on the stream's KMS key   4503 - KMS key specified in the stream is unavailable   4504 - Invalid usage of the KMS key specified in the stream   4505 - Invalid state of the KMS key specified in the stream   4506 - Unable to find the KMS key specified in the stream   5000 - Internal error  
      */
    var Payload: js.UndefOr[typings.awsSdk.kinesisvideomediaMod.Payload] = js.undefined
  }
  object GetMediaOutput {
    
    @scala.inline
    def apply(): GetMediaOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetMediaOutput]
    }
    
    @scala.inline
    implicit class GetMediaOutputMutableBuilder[Self <: GetMediaOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
      
      @scala.inline
      def setPayload(value: Payload): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "Payload", js.undefined)
    }
  }
  
  @js.native
  trait KinesisVideoMedia extends Service {
    
    @JSName("config")
    var config_KinesisVideoMedia: ConfigBase & ClientConfiguration = js.native
    
    /**
      *  Use this API to retrieve media content from a Kinesis video stream. In the request, you identify the stream name or stream Amazon Resource Name (ARN), and the starting chunk. Kinesis Video Streams then returns a stream of chunks in order by fragment number.  You must first call the GetDataEndpoint API to get an endpoint. Then send the GetMedia requests to this endpoint using the --endpoint-url parameter.   When you put media data (fragments) on a stream, Kinesis Video Streams stores each incoming fragment and related metadata in what is called a "chunk." For more information, see PutMedia. The GetMedia API returns a stream of these chunks starting from the chunk that you specify in the request.  The following limits apply when using the GetMedia API:   A client can call GetMedia up to five times per second per stream.    Kinesis Video Streams sends media data at a rate of up to 25 megabytes per second (or 200 megabits per second) during a GetMedia session.     If an error is thrown after invoking a Kinesis Video Streams media API, in addition to the HTTP status code and the response body, it includes the following pieces of information:     x-amz-ErrorType HTTP header – contains a more specific error type in addition to what the HTTP status code provides.     x-amz-RequestId HTTP header – if you want to report an issue to AWS, the support team can better diagnose the problem if given the Request Id.   Both the HTTP status code and the ErrorType header can be utilized to make programmatic decisions about whether errors are retry-able and under what conditions, as well as provide information on what actions the client programmer might need to take in order to successfully try again. For more information, see the Errors section at the bottom of this topic, as well as Common Errors.  
      */
    def getMedia(): Request[GetMediaOutput, AWSError] = js.native
    def getMedia(callback: js.Function2[/* err */ AWSError, /* data */ GetMediaOutput, Unit]): Request[GetMediaOutput, AWSError] = js.native
    /**
      *  Use this API to retrieve media content from a Kinesis video stream. In the request, you identify the stream name or stream Amazon Resource Name (ARN), and the starting chunk. Kinesis Video Streams then returns a stream of chunks in order by fragment number.  You must first call the GetDataEndpoint API to get an endpoint. Then send the GetMedia requests to this endpoint using the --endpoint-url parameter.   When you put media data (fragments) on a stream, Kinesis Video Streams stores each incoming fragment and related metadata in what is called a "chunk." For more information, see PutMedia. The GetMedia API returns a stream of these chunks starting from the chunk that you specify in the request.  The following limits apply when using the GetMedia API:   A client can call GetMedia up to five times per second per stream.    Kinesis Video Streams sends media data at a rate of up to 25 megabytes per second (or 200 megabits per second) during a GetMedia session.     If an error is thrown after invoking a Kinesis Video Streams media API, in addition to the HTTP status code and the response body, it includes the following pieces of information:     x-amz-ErrorType HTTP header – contains a more specific error type in addition to what the HTTP status code provides.     x-amz-RequestId HTTP header – if you want to report an issue to AWS, the support team can better diagnose the problem if given the Request Id.   Both the HTTP status code and the ErrorType header can be utilized to make programmatic decisions about whether errors are retry-able and under what conditions, as well as provide information on what actions the client programmer might need to take in order to successfully try again. For more information, see the Errors section at the bottom of this topic, as well as Common Errors.  
      */
    def getMedia(params: GetMediaInput): Request[GetMediaOutput, AWSError] = js.native
    def getMedia(params: GetMediaInput, callback: js.Function2[/* err */ AWSError, /* data */ GetMediaOutput, Unit]): Request[GetMediaOutput, AWSError] = js.native
  }
  
  type Payload = Buffer | Uint8Array | Blob | String | Readable
  
  type ResourceARN = String
  
  trait StartSelector extends StObject {
    
    /**
      * Specifies the fragment number from where you want the GetMedia API to start returning the fragments. 
      */
    var AfterFragmentNumber: js.UndefOr[FragmentNumberString] = js.undefined
    
    /**
      * Continuation token that Kinesis Video Streams returned in the previous GetMedia response. The GetMedia API then starts with the chunk identified by the continuation token.
      */
    var ContinuationToken: js.UndefOr[typings.awsSdk.kinesisvideomediaMod.ContinuationToken] = js.undefined
    
    /**
      * Identifies the fragment on the Kinesis video stream where you want to start getting the data from.   NOW - Start with the latest chunk on the stream.   EARLIEST - Start with earliest available chunk on the stream.   FRAGMENT_NUMBER - Start with the chunk after a specific fragment. You must also specify the AfterFragmentNumber parameter.   PRODUCER_TIMESTAMP or SERVER_TIMESTAMP - Start with the chunk containing a fragment with the specified producer or server timestamp. You specify the timestamp by adding StartTimestamp.    CONTINUATION_TOKEN - Read using the specified continuation token.     If you choose the NOW, EARLIEST, or CONTINUATION_TOKEN as the startSelectorType, you don't provide any additional information in the startSelector. 
      */
    var StartSelectorType: typings.awsSdk.kinesisvideomediaMod.StartSelectorType
    
    /**
      * A timestamp value. This value is required if you choose the PRODUCER_TIMESTAMP or the SERVER_TIMESTAMP as the startSelectorType. The GetMedia API then starts with the chunk containing the fragment that has the specified timestamp.
      */
    var StartTimestamp: js.UndefOr[Timestamp] = js.undefined
  }
  object StartSelector {
    
    @scala.inline
    def apply(StartSelectorType: StartSelectorType): StartSelector = {
      val __obj = js.Dynamic.literal(StartSelectorType = StartSelectorType.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartSelector]
    }
    
    @scala.inline
    implicit class StartSelectorMutableBuilder[Self <: StartSelector] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterFragmentNumber(value: FragmentNumberString): Self = StObject.set(x, "AfterFragmentNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterFragmentNumberUndefined: Self = StObject.set(x, "AfterFragmentNumber", js.undefined)
      
      @scala.inline
      def setContinuationToken(value: ContinuationToken): Self = StObject.set(x, "ContinuationToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinuationTokenUndefined: Self = StObject.set(x, "ContinuationToken", js.undefined)
      
      @scala.inline
      def setStartSelectorType(value: StartSelectorType): Self = StObject.set(x, "StartSelectorType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimestamp(value: Timestamp): Self = StObject.set(x, "StartTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimestampUndefined: Self = StObject.set(x, "StartTimestamp", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FRAGMENT_NUMBER
    - typings.awsSdk.awsSdkStrings.SERVER_TIMESTAMP
    - typings.awsSdk.awsSdkStrings.PRODUCER_TIMESTAMP
    - typings.awsSdk.awsSdkStrings.NOW
    - typings.awsSdk.awsSdkStrings.EARLIEST
    - typings.awsSdk.awsSdkStrings.CONTINUATION_TOKEN
    - java.lang.String
  */
  type StartSelectorType = _StartSelectorType | String
  
  type StreamName = String
  
  type Timestamp = Date
  
  trait _StartSelectorType extends StObject
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-09-30`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
