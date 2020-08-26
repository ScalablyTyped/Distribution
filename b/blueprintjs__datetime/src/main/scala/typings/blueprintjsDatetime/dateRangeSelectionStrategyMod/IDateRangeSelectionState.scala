package typings.blueprintjsDatetime.dateRangeSelectionStrategyMod

import typings.blueprintjsCore.boundaryMod.Boundary
import typings.blueprintjsDatetime.dateRangeMod.DateRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateRangeSelectionState extends js.Object {
  /**
    * The boundary that would be modified by clicking the provided `day`.
    */
  var boundary: js.UndefOr[Boundary] = js.native
  /**
    * The date range that would be selected after clicking the provided `day`.
    */
  var dateRange: DateRange = js.native
}

object IDateRangeSelectionState {
  @scala.inline
  def apply(dateRange: DateRange): IDateRangeSelectionState = {
    val __obj = js.Dynamic.literal(dateRange = dateRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateRangeSelectionState]
  }
  @scala.inline
  implicit class IDateRangeSelectionStateOps[Self <: IDateRangeSelectionState] (val x: Self) extends AnyVal {
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
    def setDateRange(value: DateRange): Self = this.set("dateRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoundary(value: Boundary): Self = this.set("boundary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundary: Self = this.set("boundary", js.undefined)
  }
  
}

