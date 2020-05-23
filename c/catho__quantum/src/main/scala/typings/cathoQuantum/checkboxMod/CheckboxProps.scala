package typings.cathoQuantum.checkboxMod

import typings.cathoQuantum.anon.BaseFontSize
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxProps extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var name: String
  var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
  var theme: js.UndefOr[BaseFontSize] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object CheckboxProps {
  @scala.inline
  def apply(
    name: String,
    checked: js.UndefOr[Boolean] = js.undefined,
    children: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: String = null,
    id: String = null,
    label: String = null,
    onChange: ChangeEvent[HTMLInputElement] => Unit = null,
    theme: BaseFontSize = null,
    value: String = null
  ): CheckboxProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxProps]
  }
}

