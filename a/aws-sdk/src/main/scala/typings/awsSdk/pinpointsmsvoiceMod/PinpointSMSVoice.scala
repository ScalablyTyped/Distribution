package typings.awsSdk.pinpointsmsvoiceMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PinpointSMSVoice extends Service {
  @JSName("config")
  var config_PinpointSMSVoice: ConfigBase with ClientConfiguration = js.native
  /**
    * Create a new configuration set. After you create the configuration set, you can add one or more event destinations to it.
    */
  def createConfigurationSet(): Request[CreateConfigurationSetResponse, AWSError] = js.native
  def createConfigurationSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateConfigurationSetResponse, Unit]): Request[CreateConfigurationSetResponse, AWSError] = js.native
  /**
    * Create a new configuration set. After you create the configuration set, you can add one or more event destinations to it.
    */
  def createConfigurationSet(params: CreateConfigurationSetRequest): Request[CreateConfigurationSetResponse, AWSError] = js.native
  def createConfigurationSet(
    params: CreateConfigurationSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConfigurationSetResponse, Unit]
  ): Request[CreateConfigurationSetResponse, AWSError] = js.native
  /**
    * Create a new event destination in a configuration set.
    */
  def createConfigurationSetEventDestination(): Request[CreateConfigurationSetEventDestinationResponse, AWSError] = js.native
  def createConfigurationSetEventDestination(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConfigurationSetEventDestinationResponse, Unit]
  ): Request[CreateConfigurationSetEventDestinationResponse, AWSError] = js.native
  /**
    * Create a new event destination in a configuration set.
    */
  def createConfigurationSetEventDestination(params: CreateConfigurationSetEventDestinationRequest): Request[CreateConfigurationSetEventDestinationResponse, AWSError] = js.native
  def createConfigurationSetEventDestination(
    params: CreateConfigurationSetEventDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConfigurationSetEventDestinationResponse, Unit]
  ): Request[CreateConfigurationSetEventDestinationResponse, AWSError] = js.native
  /**
    * Deletes an existing configuration set.
    */
  def deleteConfigurationSet(): Request[DeleteConfigurationSetResponse, AWSError] = js.native
  def deleteConfigurationSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteConfigurationSetResponse, Unit]): Request[DeleteConfigurationSetResponse, AWSError] = js.native
  /**
    * Deletes an existing configuration set.
    */
  def deleteConfigurationSet(params: DeleteConfigurationSetRequest): Request[DeleteConfigurationSetResponse, AWSError] = js.native
  def deleteConfigurationSet(
    params: DeleteConfigurationSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConfigurationSetResponse, Unit]
  ): Request[DeleteConfigurationSetResponse, AWSError] = js.native
  /**
    * Deletes an event destination in a configuration set.
    */
  def deleteConfigurationSetEventDestination(): Request[DeleteConfigurationSetEventDestinationResponse, AWSError] = js.native
  def deleteConfigurationSetEventDestination(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConfigurationSetEventDestinationResponse, Unit]
  ): Request[DeleteConfigurationSetEventDestinationResponse, AWSError] = js.native
  /**
    * Deletes an event destination in a configuration set.
    */
  def deleteConfigurationSetEventDestination(params: DeleteConfigurationSetEventDestinationRequest): Request[DeleteConfigurationSetEventDestinationResponse, AWSError] = js.native
  def deleteConfigurationSetEventDestination(
    params: DeleteConfigurationSetEventDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConfigurationSetEventDestinationResponse, Unit]
  ): Request[DeleteConfigurationSetEventDestinationResponse, AWSError] = js.native
  /**
    * Obtain information about an event destination, including the types of events it reports, the Amazon Resource Name (ARN) of the destination, and the name of the event destination.
    */
  def getConfigurationSetEventDestinations(): Request[GetConfigurationSetEventDestinationsResponse, AWSError] = js.native
  def getConfigurationSetEventDestinations(
    callback: js.Function2[/* err */ AWSError, /* data */ GetConfigurationSetEventDestinationsResponse, Unit]
  ): Request[GetConfigurationSetEventDestinationsResponse, AWSError] = js.native
  /**
    * Obtain information about an event destination, including the types of events it reports, the Amazon Resource Name (ARN) of the destination, and the name of the event destination.
    */
  def getConfigurationSetEventDestinations(params: GetConfigurationSetEventDestinationsRequest): Request[GetConfigurationSetEventDestinationsResponse, AWSError] = js.native
  def getConfigurationSetEventDestinations(
    params: GetConfigurationSetEventDestinationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConfigurationSetEventDestinationsResponse, Unit]
  ): Request[GetConfigurationSetEventDestinationsResponse, AWSError] = js.native
  /**
    * List all of the configuration sets associated with your Amazon Pinpoint account in the current region.
    */
  def listConfigurationSets(): Request[ListConfigurationSetsResponse, AWSError] = js.native
  def listConfigurationSets(callback: js.Function2[/* err */ AWSError, /* data */ ListConfigurationSetsResponse, Unit]): Request[ListConfigurationSetsResponse, AWSError] = js.native
  /**
    * List all of the configuration sets associated with your Amazon Pinpoint account in the current region.
    */
  def listConfigurationSets(params: ListConfigurationSetsRequest): Request[ListConfigurationSetsResponse, AWSError] = js.native
  def listConfigurationSets(
    params: ListConfigurationSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListConfigurationSetsResponse, Unit]
  ): Request[ListConfigurationSetsResponse, AWSError] = js.native
  /**
    * Create a new voice message and send it to a recipient's phone number.
    */
  def sendVoiceMessage(): Request[SendVoiceMessageResponse, AWSError] = js.native
  def sendVoiceMessage(callback: js.Function2[/* err */ AWSError, /* data */ SendVoiceMessageResponse, Unit]): Request[SendVoiceMessageResponse, AWSError] = js.native
  /**
    * Create a new voice message and send it to a recipient's phone number.
    */
  def sendVoiceMessage(params: SendVoiceMessageRequest): Request[SendVoiceMessageResponse, AWSError] = js.native
  def sendVoiceMessage(
    params: SendVoiceMessageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendVoiceMessageResponse, Unit]
  ): Request[SendVoiceMessageResponse, AWSError] = js.native
  /**
    * Update an event destination in a configuration set. An event destination is a location that you publish information about your voice calls to. For example, you can log an event to an Amazon CloudWatch destination when a call fails.
    */
  def updateConfigurationSetEventDestination(): Request[UpdateConfigurationSetEventDestinationResponse, AWSError] = js.native
  def updateConfigurationSetEventDestination(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConfigurationSetEventDestinationResponse, Unit]
  ): Request[UpdateConfigurationSetEventDestinationResponse, AWSError] = js.native
  /**
    * Update an event destination in a configuration set. An event destination is a location that you publish information about your voice calls to. For example, you can log an event to an Amazon CloudWatch destination when a call fails.
    */
  def updateConfigurationSetEventDestination(params: UpdateConfigurationSetEventDestinationRequest): Request[UpdateConfigurationSetEventDestinationResponse, AWSError] = js.native
  def updateConfigurationSetEventDestination(
    params: UpdateConfigurationSetEventDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConfigurationSetEventDestinationResponse, Unit]
  ): Request[UpdateConfigurationSetEventDestinationResponse, AWSError] = js.native
}

