package typings.cathoQuantum.checkboxMod

import typings.cathoQuantum.anon.ColorsSpacing
import typings.cathoQuantum.cathoQuantumStrings.button
import typings.cathoQuantum.cathoQuantumStrings.checkbox
import typings.cathoQuantum.cathoQuantumStrings.large
import typings.cathoQuantum.cathoQuantumStrings.medium
import typings.cathoQuantum.cathoQuantumStrings.small
import typings.cathoQuantum.cathoQuantumStrings.xlarge
import typings.cathoQuantum.cathoQuantumStrings.xsmall
import typings.react.mod.ChangeEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxGroupProps extends js.Object {
  var children: js.UndefOr[js.Array[Element] | Element] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* items */ js.UndefOr[Options], 
      /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]], 
      Unit
    ]
  ] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var size: js.UndefOr[xsmall | small | medium | large | xlarge] = js.undefined
  var theme: js.UndefOr[ColorsSpacing] = js.undefined
  var `type`: checkbox | button
}

object CheckboxGroupProps {
  @scala.inline
  def apply(
    `type`: checkbox | button,
    children: js.Array[Element] | Element = null,
    error: String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* items */ js.UndefOr[Options], /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]]) => Unit = null,
    options: Options = null,
    size: xsmall | small | medium | large | xlarge = null,
    theme: ColorsSpacing = null
  ): CheckboxGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxGroupProps]
  }
}

