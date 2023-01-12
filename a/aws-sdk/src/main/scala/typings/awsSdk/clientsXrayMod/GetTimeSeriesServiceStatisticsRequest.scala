package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTimeSeriesServiceStatisticsRequest extends StObject {
  
  /**
    * The end of the time frame for which to aggregate statistics.
    */
  var EndTime: js.Date
  
  /**
    * A filter expression defining entities that will be aggregated for statistics. Supports ID, service, and edge functions. If no selector expression is specified, edge statistics are returned. 
    */
  var EntitySelectorExpression: js.UndefOr[typings.awsSdk.clientsXrayMod.EntitySelectorExpression] = js.undefined
  
  /**
    * The forecasted high and low fault count values. Forecast enabled requests require the EntitySelectorExpression ID be provided.
    */
  var ForecastStatistics: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the group for which to pull statistics from.
    */
  var GroupARN: js.UndefOr[typings.awsSdk.clientsXrayMod.GroupARN] = js.undefined
  
  /**
    * The case-sensitive name of the group for which to pull statistics from.
    */
  var GroupName: js.UndefOr[typings.awsSdk.clientsXrayMod.GroupName] = js.undefined
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Aggregation period in seconds.
    */
  var Period: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The start of the time frame for which to aggregate statistics.
    */
  var StartTime: js.Date
}
object GetTimeSeriesServiceStatisticsRequest {
  
  inline def apply(EndTime: js.Date, StartTime: js.Date): GetTimeSeriesServiceStatisticsRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTimeSeriesServiceStatisticsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTimeSeriesServiceStatisticsRequest] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEntitySelectorExpression(value: EntitySelectorExpression): Self = StObject.set(x, "EntitySelectorExpression", value.asInstanceOf[js.Any])
    
    inline def setEntitySelectorExpressionUndefined: Self = StObject.set(x, "EntitySelectorExpression", js.undefined)
    
    inline def setForecastStatistics(value: NullableBoolean): Self = StObject.set(x, "ForecastStatistics", value.asInstanceOf[js.Any])
    
    inline def setForecastStatisticsUndefined: Self = StObject.set(x, "ForecastStatistics", js.undefined)
    
    inline def setGroupARN(value: GroupARN): Self = StObject.set(x, "GroupARN", value.asInstanceOf[js.Any])
    
    inline def setGroupARNUndefined: Self = StObject.set(x, "GroupARN", js.undefined)
    
    inline def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPeriod(value: NullableInteger): Self = StObject.set(x, "Period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "Period", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
