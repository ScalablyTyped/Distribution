package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInsightSummariesRequest extends StObject {
  
  /**
    * The end of the time frame in which the insights ended. The end time can't be more than 30 days old.
    */
  var EndTime: Timestamp
  
  /**
    * The Amazon Resource Name (ARN) of the group. Required if the GroupName isn't provided.
    */
  var GroupARN: js.UndefOr[typings.awsSdk.xrayMod.GroupARN] = js.undefined
  
  /**
    * The name of the group. Required if the GroupARN isn't provided.
    */
  var GroupName: js.UndefOr[typings.awsSdk.xrayMod.GroupName] = js.undefined
  
  /**
    * The maximum number of results to display.
    */
  var MaxResults: js.UndefOr[GetInsightSummariesMaxResults] = js.undefined
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The beginning of the time frame in which the insights started. The start time can't be more than 30 days old.
    */
  var StartTime: Timestamp
  
  /**
    * The list of insight states. 
    */
  var States: js.UndefOr[InsightStateList] = js.undefined
}
object GetInsightSummariesRequest {
  
  @scala.inline
  def apply(EndTime: Timestamp, StartTime: Timestamp): GetInsightSummariesRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInsightSummariesRequest]
  }
  
  @scala.inline
  implicit class GetInsightSummariesRequestMutableBuilder[Self <: GetInsightSummariesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupARN(value: GroupARN): Self = StObject.set(x, "GroupARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupARNUndefined: Self = StObject.set(x, "GroupARN", js.undefined)
    
    @scala.inline
    def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    @scala.inline
    def setMaxResults(value: GetInsightSummariesMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStates(value: InsightStateList): Self = StObject.set(x, "States", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatesUndefined: Self = StObject.set(x, "States", js.undefined)
    
    @scala.inline
    def setStatesVarargs(value: InsightState*): Self = StObject.set(x, "States", js.Array(value :_*))
  }
}
