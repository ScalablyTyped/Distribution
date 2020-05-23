package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInputRequest extends js.Object {
  /**
    * Destination settings for PUSH type inputs.
    */
  var Destinations: js.UndefOr[listOfInputDestinationRequest] = js.native
  /**
    * Settings for the devices.
    */
  var InputDevices: js.UndefOr[listOfInputDeviceSettings] = js.native
  /**
    * A list of security groups referenced by IDs to attach to the input.
    */
  var InputSecurityGroups: js.UndefOr[listOfString] = js.native
  /**
    * A list of the MediaConnect Flows that you want to use in this input. You can specify as few as one
  Flow and presently, as many as two. The only requirement is when you have more than one is that each Flow is in a
  separate Availability Zone as this ensures your EML input is redundant to AZ issues.
    */
  var MediaConnectFlows: js.UndefOr[listOfMediaConnectFlowRequest] = js.native
  /**
    * Name of the input.
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * Unique identifier of the request to ensure the request is handled
  exactly once in case of retries.
    */
  var RequestId: js.UndefOr[string] = js.native
  /**
    * The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
    */
  var RoleArn: js.UndefOr[string] = js.native
  /**
    * The source URLs for a PULL-type input. Every PULL type input needs
  exactly two source URLs for redundancy.
  Only specify sources for PULL type Inputs. Leave Destinations empty.
    */
  var Sources: js.UndefOr[listOfInputSourceRequest] = js.native
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsSdk.medialiveMod.Tags] = js.native
  var Type: js.UndefOr[InputType] = js.native
  var Vpc: js.UndefOr[InputVpcRequest] = js.native
}

object CreateInputRequest {
  @scala.inline
  def apply(
    Destinations: listOfInputDestinationRequest = null,
    InputDevices: listOfInputDeviceSettings = null,
    InputSecurityGroups: listOfString = null,
    MediaConnectFlows: listOfMediaConnectFlowRequest = null,
    Name: string = null,
    RequestId: string = null,
    RoleArn: string = null,
    Sources: listOfInputSourceRequest = null,
    Tags: Tags = null,
    Type: InputType = null,
    Vpc: InputVpcRequest = null
  ): CreateInputRequest = {
    val __obj = js.Dynamic.literal()
    if (Destinations != null) __obj.updateDynamic("Destinations")(Destinations.asInstanceOf[js.Any])
    if (InputDevices != null) __obj.updateDynamic("InputDevices")(InputDevices.asInstanceOf[js.Any])
    if (InputSecurityGroups != null) __obj.updateDynamic("InputSecurityGroups")(InputSecurityGroups.asInstanceOf[js.Any])
    if (MediaConnectFlows != null) __obj.updateDynamic("MediaConnectFlows")(MediaConnectFlows.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (Sources != null) __obj.updateDynamic("Sources")(Sources.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Vpc != null) __obj.updateDynamic("Vpc")(Vpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInputRequest]
  }
}

