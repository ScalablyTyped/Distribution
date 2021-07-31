package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcEndpointConnectionNotificationsRequest extends StObject {
  
  /**
    * The ID of the notification.
    */
  var ConnectionNotificationId: js.UndefOr[typings.awsSdk.ec2Mod.ConnectionNotificationId] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters.    connection-notification-arn - The ARN of the SNS topic for the notification.    connection-notification-id - The ID of the notification.    connection-notification-state - The state of the notification (Enabled | Disabled).    connection-notification-type - The type of notification (Topic).    service-id - The ID of the endpoint service.    vpc-endpoint-id - The ID of the VPC endpoint.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another request with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeVpcEndpointConnectionNotificationsRequest {
  
  @scala.inline
  def apply(): DescribeVpcEndpointConnectionNotificationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcEndpointConnectionNotificationsRequest]
  }
  
  @scala.inline
  implicit class DescribeVpcEndpointConnectionNotificationsRequestMutableBuilder[Self <: DescribeVpcEndpointConnectionNotificationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionNotificationId(value: ConnectionNotificationId): Self = StObject.set(x, "ConnectionNotificationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionNotificationIdUndefined: Self = StObject.set(x, "ConnectionNotificationId", js.undefined)
    
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
    def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
