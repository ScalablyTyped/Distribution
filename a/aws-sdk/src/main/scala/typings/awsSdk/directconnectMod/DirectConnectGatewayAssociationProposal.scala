package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectConnectGatewayAssociationProposal extends StObject {
  
  /**
    * Information about the associated gateway.
    */
  var associatedGateway: js.UndefOr[AssociatedGateway] = js.undefined
  
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined
  
  /**
    * The ID of the AWS account that owns the Direct Connect gateway.
    */
  var directConnectGatewayOwnerAccount: js.UndefOr[OwnerAccount] = js.undefined
  
  /**
    * The existing Amazon VPC prefixes advertised to the Direct Connect gateway.
    */
  var existingAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined
  
  /**
    * The ID of the association proposal.
    */
  var proposalId: js.UndefOr[DirectConnectGatewayAssociationProposalId] = js.undefined
  
  /**
    * The state of the proposal. The following are possible values:    accepted: The proposal has been accepted. The Direct Connect gateway association is available to use in this state.    deleted: The proposal has been deleted by the owner that made the proposal. The Direct Connect gateway association cannot be used in this state.    requested: The proposal has been requested. The Direct Connect gateway association cannot be used in this state.  
    */
  var proposalState: js.UndefOr[DirectConnectGatewayAssociationProposalState] = js.undefined
  
  /**
    * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
    */
  var requestedAllowedPrefixesToDirectConnectGateway: js.UndefOr[RouteFilterPrefixList] = js.undefined
}
object DirectConnectGatewayAssociationProposal {
  
  @scala.inline
  def apply(): DirectConnectGatewayAssociationProposal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectConnectGatewayAssociationProposal]
  }
  
  @scala.inline
  implicit class DirectConnectGatewayAssociationProposalMutableBuilder[Self <: DirectConnectGatewayAssociationProposal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociatedGateway(value: AssociatedGateway): Self = StObject.set(x, "associatedGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedGatewayUndefined: Self = StObject.set(x, "associatedGateway", js.undefined)
    
    @scala.inline
    def setDirectConnectGatewayId(value: DirectConnectGatewayId): Self = StObject.set(x, "directConnectGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectGatewayIdUndefined: Self = StObject.set(x, "directConnectGatewayId", js.undefined)
    
    @scala.inline
    def setDirectConnectGatewayOwnerAccount(value: OwnerAccount): Self = StObject.set(x, "directConnectGatewayOwnerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectGatewayOwnerAccountUndefined: Self = StObject.set(x, "directConnectGatewayOwnerAccount", js.undefined)
    
    @scala.inline
    def setExistingAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = StObject.set(x, "existingAllowedPrefixesToDirectConnectGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExistingAllowedPrefixesToDirectConnectGatewayUndefined: Self = StObject.set(x, "existingAllowedPrefixesToDirectConnectGateway", js.undefined)
    
    @scala.inline
    def setExistingAllowedPrefixesToDirectConnectGatewayVarargs(value: RouteFilterPrefix*): Self = StObject.set(x, "existingAllowedPrefixesToDirectConnectGateway", js.Array(value :_*))
    
    @scala.inline
    def setProposalId(value: DirectConnectGatewayAssociationProposalId): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalIdUndefined: Self = StObject.set(x, "proposalId", js.undefined)
    
    @scala.inline
    def setProposalState(value: DirectConnectGatewayAssociationProposalState): Self = StObject.set(x, "proposalState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalStateUndefined: Self = StObject.set(x, "proposalState", js.undefined)
    
    @scala.inline
    def setRequestedAllowedPrefixesToDirectConnectGateway(value: RouteFilterPrefixList): Self = StObject.set(x, "requestedAllowedPrefixesToDirectConnectGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedAllowedPrefixesToDirectConnectGatewayUndefined: Self = StObject.set(x, "requestedAllowedPrefixesToDirectConnectGateway", js.undefined)
    
    @scala.inline
    def setRequestedAllowedPrefixesToDirectConnectGatewayVarargs(value: RouteFilterPrefix*): Self = StObject.set(x, "requestedAllowedPrefixesToDirectConnectGateway", js.Array(value :_*))
  }
}
