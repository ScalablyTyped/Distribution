package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptDirectConnectGatewayAssociationProposalResult extends js.Object {
  var directConnectGatewayAssociation: js.UndefOr[DirectConnectGatewayAssociation] = js.native
}

object AcceptDirectConnectGatewayAssociationProposalResult {
  @scala.inline
  def apply(directConnectGatewayAssociation: DirectConnectGatewayAssociation = null): AcceptDirectConnectGatewayAssociationProposalResult = {
    val __obj = js.Dynamic.literal()
    if (directConnectGatewayAssociation != null) __obj.updateDynamic("directConnectGatewayAssociation")(directConnectGatewayAssociation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptDirectConnectGatewayAssociationProposalResult]
  }
}

