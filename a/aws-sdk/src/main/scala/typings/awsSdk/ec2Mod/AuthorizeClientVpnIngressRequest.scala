package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizeClientVpnIngressRequest extends js.Object {
  
  /**
    * The ID of the group to grant access to, for example, the Active Directory group or identity provider (IdP) group. Required if AuthorizeAllGroups is false or not specified.
    */
  var AccessGroupId: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether to grant access to all clients. Specify true to grant all clients who successfully establish a VPN connection access to the network. Must be set to true if AccessGroupId is not specified.
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
  def apply(ClientVpnEndpointId: ClientVpnEndpointId, TargetNetworkCidr: String): AuthorizeClientVpnIngressRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any], TargetNetworkCidr = TargetNetworkCidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeClientVpnIngressRequest]
  }
  
  @scala.inline
  implicit class AuthorizeClientVpnIngressRequestOps[Self <: AuthorizeClientVpnIngressRequest] (val x: Self) extends AnyVal {
    
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
    def setClientVpnEndpointId(value: ClientVpnEndpointId): Self = this.set("ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNetworkCidr(value: String): Self = this.set("TargetNetworkCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessGroupId(value: String): Self = this.set("AccessGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessGroupId: Self = this.set("AccessGroupId", js.undefined)
    
    @scala.inline
    def setAuthorizeAllGroups(value: Boolean): Self = this.set("AuthorizeAllGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizeAllGroups: Self = this.set("AuthorizeAllGroups", js.undefined)
    
    @scala.inline
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
}
