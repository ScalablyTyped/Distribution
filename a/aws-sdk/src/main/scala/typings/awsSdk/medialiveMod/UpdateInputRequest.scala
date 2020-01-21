package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateInputRequest extends js.Object {
  /**
    * Destination settings for PUSH type inputs.
    */
  var Destinations: js.UndefOr[listOfInputDestinationRequest] = js.native
  /**
    * Unique ID of the input.
    */
  var InputId: string = js.native
  /**
    * A list of security groups referenced by IDs to attach to the input.
    */
  var InputSecurityGroups: js.UndefOr[listOfString] = js.native
  /**
    * A list of the MediaConnect Flow ARNs that you want to use as the source of the input. You can specify as few as one
  Flow and presently, as many as two. The only requirement is when you have more than one is that each Flow is in a
  separate Availability Zone as this ensures your EML input is redundant to AZ issues.
    */
  var MediaConnectFlows: js.UndefOr[listOfMediaConnectFlowRequest] = js.native
  /**
    * Name of the input.
    */
  var Name: js.UndefOr[string] = js.native
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
}

object UpdateInputRequest {
  @scala.inline
  def apply(
    InputId: string,
    Destinations: listOfInputDestinationRequest = null,
    InputSecurityGroups: listOfString = null,
    MediaConnectFlows: listOfMediaConnectFlowRequest = null,
    Name: string = null,
    RoleArn: string = null,
    Sources: listOfInputSourceRequest = null
  ): UpdateInputRequest = {
    val __obj = js.Dynamic.literal(InputId = InputId.asInstanceOf[js.Any])
    if (Destinations != null) __obj.updateDynamic("Destinations")(Destinations.asInstanceOf[js.Any])
    if (InputSecurityGroups != null) __obj.updateDynamic("InputSecurityGroups")(InputSecurityGroups.asInstanceOf[js.Any])
    if (MediaConnectFlows != null) __obj.updateDynamic("MediaConnectFlows")(MediaConnectFlows.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (Sources != null) __obj.updateDynamic("Sources")(Sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInputRequest]
  }
}

