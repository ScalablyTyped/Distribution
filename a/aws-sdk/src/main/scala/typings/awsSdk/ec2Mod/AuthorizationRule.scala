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
  def apply(): AuthorizationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationRule]
  }
  @scala.inline
  implicit class AuthorizationRuleOps[Self <: AuthorizationRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessAll(value: Boolean): Self = this.set("AccessAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessAll: Self = this.set("AccessAll", js.undefined)
    @scala.inline
    def setClientVpnEndpointId(value: String): Self = this.set("ClientVpnEndpointId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientVpnEndpointId: Self = this.set("ClientVpnEndpointId", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDestinationCidr(value: String): Self = this.set("DestinationCidr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationCidr: Self = this.set("DestinationCidr", js.undefined)
    @scala.inline
    def setGroupId(value: String): Self = this.set("GroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupId: Self = this.set("GroupId", js.undefined)
    @scala.inline
    def setStatus(value: ClientVpnAuthorizationRuleStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

