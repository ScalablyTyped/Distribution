package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDirectConnectGatewayAssociationsRequest extends js.Object {
  /**
    * The ID of the associated gateway.
    */
  var associatedGatewayId: js.UndefOr[AssociatedGatewayId] = js.native
  /**
    * The ID of the Direct Connect gateway association.
    */
  var associationId: js.UndefOr[DirectConnectGatewayAssociationId] = js.native
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.native
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value. If MaxResults is given a value larger than 100, only 100 results are returned.
    */
  var maxResults: js.UndefOr[MaxResultSetSize] = js.native
  /**
    * The token provided in the previous call to retrieve the next page.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The ID of the virtual private gateway.
    */
  var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.native
}

object DescribeDirectConnectGatewayAssociationsRequest {
  @scala.inline
  def apply(
    associatedGatewayId: AssociatedGatewayId = null,
    associationId: DirectConnectGatewayAssociationId = null,
    directConnectGatewayId: DirectConnectGatewayId = null,
    maxResults: Int | Double = null,
    nextToken: PaginationToken = null,
    virtualGatewayId: VirtualGatewayId = null
  ): DescribeDirectConnectGatewayAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    if (associatedGatewayId != null) __obj.updateDynamic("associatedGatewayId")(associatedGatewayId.asInstanceOf[js.Any])
    if (associationId != null) __obj.updateDynamic("associationId")(associationId.asInstanceOf[js.Any])
    if (directConnectGatewayId != null) __obj.updateDynamic("directConnectGatewayId")(directConnectGatewayId.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (virtualGatewayId != null) __obj.updateDynamic("virtualGatewayId")(virtualGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDirectConnectGatewayAssociationsRequest]
  }
}

