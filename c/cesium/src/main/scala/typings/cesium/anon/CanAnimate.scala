package typings.cesium.anon

import typings.cesium.mod.ClockRange
import typings.cesium.mod.ClockStep
import typings.cesium.mod.JulianDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanAnimate extends StObject {
  
  var canAnimate: js.UndefOr[Boolean] = js.undefined
  
  var clockRange: js.UndefOr[ClockRange] = js.undefined
  
  var clockStep: js.UndefOr[ClockStep] = js.undefined
  
  var currentTime: js.UndefOr[JulianDate] = js.undefined
  
  var multiplier: js.UndefOr[Double] = js.undefined
  
  var shouldAnimate: js.UndefOr[Boolean] = js.undefined
  
  var startTime: js.UndefOr[JulianDate] = js.undefined
  
  var stopTime: js.UndefOr[JulianDate] = js.undefined
}
object CanAnimate {
  
  @scala.inline
  def apply(): CanAnimate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanAnimate]
  }
  
  @scala.inline
  implicit class CanAnimateMutableBuilder[Self <: CanAnimate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanAnimate(value: Boolean): Self = StObject.set(x, "canAnimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanAnimateUndefined: Self = StObject.set(x, "canAnimate", js.undefined)
    
    @scala.inline
    def setClockRange(value: ClockRange): Self = StObject.set(x, "clockRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClockRangeUndefined: Self = StObject.set(x, "clockRange", js.undefined)
    
    @scala.inline
    def setClockStep(value: ClockStep): Self = StObject.set(x, "clockStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClockStepUndefined: Self = StObject.set(x, "clockStep", js.undefined)
    
    @scala.inline
    def setCurrentTime(value: JulianDate): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTimeUndefined: Self = StObject.set(x, "currentTime", js.undefined)
    
    @scala.inline
    def setMultiplier(value: Double): Self = StObject.set(x, "multiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplierUndefined: Self = StObject.set(x, "multiplier", js.undefined)
    
    @scala.inline
    def setShouldAnimate(value: Boolean): Self = StObject.set(x, "shouldAnimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldAnimateUndefined: Self = StObject.set(x, "shouldAnimate", js.undefined)
    
    @scala.inline
    def setStartTime(value: JulianDate): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setStopTime(value: JulianDate): Self = StObject.set(x, "stopTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopTimeUndefined: Self = StObject.set(x, "stopTime", js.undefined)
  }
}
