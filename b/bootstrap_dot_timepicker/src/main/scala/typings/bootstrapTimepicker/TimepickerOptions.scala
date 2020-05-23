package typings.bootstrapTimepicker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimepickerOptions extends js.Object {
  var appendWidgetTo: js.UndefOr[String] = js.undefined
  var defaultTime: js.UndefOr[String | Boolean | Date] = js.undefined
  var disableFocus: js.UndefOr[Boolean] = js.undefined
  var disableMousewheel: js.UndefOr[Boolean] = js.undefined
  var explicitMode: js.UndefOr[Boolean] = js.undefined
  var icons: js.UndefOr[TimepickerIconOptions] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var maxHours: js.UndefOr[Double] = js.undefined
  var minuteStep: js.UndefOr[Double] = js.undefined
  var modalBackdrop: js.UndefOr[Boolean] = js.undefined
  var secondStep: js.UndefOr[Double] = js.undefined
  var showInputs: js.UndefOr[Boolean] = js.undefined
  var showMeridian: js.UndefOr[Boolean] = js.undefined
  var showSeconds: js.UndefOr[Boolean] = js.undefined
  var snapToStep: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[String | Boolean] = js.undefined
}

object TimepickerOptions {
  @scala.inline
  def apply(
    appendWidgetTo: String = null,
    defaultTime: String | Boolean | Date = null,
    disableFocus: js.UndefOr[Boolean] = js.undefined,
    disableMousewheel: js.UndefOr[Boolean] = js.undefined,
    explicitMode: js.UndefOr[Boolean] = js.undefined,
    icons: TimepickerIconOptions = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    maxHours: js.UndefOr[Double] = js.undefined,
    minuteStep: js.UndefOr[Double] = js.undefined,
    modalBackdrop: js.UndefOr[Boolean] = js.undefined,
    secondStep: js.UndefOr[Double] = js.undefined,
    showInputs: js.UndefOr[Boolean] = js.undefined,
    showMeridian: js.UndefOr[Boolean] = js.undefined,
    showSeconds: js.UndefOr[Boolean] = js.undefined,
    snapToStep: js.UndefOr[Boolean] = js.undefined,
    template: String | Boolean = null
  ): TimepickerOptions = {
    val __obj = js.Dynamic.literal()
    if (appendWidgetTo != null) __obj.updateDynamic("appendWidgetTo")(appendWidgetTo.asInstanceOf[js.Any])
    if (defaultTime != null) __obj.updateDynamic("defaultTime")(defaultTime.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocus)) __obj.updateDynamic("disableFocus")(disableFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMousewheel)) __obj.updateDynamic("disableMousewheel")(disableMousewheel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(explicitMode)) __obj.updateDynamic("explicitMode")(explicitMode.get.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHours)) __obj.updateDynamic("maxHours")(maxHours.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minuteStep)) __obj.updateDynamic("minuteStep")(minuteStep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modalBackdrop)) __obj.updateDynamic("modalBackdrop")(modalBackdrop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(secondStep)) __obj.updateDynamic("secondStep")(secondStep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showInputs)) __obj.updateDynamic("showInputs")(showInputs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMeridian)) __obj.updateDynamic("showMeridian")(showMeridian.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showSeconds)) __obj.updateDynamic("showSeconds")(showSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snapToStep)) __obj.updateDynamic("snapToStep")(snapToStep.get.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimepickerOptions]
  }
}

