package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizeClientVpnIngressRequest extends js.Object {
  /**
    * The ID of the group to grant access to, for example, the Active Directory group or identity provider (IdP) group.
    */
  var AccessGroupId: js.UndefOr[String] = js.native
  /**
    * Indicates whether to grant access to all clients. Use true to grant all clients who successfully establish a VPN connection access to the network.
    */
  var AuthorizeAllGroups: js.UndefOr[Boolean] = js.native
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: typings.awsSdk.ec2Mod.ClientVpnEndpointId = js.native
  /**
    * A brief description of the authorization rule.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The IPv4 address range, in CIDR notation, of the network for which access is being authorized.
    */
  var TargetNetworkCidr: String = js.native
}

object AuthorizeClientVpnIngressRequest {
  @scala.inline
  def apply(
    ClientVpnEndpointId: ClientVpnEndpointId,
    TargetNetworkCidr: String,
    AccessGroupId: String = null,
    AuthorizeAllGroups: js.UndefOr[Boolean] = js.undefined,
    ClientToken: String = null,
    Description: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): AuthorizeClientVpnIngressRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any], TargetNetworkCidr = TargetNetworkCidr.asInstanceOf[js.Any])
    if (AccessGroupId != null) __obj.updateDynamic("AccessGroupId")(AccessGroupId.asInstanceOf[js.Any])
    if (!js.isUndefined(AuthorizeAllGroups)) __obj.updateDynamic("AuthorizeAllGroups")(AuthorizeAllGroups.get.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeClientVpnIngressRequest]
  }
}

