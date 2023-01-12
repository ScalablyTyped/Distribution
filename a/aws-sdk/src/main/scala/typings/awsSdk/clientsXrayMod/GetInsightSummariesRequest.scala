package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInsightSummariesRequest extends StObject {
  
  /**
    * The end of the time frame in which the insights ended. The end time can't be more than 30 days old.
    */
  var EndTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the group. Required if the GroupName isn't provided.
    */
  var GroupARN: js.UndefOr[typings.awsSdk.clientsXrayMod.GroupARN] = js.undefined
  
  /**
    * The name of the group. Required if the GroupARN isn't provided.
    */
  var GroupName: js.UndefOr[typings.awsSdk.clientsXrayMod.GroupName] = js.undefined
  
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
  var StartTime: js.Date
  
  /**
    * The list of insight states. 
    */
  var States: js.UndefOr[InsightStateList] = js.undefined
}
object GetInsightSummariesRequest {
  
  inline def apply(EndTime: js.Date, StartTime: js.Date): GetInsightSummariesRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInsightSummariesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInsightSummariesRequest] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setGroupARN(value: GroupARN): Self = StObject.set(x, "GroupARN", value.asInstanceOf[js.Any])
    
    inline def setGroupARNUndefined: Self = StObject.set(x, "GroupARN", js.undefined)
    
    inline def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setMaxResults(value: GetInsightSummariesMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStates(value: InsightStateList): Self = StObject.set(x, "States", value.asInstanceOf[js.Any])
    
    inline def setStatesUndefined: Self = StObject.set(x, "States", js.undefined)
    
    inline def setStatesVarargs(value: InsightState*): Self = StObject.set(x, "States", js.Array(value*))
  }
}
