package typings.cathoQuantum.radioGroupMod

import typings.cathoQuantum.AnonColorsComponents
import typings.cathoQuantum.cathoQuantumStrings.error
import typings.cathoQuantum.cathoQuantumStrings.neutral
import typings.cathoQuantum.cathoQuantumStrings.primary
import typings.cathoQuantum.cathoQuantumStrings.success
import typings.cathoQuantum.cathoQuantumStrings.warning
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioButtonProps[T] extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[ChangeEventHandler[T]] = js.undefined
  var skin: js.UndefOr[neutral | primary | success | warning | error] = js.undefined
  var theme: js.UndefOr[AnonColorsComponents] = js.undefined
  var value: String
}

object RadioButtonProps {
  @scala.inline
  def apply[T](
    value: String,
    checked: js.UndefOr[Boolean] = js.undefined,
    children: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    id: String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    onChange: ChangeEvent[T] => Unit = null,
    skin: neutral | primary | success | warning | error = null,
    theme: AnonColorsComponents = null
  ): RadioButtonProps[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioButtonProps[T]]
  }
}

