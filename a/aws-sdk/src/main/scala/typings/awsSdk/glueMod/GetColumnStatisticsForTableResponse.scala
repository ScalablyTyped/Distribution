package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetColumnStatisticsForTableResponse extends js.Object {
  /**
    * List of ColumnStatistics that failed to be retrieved.
    */
  var ColumnStatisticsList: js.UndefOr[typings.awsSdk.glueMod.ColumnStatisticsList] = js.native
  /**
    * List of ColumnStatistics that failed to be retrieved.
    */
  var Errors: js.UndefOr[ColumnErrors] = js.native
}

object GetColumnStatisticsForTableResponse {
  @scala.inline
  def apply(ColumnStatisticsList: ColumnStatisticsList = null, Errors: ColumnErrors = null): GetColumnStatisticsForTableResponse = {
    val __obj = js.Dynamic.literal()
    if (ColumnStatisticsList != null) __obj.updateDynamic("ColumnStatisticsList")(ColumnStatisticsList.asInstanceOf[js.Any])
    if (Errors != null) __obj.updateDynamic("Errors")(Errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetColumnStatisticsForTableResponse]
  }
}

