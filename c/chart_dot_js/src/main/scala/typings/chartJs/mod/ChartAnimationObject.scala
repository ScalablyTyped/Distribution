package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartAnimationObject extends StObject {
  
  var currentStep: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[Easing] = js.undefined
  
  var numSteps: js.UndefOr[Double] = js.undefined
  
  var onAnimationComplete: js.UndefOr[js.Function1[/* arg */ js.Any, Unit]] = js.undefined
  
  var onAnimationProgress: js.UndefOr[js.Function1[/* arg */ js.Any, Unit]] = js.undefined
  
  var render: js.UndefOr[js.Function1[/* arg */ js.Any, Unit]] = js.undefined
}
object ChartAnimationObject {
  
  inline def apply(): ChartAnimationObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAnimationObject]
  }
  
  extension [Self <: ChartAnimationObject](x: Self) {
    
    inline def setCurrentStep(value: Double): Self = StObject.set(x, "currentStep", value.asInstanceOf[js.Any])
    
    inline def setCurrentStepUndefined: Self = StObject.set(x, "currentStep", js.undefined)
    
    inline def setEasing(value: Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setNumSteps(value: Double): Self = StObject.set(x, "numSteps", value.asInstanceOf[js.Any])
    
    inline def setNumStepsUndefined: Self = StObject.set(x, "numSteps", js.undefined)
    
    inline def setOnAnimationComplete(value: /* arg */ js.Any => Unit): Self = StObject.set(x, "onAnimationComplete", js.Any.fromFunction1(value))
    
    inline def setOnAnimationCompleteUndefined: Self = StObject.set(x, "onAnimationComplete", js.undefined)
    
    inline def setOnAnimationProgress(value: /* arg */ js.Any => Unit): Self = StObject.set(x, "onAnimationProgress", js.Any.fromFunction1(value))
    
    inline def setOnAnimationProgressUndefined: Self = StObject.set(x, "onAnimationProgress", js.undefined)
    
    inline def setRender(value: /* arg */ js.Any => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
  }
}
