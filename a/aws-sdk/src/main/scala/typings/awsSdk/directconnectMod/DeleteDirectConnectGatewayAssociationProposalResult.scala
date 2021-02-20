package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDirectConnectGatewayAssociationProposalResult extends StObject {
  
  /**
    * The ID of the associated gateway.
    */
  var directConnectGatewayAssociationProposal: js.UndefOr[DirectConnectGatewayAssociationProposal] = js.native
}
object DeleteDirectConnectGatewayAssociationProposalResult {
  
  @scala.inline
  def apply(): DeleteDirectConnectGatewayAssociationProposalResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDirectConnectGatewayAssociationProposalResult]
  }
  
  @scala.inline
  implicit class DeleteDirectConnectGatewayAssociationProposalResultMutableBuilder[Self <: DeleteDirectConnectGatewayAssociationProposalResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectConnectGatewayAssociationProposal(value: DirectConnectGatewayAssociationProposal): Self = StObject.set(x, "directConnectGatewayAssociationProposal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectGatewayAssociationProposalUndefined: Self = StObject.set(x, "directConnectGatewayAssociationProposal", js.undefined)
  }
}
