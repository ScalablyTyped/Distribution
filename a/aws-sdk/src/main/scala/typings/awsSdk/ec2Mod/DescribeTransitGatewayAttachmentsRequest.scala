package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTransitGatewayAttachmentsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters. The possible values are:    association.state - The state of the association (associating | associated | disassociating).    association.transit-gateway-route-table-id - The ID of the route table for the transit gateway.    resource-id - The ID of the resource.    resource-owner-id - The ID of the Amazon Web Services account that owns the resource.    resource-type - The resource type. Valid values are vpc | vpn | direct-connect-gateway | peering | connect.    state - The state of the attachment. Valid values are available | deleted | deleting | failed | failing | initiatingRequest | modifying | pendingAcceptance | pending | rollingBack | rejected | rejecting.    transit-gateway-attachment-id - The ID of the attachment.    transit-gateway-id - The ID of the transit gateway.    transit-gateway-owner-id - The ID of the Amazon Web Services account that owns the transit gateway.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[TransitGatewayMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The IDs of the attachments.
    */
  var TransitGatewayAttachmentIds: js.UndefOr[TransitGatewayAttachmentIdStringList] = js.undefined
}
object DescribeTransitGatewayAttachmentsRequest {
  
  inline def apply(): DescribeTransitGatewayAttachmentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTransitGatewayAttachmentsRequest]
  }
  
  extension [Self <: DescribeTransitGatewayAttachmentsRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: TransitGatewayMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTransitGatewayAttachmentIds(value: TransitGatewayAttachmentIdStringList): Self = StObject.set(x, "TransitGatewayAttachmentIds", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayAttachmentIdsUndefined: Self = StObject.set(x, "TransitGatewayAttachmentIds", js.undefined)
    
    inline def setTransitGatewayAttachmentIdsVarargs(value: TransitGatewayAttachmentId*): Self = StObject.set(x, "TransitGatewayAttachmentIds", js.Array(value*))
  }
}
