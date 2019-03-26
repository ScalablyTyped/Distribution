package typings
package atBlueprintjsDatetimeLib.libEsmDateRangeInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateRangeInputState extends js.Object {
  var boundaryToModify: js.UndefOr[atBlueprintjsCoreLib.libEsmCommonBoundaryMod.Boundary] = js.undefined
  var endHoverString: js.UndefOr[java.lang.String] = js.undefined
  var endInputString: js.UndefOr[java.lang.String] = js.undefined
  var formattedMaxDateString: js.UndefOr[java.lang.String] = js.undefined
  var formattedMinDateString: js.UndefOr[java.lang.String] = js.undefined
  var isEndInputFocused: js.UndefOr[scala.Boolean] = js.undefined
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  var isStartInputFocused: js.UndefOr[scala.Boolean] = js.undefined
  var lastFocusedField: js.UndefOr[atBlueprintjsCoreLib.libEsmCommonBoundaryMod.Boundary] = js.undefined
  var selectedEnd: js.UndefOr[stdLib.Date] = js.undefined
  var selectedStart: js.UndefOr[stdLib.Date] = js.undefined
  var shouldSelectAfterUpdate: js.UndefOr[scala.Boolean] = js.undefined
  var startHoverString: js.UndefOr[java.lang.String] = js.undefined
  var startInputString: js.UndefOr[java.lang.String] = js.undefined
  var wasLastFocusChangeDueToHover: js.UndefOr[scala.Boolean] = js.undefined
}

object IDateRangeInputState {
  @scala.inline
  def apply(
    boundaryToModify: atBlueprintjsCoreLib.libEsmCommonBoundaryMod.Boundary = null,
    endHoverString: java.lang.String = null,
    endInputString: java.lang.String = null,
    formattedMaxDateString: java.lang.String = null,
    formattedMinDateString: java.lang.String = null,
    isEndInputFocused: js.UndefOr[scala.Boolean] = js.undefined,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    isStartInputFocused: js.UndefOr[scala.Boolean] = js.undefined,
    lastFocusedField: atBlueprintjsCoreLib.libEsmCommonBoundaryMod.Boundary = null,
    selectedEnd: stdLib.Date = null,
    selectedStart: stdLib.Date = null,
    shouldSelectAfterUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    startHoverString: java.lang.String = null,
    startInputString: java.lang.String = null,
    wasLastFocusChangeDueToHover: js.UndefOr[scala.Boolean] = js.undefined
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

