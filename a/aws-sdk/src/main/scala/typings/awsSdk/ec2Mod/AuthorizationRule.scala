package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizationRule extends js.Object {
  /**
    * Indicates whether the authorization rule grants access to all clients.
    */
  var AccessAll: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the Client VPN endpoint with which the authorization rule is associated.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.native
  /**
    * A brief description of the authorization rule.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The IPv4 address range, in CIDR notation, of the network to which the authorization rule applies.
    */
  var DestinationCidr: js.UndefOr[String] = js.native
  /**
    * The ID of the Active Directory group to which the authorization rule grants access.
    */
  var GroupId: js.UndefOr[String] = js.native
  /**
    * The current state of the authorization rule.
    */
  var Status: js.UndefOr[ClientVpnAuthorizationRuleStatus] = js.native
}

object AuthorizationRule {
  @scala.inline
  def apply(
    AccessAll: js.UndefOr[Boolean] = js.undefined,
    ClientVpnEndpointId: String = null,
    Description: String = null,
    DestinationCidr: String = null,
    GroupId: String = null,
    Status: ClientVpnAuthorizationRuleStatus = null
  ): AuthorizationRule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AccessAll)) __obj.updateDynamic("AccessAll")(AccessAll.get.asInstanceOf[js.Any])
    if (ClientVpnEndpointId != null) __obj.updateDynamic("ClientVpnEndpointId")(ClientVpnEndpointId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DestinationCidr != null) __obj.updateDynamic("DestinationCidr")(DestinationCidr.asInstanceOf[js.Any])
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationRule]
  }
}

