package typings.blueprintjsCore.sliderMod

import typings.blueprintjsCore.multiSliderMod.ISliderBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISliderProps extends ISliderBaseProps {
  
  /**
    * Initial value of the slider. This determines the other end of the
    * track fill: from `initialValue` to `value`.
    * @default 0
    */
  var initialValue: js.UndefOr[Double] = js.native
  
  /** Callback invoked when the value changes. */
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  /** Callback invoked when the handle is released. */
  var onRelease: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  /**
    * Value of slider.
    * @default 0
    */
  var value: js.UndefOr[Double] = js.native
}
object ISliderProps {
  
  @scala.inline
  def apply(): ISliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISliderProps]
  }
  
  @scala.inline
  implicit class ISliderPropsOps[Self <: ISliderProps] (val x: Self) extends AnyVal {
    
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
    def setInitialValue(value: Double): Self = this.set("initialValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialValue: Self = this.set("initialValue", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ Double => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnRelease(value: /* value */ Double => Unit): Self = this.set("onRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRelease: Self = this.set("onRelease", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
