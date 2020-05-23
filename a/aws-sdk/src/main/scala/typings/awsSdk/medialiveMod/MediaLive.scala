package typings.awsSdk.medialiveMod

import typings.awsSdk.anon.DescribeChannelRequestwai
import typings.awsSdk.anon.DescribeInputRequestwaite
import typings.awsSdk.anon.DescribeMultiplexRequestw
import typings.awsSdk.awsSdkStrings.channelCreated
import typings.awsSdk.awsSdkStrings.channelDeleted
import typings.awsSdk.awsSdkStrings.channelRunning
import typings.awsSdk.awsSdkStrings.channelStopped
import typings.awsSdk.awsSdkStrings.inputAttached
import typings.awsSdk.awsSdkStrings.inputDeleted
import typings.awsSdk.awsSdkStrings.inputDetached
import typings.awsSdk.awsSdkStrings.multiplexCreated
import typings.awsSdk.awsSdkStrings.multiplexDeleted
import typings.awsSdk.awsSdkStrings.multiplexRunning
import typings.awsSdk.awsSdkStrings.multiplexStopped
import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaLive extends Service {
  @JSName("config")
  var config_MediaLive: ConfigBase with ClientConfiguration = js.native
  /**
    * Update a channel schedule
    */
  def batchUpdateSchedule(): Request[BatchUpdateScheduleResponse, AWSError] = js.native
  def batchUpdateSchedule(callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdateScheduleResponse, Unit]): Request[BatchUpdateScheduleResponse, AWSError] = js.native
  /**
    * Update a channel schedule
    */
  def batchUpdateSchedule(params: BatchUpdateScheduleRequest): Request[BatchUpdateScheduleResponse, AWSError] = js.native
  def batchUpdateSchedule(
    params: BatchUpdateScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdateScheduleResponse, Unit]
  ): Request[BatchUpdateScheduleResponse, AWSError] = js.native
  /**
    * Creates a new channel
    */
  def createChannel(): Request[CreateChannelResponse, AWSError] = js.native
  def createChannel(callback: js.Function2[/* err */ AWSError, /* data */ CreateChannelResponse, Unit]): Request[CreateChannelResponse, AWSError] = js.native
  /**
    * Creates a new channel
    */
  def createChannel(params: CreateChannelRequest): Request[CreateChannelResponse, AWSError] = js.native
  def createChannel(
    params: CreateChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateChannelResponse, Unit]
  ): Request[CreateChannelResponse, AWSError] = js.native
  /**
    * Create an input
    */
  def createInput(): Request[CreateInputResponse, AWSError] = js.native
  def createInput(callback: js.Function2[/* err */ AWSError, /* data */ CreateInputResponse, Unit]): Request[CreateInputResponse, AWSError] = js.native
  /**
    * Create an input
    */
  def createInput(params: CreateInputRequest): Request[CreateInputResponse, AWSError] = js.native
  def createInput(
    params: CreateInputRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateInputResponse, Unit]
  ): Request[CreateInputResponse, AWSError] = js.native
  /**
    * Creates a Input Security Group
    */
  def createInputSecurityGroup(): Request[CreateInputSecurityGroupResponse, AWSError] = js.native
  def createInputSecurityGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateInputSecurityGroupResponse, Unit]): Request[CreateInputSecurityGroupResponse, AWSError] = js.native
  /**
    * Creates a Input Security Group
    */
  def createInputSecurityGroup(params: CreateInputSecurityGroupRequest): Request[CreateInputSecurityGroupResponse, AWSError] = js.native
  def createInputSecurityGroup(
    params: CreateInputSecurityGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateInputSecurityGroupResponse, Unit]
  ): Request[CreateInputSecurityGroupResponse, AWSError] = js.native
  /**
    * Create a new multiplex.
    */
  def createMultiplex(): Request[CreateMultiplexResponse, AWSError] = js.native
  def createMultiplex(callback: js.Function2[/* err */ AWSError, /* data */ CreateMultiplexResponse, Unit]): Request[CreateMultiplexResponse, AWSError] = js.native
  /**
    * Create a new multiplex.
    */
  def createMultiplex(params: CreateMultiplexRequest): Request[CreateMultiplexResponse, AWSError] = js.native
  def createMultiplex(
    params: CreateMultiplexRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMultiplexResponse, Unit]
  ): Request[CreateMultiplexResponse, AWSError] = js.native
  /**
    * Create a new program in the multiplex.
    */
  def createMultiplexProgram(): Request[CreateMultiplexProgramResponse, AWSError] = js.native
  def createMultiplexProgram(callback: js.Function2[/* err */ AWSError, /* data */ CreateMultiplexProgramResponse, Unit]): Request[CreateMultiplexProgramResponse, AWSError] = js.native
  /**
    * Create a new program in the multiplex.
    */
  def createMultiplexProgram(params: CreateMultiplexProgramRequest): Request[CreateMultiplexProgramResponse, AWSError] = js.native
  def createMultiplexProgram(
    params: CreateMultiplexProgramRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMultiplexProgramResponse, Unit]
  ): Request[CreateMultiplexProgramResponse, AWSError] = js.native
  /**
    * Create tags for a resource
    */
  def createTags(): Request[js.Object, AWSError] = js.native
  def createTags(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Create tags for a resource
    */
  def createTags(params: CreateTagsRequest): Request[js.Object, AWSError] = js.native
  def createTags(params: CreateTagsRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Starts deletion of channel. The associated outputs are also deleted.
    */
  def deleteChannel(): Request[DeleteChannelResponse, AWSError] = js.native
  def deleteChannel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteChannelResponse, Unit]): Request[DeleteChannelResponse, AWSError] = js.native
  /**
    * Starts deletion of channel. The associated outputs are also deleted.
    */
  def deleteChannel(params: DeleteChannelRequest): Request[DeleteChannelResponse, AWSError] = js.native
  def deleteChannel(
    params: DeleteChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteChannelResponse, Unit]
  ): Request[DeleteChannelResponse, AWSError] = js.native
  /**
    * Deletes the input end point
    */
  def deleteInput(): Request[DeleteInputResponse, AWSError] = js.native
  def deleteInput(callback: js.Function2[/* err */ AWSError, /* data */ DeleteInputResponse, Unit]): Request[DeleteInputResponse, AWSError] = js.native
  /**
    * Deletes the input end point
    */
  def deleteInput(params: DeleteInputRequest): Request[DeleteInputResponse, AWSError] = js.native
  def deleteInput(
    params: DeleteInputRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteInputResponse, Unit]
  ): Request[DeleteInputResponse, AWSError] = js.native
  /**
    * Deletes an Input Security Group
    */
  def deleteInputSecurityGroup(): Request[DeleteInputSecurityGroupResponse, AWSError] = js.native
  def deleteInputSecurityGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteInputSecurityGroupResponse, Unit]): Request[DeleteInputSecurityGroupResponse, AWSError] = js.native
  /**
    * Deletes an Input Security Group
    */
  def deleteInputSecurityGroup(params: DeleteInputSecurityGroupRequest): Request[DeleteInputSecurityGroupResponse, AWSError] = js.native
  def deleteInputSecurityGroup(
    params: DeleteInputSecurityGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteInputSecurityGroupResponse, Unit]
  ): Request[DeleteInputSecurityGroupResponse, AWSError] = js.native
  /**
    * Delete a multiplex. The multiplex must be idle.
    */
  def deleteMultiplex(): Request[DeleteMultiplexResponse, AWSError] = js.native
  def deleteMultiplex(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMultiplexResponse, Unit]): Request[DeleteMultiplexResponse, AWSError] = js.native
  /**
    * Delete a multiplex. The multiplex must be idle.
    */
  def deleteMultiplex(params: DeleteMultiplexRequest): Request[DeleteMultiplexResponse, AWSError] = js.native
  def deleteMultiplex(
    params: DeleteMultiplexRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMultiplexResponse, Unit]
  ): Request[DeleteMultiplexResponse, AWSError] = js.native
  /**
    * Delete a program from a multiplex.
    */
  def deleteMultiplexProgram(): Request[DeleteMultiplexProgramResponse, AWSError] = js.native
  def deleteMultiplexProgram(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMultiplexProgramResponse, Unit]): Request[DeleteMultiplexProgramResponse, AWSError] = js.native
  /**
    * Delete a program from a multiplex.
    */
  def deleteMultiplexProgram(params: DeleteMultiplexProgramRequest): Request[DeleteMultiplexProgramResponse, AWSError] = js.native
  def deleteMultiplexProgram(
    params: DeleteMultiplexProgramRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMultiplexProgramResponse, Unit]
  ): Request[DeleteMultiplexProgramResponse, AWSError] = js.native
  /**
    * Delete an expired reservation.
    */
  def deleteReservation(): Request[DeleteReservationResponse, AWSError] = js.native
  def deleteReservation(callback: js.Function2[/* err */ AWSError, /* data */ DeleteReservationResponse, Unit]): Request[DeleteReservationResponse, AWSError] = js.native
  /**
    * Delete an expired reservation.
    */
  def deleteReservation(params: DeleteReservationRequest): Request[DeleteReservationResponse, AWSError] = js.native
  def deleteReservation(
    params: DeleteReservationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReservationResponse, Unit]
  ): Request[DeleteReservationResponse, AWSError] = js.native
  /**
    * Delete all schedule actions on a channel.
    */
  def deleteSchedule(): Request[DeleteScheduleResponse, AWSError] = js.native
  def deleteSchedule(callback: js.Function2[/* err */ AWSError, /* data */ DeleteScheduleResponse, Unit]): Request[DeleteScheduleResponse, AWSError] = js.native
  /**
    * Delete all schedule actions on a channel.
    */
  def deleteSchedule(params: DeleteScheduleRequest): Request[DeleteScheduleResponse, AWSError] = js.native
  def deleteSchedule(
    params: DeleteScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteScheduleResponse, Unit]
  ): Request[DeleteScheduleResponse, AWSError] = js.native
  /**
    * Removes tags for a resource
    */
  def deleteTags(): Request[js.Object, AWSError] = js.native
  def deleteTags(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes tags for a resource
    */
  def deleteTags(params: DeleteTagsRequest): Request[js.Object, AWSError] = js.native
  def deleteTags(params: DeleteTagsRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Gets details about a channel
    */
  def describeChannel(): Request[DescribeChannelResponse, AWSError] = js.native
  def describeChannel(callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelResponse, Unit]): Request[DescribeChannelResponse, AWSError] = js.native
  /**
    * Gets details about a channel
    */
  def describeChannel(params: DescribeChannelRequest): Request[DescribeChannelResponse, AWSError] = js.native
  def describeChannel(
    params: DescribeChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelResponse, Unit]
  ): Request[DescribeChannelResponse, AWSError] = js.native
  /**
    * Produces details about an input
    */
  def describeInput(): Request[DescribeInputResponse, AWSError] = js.native
  def describeInput(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInputResponse, Unit]): Request[DescribeInputResponse, AWSError] = js.native
  /**
    * Produces details about an input
    */
  def describeInput(params: DescribeInputRequest): Request[DescribeInputResponse, AWSError] = js.native
  def describeInput(
    params: DescribeInputRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInputResponse, Unit]
  ): Request[DescribeInputResponse, AWSError] = js.native
  /**
    * Gets the details for the input device
    */
  def describeInputDevice(): Request[DescribeInputDeviceResponse, AWSError] = js.native
  def describeInputDevice(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInputDeviceResponse, Unit]): Request[DescribeInputDeviceResponse, AWSError] = js.native
  /**
    * Gets the details for the input device
    */
  def describeInputDevice(params: DescribeInputDeviceRequest): Request[DescribeInputDeviceResponse, AWSError] = js.native
  def describeInputDevice(
    params: DescribeInputDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInputDeviceResponse, Unit]
  ): Request[DescribeInputDeviceResponse, AWSError] = js.native
  /**
    * Produces a summary of an Input Security Group
    */
  def describeInputSecurityGroup(): Request[DescribeInputSecurityGroupResponse, AWSError] = js.native
  def describeInputSecurityGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInputSecurityGroupResponse, Unit]): Request[DescribeInputSecurityGroupResponse, AWSError] = js.native
  /**
    * Produces a summary of an Input Security Group
    */
  def describeInputSecurityGroup(params: DescribeInputSecurityGroupRequest): Request[DescribeInputSecurityGroupResponse, AWSError] = js.native
  def describeInputSecurityGroup(
    params: DescribeInputSecurityGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInputSecurityGroupResponse, Unit]
  ): Request[DescribeInputSecurityGroupResponse, AWSError] = js.native
  /**
    * Gets details about a multiplex.
    */
  def describeMultiplex(): Request[DescribeMultiplexResponse, AWSError] = js.native
  def describeMultiplex(callback: js.Function2[/* err */ AWSError, /* data */ DescribeMultiplexResponse, Unit]): Request[DescribeMultiplexResponse, AWSError] = js.native
  /**
    * Gets details about a multiplex.
    */
  def describeMultiplex(params: DescribeMultiplexRequest): Request[DescribeMultiplexResponse, AWSError] = js.native
  def describeMultiplex(
    params: DescribeMultiplexRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMultiplexResponse, Unit]
  ): Request[DescribeMultiplexResponse, AWSError] = js.native
  /**
    * Get the details for a program in a multiplex.
    */
  def describeMultiplexProgram(): Request[DescribeMultiplexProgramResponse, AWSError] = js.native
  def describeMultiplexProgram(callback: js.Function2[/* err */ AWSError, /* data */ DescribeMultiplexProgramResponse, Unit]): Request[DescribeMultiplexProgramResponse, AWSError] = js.native
  /**
    * Get the details for a program in a multiplex.
    */
  def describeMultiplexProgram(params: DescribeMultiplexProgramRequest): Request[DescribeMultiplexProgramResponse, AWSError] = js.native
  def describeMultiplexProgram(
    params: DescribeMultiplexProgramRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMultiplexProgramResponse, Unit]
  ): Request[DescribeMultiplexProgramResponse, AWSError] = js.native
  /**
    * Get details for an offering.
    */
  def describeOffering(): Request[DescribeOfferingResponse, AWSError] = js.native
  def describeOffering(callback: js.Function2[/* err */ AWSError, /* data */ DescribeOfferingResponse, Unit]): Request[DescribeOfferingResponse, AWSError] = js.native
  /**
    * Get details for an offering.
    */
  def describeOffering(params: DescribeOfferingRequest): Request[DescribeOfferingResponse, AWSError] = js.native
  def describeOffering(
    params: DescribeOfferingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOfferingResponse, Unit]
  ): Request[DescribeOfferingResponse, AWSError] = js.native
  /**
    * Get details for a reservation.
    */
  def describeReservation(): Request[DescribeReservationResponse, AWSError] = js.native
  def describeReservation(callback: js.Function2[/* err */ AWSError, /* data */ DescribeReservationResponse, Unit]): Request[DescribeReservationResponse, AWSError] = js.native
  /**
    * Get details for a reservation.
    */
  def describeReservation(params: DescribeReservationRequest): Request[DescribeReservationResponse, AWSError] = js.native
  def describeReservation(
    params: DescribeReservationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReservationResponse, Unit]
  ): Request[DescribeReservationResponse, AWSError] = js.native
  /**
    * Get a channel schedule
    */
  def describeSchedule(): Request[DescribeScheduleResponse, AWSError] = js.native
  def describeSchedule(callback: js.Function2[/* err */ AWSError, /* data */ DescribeScheduleResponse, Unit]): Request[DescribeScheduleResponse, AWSError] = js.native
  /**
    * Get a channel schedule
    */
  def describeSchedule(params: DescribeScheduleRequest): Request[DescribeScheduleResponse, AWSError] = js.native
  def describeSchedule(
    params: DescribeScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeScheduleResponse, Unit]
  ): Request[DescribeScheduleResponse, AWSError] = js.native
  /**
    * Produces list of channels that have been created
    */
  def listChannels(): Request[ListChannelsResponse, AWSError] = js.native
  def listChannels(callback: js.Function2[/* err */ AWSError, /* data */ ListChannelsResponse, Unit]): Request[ListChannelsResponse, AWSError] = js.native
  /**
    * Produces list of channels that have been created
    */
  def listChannels(params: ListChannelsRequest): Request[ListChannelsResponse, AWSError] = js.native
  def listChannels(
    params: ListChannelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListChannelsResponse, Unit]
  ): Request[ListChannelsResponse, AWSError] = js.native
  /**
    * List input devices
    */
  def listInputDevices(): Request[ListInputDevicesResponse, AWSError] = js.native
  def listInputDevices(callback: js.Function2[/* err */ AWSError, /* data */ ListInputDevicesResponse, Unit]): Request[ListInputDevicesResponse, AWSError] = js.native
  /**
    * List input devices
    */
  def listInputDevices(params: ListInputDevicesRequest): Request[ListInputDevicesResponse, AWSError] = js.native
  def listInputDevices(
    params: ListInputDevicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInputDevicesResponse, Unit]
  ): Request[ListInputDevicesResponse, AWSError] = js.native
  /**
    * Produces a list of Input Security Groups for an account
    */
  def listInputSecurityGroups(): Request[ListInputSecurityGroupsResponse, AWSError] = js.native
  def listInputSecurityGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListInputSecurityGroupsResponse, Unit]): Request[ListInputSecurityGroupsResponse, AWSError] = js.native
  /**
    * Produces a list of Input Security Groups for an account
    */
  def listInputSecurityGroups(params: ListInputSecurityGroupsRequest): Request[ListInputSecurityGroupsResponse, AWSError] = js.native
  def listInputSecurityGroups(
    params: ListInputSecurityGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInputSecurityGroupsResponse, Unit]
  ): Request[ListInputSecurityGroupsResponse, AWSError] = js.native
  /**
    * Produces list of inputs that have been created
    */
  def listInputs(): Request[ListInputsResponse, AWSError] = js.native
  def listInputs(callback: js.Function2[/* err */ AWSError, /* data */ ListInputsResponse, Unit]): Request[ListInputsResponse, AWSError] = js.native
  /**
    * Produces list of inputs that have been created
    */
  def listInputs(params: ListInputsRequest): Request[ListInputsResponse, AWSError] = js.native
  def listInputs(
    params: ListInputsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInputsResponse, Unit]
  ): Request[ListInputsResponse, AWSError] = js.native
  /**
    * List the programs that currently exist for a specific multiplex.
    */
  def listMultiplexPrograms(): Request[ListMultiplexProgramsResponse, AWSError] = js.native
  def listMultiplexPrograms(callback: js.Function2[/* err */ AWSError, /* data */ ListMultiplexProgramsResponse, Unit]): Request[ListMultiplexProgramsResponse, AWSError] = js.native
  /**
    * List the programs that currently exist for a specific multiplex.
    */
  def listMultiplexPrograms(params: ListMultiplexProgramsRequest): Request[ListMultiplexProgramsResponse, AWSError] = js.native
  def listMultiplexPrograms(
    params: ListMultiplexProgramsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMultiplexProgramsResponse, Unit]
  ): Request[ListMultiplexProgramsResponse, AWSError] = js.native
  /**
    * Retrieve a list of the existing multiplexes.
    */
  def listMultiplexes(): Request[ListMultiplexesResponse, AWSError] = js.native
  def listMultiplexes(callback: js.Function2[/* err */ AWSError, /* data */ ListMultiplexesResponse, Unit]): Request[ListMultiplexesResponse, AWSError] = js.native
  /**
    * Retrieve a list of the existing multiplexes.
    */
  def listMultiplexes(params: ListMultiplexesRequest): Request[ListMultiplexesResponse, AWSError] = js.native
  def listMultiplexes(
    params: ListMultiplexesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMultiplexesResponse, Unit]
  ): Request[ListMultiplexesResponse, AWSError] = js.native
  /**
    * List offerings available for purchase.
    */
  def listOfferings(): Request[ListOfferingsResponse, AWSError] = js.native
  def listOfferings(callback: js.Function2[/* err */ AWSError, /* data */ ListOfferingsResponse, Unit]): Request[ListOfferingsResponse, AWSError] = js.native
  /**
    * List offerings available for purchase.
    */
  def listOfferings(params: ListOfferingsRequest): Request[ListOfferingsResponse, AWSError] = js.native
  def listOfferings(
    params: ListOfferingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOfferingsResponse, Unit]
  ): Request[ListOfferingsResponse, AWSError] = js.native
  /**
    * List purchased reservations.
    */
  def listReservations(): Request[ListReservationsResponse, AWSError] = js.native
  def listReservations(callback: js.Function2[/* err */ AWSError, /* data */ ListReservationsResponse, Unit]): Request[ListReservationsResponse, AWSError] = js.native
  /**
    * List purchased reservations.
    */
  def listReservations(params: ListReservationsRequest): Request[ListReservationsResponse, AWSError] = js.native
  def listReservations(
    params: ListReservationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReservationsResponse, Unit]
  ): Request[ListReservationsResponse, AWSError] = js.native
  /**
    * Produces list of tags that have been created for a resource
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Produces list of tags that have been created for a resource
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Purchase an offering and create a reservation.
    */
  def purchaseOffering(): Request[PurchaseOfferingResponse, AWSError] = js.native
  def purchaseOffering(callback: js.Function2[/* err */ AWSError, /* data */ PurchaseOfferingResponse, Unit]): Request[PurchaseOfferingResponse, AWSError] = js.native
  /**
    * Purchase an offering and create a reservation.
    */
  def purchaseOffering(params: PurchaseOfferingRequest): Request[PurchaseOfferingResponse, AWSError] = js.native
  def purchaseOffering(
    params: PurchaseOfferingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PurchaseOfferingResponse, Unit]
  ): Request[PurchaseOfferingResponse, AWSError] = js.native
  /**
    * Starts an existing channel
    */
  def startChannel(): Request[StartChannelResponse, AWSError] = js.native
  def startChannel(callback: js.Function2[/* err */ AWSError, /* data */ StartChannelResponse, Unit]): Request[StartChannelResponse, AWSError] = js.native
  /**
    * Starts an existing channel
    */
  def startChannel(params: StartChannelRequest): Request[StartChannelResponse, AWSError] = js.native
  def startChannel(
    params: StartChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartChannelResponse, Unit]
  ): Request[StartChannelResponse, AWSError] = js.native
  /**
    * Start (run) the multiplex. Starting the multiplex does not start the channels. You must explicitly start each channel.
    */
  def startMultiplex(): Request[StartMultiplexResponse, AWSError] = js.native
  def startMultiplex(callback: js.Function2[/* err */ AWSError, /* data */ StartMultiplexResponse, Unit]): Request[StartMultiplexResponse, AWSError] = js.native
  /**
    * Start (run) the multiplex. Starting the multiplex does not start the channels. You must explicitly start each channel.
    */
  def startMultiplex(params: StartMultiplexRequest): Request[StartMultiplexResponse, AWSError] = js.native
  def startMultiplex(
    params: StartMultiplexRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartMultiplexResponse, Unit]
  ): Request[StartMultiplexResponse, AWSError] = js.native
  /**
    * Stops a running channel
    */
  def stopChannel(): Request[StopChannelResponse, AWSError] = js.native
  def stopChannel(callback: js.Function2[/* err */ AWSError, /* data */ StopChannelResponse, Unit]): Request[StopChannelResponse, AWSError] = js.native
  /**
    * Stops a running channel
    */
  def stopChannel(params: StopChannelRequest): Request[StopChannelResponse, AWSError] = js.native
  def stopChannel(
    params: StopChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopChannelResponse, Unit]
  ): Request[StopChannelResponse, AWSError] = js.native
  /**
    * Stops a running multiplex. If the multiplex isn't running, this action has no effect.
    */
  def stopMultiplex(): Request[StopMultiplexResponse, AWSError] = js.native
  def stopMultiplex(callback: js.Function2[/* err */ AWSError, /* data */ StopMultiplexResponse, Unit]): Request[StopMultiplexResponse, AWSError] = js.native
  /**
    * Stops a running multiplex. If the multiplex isn't running, this action has no effect.
    */
  def stopMultiplex(params: StopMultiplexRequest): Request[StopMultiplexResponse, AWSError] = js.native
  def stopMultiplex(
    params: StopMultiplexRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopMultiplexResponse, Unit]
  ): Request[StopMultiplexResponse, AWSError] = js.native
  /**
    * Updates a channel.
    */
  def updateChannel(): Request[UpdateChannelResponse, AWSError] = js.native
  def updateChannel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateChannelResponse, Unit]): Request[UpdateChannelResponse, AWSError] = js.native
  /**
    * Updates a channel.
    */
  def updateChannel(params: UpdateChannelRequest): Request[UpdateChannelResponse, AWSError] = js.native
  def updateChannel(
    params: UpdateChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateChannelResponse, Unit]
  ): Request[UpdateChannelResponse, AWSError] = js.native
  /**
    * Changes the class of the channel.
    */
  def updateChannelClass(): Request[UpdateChannelClassResponse, AWSError] = js.native
  def updateChannelClass(callback: js.Function2[/* err */ AWSError, /* data */ UpdateChannelClassResponse, Unit]): Request[UpdateChannelClassResponse, AWSError] = js.native
  /**
    * Changes the class of the channel.
    */
  def updateChannelClass(params: UpdateChannelClassRequest): Request[UpdateChannelClassResponse, AWSError] = js.native
  def updateChannelClass(
    params: UpdateChannelClassRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateChannelClassResponse, Unit]
  ): Request[UpdateChannelClassResponse, AWSError] = js.native
  /**
    * Updates an input.
    */
  def updateInput(): Request[UpdateInputResponse, AWSError] = js.native
  def updateInput(callback: js.Function2[/* err */ AWSError, /* data */ UpdateInputResponse, Unit]): Request[UpdateInputResponse, AWSError] = js.native
  /**
    * Updates an input.
    */
  def updateInput(params: UpdateInputRequest): Request[UpdateInputResponse, AWSError] = js.native
  def updateInput(
    params: UpdateInputRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateInputResponse, Unit]
  ): Request[UpdateInputResponse, AWSError] = js.native
  /**
    * Updates the parameters for the input device.
    */
  def updateInputDevice(): Request[UpdateInputDeviceResponse, AWSError] = js.native
  def updateInputDevice(callback: js.Function2[/* err */ AWSError, /* data */ UpdateInputDeviceResponse, Unit]): Request[UpdateInputDeviceResponse, AWSError] = js.native
  /**
    * Updates the parameters for the input device.
    */
  def updateInputDevice(params: UpdateInputDeviceRequest): Request[UpdateInputDeviceResponse, AWSError] = js.native
  def updateInputDevice(
    params: UpdateInputDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateInputDeviceResponse, Unit]
  ): Request[UpdateInputDeviceResponse, AWSError] = js.native
  /**
    * Update an Input Security Group's Whilelists.
    */
  def updateInputSecurityGroup(): Request[UpdateInputSecurityGroupResponse, AWSError] = js.native
  def updateInputSecurityGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateInputSecurityGroupResponse, Unit]): Request[UpdateInputSecurityGroupResponse, AWSError] = js.native
  /**
    * Update an Input Security Group's Whilelists.
    */
  def updateInputSecurityGroup(params: UpdateInputSecurityGroupRequest): Request[UpdateInputSecurityGroupResponse, AWSError] = js.native
  def updateInputSecurityGroup(
    params: UpdateInputSecurityGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateInputSecurityGroupResponse, Unit]
  ): Request[UpdateInputSecurityGroupResponse, AWSError] = js.native
  /**
    * Updates a multiplex.
    */
  def updateMultiplex(): Request[UpdateMultiplexResponse, AWSError] = js.native
  def updateMultiplex(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMultiplexResponse, Unit]): Request[UpdateMultiplexResponse, AWSError] = js.native
  /**
    * Updates a multiplex.
    */
  def updateMultiplex(params: UpdateMultiplexRequest): Request[UpdateMultiplexResponse, AWSError] = js.native
  def updateMultiplex(
    params: UpdateMultiplexRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMultiplexResponse, Unit]
  ): Request[UpdateMultiplexResponse, AWSError] = js.native
  /**
    * Update a program in a multiplex.
    */
  def updateMultiplexProgram(): Request[UpdateMultiplexProgramResponse, AWSError] = js.native
  def updateMultiplexProgram(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMultiplexProgramResponse, Unit]): Request[UpdateMultiplexProgramResponse, AWSError] = js.native
  /**
    * Update a program in a multiplex.
    */
  def updateMultiplexProgram(params: UpdateMultiplexProgramRequest): Request[UpdateMultiplexProgramResponse, AWSError] = js.native
  def updateMultiplexProgram(
    params: UpdateMultiplexProgramRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMultiplexProgramResponse, Unit]
  ): Request[UpdateMultiplexProgramResponse, AWSError] = js.native
  /**
    * Update reservation.
    */
  def updateReservation(): Request[UpdateReservationResponse, AWSError] = js.native
  def updateReservation(callback: js.Function2[/* err */ AWSError, /* data */ UpdateReservationResponse, Unit]): Request[UpdateReservationResponse, AWSError] = js.native
  /**
    * Update reservation.
    */
  def updateReservation(params: UpdateReservationRequest): Request[UpdateReservationResponse, AWSError] = js.native
  def updateReservation(
    params: UpdateReservationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateReservationResponse, Unit]
  ): Request[UpdateReservationResponse, AWSError] = js.native
  /**
    * Waits for the channelCreated state by periodically calling the underlying MediaLive.describeChanneloperation every 3 seconds (at most 5 times). Wait until a channel has been created
    */
  @JSName("waitFor")
  def waitFor_channelCreated(state: channelCreated): Request[DescribeChannelResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_channelCreated(
    state: channelCreated,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelResponse, Unit]
  ): Request[DescribeChannelResponse, AWSError] = js.native
  /**
    * Waits for the channelCreated state by periodically calling the underlying MediaLive.describeChanneloperation every 3 seconds (at most 5 times). Wait until a channel has been created
    */
  @JSName("waitFor")
  def waitFor_channelCreated(state: channelCreated, params: DescribeChannelRequestwai): Request[DescribeChannelResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_channelCreated(
    state: channelCreated,
    params: DescribeChannelRequestwai,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelResponse, Unit]
  ): Request[DescribeChannelResponse, AWSError] = js.native
  /**
    * Waits for the channelDeleted state by periodically calling the underlying MediaLive.describeChanneloperation every 5 seconds (at most 84 times). Wait until a channel has been deleted
    */
  @JSName("waitFor")
  def waitFor_channelDeleted(state: channelDeleted): Request[DescribeChannelResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_channelDeleted(
    state: channelDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelResponse, Unit]
  ): Request[DescribeChannelResponse, AWSError] = js.native
  /**
    * Waits for the channelDeleted state by periodically calling the underlying MediaLive.describeChanneloperation every 5 seconds (at most 84 times). Wait until a channel has been deleted
    */
  @JSName("waitFor")
  def waitFor_channelDeleted(state: channelDeleted, params: DescribeChannelRequestwai): Request[DescribeChannelResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_channelDeleted(
    state: channelDeleted,
    params: DescribeChannelRequestwai,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelResponse, Unit]
  ): Request[DescribeChannelResponse, AWSError] = js.native
  /**
    * Waits for the channelRunning state by periodically calling the underlying MediaLive.describeChanneloperation every 5 seconds (at most 120 times). Wait until a channel is running
    */
  @JSName("waitFor")
  def waitFor_channelRunning(state: channelRunning): Request[DescribeChannelResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_channelRunning(
    state: channelRunning,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelResponse, Unit]
  ): Request[DescribeChannelResponse, AWSError] = js.native
  /**
    * Waits for the channelRunning state by periodically calling the underlying MediaLive.describeChanneloperation every 5 seconds (at most 120 times). Wait until a channel is running
    */
  @JSName("waitFor")
  def waitFor_channelRunning(state: channelRunning, params: DescribeChannelRequestwai): Request[DescribeChannelResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_channelRunning(
    state: channelRunning,
    params: DescribeChannelRequestwai,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelResponse, Unit]
  ): Request[DescribeChannelResponse, AWSError] = js.native
  /**
    * Waits for the channelStopped state by periodically calling the underlying MediaLive.describeChanneloperation every 5 seconds (at most 60 times). Wait until a channel has is stopped
    */
  @JSName("waitFor")
  def waitFor_channelStopped(state: channelStopped): Request[DescribeChannelResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_channelStopped(
    state: channelStopped,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelResponse, Unit]
  ): Request[DescribeChannelResponse, AWSError] = js.native
  /**
    * Waits for the channelStopped state by periodically calling the underlying MediaLive.describeChanneloperation every 5 seconds (at most 60 times). Wait until a channel has is stopped
    */
  @JSName("waitFor")
  def waitFor_channelStopped(state: channelStopped, params: DescribeChannelRequestwai): Request[DescribeChannelResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_channelStopped(
    state: channelStopped,
    params: DescribeChannelRequestwai,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeChannelResponse, Unit]
  ): Request[DescribeChannelResponse, AWSError] = js.native
  /**
    * Waits for the inputAttached state by periodically calling the underlying MediaLive.describeInputoperation every 5 seconds (at most 20 times). Wait until an input has been attached
    */
  @JSName("waitFor")
  def waitFor_inputAttached(state: inputAttached): Request[DescribeInputResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_inputAttached(
    state: inputAttached,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInputResponse, Unit]
  ): Request[DescribeInputResponse, AWSError] = js.native
  /**
    * Waits for the inputAttached state by periodically calling the underlying MediaLive.describeInputoperation every 5 seconds (at most 20 times). Wait until an input has been attached
    */
  @JSName("waitFor")
  def waitFor_inputAttached(state: inputAttached, params: DescribeInputRequestwaite): Request[DescribeInputResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_inputAttached(
    state: inputAttached,
    params: DescribeInputRequestwaite,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInputResponse, Unit]
  ): Request[DescribeInputResponse, AWSError] = js.native
  /**
    * Waits for the inputDeleted state by periodically calling the underlying MediaLive.describeInputoperation every 5 seconds (at most 20 times). Wait until an input has been deleted
    */
  @JSName("waitFor")
  def waitFor_inputDeleted(state: inputDeleted): Request[DescribeInputResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_inputDeleted(
    state: inputDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInputResponse, Unit]
  ): Request[DescribeInputResponse, AWSError] = js.native
  /**
    * Waits for the inputDeleted state by periodically calling the underlying MediaLive.describeInputoperation every 5 seconds (at most 20 times). Wait until an input has been deleted
    */
  @JSName("waitFor")
  def waitFor_inputDeleted(state: inputDeleted, params: DescribeInputRequestwaite): Request[DescribeInputResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_inputDeleted(
    state: inputDeleted,
    params: DescribeInputRequestwaite,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInputResponse, Unit]
  ): Request[DescribeInputResponse, AWSError] = js.native
  /**
    * Waits for the inputDetached state by periodically calling the underlying MediaLive.describeInputoperation every 5 seconds (at most 84 times). Wait until an input has been detached
    */
  @JSName("waitFor")
  def waitFor_inputDetached(state: inputDetached): Request[DescribeInputResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_inputDetached(
    state: inputDetached,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInputResponse, Unit]
  ): Request[DescribeInputResponse, AWSError] = js.native
  /**
    * Waits for the inputDetached state by periodically calling the underlying MediaLive.describeInputoperation every 5 seconds (at most 84 times). Wait until an input has been detached
    */
  @JSName("waitFor")
  def waitFor_inputDetached(state: inputDetached, params: DescribeInputRequestwaite): Request[DescribeInputResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_inputDetached(
    state: inputDetached,
    params: DescribeInputRequestwaite,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInputResponse, Unit]
  ): Request[DescribeInputResponse, AWSError] = js.native
  /**
    * Waits for the multiplexCreated state by periodically calling the underlying MediaLive.describeMultiplexoperation every 3 seconds (at most 5 times). Wait until a multiplex has been created
    */
  @JSName("waitFor")
  def waitFor_multiplexCreated(state: multiplexCreated): Request[DescribeMultiplexResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_multiplexCreated(
    state: multiplexCreated,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMultiplexResponse, Unit]
  ): Request[DescribeMultiplexResponse, AWSError] = js.native
  /**
    * Waits for the multiplexCreated state by periodically calling the underlying MediaLive.describeMultiplexoperation every 3 seconds (at most 5 times). Wait until a multiplex has been created
    */
  @JSName("waitFor")
  def waitFor_multiplexCreated(state: multiplexCreated, params: DescribeMultiplexRequestw): Request[DescribeMultiplexResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_multiplexCreated(
    state: multiplexCreated,
    params: DescribeMultiplexRequestw,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMultiplexResponse, Unit]
  ): Request[DescribeMultiplexResponse, AWSError] = js.native
  /**
    * Waits for the multiplexDeleted state by periodically calling the underlying MediaLive.describeMultiplexoperation every 5 seconds (at most 20 times). Wait until a multiplex has been deleted
    */
  @JSName("waitFor")
  def waitFor_multiplexDeleted(state: multiplexDeleted): Request[DescribeMultiplexResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_multiplexDeleted(
    state: multiplexDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMultiplexResponse, Unit]
  ): Request[DescribeMultiplexResponse, AWSError] = js.native
  /**
    * Waits for the multiplexDeleted state by periodically calling the underlying MediaLive.describeMultiplexoperation every 5 seconds (at most 20 times). Wait until a multiplex has been deleted
    */
  @JSName("waitFor")
  def waitFor_multiplexDeleted(state: multiplexDeleted, params: DescribeMultiplexRequestw): Request[DescribeMultiplexResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_multiplexDeleted(
    state: multiplexDeleted,
    params: DescribeMultiplexRequestw,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMultiplexResponse, Unit]
  ): Request[DescribeMultiplexResponse, AWSError] = js.native
  /**
    * Waits for the multiplexRunning state by periodically calling the underlying MediaLive.describeMultiplexoperation every 5 seconds (at most 120 times). Wait until a multiplex is running
    */
  @JSName("waitFor")
  def waitFor_multiplexRunning(state: multiplexRunning): Request[DescribeMultiplexResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_multiplexRunning(
    state: multiplexRunning,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMultiplexResponse, Unit]
  ): Request[DescribeMultiplexResponse, AWSError] = js.native
  /**
    * Waits for the multiplexRunning state by periodically calling the underlying MediaLive.describeMultiplexoperation every 5 seconds (at most 120 times). Wait until a multiplex is running
    */
  @JSName("waitFor")
  def waitFor_multiplexRunning(state: multiplexRunning, params: DescribeMultiplexRequestw): Request[DescribeMultiplexResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_multiplexRunning(
    state: multiplexRunning,
    params: DescribeMultiplexRequestw,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMultiplexResponse, Unit]
  ): Request[DescribeMultiplexResponse, AWSError] = js.native
  /**
    * Waits for the multiplexStopped state by periodically calling the underlying MediaLive.describeMultiplexoperation every 5 seconds (at most 28 times). Wait until a multiplex has is stopped
    */
  @JSName("waitFor")
  def waitFor_multiplexStopped(state: multiplexStopped): Request[DescribeMultiplexResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_multiplexStopped(
    state: multiplexStopped,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMultiplexResponse, Unit]
  ): Request[DescribeMultiplexResponse, AWSError] = js.native
  /**
    * Waits for the multiplexStopped state by periodically calling the underlying MediaLive.describeMultiplexoperation every 5 seconds (at most 28 times). Wait until a multiplex has is stopped
    */
  @JSName("waitFor")
  def waitFor_multiplexStopped(state: multiplexStopped, params: DescribeMultiplexRequestw): Request[DescribeMultiplexResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_multiplexStopped(
    state: multiplexStopped,
    params: DescribeMultiplexRequestw,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMultiplexResponse, Unit]
  ): Request[DescribeMultiplexResponse, AWSError] = js.native
}

