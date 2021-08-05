package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAttackStatisticsResponse extends StObject {
  
  /**
    * The data that describes the attacks detected during the time period.
    */
  var DataItems: AttackStatisticsDataList
  
  var TimeRange: typings.awsSdk.shieldMod.TimeRange
}
object DescribeAttackStatisticsResponse {
  
  inline def apply(DataItems: AttackStatisticsDataList, TimeRange: TimeRange): DescribeAttackStatisticsResponse = {
    val __obj = js.Dynamic.literal(DataItems = DataItems.asInstanceOf[js.Any], TimeRange = TimeRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAttackStatisticsResponse]
  }
  
  extension [Self <: DescribeAttackStatisticsResponse](x: Self) {
    
    inline def setDataItems(value: AttackStatisticsDataList): Self = StObject.set(x, "DataItems", value.asInstanceOf[js.Any])
    
    inline def setDataItemsVarargs(value: AttackStatisticsDataItem*): Self = StObject.set(x, "DataItems", js.Array(value :_*))
    
    inline def setTimeRange(value: TimeRange): Self = StObject.set(x, "TimeRange", value.asInstanceOf[js.Any])
  }
}
