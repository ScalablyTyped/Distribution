package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventsRequest extends StObject {
  
  /**
    * The number of minutes' worth of events to retrieve.
    */
  var Duration: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The end of the time interval for which to retrieve events, specified in ISO 8601 format.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. The value for MaxResults must be between 20 and 100.
    */
  var MaxResults: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the event source for which events will be returned. If not specified, then all sources are included in the response.
    */
  var SourceName: js.UndefOr[String] = js.undefined
  
  /**
    * The event source to retrieve events for. If no value is specified, all events are returned.
    */
  var SourceType: js.UndefOr[typings.awsSdk.daxMod.SourceType] = js.undefined
  
  /**
    * The beginning of the time interval to retrieve events for, specified in ISO 8601 format.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object DescribeEventsRequest {
  
  inline def apply(): DescribeEventsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventsRequest]
  }
  
  extension [Self <: DescribeEventsRequest](x: Self) {
    
    inline def setDuration(value: IntegerOptional): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setMaxResults(value: IntegerOptional): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSourceName(value: String): Self = StObject.set(x, "SourceName", value.asInstanceOf[js.Any])
    
    inline def setSourceNameUndefined: Self = StObject.set(x, "SourceName", js.undefined)
    
    inline def setSourceType(value: SourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
