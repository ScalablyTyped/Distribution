package typings.bootstrapSwitch.BootstrapSwitch

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
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (handleWidth != null) __obj.updateDynamic("handleWidth")(handleWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate.asInstanceOf[js.Any])
    if (!js.isUndefined(invers)) __obj.updateDynamic("invers")(invers.asInstanceOf[js.Any])
    if (labelText != null) __obj.updateDynamic("labelText")(labelText.asInstanceOf[js.Any])
    if (labelWidth != null) __obj.updateDynamic("labelWidth")(labelWidth.asInstanceOf[js.Any])
    if (offColor != null) __obj.updateDynamic("offColor")(offColor.asInstanceOf[js.Any])
    if (offText != null) __obj.updateDynamic("offText")(offText.asInstanceOf[js.Any])
    if (onColor != null) __obj.updateDynamic("onColor")(onColor.asInstanceOf[js.Any])
    if (onInit != null) __obj.updateDynamic("onInit")(onInit.asInstanceOf[js.Any])
    if (onSwitchChange != null) __obj.updateDynamic("onSwitchChange")(onSwitchChange.asInstanceOf[js.Any])
    if (onText != null) __obj.updateDynamic("onText")(onText.asInstanceOf[js.Any])
    if (!js.isUndefined(radioAllOff)) __obj.updateDynamic("radioAllOff")(radioAllOff.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(state)) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (wrapperClass != null) __obj.updateDynamic("wrapperClass")(wrapperClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapSwitchOptions]
  }
}

