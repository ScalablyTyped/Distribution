package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInputResponse extends js.Object {
  /**
    * The Unique ARN of the input (generated, immutable).
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * A list of channel IDs that that input is attached to (currently an input can only be attached to one channel).
    */
  var AttachedChannels: js.UndefOr[listOfString] = js.native
  /**
    * A list of the destinations of the input (PUSH-type).
    */
  var Destinations: js.UndefOr[listOfInputDestination] = js.native
  /**
    * The generated ID of the input (unique for user account, immutable).
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * STANDARD - MediaLive expects two sources to be connected to this input. If the channel is also STANDARD, both sources will be ingested. If the channel is SINGLE_PIPELINE, only the first source will be ingested; the second source will always be ignored, even if the first source fails.
  SINGLE_PIPELINE - You can connect only one source to this input. If the ChannelClass is also  SINGLE_PIPELINE, this value is valid. If the ChannelClass is STANDARD, this value is not valid because the channel requires two sources in the input.
    */
  var InputClass: js.UndefOr[typings.awsSdk.medialiveMod.InputClass] = js.native
  /**
    * Certain pull input sources can be dynamic, meaning that they can have their URL's dynamically changes
  during input switch actions. Presently, this functionality only works with MP4_FILE inputs.
    */
  var InputSourceType: js.UndefOr[typings.awsSdk.medialiveMod.InputSourceType] = js.native
  /**
    * A list of MediaConnect Flows for this input.
    */
  var MediaConnectFlows: js.UndefOr[listOfMediaConnectFlow] = js.native
  /**
    * The user-assigned name (This is a mutable value).
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
    */
  var RoleArn: js.UndefOr[string] = js.native
  /**
    * A list of IDs for all the Input Security Groups attached to the input.
    */
  var SecurityGroups: js.UndefOr[listOfString] = js.native
  /**
    * A list of the sources of the input (PULL-type).
    */
  var Sources: js.UndefOr[listOfInputSource] = js.native
  var State: js.UndefOr[InputState] = js.native
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsSdk.medialiveMod.Tags] = js.native
  var Type: js.UndefOr[InputType] = js.native
}

object DescribeInputResponse {
  @scala.inline
  def apply(
    Arn: string = null,
    AttachedChannels: listOfString = null,
    Destinations: listOfInputDestination = null,
    Id: string = null,
    InputClass: InputClass = null,
    InputSourceType: InputSourceType = null,
    MediaConnectFlows: listOfMediaConnectFlow = null,
    Name: string = null,
    RoleArn: string = null,
    SecurityGroups: listOfString = null,
    Sources: listOfInputSource = null,
    State: InputState = null,
    Tags: Tags = null,
    Type: InputType = null
  ): DescribeInputResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (AttachedChannels != null) __obj.updateDynamic("AttachedChannels")(AttachedChannels.asInstanceOf[js.Any])
    if (Destinations != null) __obj.updateDynamic("Destinations")(Destinations.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (InputClass != null) __obj.updateDynamic("InputClass")(InputClass.asInstanceOf[js.Any])
    if (InputSourceType != null) __obj.updateDynamic("InputSourceType")(InputSourceType.asInstanceOf[js.Any])
    if (MediaConnectFlows != null) __obj.updateDynamic("MediaConnectFlows")(MediaConnectFlows.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups.asInstanceOf[js.Any])
    if (Sources != null) __obj.updateDynamic("Sources")(Sources.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInputResponse]
  }
}

