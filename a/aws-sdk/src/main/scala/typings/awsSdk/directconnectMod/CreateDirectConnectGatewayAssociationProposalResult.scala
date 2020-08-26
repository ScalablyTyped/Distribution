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
  def apply(): CreateDirectConnectGatewayAssociationProposalResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDirectConnectGatewayAssociationProposalResult]
  }
  @scala.inline
  implicit class CreateDirectConnectGatewayAssociationProposalResultOps[Self <: CreateDirectConnectGatewayAssociationProposalResult] (val x: Self) extends AnyVal {
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

