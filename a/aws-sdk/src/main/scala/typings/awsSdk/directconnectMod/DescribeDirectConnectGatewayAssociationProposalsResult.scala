package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDirectConnectGatewayAssociationProposalsResult extends js.Object {
  /**
    * Describes the Direct Connect gateway association proposals.
    */
  var directConnectGatewayAssociationProposals: js.UndefOr[DirectConnectGatewayAssociationProposalList] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object DescribeDirectConnectGatewayAssociationProposalsResult {
  @scala.inline
  def apply(): DescribeDirectConnectGatewayAssociationProposalsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDirectConnectGatewayAssociationProposalsResult]
  }
  @scala.inline
  implicit class DescribeDirectConnectGatewayAssociationProposalsResultOps[Self <: DescribeDirectConnectGatewayAssociationProposalsResult] (val x: Self) extends AnyVal {
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
    def setDirectConnectGatewayAssociationProposalsVarargs(value: DirectConnectGatewayAssociationProposal*): Self = this.set("directConnectGatewayAssociationProposals", js.Array(value :_*))
    @scala.inline
    def setDirectConnectGatewayAssociationProposals(value: DirectConnectGatewayAssociationProposalList): Self = this.set("directConnectGatewayAssociationProposals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectConnectGatewayAssociationProposals: Self = this.set("directConnectGatewayAssociationProposals", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

