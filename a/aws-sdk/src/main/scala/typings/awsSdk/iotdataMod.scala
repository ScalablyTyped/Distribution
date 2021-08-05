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
  
  trait Blob extends StObject
  
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.iotdataMod.apiVersion] = js.undefined
  }
  object ClientApiVersions {
    
    inline def apply(): ClientApiVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientApiVersions]
    }
    
    extension [Self <: ClientApiVersions](x: Self) {
      
      inline def setApiVersion(value: apiVersion): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    }
  }
  
  @js.native
  trait ClientConfiguration
    extends ServiceConfigurationOptions
       with ClientApiVersions
  
  trait DeleteThingShadowRequest extends StObject {
    
    /**
      * The name of the shadow.
      */
    var shadowName: js.UndefOr[ShadowName] = js.undefined
    
    /**
      * The name of the thing.
      */
    var thingName: ThingName
  }
  object DeleteThingShadowRequest {
    
    inline def apply(thingName: ThingName): DeleteThingShadowRequest = {
      val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteThingShadowRequest]
    }
    
    extension [Self <: DeleteThingShadowRequest](x: Self) {
      
      inline def setShadowName(value: ShadowName): Self = StObject.set(x, "shadowName", value.asInstanceOf[js.Any])
      
      inline def setShadowNameUndefined: Self = StObject.set(x, "shadowName", js.undefined)
      
      inline def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeleteThingShadowResponse extends StObject {
    
    /**
      * The state information, in JSON format.
      */
    var payload: JsonDocument
  }
  object DeleteThingShadowResponse {
    
    inline def apply(payload: JsonDocument): DeleteThingShadowResponse = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteThingShadowResponse]
    }
    
    extension [Self <: DeleteThingShadowResponse](x: Self) {
      
      inline def setPayload(value: JsonDocument): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetThingShadowRequest extends StObject {
    
    /**
      * The name of the shadow.
      */
    var shadowName: js.UndefOr[ShadowName] = js.undefined
    
    /**
      * The name of the thing.
      */
    var thingName: ThingName
  }
  object GetThingShadowRequest {
    
    inline def apply(thingName: ThingName): GetThingShadowRequest = {
      val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetThingShadowRequest]
    }
    
    extension [Self <: GetThingShadowRequest](x: Self) {
      
      inline def setShadowName(value: ShadowName): Self = StObject.set(x, "shadowName", value.asInstanceOf[js.Any])
      
      inline def setShadowNameUndefined: Self = StObject.set(x, "shadowName", js.undefined)
      
      inline def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetThingShadowResponse extends StObject {
    
    /**
      * The state information, in JSON format.
      */
    var payload: js.UndefOr[JsonDocument] = js.undefined
  }
  object GetThingShadowResponse {
    
    inline def apply(): GetThingShadowResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetThingShadowResponse]
    }
    
    extension [Self <: GetThingShadowResponse](x: Self) {
      
      inline def setPayload(value: JsonDocument): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    }
  }
  
  @js.native
  trait IotData extends Service {
    
    @JSName("config")
    var config_IotData: ConfigBase & ClientConfiguration = js.native
    
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
  
  trait ListNamedShadowsForThingRequest extends StObject {
    
    /**
      * The token to retrieve the next set of results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    
    /**
      * The result page size.
      */
    var pageSize: js.UndefOr[PageSize] = js.undefined
    
    /**
      * The name of the thing.
      */
    var thingName: ThingName
  }
  object ListNamedShadowsForThingRequest {
    
    inline def apply(thingName: ThingName): ListNamedShadowsForThingRequest = {
      val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListNamedShadowsForThingRequest]
    }
    
    extension [Self <: ListNamedShadowsForThingRequest](x: Self) {
      
      inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
      
      inline def setPageSize(value: PageSize): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListNamedShadowsForThingResponse extends StObject {
    
    /**
      * The token for the next set of results, or null if there are no additional results.
      */
    var nextToken: js.UndefOr[NextToken] = js.undefined
    
    /**
      * The list of shadows for the specified thing.
      */
    var results: js.UndefOr[NamedShadowList] = js.undefined
    
    /**
      * The Epoch date and time the response was generated by AWS IoT.
      */
    var timestamp: js.UndefOr[Timestamp] = js.undefined
  }
  object ListNamedShadowsForThingResponse {
    
    inline def apply(): ListNamedShadowsForThingResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListNamedShadowsForThingResponse]
    }
    
    extension [Self <: ListNamedShadowsForThingResponse](x: Self) {
      
      inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
      
      inline def setResults(value: NamedShadowList): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setResultsVarargs(value: ShadowName*): Self = StObject.set(x, "results", js.Array(value :_*))
      
      inline def setTimestamp(value: Timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
  
  type NamedShadowList = js.Array[ShadowName]
  
  type NextToken = String
  
  type PageSize = Double
  
  type Payload = Buffer | Uint8Array | Blob | String
  
  trait PublishRequest extends StObject {
    
    /**
      * The state information, in JSON format.
      */
    var payload: js.UndefOr[Payload] = js.undefined
    
    /**
      * The Quality of Service (QoS) level.
      */
    var qos: js.UndefOr[Qos] = js.undefined
    
    /**
      * The name of the MQTT topic.
      */
    var topic: Topic
  }
  object PublishRequest {
    
    inline def apply(topic: Topic): PublishRequest = {
      val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublishRequest]
    }
    
    extension [Self <: PublishRequest](x: Self) {
      
      inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setQos(value: Qos): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
      
      inline def setQosUndefined: Self = StObject.set(x, "qos", js.undefined)
      
      inline def setTopic(value: Topic): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  type Qos = Double
  
  type ShadowName = String
  
  type ThingName = String
  
  type Timestamp = Double
  
  type Topic = String
  
  trait UpdateThingShadowRequest extends StObject {
    
    /**
      * The state information, in JSON format.
      */
    var payload: JsonDocument
    
    /**
      * The name of the shadow.
      */
    var shadowName: js.UndefOr[ShadowName] = js.undefined
    
    /**
      * The name of the thing.
      */
    var thingName: ThingName
  }
  object UpdateThingShadowRequest {
    
    inline def apply(payload: JsonDocument, thingName: ThingName): UpdateThingShadowRequest = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateThingShadowRequest]
    }
    
    extension [Self <: UpdateThingShadowRequest](x: Self) {
      
      inline def setPayload(value: JsonDocument): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setShadowName(value: ShadowName): Self = StObject.set(x, "shadowName", value.asInstanceOf[js.Any])
      
      inline def setShadowNameUndefined: Self = StObject.set(x, "shadowName", js.undefined)
      
      inline def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateThingShadowResponse extends StObject {
    
    /**
      * The state information, in JSON format.
      */
    var payload: js.UndefOr[JsonDocument] = js.undefined
  }
  object UpdateThingShadowResponse {
    
    inline def apply(): UpdateThingShadowResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateThingShadowResponse]
    }
    
    extension [Self <: UpdateThingShadowResponse](x: Self) {
      
      inline def setPayload(value: JsonDocument): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
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
