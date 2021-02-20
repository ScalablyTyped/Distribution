package typings.awsSdk

import typings.awsSdk.awsSdkStrings.TURN
import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kinesisvideosignalingchannelsMod {
  
  @JSImport("aws-sdk/clients/kinesisvideosignalingchannels", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ^ () extends KinesisVideoSignalingChannels {
    def this(options: ClientConfiguration) = this()
  }
  
  type Answer = String
  
  @js.native
  trait Blob extends StObject
  
  @js.native
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.kinesisvideosignalingchannelsMod.apiVersion] = js.native
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
  
  type ClientId = String
  
  @js.native
  trait GetIceServerConfigRequest extends StObject {
    
    /**
      * The ARN of the signaling channel to be used for the peer-to-peer connection between configured peers. 
      */
    var ChannelARN: ResourceARN = js.native
    
    /**
      * Unique identifier for the viewer. Must be unique within the signaling channel.
      */
    var ClientId: js.UndefOr[typings.awsSdk.kinesisvideosignalingchannelsMod.ClientId] = js.native
    
    /**
      * Specifies the desired service. Currently, TURN is the only valid value.
      */
    var Service: js.UndefOr[typings.awsSdk.kinesisvideosignalingchannelsMod.Service] = js.native
    
    /**
      * An optional user ID to be associated with the credentials.
      */
    var Username: js.UndefOr[typings.awsSdk.kinesisvideosignalingchannelsMod.Username] = js.native
  }
  object GetIceServerConfigRequest {
    
    @scala.inline
    def apply(ChannelARN: ResourceARN): GetIceServerConfigRequest = {
      val __obj = js.Dynamic.literal(ChannelARN = ChannelARN.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetIceServerConfigRequest]
    }
    
    @scala.inline
    implicit class GetIceServerConfigRequestMutableBuilder[Self <: GetIceServerConfigRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannelARN(value: ResourceARN): Self = StObject.set(x, "ChannelARN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientId(value: ClientId): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdUndefined: Self = StObject.set(x, "ClientId", js.undefined)
      
      @scala.inline
      def setService(value: Service): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceUndefined: Self = StObject.set(x, "Service", js.undefined)
      
      @scala.inline
      def setUsername(value: Username): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
    }
  }
  
  @js.native
  trait GetIceServerConfigResponse extends StObject {
    
    /**
      * The list of ICE server information objects.
      */
    var IceServerList: js.UndefOr[typings.awsSdk.kinesisvideosignalingchannelsMod.IceServerList] = js.native
  }
  object GetIceServerConfigResponse {
    
    @scala.inline
    def apply(): GetIceServerConfigResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetIceServerConfigResponse]
    }
    
    @scala.inline
    implicit class GetIceServerConfigResponseMutableBuilder[Self <: GetIceServerConfigResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIceServerList(value: IceServerList): Self = StObject.set(x, "IceServerList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIceServerListUndefined: Self = StObject.set(x, "IceServerList", js.undefined)
      
      @scala.inline
      def setIceServerListVarargs(value: IceServer*): Self = StObject.set(x, "IceServerList", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IceServer extends StObject {
    
    /**
      * A password to login to the ICE server.
      */
    var Password: js.UndefOr[typings.awsSdk.kinesisvideosignalingchannelsMod.Password] = js.native
    
    /**
      * The period of time, in seconds, during which the username and password are valid.
      */
    var Ttl: js.UndefOr[typings.awsSdk.kinesisvideosignalingchannelsMod.Ttl] = js.native
    
    /**
      * An array of URIs, in the form specified in the I-D.petithuguenin-behave-turn-uris spec. These URIs provide the different addresses and/or protocols that can be used to reach the TURN server.
      */
    var Uris: js.UndefOr[typings.awsSdk.kinesisvideosignalingchannelsMod.Uris] = js.native
    
    /**
      * A username to login to the ICE server.
      */
    var Username: js.UndefOr[typings.awsSdk.kinesisvideosignalingchannelsMod.Username] = js.native
  }
  object IceServer {
    
    @scala.inline
    def apply(): IceServer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IceServer]
    }
    
    @scala.inline
    implicit class IceServerMutableBuilder[Self <: IceServer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassword(value: Password): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
      
      @scala.inline
      def setTtl(value: Ttl): Self = StObject.set(x, "Ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "Ttl", js.undefined)
      
      @scala.inline
      def setUris(value: Uris): Self = StObject.set(x, "Uris", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrisUndefined: Self = StObject.set(x, "Uris", js.undefined)
      
      @scala.inline
      def setUrisVarargs(value: Uri*): Self = StObject.set(x, "Uris", js.Array(value :_*))
      
      @scala.inline
      def setUsername(value: Username): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
    }
  }
  
  type IceServerList = js.Array[IceServer]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped 'TURN' | string */ @js.native
  trait KinesisVideoSignalingChannels extends StObject {
    
    var config: ConfigBase with ClientConfiguration = js.native
    
    /**
      * Gets the Interactive Connectivity Establishment (ICE) server configuration information, including URIs, username, and password which can be used to configure the WebRTC connection. The ICE component uses this configuration information to setup the WebRTC connection, including authenticating with the Traversal Using Relays around NAT (TURN) relay server.  TURN is a protocol that is used to improve the connectivity of peer-to-peer applications. By providing a cloud-based relay service, TURN ensures that a connection can be established even when one or more peers are incapable of a direct peer-to-peer connection. For more information, see A REST API For Access To TURN Services.  You can invoke this API to establish a fallback mechanism in case either of the peers is unable to establish a direct peer-to-peer connection over a signaling channel. You must specify either a signaling channel ARN or the client ID in order to invoke this API.
      */
    def getIceServerConfig(): Request[GetIceServerConfigResponse, AWSError] = js.native
    def getIceServerConfig(callback: js.Function2[/* err */ AWSError, /* data */ GetIceServerConfigResponse, Unit]): Request[GetIceServerConfigResponse, AWSError] = js.native
    /**
      * Gets the Interactive Connectivity Establishment (ICE) server configuration information, including URIs, username, and password which can be used to configure the WebRTC connection. The ICE component uses this configuration information to setup the WebRTC connection, including authenticating with the Traversal Using Relays around NAT (TURN) relay server.  TURN is a protocol that is used to improve the connectivity of peer-to-peer applications. By providing a cloud-based relay service, TURN ensures that a connection can be established even when one or more peers are incapable of a direct peer-to-peer connection. For more information, see A REST API For Access To TURN Services.  You can invoke this API to establish a fallback mechanism in case either of the peers is unable to establish a direct peer-to-peer connection over a signaling channel. You must specify either a signaling channel ARN or the client ID in order to invoke this API.
      */
    def getIceServerConfig(params: GetIceServerConfigRequest): Request[GetIceServerConfigResponse, AWSError] = js.native
    def getIceServerConfig(
      params: GetIceServerConfigRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ GetIceServerConfigResponse, Unit]
    ): Request[GetIceServerConfigResponse, AWSError] = js.native
    
    /**
      * This API allows you to connect WebRTC-enabled devices with Alexa display devices. When invoked, it sends the Alexa Session Description Protocol (SDP) offer to the master peer. The offer is delivered as soon as the master is connected to the specified signaling channel. This API returns the SDP answer from the connected master. If the master is not connected to the signaling channel, redelivery requests are made until the message expires.
      */
    def sendAlexaOfferToMaster(): Request[SendAlexaOfferToMasterResponse, AWSError] = js.native
    def sendAlexaOfferToMaster(callback: js.Function2[/* err */ AWSError, /* data */ SendAlexaOfferToMasterResponse, Unit]): Request[SendAlexaOfferToMasterResponse, AWSError] = js.native
    /**
      * This API allows you to connect WebRTC-enabled devices with Alexa display devices. When invoked, it sends the Alexa Session Description Protocol (SDP) offer to the master peer. The offer is delivered as soon as the master is connected to the specified signaling channel. This API returns the SDP answer from the connected master. If the master is not connected to the signaling channel, redelivery requests are made until the message expires.
      */
    def sendAlexaOfferToMaster(params: SendAlexaOfferToMasterRequest): Request[SendAlexaOfferToMasterResponse, AWSError] = js.native
    def sendAlexaOfferToMaster(
      params: SendAlexaOfferToMasterRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ SendAlexaOfferToMasterResponse, Unit]
    ): Request[SendAlexaOfferToMasterResponse, AWSError] = js.native
  }
  
  type MessagePayload = String
  
  type Password = String
  
  type ResourceARN = String
  
  @js.native
  trait SendAlexaOfferToMasterRequest extends StObject {
    
    /**
      * The ARN of the signaling channel by which Alexa and the master peer communicate.
      */
    var ChannelARN: ResourceARN = js.native
    
    /**
      * The base64-encoded SDP offer content.
      */
    var MessagePayload: typings.awsSdk.kinesisvideosignalingchannelsMod.MessagePayload = js.native
    
    /**
      * The unique identifier for the sender client.
      */
    var SenderClientId: ClientId = js.native
  }
  object SendAlexaOfferToMasterRequest {
    
    @scala.inline
    def apply(ChannelARN: ResourceARN, MessagePayload: MessagePayload, SenderClientId: ClientId): SendAlexaOfferToMasterRequest = {
      val __obj = js.Dynamic.literal(ChannelARN = ChannelARN.asInstanceOf[js.Any], MessagePayload = MessagePayload.asInstanceOf[js.Any], SenderClientId = SenderClientId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendAlexaOfferToMasterRequest]
    }
    
    @scala.inline
    implicit class SendAlexaOfferToMasterRequestMutableBuilder[Self <: SendAlexaOfferToMasterRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannelARN(value: ResourceARN): Self = StObject.set(x, "ChannelARN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagePayload(value: MessagePayload): Self = StObject.set(x, "MessagePayload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSenderClientId(value: ClientId): Self = StObject.set(x, "SenderClientId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SendAlexaOfferToMasterResponse extends StObject {
    
    /**
      * The base64-encoded SDP answer content.
      */
    var Answer: js.UndefOr[typings.awsSdk.kinesisvideosignalingchannelsMod.Answer] = js.native
  }
  object SendAlexaOfferToMasterResponse {
    
    @scala.inline
    def apply(): SendAlexaOfferToMasterResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SendAlexaOfferToMasterResponse]
    }
    
    @scala.inline
    implicit class SendAlexaOfferToMasterResponseMutableBuilder[Self <: SendAlexaOfferToMasterResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnswer(value: Answer): Self = StObject.set(x, "Answer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnswerUndefined: Self = StObject.set(x, "Answer", js.undefined)
    }
  }
  
  type Service = TURN | String
  
  type Ttl = Double
  
  type Uri = String
  
  type Uris = js.Array[Uri]
  
  type Username = String
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-12-04`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
