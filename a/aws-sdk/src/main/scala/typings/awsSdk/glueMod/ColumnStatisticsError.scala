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
  def apply(): ColumnStatisticsError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnStatisticsError]
  }
  @scala.inline
  implicit class ColumnStatisticsErrorOps[Self <: ColumnStatisticsError] (val x: Self) extends AnyVal {
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
    def setColumnStatistics(value: ColumnStatistics): Self = this.set("ColumnStatistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnStatistics: Self = this.set("ColumnStatistics", js.undefined)
    @scala.inline
    def setError(value: ErrorDetail): Self = this.set("Error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("Error", js.undefined)
  }
  
}

