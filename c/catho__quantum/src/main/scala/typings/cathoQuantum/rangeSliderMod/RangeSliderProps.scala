package typings.cathoQuantum.rangeSliderMod

import typings.cathoQuantum.anon.BaseFontSizeColors
import typings.cathoQuantum.anon.From
import typings.cathoQuantum.anon.LabelValue
import typings.cathoQuantum.cathoQuantumBooleans.`false`
import typings.cathoQuantum.cathoQuantumStrings.auto
import typings.cathoQuantum.cathoQuantumStrings.inverted
import typings.cathoQuantum.cathoQuantumStrings.normal
import typings.cathoQuantum.cathoQuantumStrings.off
import typings.cathoQuantum.cathoQuantumStrings.on
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSliderProps extends js.Object {
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  var defaultValue: js.UndefOr[Double | From] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var marks: js.UndefOr[js.Array[LabelValue]] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
  var onChangeCommitted: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var theme: js.UndefOr[BaseFontSizeColors] = js.undefined
  var tipFormatter: js.UndefOr[
    js.Function2[/* value */ js.UndefOr[Double], /* index */ js.UndefOr[Double], String]
  ] = js.undefined
  var track: js.UndefOr[normal | `false` | inverted] = js.undefined
  var value: js.UndefOr[Double | From] = js.undefined
  var valueLabelDisplay: js.UndefOr[auto | on | off] = js.undefined
}

object RangeSliderProps {
  @scala.inline
  def apply(
    `aria-labelledby`: String = null,
    defaultValue: Double | From = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    marks: js.Array[LabelValue] = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    onChange: ChangeEvent[HTMLInputElement] => Unit = null,
    onChangeCommitted: ChangeEvent[HTMLInputElement] => Unit = null,
    step: js.UndefOr[Double] = js.undefined,
    theme: BaseFontSizeColors = null,
    tipFormatter: (/* value */ js.UndefOr[Double], /* index */ js.UndefOr[Double]) => String = null,
    track: normal | `false` | inverted = null,
    value: Double | From = null,
    valueLabelDisplay: auto | on | off = null
  ): RangeSliderProps = {
    val __obj = js.Dynamic.literal()
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeCommitted != null) __obj.updateDynamic("onChangeCommitted")(js.Any.fromFunction1(onChangeCommitted))
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(js.Any.fromFunction2(tipFormatter))
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueLabelDisplay != null) __obj.updateDynamic("valueLabelDisplay")(valueLabelDisplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSliderProps]
  }
}

