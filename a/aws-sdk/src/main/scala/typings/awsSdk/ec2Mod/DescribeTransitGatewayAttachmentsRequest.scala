package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTransitGatewayAttachmentsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more filters. The possible values are:    association.state - The state of the association (associating | associated | disassociating).    association.transit-gateway-route-table-id - The ID of the route table for the transit gateway.    resource-id - The ID of the resource.    resource-owner-id - The ID of the AWS account that owns the resource.    resource-type - The resource type. Valid values are vpc | vpn | direct-connect-gateway | peering.    state - The state of the attachment. Valid values are available | deleted | deleting | failed | failing | initiatingRequest | modifying | pendingAcceptance | pending | rollingBack | rejected | rejecting.    transit-gateway-attachment-id - The ID of the attachment.    transit-gateway-id - The ID of the transit gateway.    transit-gateway-owner-id - The ID of the AWS account that owns the transit gateway.  
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
  def apply(): DescribeTransitGatewayAttachmentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTransitGatewayAttachmentsRequest]
  }
  
  @scala.inline
  implicit class DescribeTransitGatewayAttachmentsRequestMutableBuilder[Self <: DescribeTransitGatewayAttachmentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: TransitGatewayMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTransitGatewayAttachmentIds(value: TransitGatewayAttachmentIdStringList): Self = StObject.set(x, "TransitGatewayAttachmentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayAttachmentIdsUndefined: Self = StObject.set(x, "TransitGatewayAttachmentIds", js.undefined)
    
    @scala.inline
    def setTransitGatewayAttachmentIdsVarargs(value: TransitGatewayAttachmentId*): Self = StObject.set(x, "TransitGatewayAttachmentIds", js.Array(value :_*))
  }
}
