package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTraceSummariesRequest extends StObject {
  
  /**
    * The end of the time frame for which to retrieve traces.
    */
  var EndTime: js.Date
  
  /**
    * Specify a filter expression to retrieve trace summaries for services or requests that meet certain requirements.
    */
  var FilterExpression: js.UndefOr[typings.awsSdk.clientsXrayMod.FilterExpression] = js.undefined
  
  /**
    * Specify the pagination token returned by a previous request to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Set to true to get summaries for only a subset of available traces.
    */
  var Sampling: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * A parameter to indicate whether to enable sampling on trace summaries. Input parameters are Name and Value.
    */
  var SamplingStrategy: js.UndefOr[typings.awsSdk.clientsXrayMod.SamplingStrategy] = js.undefined
  
  /**
    * The start of the time frame for which to retrieve traces.
    */
  var StartTime: js.Date
  
  /**
    * A parameter to indicate whether to query trace summaries by TraceId or Event time.
    */
  var TimeRangeType: js.UndefOr[typings.awsSdk.clientsXrayMod.TimeRangeType] = js.undefined
}
object GetTraceSummariesRequest {
  
  inline def apply(EndTime: js.Date, StartTime: js.Date): GetTraceSummariesRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTraceSummariesRequest]
  }
  
  extension [Self <: GetTraceSummariesRequest](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setFilterExpression(value: FilterExpression): Self = StObject.set(x, "FilterExpression", value.asInstanceOf[js.Any])
    
    inline def setFilterExpressionUndefined: Self = StObject.set(x, "FilterExpression", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSampling(value: NullableBoolean): Self = StObject.set(x, "Sampling", value.asInstanceOf[js.Any])
    
    inline def setSamplingStrategy(value: SamplingStrategy): Self = StObject.set(x, "SamplingStrategy", value.asInstanceOf[js.Any])
    
    inline def setSamplingStrategyUndefined: Self = StObject.set(x, "SamplingStrategy", js.undefined)
    
    inline def setSamplingUndefined: Self = StObject.set(x, "Sampling", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setTimeRangeType(value: TimeRangeType): Self = StObject.set(x, "TimeRangeType", value.asInstanceOf[js.Any])
    
    inline def setTimeRangeTypeUndefined: Self = StObject.set(x, "TimeRangeType", js.undefined)
  }
}
