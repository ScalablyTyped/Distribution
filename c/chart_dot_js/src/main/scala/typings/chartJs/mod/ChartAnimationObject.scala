package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartAnimationObject extends js.Object {
  
  var currentStep: js.UndefOr[Double] = js.native
  
  var easing: js.UndefOr[Easing] = js.native
  
  var numSteps: js.UndefOr[Double] = js.native
  
  var onAnimationComplete: js.UndefOr[js.Function1[/* arg */ js.Any, Unit]] = js.native
  
  var onAnimationProgress: js.UndefOr[js.Function1[/* arg */ js.Any, Unit]] = js.native
  
  var render: js.UndefOr[js.Function1[/* arg */ js.Any, Unit]] = js.native
}
object ChartAnimationObject {
  
  @scala.inline
  def apply(): ChartAnimationObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAnimationObject]
  }
  
  @scala.inline
  implicit class ChartAnimationObjectOps[Self <: ChartAnimationObject] (val x: Self) extends AnyVal {
    
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
    def setCurrentStep(value: Double): Self = this.set("currentStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentStep: Self = this.set("currentStep", js.undefined)
    
    @scala.inline
    def setEasing(value: Easing): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setNumSteps(value: Double): Self = this.set("numSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumSteps: Self = this.set("numSteps", js.undefined)
    
    @scala.inline
    def setOnAnimationComplete(value: /* arg */ js.Any => Unit): Self = this.set("onAnimationComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAnimationComplete: Self = this.set("onAnimationComplete", js.undefined)
    
    @scala.inline
    def setOnAnimationProgress(value: /* arg */ js.Any => Unit): Self = this.set("onAnimationProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAnimationProgress: Self = this.set("onAnimationProgress", js.undefined)
    
    @scala.inline
    def setRender(value: /* arg */ js.Any => Unit): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
}
