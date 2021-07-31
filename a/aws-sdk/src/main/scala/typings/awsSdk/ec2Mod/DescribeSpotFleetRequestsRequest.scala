package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSpotFleetRequestsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default value is 1000. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The IDs of the Spot Fleet requests.
    */
  var SpotFleetRequestIds: js.UndefOr[SpotFleetRequestIdList] = js.undefined
}
object DescribeSpotFleetRequestsRequest {
  
  @scala.inline
  def apply(): DescribeSpotFleetRequestsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSpotFleetRequestsRequest]
  }
  
  @scala.inline
  implicit class DescribeSpotFleetRequestsRequestMutableBuilder[Self <: DescribeSpotFleetRequestsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSpotFleetRequestIds(value: SpotFleetRequestIdList): Self = StObject.set(x, "SpotFleetRequestIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotFleetRequestIdsUndefined: Self = StObject.set(x, "SpotFleetRequestIds", js.undefined)
    
    @scala.inline
    def setSpotFleetRequestIdsVarargs(value: SpotFleetRequestId*): Self = StObject.set(x, "SpotFleetRequestIds", js.Array(value :_*))
  }
}
