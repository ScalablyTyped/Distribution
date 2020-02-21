package typings.cathoQuantum.checkboxMod

import typings.cathoQuantum.cathoQuantumStrings.error
import typings.cathoQuantum.cathoQuantumStrings.neutral
import typings.cathoQuantum.cathoQuantumStrings.primary
import typings.cathoQuantum.cathoQuantumStrings.success
import typings.cathoQuantum.cathoQuantumStrings.warning
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxButtonProps[T] extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var name: String
  var onChange: js.UndefOr[ChangeEventHandler[T]] = js.undefined
  var skin: js.UndefOr[neutral | primary | success | warning | error] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object CheckboxButtonProps {
  @scala.inline
  def apply[T](
    name: String,
    checked: js.UndefOr[Boolean] = js.undefined,
    children: js.Array[ReactNode] | ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: String = null,
    icon: String = null,
    id: String = null,
    label: String = null,
    onChange: ChangeEvent[T] => Unit = null,
    skin: neutral | primary | success | warning | error = null,
    value: String = null
  ): CheckboxButtonProps[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxButtonProps[T]]
  }
}

