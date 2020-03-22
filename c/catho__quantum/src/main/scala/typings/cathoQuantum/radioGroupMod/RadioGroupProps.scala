package typings.cathoQuantum.radioGroupMod

import typings.cathoQuantum.AnonColorsSpacing
import typings.cathoQuantum.AnonDisabled
import typings.cathoQuantum.cathoQuantumStrings.button
import typings.cathoQuantum.cathoQuantumStrings.radio
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioGroupProps[T] extends js.Object {
  var children: js.UndefOr[js.Array[Element] | Element] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var name: String
  var onChange: js.UndefOr[ChangeEventHandler[T]] = js.undefined
  var options: js.UndefOr[js.Array[AnonDisabled]] = js.undefined
  var theme: js.UndefOr[AnonColorsSpacing] = js.undefined
  var `type`: js.UndefOr[radio | button] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object RadioGroupProps {
  @scala.inline
  def apply[T](
    name: String,
    children: js.Array[Element] | Element = null,
    error: String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    onChange: ChangeEvent[T] => Unit = null,
    options: js.Array[AnonDisabled] = null,
    theme: AnonColorsSpacing = null,
    `type`: radio | button = null,
    value: String = null
  ): RadioGroupProps[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioGroupProps[T]]
  }
}

