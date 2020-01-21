package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpcEndpointServiceConfigurationRequest extends js.Object {
  /**
    * Indicates whether requests to create an endpoint to your service must be accepted.
    */
  var AcceptanceRequired: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Names (ARNs) of Network Load Balancers to add to your service configuration.
    */
  var AddNetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The private DNS name to assign to the endpoint service.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Names (ARNs) of Network Load Balancers to remove from your service configuration.
    */
  var RemoveNetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.native
  /**
    * Removes the private DNS name of the endpoint service.
    */
  var RemovePrivateDnsName: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the service.
    */
  var ServiceId: typings.awsSdk.ec2Mod.ServiceId = js.native
}

object ModifyVpcEndpointServiceConfigurationRequest {
  @scala.inline
  def apply(
    ServiceId: ServiceId,
    AcceptanceRequired: js.UndefOr[scala.Boolean] = js.undefined,
    AddNetworkLoadBalancerArns: ValueStringList = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    PrivateDnsName: String = null,
    RemoveNetworkLoadBalancerArns: ValueStringList = null,
    RemovePrivateDnsName: js.UndefOr[scala.Boolean] = js.undefined
  ): ModifyVpcEndpointServiceConfigurationRequest = {
    val __obj = js.Dynamic.literal(ServiceId = ServiceId.asInstanceOf[js.Any])
    if (!js.isUndefined(AcceptanceRequired)) __obj.updateDynamic("AcceptanceRequired")(AcceptanceRequired.asInstanceOf[js.Any])
    if (AddNetworkLoadBalancerArns != null) __obj.updateDynamic("AddNetworkLoadBalancerArns")(AddNetworkLoadBalancerArns.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (PrivateDnsName != null) __obj.updateDynamic("PrivateDnsName")(PrivateDnsName.asInstanceOf[js.Any])
    if (RemoveNetworkLoadBalancerArns != null) __obj.updateDynamic("RemoveNetworkLoadBalancerArns")(RemoveNetworkLoadBalancerArns.asInstanceOf[js.Any])
    if (!js.isUndefined(RemovePrivateDnsName)) __obj.updateDynamic("RemovePrivateDnsName")(RemovePrivateDnsName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcEndpointServiceConfigurationRequest]
  }
}

