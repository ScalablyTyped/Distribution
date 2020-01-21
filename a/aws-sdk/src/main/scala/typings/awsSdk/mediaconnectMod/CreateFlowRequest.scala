package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFlowRequest extends js.Object {
  /**
    * The Availability Zone that you want to create the flow in. These options are limited to the Availability Zones within the current AWS Region.
    */
  var AvailabilityZone: js.UndefOr[string] = js.native
  /**
    * The entitlements that you want to grant on a flow.
    */
  var Entitlements: js.UndefOr[listOfGrantEntitlementRequest] = js.native
  /**
    * The name of the flow.
    */
  var Name: string = js.native
  /**
    * The outputs that you want to add to this flow.
    */
  var Outputs: js.UndefOr[listOfAddOutputRequest] = js.native
  var Source: SetSourceRequest = js.native
}

object CreateFlowRequest {
  @scala.inline
  def apply(
    Name: string,
    Source: SetSourceRequest,
    AvailabilityZone: string = null,
    Entitlements: listOfGrantEntitlementRequest = null,
    Outputs: listOfAddOutputRequest = null
  ): CreateFlowRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (Entitlements != null) __obj.updateDynamic("Entitlements")(Entitlements.asInstanceOf[js.Any])
    if (Outputs != null) __obj.updateDynamic("Outputs")(Outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFlowRequest]
  }
}

