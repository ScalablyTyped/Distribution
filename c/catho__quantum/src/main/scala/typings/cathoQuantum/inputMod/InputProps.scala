package typings.cathoQuantum.inputMod

import typings.cathoQuantum.anon.BaseFontSizeColors
import typings.cathoQuantum.cathoQuantumStrings.email
import typings.cathoQuantum.cathoQuantumStrings.number
import typings.cathoQuantum.cathoQuantumStrings.password
import typings.cathoQuantum.cathoQuantumStrings.search
import typings.cathoQuantum.cathoQuantumStrings.tel
import typings.cathoQuantum.cathoQuantumStrings.text
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputProps extends js.Object {
  var descriptionLabel: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var helperText: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var mask: js.UndefOr[Mask | js.Array[Mask]] = js.undefined
  var maxLength: js.UndefOr[Double | String] = js.undefined
  var minLength: js.UndefOr[Double | String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
  var onClean: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[BaseFontSizeColors] = js.undefined
  var `type`: js.UndefOr[email | text | tel | number | password | search] = js.undefined
  var validate: js.UndefOr[Validate | CustomValidate | (js.Array[Validate | CustomValidate])] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object InputProps {
  @scala.inline
  def apply(
    descriptionLabel: String = null,
    error: String = null,
    helperText: String = null,
    id: String = null,
    label: String = null,
    mask: Mask | js.Array[Mask] = null,
    maxLength: Double | String = null,
    minLength: Double | String = null,
    name: String = null,
    onChange: ChangeEvent[HTMLInputElement] => Unit = null,
    onClean: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit = null,
    placeholder: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    theme: BaseFontSizeColors = null,
    `type`: email | text | tel | number | password | search = null,
    validate: Validate | CustomValidate | (js.Array[Validate | CustomValidate]) = null,
    value: String = null
  ): InputProps = {
    val __obj = js.Dynamic.literal()
    if (descriptionLabel != null) __obj.updateDynamic("descriptionLabel")(descriptionLabel.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (helperText != null) __obj.updateDynamic("helperText")(helperText.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClean != null) __obj.updateDynamic("onClean")(js.Any.fromFunction1(onClean))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputProps]
  }
}

