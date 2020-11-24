package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptDirectConnectGatewayAssociationProposalRequest extends js.Object {
  
  /**
    * The ID of the AWS account that owns the virtual private gateway or transit gateway.
    */
  var associatedGatewayOwnerAccount: OwnerAccount = js.native
  
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: DirectConnectGatewayId = js.native
  
  /**
    * Overrides the Amazon VPC prefixes advertised to the Direct Connect gateway. For information about how to set the prefixes, see Allowed Prefixes in the AWS Direct Connect User Guide.
    */
  var overrideAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.native
  
  /**
    * The ID of the request proposal.
    */
  var proposalId: DirectConnectGatewayAssociationProposalId = js.native
}
object AcceptDirectConnectGatewayAssociationProposalRequest {
  
  @scala.inline
  def apply(
    associatedGatewayOwnerAccount: OwnerAccount,
    directConnectGatewayId: DirectConnectGatewayId,
    proposalId: DirectConnectGatewayAssociationProposalId
  ): AcceptDirectConnectGatewayAssociationProposalRequest = {
    val __obj = js.Dynamic.literal(associatedGatewayOwnerAccount = associatedGatewayOwnerAccount.asInstanceOf[js.Any], directConnectGatewayId = directConnectGatewayId.asInstanceOf[js.Any], proposalId = proposalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptDirectConnectGatewayAssociationProposalRequest]
  }
  
  @scala.inline
  implicit class AcceptDirectConnectGatewayAssociationProposalRequestOps[Self <: AcceptDirectConnectGatewayAssociationProposalRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssociatedGatewayOwnerAccount(value: OwnerAccount): Self = this.set("associatedGatewayOwnerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = this.set("directConnectGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalId(value: DirectConnectGatewayAssociationProposalId): Self = this.set("proposalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideAllowedPrefixesToDirectConnectGatewayVarargs(value: RouteFilterPrefix*): Self = this.set("overrideAllowedPrefixesToDirectConnectGateway", js.Array(value :_*))
    
    @scala.inline
    def setOverrideAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = this.set("overrideAllowedPrefixesToDirectConnectGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideAllowedPrefixesToDirectConnectGateway: Self = this.set("overrideAllowedPrefixesToDirectConnectGateway", js.undefined)
  }
}
