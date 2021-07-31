package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSpotFleetRequestHistoryRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of events to describe. By default, all events are described.
    */
  var EventType: js.UndefOr[typings.awsSdk.ec2Mod.EventType] = js.undefined
  
  /**
    * The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default value is 1000. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[DescribeSpotFleetRequestHistoryMaxResults] = js.undefined
  
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: typings.awsSdk.ec2Mod.SpotFleetRequestId
  
  /**
    * The starting date and time for the events, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var StartTime: DateTime
}
object DescribeSpotFleetRequestHistoryRequest {
  
  @scala.inline
  def apply(SpotFleetRequestId: SpotFleetRequestId, StartTime: DateTime): DescribeSpotFleetRequestHistoryRequest = {
    val __obj = js.Dynamic.literal(SpotFleetRequestId = SpotFleetRequestId.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSpotFleetRequestHistoryRequest]
  }
  
  @scala.inline
  implicit class DescribeSpotFleetRequestHistoryRequestMutableBuilder[Self <: DescribeSpotFleetRequestHistoryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setEventType(value: EventType): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeUndefined: Self = StObject.set(x, "EventType", js.undefined)
    
    @scala.inline
    def setMaxResults(value: DescribeSpotFleetRequestHistoryMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSpotFleetRequestId(value: SpotFleetRequestId): Self = StObject.set(x, "SpotFleetRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: DateTime): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
