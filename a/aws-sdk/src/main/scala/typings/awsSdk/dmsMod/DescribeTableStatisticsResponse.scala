package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTableStatisticsResponse extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the replication task.
    */
  var ReplicationTaskArn: js.UndefOr[String] = js.native
  /**
    * The table statistics.
    */
  var TableStatistics: js.UndefOr[TableStatisticsList] = js.native
}

object DescribeTableStatisticsResponse {
  @scala.inline
  def apply(
    Marker: String = null,
    ReplicationTaskArn: String = null,
    TableStatistics: TableStatisticsList = null
  ): DescribeTableStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (ReplicationTaskArn != null) __obj.updateDynamic("ReplicationTaskArn")(ReplicationTaskArn.asInstanceOf[js.Any])
    if (TableStatistics != null) __obj.updateDynamic("TableStatistics")(TableStatistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTableStatisticsResponse]
  }
}

