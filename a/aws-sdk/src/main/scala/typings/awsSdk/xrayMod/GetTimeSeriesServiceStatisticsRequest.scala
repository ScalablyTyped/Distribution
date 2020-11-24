package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTimeSeriesServiceStatisticsRequest extends js.Object {
  
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
  implicit class GetTimeSeriesServiceStatisticsRequestOps[Self <: GetTimeSeriesServiceStatisticsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitySelectorExpression(value: EntitySelectorExpression): Self = this.set("EntitySelectorExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntitySelectorExpression: Self = this.set("EntitySelectorExpression", js.undefined)
    
    @scala.inline
    def setForecastStatistics(value: NullableBoolean): Self = this.set("ForecastStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForecastStatistics: Self = this.set("ForecastStatistics", js.undefined)
    
    @scala.inline
    def setGroupARN(value: GroupARN): Self = this.set("GroupARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupARN: Self = this.set("GroupARN", js.undefined)
    
    @scala.inline
    def setGroupName(value: GroupName): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setPeriod(value: NullableInteger): Self = this.set("Period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("Period", js.undefined)
  }
}
