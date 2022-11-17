package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationEvent extends StObject {
  
  var chart: Chart4[ChartType, DefaultDataPoint[ChartType], Any]
  
  var currentStep: Double
  
  var initial: Boolean
  
  var numSteps: Double
}
object AnimationEvent {
  
  inline def apply(
    chart: Chart4[ChartType, DefaultDataPoint[ChartType], Any],
    currentStep: Double,
    initial: Boolean,
    numSteps: Double
  ): AnimationEvent = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], currentStep = currentStep.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], numSteps = numSteps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEvent]
  }
  
  extension [Self <: AnimationEvent](x: Self) {
    
    inline def setChart(value: Chart4[ChartType, DefaultDataPoint[ChartType], Any]): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setCurrentStep(value: Double): Self = StObject.set(x, "currentStep", value.asInstanceOf[js.Any])
    
    inline def setInitial(value: Boolean): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setNumSteps(value: Double): Self = StObject.set(x, "numSteps", value.asInstanceOf[js.Any])
  }
}
