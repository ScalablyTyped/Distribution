package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpcEndpointServiceConfigurationRequest extends js.Object {
  /**
    * Indicates whether requests from service consumers to create an endpoint to your service must be accepted. To accept a request, use AcceptVpcEndpointConnections.
    */
  var AcceptanceRequired: js.UndefOr[Boolean] = js.native
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Names (ARNs) of one or more Network Load Balancers for your service.
    */
  var NetworkLoadBalancerArns: ValueStringList = js.native
  /**
    * The private DNS name to assign to the VPC endpoint service.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
}

object CreateVpcEndpointServiceConfigurationRequest {
  @scala.inline
  def apply(
    NetworkLoadBalancerArns: ValueStringList,
    AcceptanceRequired: js.UndefOr[scala.Boolean] = js.undefined,
    ClientToken: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    PrivateDnsName: String = null
  ): CreateVpcEndpointServiceConfigurationRequest = {
    val __obj = js.Dynamic.literal(NetworkLoadBalancerArns = NetworkLoadBalancerArns.asInstanceOf[js.Any])
    if (!js.isUndefined(AcceptanceRequired)) __obj.updateDynamic("AcceptanceRequired")(AcceptanceRequired.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (PrivateDnsName != null) __obj.updateDynamic("PrivateDnsName")(PrivateDnsName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcEndpointServiceConfigurationRequest]
  }
}

