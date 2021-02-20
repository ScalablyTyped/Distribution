package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDirectConnectGatewayAssociationProposalResult extends StObject {
  
  /**
    * Information about the Direct Connect gateway proposal.
    */
  var directConnectGatewayAssociationProposal: js.UndefOr[DirectConnectGatewayAssociationProposal] = js.native
}
object CreateDirectConnectGatewayAssociationProposalResult {
  
  @scala.inline
  def apply(): CreateDirectConnectGatewayAssociationProposalResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDirectConnectGatewayAssociationProposalResult]
  }
  
  @scala.inline
  implicit class CreateDirectConnectGatewayAssociationProposalResultMutableBuilder[Self <: CreateDirectConnectGatewayAssociationProposalResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectConnectGatewayAssociationProposal(value: DirectConnectGatewayAssociationProposal): Self = StObject.set(x, "directConnectGatewayAssociationProposal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectConnectGatewayAssociationProposalUndefined: Self = StObject.set(x, "directConnectGatewayAssociationProposal", js.undefined)
  }
}
