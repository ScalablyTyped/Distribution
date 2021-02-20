package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTimeSeriesServiceStatisticsRequest extends StObject {
  
  /**
    * The end of the time frame for which to aggregate statistics.
    */
  var EndTime: Timestamp = js.native
  
  /**
    * A filter expression defining entities that will be aggregated for statistics. Supports ID, service, and edge functions. If no selector expression is specified, edge statistics are returned. 
    */
  var EntitySelectorExpression: js.UndefOr[typings.awsSdk.xrayMod.EntitySelectorExpression] = js.native
  
  /**
    * The forecasted high and low fault count values. Forecast enabled requests require the EntitySelectorExpression ID be provided.
    */
  var ForecastStatistics: js.UndefOr[NullableBoolean] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the group for which to pull statistics from.
    */
  var GroupARN: js.UndefOr[typings.awsSdk.xrayMod.GroupARN] = js.native
  
  /**
    * The case-sensitive name of the group for which to pull statistics from.
    */
  var GroupName: js.UndefOr[typings.awsSdk.xrayMod.GroupName] = js.native
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Aggregation period in seconds.
    */
  var Period: js.UndefOr[NullableInteger] = js.native
  
  /**
    * The start of the time frame for which to aggregate statistics.
    */
  var StartTime: Timestamp = js.native
}
object GetTimeSeriesServiceStatisticsRequest {
  
  @scala.inline
  def apply(EndTime: Timestamp, StartTime: Timestamp): GetTimeSeriesServiceStatisticsRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTimeSeriesServiceStatisticsRequest]
  }
  
  @scala.inline
  implicit class GetTimeSeriesServiceStatisticsRequestMutableBuilder[Self <: GetTimeSeriesServiceStatisticsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitySelectorExpression(value: EntitySelectorExpression): Self = StObject.set(x, "EntitySelectorExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitySelectorExpressionUndefined: Self = StObject.set(x, "EntitySelectorExpression", js.undefined)
    
    @scala.inline
    def setForecastStatistics(value: NullableBoolean): Self = StObject.set(x, "ForecastStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastStatisticsUndefined: Self = StObject.set(x, "ForecastStatistics", js.undefined)
    
    @scala.inline
    def setGroupARN(value: GroupARN): Self = StObject.set(x, "GroupARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupARNUndefined: Self = StObject.set(x, "GroupARN", js.undefined)
    
    @scala.inline
    def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPeriod(value: NullableInteger): Self = StObject.set(x, "Period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "Period", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
