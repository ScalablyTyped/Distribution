package typings.cathoQuantum.inputMod

import typings.cathoQuantum.AnonBaseFontSizeColorsSpacing
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputProps[T] extends js.Object {
  var descriptionLabel: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var helperText: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var mask: js.UndefOr[Mask | js.Array[Mask]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[ChangeEventHandler[T]] = js.undefined
  var onClean: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[AnonBaseFontSizeColorsSpacing] = js.undefined
  var `type`: js.UndefOr[email | text | tel | number | password | search] = js.undefined
  var validate: js.UndefOr[Validate | CustomValidate | (js.Array[Validate | CustomValidate])] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object InputProps {
  @scala.inline
  def apply[T](
    descriptionLabel: String = null,
    error: String = null,
    helperText: String = null,
    id: String = null,
    label: String = null,
    mask: Mask | js.Array[Mask] = null,
    name: String = null,
    onChange: ChangeEvent[T] => Unit = null,
    onClean: MouseEvent[T, NativeMouseEvent] => Unit = null,
    placeholder: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    theme: AnonBaseFontSizeColorsSpacing = null,
    `type`: email | text | tel | number | password | search = null,
    validate: Validate | CustomValidate | (js.Array[Validate | CustomValidate]) = null,
    value: String = null
  ): InputProps[T] = {
    val __obj = js.Dynamic.literal()
    if (descriptionLabel != null) __obj.updateDynamic("descriptionLabel")(descriptionLabel.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (helperText != null) __obj.updateDynamic("helperText")(helperText.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClean != null) __obj.updateDynamic("onClean")(js.Any.fromFunction1(onClean))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputProps[T]]
  }
}

