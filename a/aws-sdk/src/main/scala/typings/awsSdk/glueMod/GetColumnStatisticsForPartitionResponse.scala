package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetColumnStatisticsForPartitionResponse extends js.Object {
  /**
    * List of ColumnStatistics that failed to be retrieved.
    */
  var ColumnStatisticsList: js.UndefOr[typings.awsSdk.glueMod.ColumnStatisticsList] = js.native
  /**
    * Error occurred during retrieving column statistics data.
    */
  var Errors: js.UndefOr[ColumnErrors] = js.native
}

object GetColumnStatisticsForPartitionResponse {
  @scala.inline
  def apply(ColumnStatisticsList: ColumnStatisticsList = null, Errors: ColumnErrors = null): GetColumnStatisticsForPartitionResponse = {
    val __obj = js.Dynamic.literal()
    if (ColumnStatisticsList != null) __obj.updateDynamic("ColumnStatisticsList")(ColumnStatisticsList.asInstanceOf[js.Any])
    if (Errors != null) __obj.updateDynamic("Errors")(Errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetColumnStatisticsForPartitionResponse]
  }
}

