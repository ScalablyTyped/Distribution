package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDirectConnectGatewayAssociationProposalRequest extends js.Object {
  
  /**
    * The ID of the proposal.
    */
  var proposalId: DirectConnectGatewayAssociationProposalId = js.native
}
object DeleteDirectConnectGatewayAssociationProposalRequest {
  
  @scala.inline
  def apply(proposalId: DirectConnectGatewayAssociationProposalId): DeleteDirectConnectGatewayAssociationProposalRequest = {
    val __obj = js.Dynamic.literal(proposalId = proposalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDirectConnectGatewayAssociationProposalRequest]
  }
  
  @scala.inline
  implicit class DeleteDirectConnectGatewayAssociationProposalRequestOps[Self <: DeleteDirectConnectGatewayAssociationProposalRequest] (val x: Self) extends AnyVal {
    
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
    def setProposalId(value: DirectConnectGatewayAssociationProposalId): Self = this.set("proposalId", value.asInstanceOf[js.Any])
  }
}
