package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnStatisticsError extends js.Object {
  /**
    * The ColumnStatistics of the column.
    */
  var ColumnStatistics: js.UndefOr[typings.awsSdk.glueMod.ColumnStatistics] = js.native
  /**
    * The error message occurred during operation.
    */
  var Error: js.UndefOr[ErrorDetail] = js.native
}

object ColumnStatisticsError {
  @scala.inline
  def apply(ColumnStatistics: ColumnStatistics = null, Error: ErrorDetail = null): ColumnStatisticsError = {
    val __obj = js.Dynamic.literal()
    if (ColumnStatistics != null) __obj.updateDynamic("ColumnStatistics")(ColumnStatistics.asInstanceOf[js.Any])
    if (Error != null) __obj.updateDynamic("Error")(Error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnStatisticsError]
  }
}

