package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTransitGatewayAttachmentsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more filters. The possible values are:    association.state - The state of the association (associating | associated | disassociating).    association.transit-gateway-route-table-id - The ID of the route table for the transit gateway.    resource-id - The ID of the resource.    resource-owner-id - The ID of the AWS account that owns the resource.    resource-type - The resource type (vpc | vpn).    state - The state of the attachment (available | deleted | deleting | failed | modifying | pendingAcceptance | pending | rollingBack | rejected | rejecting).    transit-gateway-attachment-id - The ID of the attachment.    transit-gateway-id - The ID of the transit gateway.    transit-gateway-owner-id - The ID of the AWS account that owns the transit gateway.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[TransitGatewayMaxResults] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The IDs of the attachments.
    */
  var TransitGatewayAttachmentIds: js.UndefOr[TransitGatewayAttachmentIdStringList] = js.native
}

object DescribeTransitGatewayAttachmentsRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Filters: FilterList = null,
    MaxResults: js.UndefOr[TransitGatewayMaxResults] = js.undefined,
    NextToken: String = null,
    TransitGatewayAttachmentIds: TransitGatewayAttachmentIdStringList = null
  ): DescribeTransitGatewayAttachmentsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TransitGatewayAttachmentIds != null) __obj.updateDynamic("TransitGatewayAttachmentIds")(TransitGatewayAttachmentIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTransitGatewayAttachmentsRequest]
  }
}

