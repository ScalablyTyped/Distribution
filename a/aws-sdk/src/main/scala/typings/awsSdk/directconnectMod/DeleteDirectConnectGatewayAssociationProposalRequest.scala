package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDirectConnectGatewayAssociationProposalRequest extends StObject {
  
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
  implicit class DeleteDirectConnectGatewayAssociationProposalRequestMutableBuilder[Self <: DeleteDirectConnectGatewayAssociationProposalRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProposalId(value: DirectConnectGatewayAssociationProposalId): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
  }
}
