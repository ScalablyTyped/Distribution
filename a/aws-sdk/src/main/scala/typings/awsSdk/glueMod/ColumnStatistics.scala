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
}

