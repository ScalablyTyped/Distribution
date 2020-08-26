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
  def apply(): DeleteDirectConnectGatewayAssociationProposalResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDirectConnectGatewayAssociationProposalResult]
  }
  @scala.inline
  implicit class DeleteDirectConnectGatewayAssociationProposalResultOps[Self <: DeleteDirectConnectGatewayAssociationProposalResult] (val x: Self) extends AnyVal {
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
    def setDirectConnectGatewayAssociationProposal(value: DirectConnectGatewayAssociationProposal): Self = this.set("directConnectGatewayAssociationProposal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectConnectGatewayAssociationProposal: Self = this.set("directConnectGatewayAssociationProposal", js.undefined)
  }
  
}

