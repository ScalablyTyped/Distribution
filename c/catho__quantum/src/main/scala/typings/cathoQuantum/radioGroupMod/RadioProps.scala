package typings.cathoQuantum.radioGroupMod

import typings.cathoQuantum.AnonColorsSpacing
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioProps[T] extends js.Object {
  var children: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[ChangeEventHandler[T]] = js.undefined
  var theme: js.UndefOr[AnonColorsSpacing] = js.undefined
  var value: String
}

object RadioProps {
  @scala.inline
  def apply[T](
    value: String,
    children: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    onChange: ChangeEvent[T] => Unit = null,
    theme: AnonColorsSpacing = null
  ): RadioProps[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioProps[T]]
  }
}

