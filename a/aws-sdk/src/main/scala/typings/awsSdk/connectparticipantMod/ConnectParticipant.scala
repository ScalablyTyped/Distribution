package typings.awsSdk.connectparticipantMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectParticipant extends Service {
  
  @JSName("config")
  var config_ConnectParticipant: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Creates the participant's connection. Note that ParticipantToken is used for invoking this API instead of ConnectionToken. The participant token is valid for the lifetime of the participant – until the they are part of a contact. The response URL for WEBSOCKET Type has a connect expiry timeout of 100s. Clients must manually connect to the returned websocket URL and subscribe to the desired topic.  For chat, you need to publish the following on the established websocket connection:  {"topic":"aws/subscribe","content":{"topics":["aws/chat"]}}  Upon websocket URL expiry, as specified in the response ConnectionExpiry parameter, clients need to call this API again to obtain a new websocket URL and perform the same steps as before.
    */
  def createParticipantConnection(): Request[CreateParticipantConnectionResponse, AWSError] = js.native
  def createParticipantConnection(callback: js.Function2[/* err */ AWSError, /* data */ CreateParticipantConnectionResponse, Unit]): Request[CreateParticipantConnectionResponse, AWSError] = js.native
  /**
    * Creates the participant's connection. Note that ParticipantToken is used for invoking this API instead of ConnectionToken. The participant token is valid for the lifetime of the participant – until the they are part of a contact. The response URL for WEBSOCKET Type has a connect expiry timeout of 100s. Clients must manually connect to the returned websocket URL and subscribe to the desired topic.  For chat, you need to publish the following on the established websocket connection:  {"topic":"aws/subscribe","content":{"topics":["aws/chat"]}}  Upon websocket URL expiry, as specified in the response ConnectionExpiry parameter, clients need to call this API again to obtain a new websocket URL and perform the same steps as before.
    */
  def createParticipantConnection(params: CreateParticipantConnectionRequest): Request[CreateParticipantConnectionResponse, AWSError] = js.native
  def createParticipantConnection(
    params: CreateParticipantConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateParticipantConnectionResponse, Unit]
  ): Request[CreateParticipantConnectionResponse, AWSError] = js.native
  
  /**
    * Disconnects a participant. Note that ConnectionToken is used for invoking this API instead of ParticipantToken.
    */
  def disconnectParticipant(): Request[DisconnectParticipantResponse, AWSError] = js.native
  def disconnectParticipant(callback: js.Function2[/* err */ AWSError, /* data */ DisconnectParticipantResponse, Unit]): Request[DisconnectParticipantResponse, AWSError] = js.native
  /**
    * Disconnects a participant. Note that ConnectionToken is used for invoking this API instead of ParticipantToken.
    */
  def disconnectParticipant(params: DisconnectParticipantRequest): Request[DisconnectParticipantResponse, AWSError] = js.native
  def disconnectParticipant(
    params: DisconnectParticipantRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisconnectParticipantResponse, Unit]
  ): Request[DisconnectParticipantResponse, AWSError] = js.native
  
  /**
    * Retrieves a transcript of the session. Note that ConnectionToken is used for invoking this API instead of ParticipantToken.
    */
  def getTranscript(): Request[GetTranscriptResponse, AWSError] = js.native
  def getTranscript(callback: js.Function2[/* err */ AWSError, /* data */ GetTranscriptResponse, Unit]): Request[GetTranscriptResponse, AWSError] = js.native
  /**
    * Retrieves a transcript of the session. Note that ConnectionToken is used for invoking this API instead of ParticipantToken.
    */
  def getTranscript(params: GetTranscriptRequest): Request[GetTranscriptResponse, AWSError] = js.native
  def getTranscript(
    params: GetTranscriptRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTranscriptResponse, Unit]
  ): Request[GetTranscriptResponse, AWSError] = js.native
  
  /**
    * Sends an event. Note that ConnectionToken is used for invoking this API instead of ParticipantToken.
    */
  def sendEvent(): Request[SendEventResponse, AWSError] = js.native
  def sendEvent(callback: js.Function2[/* err */ AWSError, /* data */ SendEventResponse, Unit]): Request[SendEventResponse, AWSError] = js.native
  /**
    * Sends an event. Note that ConnectionToken is used for invoking this API instead of ParticipantToken.
    */
  def sendEvent(params: SendEventRequest): Request[SendEventResponse, AWSError] = js.native
  def sendEvent(
    params: SendEventRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendEventResponse, Unit]
  ): Request[SendEventResponse, AWSError] = js.native
  
  /**
    * Sends a message. Note that ConnectionToken is used for invoking this API instead of ParticipantToken.
    */
  def sendMessage(): Request[SendMessageResponse, AWSError] = js.native
  def sendMessage(callback: js.Function2[/* err */ AWSError, /* data */ SendMessageResponse, Unit]): Request[SendMessageResponse, AWSError] = js.native
  /**
    * Sends a message. Note that ConnectionToken is used for invoking this API instead of ParticipantToken.
    */
  def sendMessage(params: SendMessageRequest): Request[SendMessageResponse, AWSError] = js.native
  def sendMessage(
    params: SendMessageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendMessageResponse, Unit]
  ): Request[SendMessageResponse, AWSError] = js.native
}
