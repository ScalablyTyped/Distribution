package typings.baseui.sliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatefulSliderProps extends js.Object {
  
  var initialState: js.UndefOr[State] = js.native
  
  var marks: js.UndefOr[Boolean] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* e */ State, _]] = js.native
  
  var onFinalChange: js.UndefOr[js.Function1[/* e */ State, _]] = js.native
  
  var overrides: js.UndefOr[SliderOverrides] = js.native
  
  var step: js.UndefOr[Double] = js.native
}
object StatefulSliderProps {
  
  @scala.inline
  def apply(): StatefulSliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulSliderProps]
  }
  
  @scala.inline
  implicit class StatefulSliderPropsOps[Self <: StatefulSliderProps] (val x: Self) extends AnyVal {
    
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
    def setInitialState(value: State): Self = this.set("initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    
    @scala.inline
    def setMarks(value: Boolean): Self = this.set("marks", value.asInstanceOf[js.Any])
    
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
    def setOnChange(value: /* e */ State => _): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnFinalChange(value: /* e */ State => _): Self = this.set("onFinalChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFinalChange: Self = this.set("onFinalChange", js.undefined)
    
    @scala.inline
    def setOverrides(value: SliderOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
}
