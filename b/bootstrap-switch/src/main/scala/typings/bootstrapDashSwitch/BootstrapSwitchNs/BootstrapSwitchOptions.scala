package typings.bootstrapDashSwitch.BootstrapSwitchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapSwitchOptions extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var baseClass: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var handleWidth: js.UndefOr[String] = js.undefined
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  var invers: js.UndefOr[Boolean] = js.undefined
  var labelText: js.UndefOr[String] = js.undefined
  var labelWidth: js.UndefOr[String] = js.undefined
  var offColor: js.UndefOr[String] = js.undefined
  var offText: js.UndefOr[String] = js.undefined
  var onColor: js.UndefOr[String] = js.undefined
  var onInit: js.UndefOr[js.Any] = js.undefined
  var onSwitchChange: js.UndefOr[js.Any] = js.undefined
  var onText: js.UndefOr[String] = js.undefined
  var radioAllOff: js.UndefOr[Boolean] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[Boolean] = js.undefined
  var wrapperClass: js.UndefOr[String] = js.undefined
}

object BootstrapSwitchOptions {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    baseClass: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    handleWidth: String = null,
    indeterminate: js.UndefOr[Boolean] = js.undefined,
    invers: js.UndefOr[Boolean] = js.undefined,
    labelText: String = null,
    labelWidth: String = null,
    offColor: String = null,
    offText: String = null,
    onColor: String = null,
    onInit: js.Any = null,
    onSwitchChange: js.Any = null,
    onText: String = null,
    radioAllOff: js.UndefOr[Boolean] = js.undefined,
    readonly: js.UndefOr[Boolean] = js.undefined,
    size: String = null,
    state: js.UndefOr[Boolean] = js.undefined,
    wrapperClass: String = null
  ): BootstrapSwitchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (handleWidth != null) __obj.updateDynamic("handleWidth")(handleWidth)
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate)
    if (!js.isUndefined(invers)) __obj.updateDynamic("invers")(invers)
    if (labelText != null) __obj.updateDynamic("labelText")(labelText)
    if (labelWidth != null) __obj.updateDynamic("labelWidth")(labelWidth)
    if (offColor != null) __obj.updateDynamic("offColor")(offColor)
    if (offText != null) __obj.updateDynamic("offText")(offText)
    if (onColor != null) __obj.updateDynamic("onColor")(onColor)
    if (onInit != null) __obj.updateDynamic("onInit")(onInit)
    if (onSwitchChange != null) __obj.updateDynamic("onSwitchChange")(onSwitchChange)
    if (onText != null) __obj.updateDynamic("onText")(onText)
    if (!js.isUndefined(radioAllOff)) __obj.updateDynamic("radioAllOff")(radioAllOff)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(state)) __obj.updateDynamic("state")(state)
    if (wrapperClass != null) __obj.updateDynamic("wrapperClass")(wrapperClass)
    __obj.asInstanceOf[BootstrapSwitchOptions]
  }
}

