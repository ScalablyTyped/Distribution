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
  def apply(
    directConnectGatewayAssociationProposals: DirectConnectGatewayAssociationProposalList = null,
    nextToken: PaginationToken = null
  ): DescribeDirectConnectGatewayAssociationProposalsResult = {
    val __obj = js.Dynamic.literal()
    if (directConnectGatewayAssociationProposals != null) __obj.updateDynamic("directConnectGatewayAssociationProposals")(directConnectGatewayAssociationProposals.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDirectConnectGatewayAssociationProposalsResult]
  }
}

