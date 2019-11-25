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
  var selectedShortcutIndex: js.UndefOr[Double] = js.undefined
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
    selectedShortcutIndex: Int | Double = null,
    selectedStart: Date = null,
    shouldSelectAfterUpdate: js.UndefOr[Boolean] = js.undefined,
    startHoverString: String = null,
    startInputString: String = null,
    wasLastFocusChangeDueToHover: js.UndefOr[Boolean] = js.undefined
  ): IDateRangeInputState = {
    val __obj = js.Dynamic.literal()
    if (boundaryToModify != null) __obj.updateDynamic("boundaryToModify")(boundaryToModify.asInstanceOf[js.Any])
    if (endHoverString != null) __obj.updateDynamic("endHoverString")(endHoverString.asInstanceOf[js.Any])
    if (endInputString != null) __obj.updateDynamic("endInputString")(endInputString.asInstanceOf[js.Any])
    if (formattedMaxDateString != null) __obj.updateDynamic("formattedMaxDateString")(formattedMaxDateString.asInstanceOf[js.Any])
    if (formattedMinDateString != null) __obj.updateDynamic("formattedMinDateString")(formattedMinDateString.asInstanceOf[js.Any])
    if (!js.isUndefined(isEndInputFocused)) __obj.updateDynamic("isEndInputFocused")(isEndInputFocused.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(isStartInputFocused)) __obj.updateDynamic("isStartInputFocused")(isStartInputFocused.asInstanceOf[js.Any])
    if (lastFocusedField != null) __obj.updateDynamic("lastFocusedField")(lastFocusedField.asInstanceOf[js.Any])
    if (selectedEnd != null) __obj.updateDynamic("selectedEnd")(selectedEnd.asInstanceOf[js.Any])
    if (selectedShortcutIndex != null) __obj.updateDynamic("selectedShortcutIndex")(selectedShortcutIndex.asInstanceOf[js.Any])
    if (selectedStart != null) __obj.updateDynamic("selectedStart")(selectedStart.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldSelectAfterUpdate)) __obj.updateDynamic("shouldSelectAfterUpdate")(shouldSelectAfterUpdate.asInstanceOf[js.Any])
    if (startHoverString != null) __obj.updateDynamic("startHoverString")(startHoverString.asInstanceOf[js.Any])
    if (startInputString != null) __obj.updateDynamic("startInputString")(startInputString.asInstanceOf[js.Any])
    if (!js.isUndefined(wasLastFocusChangeDueToHover)) __obj.updateDynamic("wasLastFocusChangeDueToHover")(wasLastFocusChangeDueToHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateRangeInputState]
  }
}

