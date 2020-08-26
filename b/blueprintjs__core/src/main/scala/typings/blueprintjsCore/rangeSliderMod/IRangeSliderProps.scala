package typings.blueprintjsCore.rangeSliderMod

import typings.blueprintjsCore.multiSliderMod.ISliderBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRangeSliderProps extends ISliderBaseProps {
  /** Callback invoked when the range value changes. */
  var onChange: js.UndefOr[js.Function1[/* value */ NumberRange, Unit]] = js.native
  /** Callback invoked when a handle is released. */
  var onRelease: js.UndefOr[js.Function1[/* value */ NumberRange, Unit]] = js.native
  /**
    * Range value of slider. Handles will be rendered at each position in the range.
    * @default [0, 10]
    */
  var value: js.UndefOr[NumberRange] = js.native
}

object IRangeSliderProps {
  @scala.inline
  def apply(): IRangeSliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRangeSliderProps]
  }
  @scala.inline
  implicit class IRangeSliderPropsOps[Self <: IRangeSliderProps] (val x: Self) extends AnyVal {
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
    def setOnChange(value: /* value */ NumberRange => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnRelease(value: /* value */ NumberRange => Unit): Self = this.set("onRelease", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRelease: Self = this.set("onRelease", js.undefined)
    @scala.inline
    def setValue(value: NumberRange): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

