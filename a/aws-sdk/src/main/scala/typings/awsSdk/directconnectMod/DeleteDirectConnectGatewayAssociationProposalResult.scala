package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDirectConnectGatewayAssociationProposalResult extends js.Object {
  /**
    * The ID of the associated gateway.
    */
  var directConnectGatewayAssociationProposal: js.UndefOr[DirectConnectGatewayAssociationProposal] = js.native
}

object DeleteDirectConnectGatewayAssociationProposalResult {
  @scala.inline
  def apply(directConnectGatewayAssociationProposal: DirectConnectGatewayAssociationProposal = null): DeleteDirectConnectGatewayAssociationProposalResult = {
    val __obj = js.Dynamic.literal()
    if (directConnectGatewayAssociationProposal != null) __obj.updateDynamic("directConnectGatewayAssociationProposal")(directConnectGatewayAssociationProposal.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDirectConnectGatewayAssociationProposalResult]
  }
}

