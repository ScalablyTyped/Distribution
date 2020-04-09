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
  var Source: js.UndefOr[SetSourceRequest] = js.native
  var SourceFailoverConfig: js.UndefOr[FailoverConfig] = js.native
  var Sources: js.UndefOr[listOfSetSourceRequest] = js.native
  /**
    * The VPC interfaces you want on the flow.
    */
  var VpcInterfaces: js.UndefOr[listOfVpcInterfaceRequest] = js.native
}

object CreateFlowRequest {
  @scala.inline
  def apply(
    Name: string,
    AvailabilityZone: string = null,
    Entitlements: listOfGrantEntitlementRequest = null,
    Outputs: listOfAddOutputRequest = null,
    Source: SetSourceRequest = null,
    SourceFailoverConfig: FailoverConfig = null,
    Sources: listOfSetSourceRequest = null,
    VpcInterfaces: listOfVpcInterfaceRequest = null
  ): CreateFlowRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (Entitlements != null) __obj.updateDynamic("Entitlements")(Entitlements.asInstanceOf[js.Any])
    if (Outputs != null) __obj.updateDynamic("Outputs")(Outputs.asInstanceOf[js.Any])
    if (Source != null) __obj.updateDynamic("Source")(Source.asInstanceOf[js.Any])
    if (SourceFailoverConfig != null) __obj.updateDynamic("SourceFailoverConfig")(SourceFailoverConfig.asInstanceOf[js.Any])
    if (Sources != null) __obj.updateDynamic("Sources")(Sources.asInstanceOf[js.Any])
    if (VpcInterfaces != null) __obj.updateDynamic("VpcInterfaces")(VpcInterfaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFlowRequest]
  }
}

