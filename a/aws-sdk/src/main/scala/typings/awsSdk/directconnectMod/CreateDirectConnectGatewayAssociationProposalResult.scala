package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDirectConnectGatewayAssociationProposalResult extends js.Object {
  /**
    * Information about the Direct Connect gateway proposal.
    */
  var directConnectGatewayAssociationProposal: js.UndefOr[DirectConnectGatewayAssociationProposal] = js.native
}

object CreateDirectConnectGatewayAssociationProposalResult {
  @scala.inline
  def apply(directConnectGatewayAssociationProposal: DirectConnectGatewayAssociationProposal = null): CreateDirectConnectGatewayAssociationProposalResult = {
    val __obj = js.Dynamic.literal()
    if (directConnectGatewayAssociationProposal != null) __obj.updateDynamic("directConnectGatewayAssociationProposal")(directConnectGatewayAssociationProposal.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectConnectGatewayAssociationProposalResult]
  }
}

