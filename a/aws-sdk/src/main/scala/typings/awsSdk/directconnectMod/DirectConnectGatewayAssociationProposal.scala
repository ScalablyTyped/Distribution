package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectConnectGatewayAssociationProposal extends js.Object {
  
  /**
    * Information about the associated gateway.
    */
  var associatedGateway: js.UndefOr[AssociatedGateway] = js.native
  
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.native
  
  /**
    * The ID of the AWS account that owns the Direct Connect gateway.
    */
  var directConnectGatewayOwnerAccount: js.UndefOr[OwnerAccount] = js.native
  
  /**
    * The existing Amazon VPC prefixes advertised to the Direct Connect gateway.
    */
  var existingAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.native
  
  /**
    * The ID of the association proposal.
    */
  var proposalId: js.UndefOr[DirectConnectGatewayAssociationProposalId] = js.native
  
  /**
    * The state of the proposal. The following are possible values:    accepted: The proposal has been accepted. The Direct Connect gateway association is available to use in this state.    deleted: The proposal has been deleted by the owner that made the proposal. The Direct Connect gateway association cannot be used in this state.    requested: The proposal has been requested. The Direct Connect gateway association cannot be used in this state.  
    */
  var proposalState: js.UndefOr[DirectConnectGatewayAssociationProposalState] = js.native
  
  /**
    * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
    */
  var requestedAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.native
}
object DirectConnectGatewayAssociationProposal {
  
  @scala.inline
  def apply(): DirectConnectGatewayAssociationProposal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectConnectGatewayAssociationProposal]
  }
  
  @scala.inline
  implicit class DirectConnectGatewayAssociationProposalOps[Self <: DirectConnectGatewayAssociationProposal] (val x: Self) extends AnyVal {
    
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
    def setAssociatedGateway(value: AssociatedGateway): Self = this.set("associatedGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatedGateway: Self = this.set("associatedGateway", js.undefined)
    
    @scala.inline
    def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = this.set("directConnectGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectConnectGatewayId: Self = this.set("directConnectGatewayId", js.undefined)
    
    @scala.inline
    def setDirectConnectGatewayOwnerAccount(value: OwnerAccount): Self = this.set("directConnectGatewayOwnerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectConnectGatewayOwnerAccount: Self = this.set("directConnectGatewayOwnerAccount", js.undefined)
    
    @scala.inline
    def setExistingAllowedPrefixesToDirectConnectGatewayVarargs(value: RouteFilterPrefix*): Self = this.set("existingAllowedPrefixesToDirectConnectGateway", js.Array(value :_*))
    
    @scala.inline
    def setExistingAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = this.set("existingAllowedPrefixesToDirectConnectGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExistingAllowedPrefixesToDirectConnectGateway: Self = this.set("existingAllowedPrefixesToDirectConnectGateway", js.undefined)
    
    @scala.inline
    def setProposalId(value: DirectConnectGatewayAssociationProposalId): Self = this.set("proposalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProposalId: Self = this.set("proposalId", js.undefined)
    
    @scala.inline
    def setProposalState(value: DirectConnectGatewayAssociationProposalState): Self = this.set("proposalState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProposalState: Self = this.set("proposalState", js.undefined)
    
    @scala.inline
    def setRequestedAllowedPrefixesToDirectConnectGatewayVarargs(value: RouteFilterPrefix*): Self = this.set("requestedAllowedPrefixesToDirectConnectGateway", js.Array(value :_*))
    
    @scala.inline
    def setRequestedAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = this.set("requestedAllowedPrefixesToDirectConnectGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedAllowedPrefixesToDirectConnectGateway: Self = this.set("requestedAllowedPrefixesToDirectConnectGateway", js.undefined)
  }
}
