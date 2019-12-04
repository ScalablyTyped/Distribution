package typings.atBlueprintjsDatetime.libEsmDateRangeSelectionStrategyMod

import typings.atBlueprintjsCore.libEsmCommonBoundaryMod.Boundary
import typings.atBlueprintjsDatetime.libEsmCommonDateUtilsMod.DateRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateRangeSelectionState extends js.Object {
  /**
    * The boundary that would be modified by clicking the provided `day`.
    */
  var boundary: js.UndefOr[Boundary] = js.undefined
  /**
    * The date range that would be selected after clicking the provided `day`.
    */
  var dateRange: DateRange
}

object IDateRangeSelectionState {
  @scala.inline
  def apply(dateRange: DateRange, boundary: Boundary = null): IDateRangeSelectionState = {
    val __obj = js.Dynamic.literal(dateRange = dateRange.asInstanceOf[js.Any])
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateRangeSelectionState]
  }
}

