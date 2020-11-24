package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAttackStatisticsResponse extends js.Object {
  
  /**
    * The data that describes the attacks detected during the time period.
    */
  var DataItems: AttackStatisticsDataList = js.native
  
  var TimeRange: typings.awsSdk.shieldMod.TimeRange = js.native
}
object DescribeAttackStatisticsResponse {
  
  @scala.inline
  def apply(DataItems: AttackStatisticsDataList, TimeRange: TimeRange): DescribeAttackStatisticsResponse = {
    val __obj = js.Dynamic.literal(DataItems = DataItems.asInstanceOf[js.Any], TimeRange = TimeRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAttackStatisticsResponse]
  }
  
  @scala.inline
  implicit class DescribeAttackStatisticsResponseOps[Self <: DescribeAttackStatisticsResponse] (val x: Self) extends AnyVal {
    
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
    def setDataItemsVarargs(value: AttackStatisticsDataItem*): Self = this.set("DataItems", js.Array(value :_*))
    
    @scala.inline
    def setDataItems(value: AttackStatisticsDataList): Self = this.set("DataItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeRange(value: TimeRange): Self = this.set("TimeRange", value.asInstanceOf[js.Any])
  }
}
