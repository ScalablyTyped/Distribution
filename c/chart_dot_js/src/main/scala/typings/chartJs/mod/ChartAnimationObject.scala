package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartAnimationObject extends StObject {
  
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
  implicit class ChartAnimationObjectMutableBuilder[Self <: ChartAnimationObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentStep(value: Double): Self = StObject.set(x, "currentStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentStepUndefined: Self = StObject.set(x, "currentStep", js.undefined)
    
    @scala.inline
    def setEasing(value: Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setNumSteps(value: Double): Self = StObject.set(x, "numSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumStepsUndefined: Self = StObject.set(x, "numSteps", js.undefined)
    
    @scala.inline
    def setOnAnimationComplete(value: /* arg */ js.Any => Unit): Self = StObject.set(x, "onAnimationComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAnimationCompleteUndefined: Self = StObject.set(x, "onAnimationComplete", js.undefined)
    
    @scala.inline
    def setOnAnimationProgress(value: /* arg */ js.Any => Unit): Self = StObject.set(x, "onAnimationProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAnimationProgressUndefined: Self = StObject.set(x, "onAnimationProgress", js.undefined)
    
    @scala.inline
    def setRender(value: /* arg */ js.Any => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
  }
}
