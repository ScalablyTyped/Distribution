package typings.cathoQuantum.radioGroupMod

import typings.cathoQuantum.anon.ColorsSpacing
import typings.cathoQuantum.anon.Disabled
import typings.cathoQuantum.cathoQuantumStrings.button
import typings.cathoQuantum.cathoQuantumStrings.large
import typings.cathoQuantum.cathoQuantumStrings.medium
import typings.cathoQuantum.cathoQuantumStrings.radio
import typings.cathoQuantum.cathoQuantumStrings.small
import typings.cathoQuantum.cathoQuantumStrings.xlarge
import typings.cathoQuantum.cathoQuantumStrings.xsmall
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioGroupProps extends js.Object {
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var name: String
  var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
  var options: js.UndefOr[js.Array[Disabled]] = js.undefined
  var size: js.UndefOr[xsmall | small | medium | large | xlarge] = js.undefined
  var theme: js.UndefOr[ColorsSpacing] = js.undefined
  var `type`: js.UndefOr[radio | button] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object RadioGroupProps {
  @scala.inline
  def apply(
    name: String,
    children: js.Array[ReactNode] | ReactNode = null,
    error: String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    onChange: ChangeEvent[HTMLInputElement] => Unit = null,
    options: js.Array[Disabled] = null,
    size: xsmall | small | medium | large | xlarge = null,
    theme: ColorsSpacing = null,
    `type`: radio | button = null,
    value: String = null
  ): RadioGroupProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioGroupProps]
  }
}

