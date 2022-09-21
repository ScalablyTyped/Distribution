package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSpotFleetRequestHistoryResponse extends StObject {
  
  /**
    * Information about the events in the history of the Spot Fleet request.
    */
  var HistoryRecords: js.UndefOr[typings.awsSdk.ec2Mod.HistoryRecords] = js.undefined
  
  /**
    * The last date and time for the events, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). All records up to this time were retrieved. If nextToken indicates that there are more results, this value is not present.
    */
  var LastEvaluatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The starting date and time for the events, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object DescribeSpotFleetRequestHistoryResponse {
  
  inline def apply(): DescribeSpotFleetRequestHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSpotFleetRequestHistoryResponse]
  }
  
  extension [Self <: DescribeSpotFleetRequestHistoryResponse](x: Self) {
    
    inline def setHistoryRecords(value: HistoryRecords): Self = StObject.set(x, "HistoryRecords", value.asInstanceOf[js.Any])
    
    inline def setHistoryRecordsUndefined: Self = StObject.set(x, "HistoryRecords", js.undefined)
    
    inline def setHistoryRecordsVarargs(value: HistoryRecord*): Self = StObject.set(x, "HistoryRecords", js.Array(value*))
    
    inline def setLastEvaluatedTime(value: js.Date): Self = StObject.set(x, "LastEvaluatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastEvaluatedTimeUndefined: Self = StObject.set(x, "LastEvaluatedTime", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSpotFleetRequestId(value: String): Self = StObject.set(x, "SpotFleetRequestId", value.asInstanceOf[js.Any])
    
    inline def setSpotFleetRequestIdUndefined: Self = StObject.set(x, "SpotFleetRequestId", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
