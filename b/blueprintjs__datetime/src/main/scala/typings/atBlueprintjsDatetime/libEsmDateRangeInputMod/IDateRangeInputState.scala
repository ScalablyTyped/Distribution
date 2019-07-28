package typings.atBlueprintjsDatetime.libEsmDateRangeInputMod

import typings.atBlueprintjsCore.libEsmCommonBoundaryMod.Boundary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateRangeInputState extends js.Object {
  var boundaryToModify: js.UndefOr[Boundary] = js.undefined
  var endHoverString: js.UndefOr[String] = js.undefined
  var endInputString: js.UndefOr[String] = js.undefined
  var formattedMaxDateString: js.UndefOr[String] = js.undefined
  var formattedMinDateString: js.UndefOr[String] = js.undefined
  var isEndInputFocused: js.UndefOr[Boolean] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var isStartInputFocused: js.UndefOr[Boolean] = js.undefined
  var lastFocusedField: js.UndefOr[Boundary] = js.undefined
  var selectedEnd: js.UndefOr[Date] = js.undefined
  var selectedStart: js.UndefOr[Date] = js.undefined
  var shouldSelectAfterUpdate: js.UndefOr[Boolean] = js.undefined
  var startHoverString: js.UndefOr[String] = js.undefined
  var startInputString: js.UndefOr[String] = js.undefined
  var wasLastFocusChangeDueToHover: js.UndefOr[Boolean] = js.undefined
}

object IDateRangeInputState {
  @scala.inline
  def apply(
    boundaryToModify: Boundary = null,
    endHoverString: String = null,
    endInputString: String = null,
    formattedMaxDateString: String = null,
    formattedMinDateString: String = null,
    isEndInputFocused: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    isStartInputFocused: js.UndefOr[Boolean] = js.undefined,
    lastFocusedField: Boundary = null,
    selectedEnd: Date = null,
    selectedStart: Date = null,
    shouldSelectAfterUpdate: js.UndefOr[Boolean] = js.undefined,
    startHoverString: String = null,
    startInputString: String = null,
    wasLastFocusChangeDueToHover: js.UndefOr[Boolean] = js.undefined
  ): IDateRangeInputState = {
    val __obj = js.Dynamic.literal()
    if (boundaryToModify != null) __obj.updateDynamic("boundaryToModify")(boundaryToModify)
    if (endHoverString != null) __obj.updateDynamic("endHoverString")(endHoverString)
    if (endInputString != null) __obj.updateDynamic("endInputString")(endInputString)
    if (formattedMaxDateString != null) __obj.updateDynamic("formattedMaxDateString")(formattedMaxDateString)
    if (formattedMinDateString != null) __obj.updateDynamic("formattedMinDateString")(formattedMinDateString)
    if (!js.isUndefined(isEndInputFocused)) __obj.updateDynamic("isEndInputFocused")(isEndInputFocused)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (!js.isUndefined(isStartInputFocused)) __obj.updateDynamic("isStartInputFocused")(isStartInputFocused)
    if (lastFocusedField != null) __obj.updateDynamic("lastFocusedField")(lastFocusedField)
    if (selectedEnd != null) __obj.updateDynamic("selectedEnd")(selectedEnd)
    if (selectedStart != null) __obj.updateDynamic("selectedStart")(selectedStart)
    if (!js.isUndefined(shouldSelectAfterUpdate)) __obj.updateDynamic("shouldSelectAfterUpdate")(shouldSelectAfterUpdate)
    if (startHoverString != null) __obj.updateDynamic("startHoverString")(startHoverString)
    if (startInputString != null) __obj.updateDynamic("startInputString")(startInputString)
    if (!js.isUndefined(wasLastFocusChangeDueToHover)) __obj.updateDynamic("wasLastFocusChangeDueToHover")(wasLastFocusChangeDueToHover)
    __obj.asInstanceOf[IDateRangeInputState]
  }
}

