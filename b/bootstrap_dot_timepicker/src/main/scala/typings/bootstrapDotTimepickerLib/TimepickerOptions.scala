package typings
package bootstrapDotTimepickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimepickerOptions extends js.Object {
  var appendWidgetTo: js.UndefOr[java.lang.String] = js.undefined
  var defaultTime: js.UndefOr[java.lang.String | scala.Boolean | stdLib.Date] = js.undefined
  var disableFocus: js.UndefOr[scala.Boolean] = js.undefined
  var disableMousewheel: js.UndefOr[scala.Boolean] = js.undefined
  var explicitMode: js.UndefOr[scala.Boolean] = js.undefined
  var icons: js.UndefOr[TimepickerIconOptions] = js.undefined
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  var maxHours: js.UndefOr[scala.Double] = js.undefined
  var minuteStep: js.UndefOr[scala.Double] = js.undefined
  var modalBackdrop: js.UndefOr[scala.Boolean] = js.undefined
  var secondStep: js.UndefOr[scala.Double] = js.undefined
  var showInputs: js.UndefOr[scala.Boolean] = js.undefined
  var showMeridian: js.UndefOr[scala.Boolean] = js.undefined
  var showSeconds: js.UndefOr[scala.Boolean] = js.undefined
  var snapToStep: js.UndefOr[scala.Boolean] = js.undefined
  var template: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
}

object TimepickerOptions {
  @scala.inline
  def apply(
    appendWidgetTo: java.lang.String = null,
    defaultTime: java.lang.String | scala.Boolean | stdLib.Date = null,
    disableFocus: js.UndefOr[scala.Boolean] = js.undefined,
    disableMousewheel: js.UndefOr[scala.Boolean] = js.undefined,
    explicitMode: js.UndefOr[scala.Boolean] = js.undefined,
    icons: TimepickerIconOptions = null,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    maxHours: scala.Int | scala.Double = null,
    minuteStep: scala.Int | scala.Double = null,
    modalBackdrop: js.UndefOr[scala.Boolean] = js.undefined,
    secondStep: scala.Int | scala.Double = null,
    showInputs: js.UndefOr[scala.Boolean] = js.undefined,
    showMeridian: js.UndefOr[scala.Boolean] = js.undefined,
    showSeconds: js.UndefOr[scala.Boolean] = js.undefined,
    snapToStep: js.UndefOr[scala.Boolean] = js.undefined,
    template: java.lang.String | scala.Boolean = null
  ): TimepickerOptions = {
    val __obj = js.Dynamic.literal()
    if (appendWidgetTo != null) __obj.updateDynamic("appendWidgetTo")(appendWidgetTo)
    if (defaultTime != null) __obj.updateDynamic("defaultTime")(defaultTime.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocus)) __obj.updateDynamic("disableFocus")(disableFocus)
    if (!js.isUndefined(disableMousewheel)) __obj.updateDynamic("disableMousewheel")(disableMousewheel)
    if (!js.isUndefined(explicitMode)) __obj.updateDynamic("explicitMode")(explicitMode)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (maxHours != null) __obj.updateDynamic("maxHours")(maxHours.asInstanceOf[js.Any])
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (!js.isUndefined(modalBackdrop)) __obj.updateDynamic("modalBackdrop")(modalBackdrop)
    if (secondStep != null) __obj.updateDynamic("secondStep")(secondStep.asInstanceOf[js.Any])
    if (!js.isUndefined(showInputs)) __obj.updateDynamic("showInputs")(showInputs)
    if (!js.isUndefined(showMeridian)) __obj.updateDynamic("showMeridian")(showMeridian)
    if (!js.isUndefined(showSeconds)) __obj.updateDynamic("showSeconds")(showSeconds)
    if (!js.isUndefined(snapToStep)) __obj.updateDynamic("snapToStep")(snapToStep)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimepickerOptions]
  }
}

