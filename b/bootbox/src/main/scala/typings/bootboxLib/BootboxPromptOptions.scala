package typings
package bootboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Bootbox options available for prompt modals */
trait BootboxPromptOptions
  extends BootboxBaseOptions[java.lang.String] {
  @JSName("buttons")
  var buttons_BootboxPromptOptions: js.UndefOr[BootboxConfirmPromptButtonMap] = js.undefined
  var inputOptions: js.UndefOr[js.Array[Anon_Group]] = js.undefined
  var inputType: js.UndefOr[
    bootboxLib.bootboxLibStrings.text | bootboxLib.bootboxLibStrings.textarea | bootboxLib.bootboxLibStrings.email | bootboxLib.bootboxLibStrings.select | bootboxLib.bootboxLibStrings.checkbox | bootboxLib.bootboxLibStrings.date | bootboxLib.bootboxLibStrings.time | bootboxLib.bootboxLibStrings.number | bootboxLib.bootboxLibStrings.password
  ] = js.undefined
  @JSName("title")
  var title_BootboxPromptOptions: java.lang.String
  var value: js.UndefOr[java.lang.String] = js.undefined
  @JSName("callback")
  def callback_MBootboxPromptOptions(result: java.lang.String): js.Any
}

object BootboxPromptOptions {
  @scala.inline
  def apply(
    callback: js.Function1[java.lang.String, js.Any],
    title: java.lang.String,
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    backdrop: js.UndefOr[scala.Boolean] = js.undefined,
    buttons: BootboxConfirmPromptButtonMap = null,
    className: java.lang.String = null,
    closeButton: js.UndefOr[scala.Boolean] = js.undefined,
    inputOptions: js.Array[Anon_Group] = null,
    inputType: bootboxLib.bootboxLibStrings.text | bootboxLib.bootboxLibStrings.textarea | bootboxLib.bootboxLibStrings.email | bootboxLib.bootboxLibStrings.select | bootboxLib.bootboxLibStrings.checkbox | bootboxLib.bootboxLibStrings.date | bootboxLib.bootboxLibStrings.time | bootboxLib.bootboxLibStrings.number | bootboxLib.bootboxLibStrings.password = null,
    onEscape: js.Function0[_] | scala.Boolean = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    size: bootboxLib.bootboxLibStrings.small | bootboxLib.bootboxLibStrings.large = null,
    value: java.lang.String = null
  ): BootboxPromptOptions = {
    val __obj = js.Dynamic.literal(callback = callback, title = title)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (!js.isUndefined(backdrop)) __obj.updateDynamic("backdrop")(backdrop)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton)
    if (inputOptions != null) __obj.updateDynamic("inputOptions")(inputOptions)
    if (inputType != null) __obj.updateDynamic("inputType")(inputType.asInstanceOf[js.Any])
    if (onEscape != null) __obj.updateDynamic("onEscape")(onEscape.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[BootboxPromptOptions]
  }
}

