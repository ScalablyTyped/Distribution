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

@js.native
trait RangeSliderProps extends js.Object {
  var `aria-labelledby`: js.UndefOr[String] = js.native
  var defaultValue: js.UndefOr[Double | From] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var marks: js.UndefOr[js.Array[LabelValue]] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.native
  var onChangeCommitted: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.native
  var step: js.UndefOr[Double] = js.native
  var theme: js.UndefOr[BaseFontSizeColors] = js.native
  var tipFormatter: js.UndefOr[
    js.Function2[/* value */ js.UndefOr[Double], /* index */ js.UndefOr[Double], String]
  ] = js.native
  var track: js.UndefOr[normal | `false` | inverted] = js.native
  var value: js.UndefOr[Double | From] = js.native
  var valueLabelDisplay: js.UndefOr[auto | on | off] = js.native
}

object RangeSliderProps {
  @scala.inline
  def apply(): RangeSliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeSliderProps]
  }
  @scala.inline
  implicit class RangeSliderPropsOps[Self <: RangeSliderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setAria-labelledby`(value: String): Self = this.set("aria-labelledby", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-labelledby`: Self = this.set("aria-labelledby", js.undefined)
    @scala.inline
    def setDefaultValue(value: Double | From): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setMarksVarargs(value: LabelValue*): Self = this.set("marks", js.Array(value :_*))
    @scala.inline
    def setMarks(value: js.Array[LabelValue]): Self = this.set("marks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarks: Self = this.set("marks", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnChangeCommitted(value: ChangeEvent[HTMLInputElement] => Unit): Self = this.set("onChangeCommitted", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChangeCommitted: Self = this.set("onChangeCommitted", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setTheme(value: BaseFontSizeColors): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTipFormatter(value: (/* value */ js.UndefOr[Double], /* index */ js.UndefOr[Double]) => String): Self = this.set("tipFormatter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTipFormatter: Self = this.set("tipFormatter", js.undefined)
    @scala.inline
    def setTrack(value: normal | `false` | inverted): Self = this.set("track", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrack: Self = this.set("track", js.undefined)
    @scala.inline
    def setValue(value: Double | From): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueLabelDisplay(value: auto | on | off): Self = this.set("valueLabelDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueLabelDisplay: Self = this.set("valueLabelDisplay", js.undefined)
  }
  
}

