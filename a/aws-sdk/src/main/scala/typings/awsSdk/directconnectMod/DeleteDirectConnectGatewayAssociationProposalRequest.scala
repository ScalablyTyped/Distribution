package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDirectConnectGatewayAssociationProposalRequest extends StObject {
  
  /**
    * The ID of the proposal.
    */
  var proposalId: DirectConnectGatewayAssociationProposalId
}
object DeleteDirectConnectGatewayAssociationProposalRequest {
  
  inline def apply(proposalId: DirectConnectGatewayAssociationProposalId): DeleteDirectConnectGatewayAssociationProposalRequest = {
    val __obj = js.Dynamic.literal(proposalId = proposalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDirectConnectGatewayAssociationProposalRequest]
  }
  
  extension [Self <: DeleteDirectConnectGatewayAssociationProposalRequest](x: Self) {
    
    inline def setProposalId(value: DirectConnectGatewayAssociationProposalId): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
  }
}
