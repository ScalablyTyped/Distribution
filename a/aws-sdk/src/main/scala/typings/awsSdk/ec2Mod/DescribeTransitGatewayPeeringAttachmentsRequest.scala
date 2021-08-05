package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTransitGatewayPeeringAttachmentsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters. The possible values are:    transit-gateway-attachment-id - The ID of the transit gateway attachment.    local-owner-id - The ID of your AWS account.    remote-owner-id - The ID of the AWS account in the remote Region that owns the transit gateway.    state - The state of the peering attachment. Valid values are available | deleted | deleting | failed | failing | initiatingRequest | modifying | pendingAcceptance | pending | rollingBack | rejected | rejecting).    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources that have a tag with a specific key, regardless of the tag value.    transit-gateway-id - The ID of the transit gateway.  
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
    * One or more IDs of the transit gateway peering attachments.
    */
  var TransitGatewayAttachmentIds: js.UndefOr[TransitGatewayAttachmentIdStringList] = js.undefined
}
object DescribeTransitGatewayPeeringAttachmentsRequest {
  
  inline def apply(): DescribeTransitGatewayPeeringAttachmentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTransitGatewayPeeringAttachmentsRequest]
  }
  
  extension [Self <: DescribeTransitGatewayPeeringAttachmentsRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    inline def setMaxResults(value: TransitGatewayMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTransitGatewayAttachmentIds(value: TransitGatewayAttachmentIdStringList): Self = StObject.set(x, "TransitGatewayAttachmentIds", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayAttachmentIdsUndefined: Self = StObject.set(x, "TransitGatewayAttachmentIds", js.undefined)
    
    inline def setTransitGatewayAttachmentIdsVarargs(value: TransitGatewayAttachmentId*): Self = StObject.set(x, "TransitGatewayAttachmentIds", js.Array(value :_*))
  }
}
