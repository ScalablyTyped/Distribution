package typings.awsSdk

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import typings.awsSdk.serviceMod.ServiceConfigurationOptions
import typings.node.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iotdataMod {
  
  @JSImport("aws-sdk/clients/iotdata", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ^ () extends IotData {
    def this(options: ClientConfiguration) = this()
  }
  
  @js.native
  trait Blob extends StObject
  
  @js.native
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.iotdataMod.apiVersion] = js.native
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
  
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  
  @js.native
  trait DeleteThingShadowRequest extends StObject {
    
    /**
      * The name of the shadow.
      */
    var shadowName: js.UndefOr[ShadowName] = js.native
    
    /**
      * The name of the thing.
      */
    var thingName: ThingName = js.native
  }
  object DeleteThingShadowRequest {
    
    @scala.inline
    def apply(thingName: ThingName): DeleteThingShadowRequest = {
      val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteThingShadowRequest]
    }
    
    @scala.inline
    implicit class DeleteThingShadowRequestMutableBuilder[Self <: DeleteThingShadowRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShadowName(value: ShadowName): Self = StObject.set(x, "shadowName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowNameUndefined: Self = StObject.set(x, "shadowName", js.undefined)
      
      @scala.inline
      def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeleteThingShadowResponse extends StObject {
    
    /**
      * The state information, in JSON format.
      */
    var payload: JsonDocument = js.native
  }
  object DeleteThingShadowResponse {
    
    @scala.inline
    def apply(payload: JsonDocument): DeleteThingShadowResponse = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteThingShadowResponse]
    }
    
    @scala.inline
    implicit class DeleteThingShadowResponseMutableBuilder[Self <: DeleteThingShadowResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: JsonDocument): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetThingShadowRequest extends StObject {
    
    /**
      * The name of the shadow.
      */
    var shadowName: js.UndefOr[ShadowName] = js.native
    
    /**
      * The name of the thing.
      */
    var thingName: ThingName = js.native
  }
  object GetThingShadowRequest {
    
    @scala.inline
    def apply(thingName: ThingName): GetThingShadowRequest = {
      val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetThingShadowRequest]
    }
    
    @scala.inline
    implicit class GetThingShadowRequestMutableBuilder[Self <: GetThingShadowRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShadowName(value: ShadowName): Self = StObject.set(x, "shadowName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowNameUndefined: Self = StObject.set(x, "shadowName", js.undefined)
      
      @scala.inline
      def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetThingShadowResponse extends StObject {
    
    /**
      * The state information, in JSON format.
      */
    var payload: js.UndefOr[JsonDocument] = js.native
  }
  object GetThingShadowResponse {
    
    @scala.inline
    def apply(): GetThingShadowResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetThingShadowResponse]
    }
    
    @scala.inline
    implicit class GetThingShadowResponseMutableBuilder[Self <: GetThingShadowResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: JsonDocument): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    }
  }
  
  @js.native
  trait IotData extends Service {
    
    @JSName("config")
    var config_IotData: ConfigBase with ClientConfiguration = js.native
    
    /**
      * Deletes the shadow for the specified thing. For more information, see DeleteThingShadow in the AWS IoT Developer Guide.
      */
    def deleteThingShadow(): Request[DeleteThingShadowResponse, AWSError] = js.native
    def deleteThingShadow(callback: js.Function2[/* err */ AWSError, /* data */ DeleteThingShadowResponse, Unit]): Request[DeleteThingShadowResponse, AWSError] = js.native
    /**
      * Deletes the shadow for the specified thing. For more information, see DeleteThingShadow in the AWS IoT Developer Guide.
      */
    def deleteThingShadow(params: DeleteThingShadowRequest): Request[DeleteThingShadowResponse, AWSError] = js.native
    def deleteThingShadow(
      params: DeleteThingShadowRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ DeleteThingShadowResponse, Unit]
    ): Request[DeleteThingShadowResponse, AWSError] = js.native
    
    /**
      * Gets the shadow for the specified thing. For more information, see GetThingShadow in the AWS IoT Developer Guide.
      */
    def getThingShadow(): Request[GetThingShadowResponse, AWSError] = js.native
    def getThingShadow(callback: js.Function2[/* err */ AWSError, /* data */ GetThingShadowResponse, Unit]): Request[GetThingShadowResponse, AWSError] = js.native
    /**
      * Gets the shadow for the specified thing. For more information, see GetThingShadow in the AWS IoT Developer Guide.
      */
    def getThingShadow(params: GetThingShadowRequest): Request[GetThingShadowResponse, AWSError] = js.native
    def getThingShadow(
      params: GetThingShadowRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ GetThingShadowResponse, Unit]
    ): Request[GetThingShadowResponse, AWSError] = js.native
    
    /**
      * Lists the shadows for the specified thing.
      */
    def listNamedShadowsForThing(): Request[ListNamedShadowsForThingResponse, AWSError] = js.native
    def listNamedShadowsForThing(callback: js.Function2[/* err */ AWSError, /* data */ ListNamedShadowsForThingResponse, Unit]): Request[ListNamedShadowsForThingResponse, AWSError] = js.native
    /**
      * Lists the shadows for the specified thing.
      */
    def listNamedShadowsForThing(params: ListNamedShadowsForThingRequest): Request[ListNamedShadowsForThingResponse, AWSError] = js.native
    def listNamedShadowsForThing(
      params: ListNamedShadowsForThingRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ ListNamedShadowsForThingResponse, Unit]
    ): Request[ListNamedShadowsForThingResponse, AWSError] = js.native
    
    /**
      * Publishes state information. For more information, see HTTP Protocol in the AWS IoT Developer Guide.
      */
    def publish(): Request[js.Object, AWSError] = js.native
    def publish(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
    /**
      * Publishes state information. For more information, see HTTP Protocol in the AWS IoT Developer Guide.
      */
    def publish(params: PublishRequest): Request[js.Object, AWSError] = js.native
    def publish(params: PublishRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
    
    /**
      * Updates the shadow for the specified thing. For more information, see UpdateThingShadow in the AWS IoT Developer Guide.
      */
    def updateThingShadow(): Request[UpdateThingShadowResponse, AWSError] = js.native
    def updateThingShadow(callback: js.Function2[/* err */ AWSError, /* data */ UpdateThingShadowResponse, Unit]): Request[UpdateThingShadowResponse, AWSError] = js.native
    /**
      * Updates the shadow for the specified thing. For more information, see UpdateThingShadow in the AWS IoT Developer Guide.
      */
    def updateThingShadow(params: UpdateThingShadowRequest): Request[UpdateThingShadowResponse, AWSError] = js.native
    def updateThingShadow(
      params: UpdateThingShadowRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ UpdateThingShadowResponse, Unit]
    ): Request[UpdateThingShadowResponse, AWSError] = js.native
  }
  
  type JsonDocument = Buffer | Uint8Array | Blob | String
  
  @js.native
  trait ListNamedShadowsForThingRequest extends StObject {
    
    /**
      * The token to retrieve the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.native
    
    /**
      * The result page size.
      */
    var pageSize: js.UndefOr[PageSize] = js.native
    
    /**
      * The name of the thing.
      */
    var thingName: ThingName = js.native
  }
  object ListNamedShadowsForThingRequest {
    
    @scala.inline
    def apply(thingName: ThingName): ListNamedShadowsForThingRequest = {
      val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListNamedShadowsForThingRequest]
    }
    
    @scala.inline
    implicit class ListNamedShadowsForThingRequestMutableBuilder[Self <: ListNamedShadowsForThingRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
      
      @scala.inline
      def setPageSize(value: PageSize): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ListNamedShadowsForThingResponse extends StObject {
    
    /**
      * The token for the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.native
    
    /**
      * The list of shadows for the specified thing.
      */
    var results: js.UndefOr[NamedShadowList] = js.native
    
    /**
      * The Epoch date and time the response was generated by AWS IoT.
      */
    var timestamp: js.UndefOr[Timestamp] = js.native
  }
  object ListNamedShadowsForThingResponse {
    
    @scala.inline
    def apply(): ListNamedShadowsForThingResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListNamedShadowsForThingResponse]
    }
    
    @scala.inline
    implicit class ListNamedShadowsForThingResponseMutableBuilder[Self <: ListNamedShadowsForThingResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
      
      @scala.inline
      def setResults(value: NamedShadowList): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      @scala.inline
      def setResultsVarargs(value: ShadowName*): Self = StObject.set(x, "results", js.Array(value :_*))
      
      @scala.inline
      def setTimestamp(value: Timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
  
  type NamedShadowList = js.Array[ShadowName]
  
  type NextToken = String
  
  type PageSize = Double
  
  type Payload = Buffer | Uint8Array | Blob | String
  
  @js.native
  trait PublishRequest extends StObject {
    
    /**
      * The state information, in JSON format.
      */
    var payload: js.UndefOr[Payload] = js.native
    
    /**
      * The Quality of Service (QoS) level.
      */
    var qos: js.UndefOr[Qos] = js.native
    
    /**
      * The name of the MQTT topic.
      */
    var topic: Topic = js.native
  }
  object PublishRequest {
    
    @scala.inline
    def apply(topic: Topic): PublishRequest = {
      val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublishRequest]
    }
    
    @scala.inline
    implicit class PublishRequestMutableBuilder[Self <: PublishRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      @scala.inline
      def setQos(value: Qos): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQosUndefined: Self = StObject.set(x, "qos", js.undefined)
      
      @scala.inline
      def setTopic(value: Topic): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  type Qos = Double
  
  type ShadowName = String
  
  type ThingName = String
  
  type Timestamp = Double
  
  type Topic = String
  
  @js.native
  trait UpdateThingShadowRequest extends StObject {
    
    /**
      * The state information, in JSON format.
      */
    var payload: JsonDocument = js.native
    
    /**
      * The name of the shadow.
      */
    var shadowName: js.UndefOr[ShadowName] = js.native
    
    /**
      * The name of the thing.
      */
    var thingName: ThingName = js.native
  }
  object UpdateThingShadowRequest {
    
    @scala.inline
    def apply(payload: JsonDocument, thingName: ThingName): UpdateThingShadowRequest = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateThingShadowRequest]
    }
    
    @scala.inline
    implicit class UpdateThingShadowRequestMutableBuilder[Self <: UpdateThingShadowRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: JsonDocument): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowName(value: ShadowName): Self = StObject.set(x, "shadowName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowNameUndefined: Self = StObject.set(x, "shadowName", js.undefined)
      
      @scala.inline
      def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UpdateThingShadowResponse extends StObject {
    
    /**
      * The state information, in JSON format.
      */
    var payload: js.UndefOr[JsonDocument] = js.native
  }
  object UpdateThingShadowResponse {
    
    @scala.inline
    def apply(): UpdateThingShadowResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateThingShadowResponse]
    }
    
    @scala.inline
    implicit class UpdateThingShadowResponseMutableBuilder[Self <: UpdateThingShadowResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: JsonDocument): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    }
  }
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2015-05-28`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
