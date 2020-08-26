package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnStatistics extends js.Object {
  /**
    * The analyzed time of the column statistics.
    */
  var AnalyzedTime: Timestamp = js.native
  /**
    * The name of the column.
    */
  var ColumnName: NameString = js.native
  /**
    * The type of the column.
    */
  var ColumnType: TypeString = js.native
  /**
    * The statistics of the column.
    */
  var StatisticsData: ColumnStatisticsData = js.native
}

object ColumnStatistics {
  @scala.inline
  def apply(
    AnalyzedTime: Timestamp,
    ColumnName: NameString,
    ColumnType: TypeString,
    StatisticsData: ColumnStatisticsData
  ): ColumnStatistics = {
    val __obj = js.Dynamic.literal(AnalyzedTime = AnalyzedTime.asInstanceOf[js.Any], ColumnName = ColumnName.asInstanceOf[js.Any], ColumnType = ColumnType.asInstanceOf[js.Any], StatisticsData = StatisticsData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnStatistics]
  }
  @scala.inline
  implicit class ColumnStatisticsOps[Self <: ColumnStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnalyzedTime(value: Timestamp): Self = this.set("AnalyzedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnName(value: NameString): Self = this.set("ColumnName", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnType(value: TypeString): Self = this.set("ColumnType", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatisticsData(value: ColumnStatisticsData): Self = this.set("StatisticsData", value.asInstanceOf[js.Any])
  }
  
}

