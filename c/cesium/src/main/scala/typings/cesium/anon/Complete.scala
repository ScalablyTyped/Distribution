package typings.cesium.anon

import typings.cesium.mod.Camera.FlightCancelledCallback
import typings.cesium.mod.Camera.FlightCompleteCallback
import typings.cesium.mod.HeadingPitchRange
import typings.cesium.mod.Matrix4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Complete extends StObject {
  
  var cancel: js.UndefOr[FlightCancelledCallback] = js.undefined
  
  var complete: js.UndefOr[FlightCompleteCallback] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easingFunction: js.UndefOr[typings.cesium.mod.EasingFunction.Callback] = js.undefined
  
  var endTransform: js.UndefOr[Matrix4] = js.undefined
  
  var flyOverLongitude: js.UndefOr[Double] = js.undefined
  
  var flyOverLongitudeWeight: js.UndefOr[Double] = js.undefined
  
  var maximumHeight: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[HeadingPitchRange] = js.undefined
  
  var pitchAdjustHeight: js.UndefOr[Double] = js.undefined
}
object Complete {
  
  inline def apply(): Complete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Complete]
  }
  
  extension [Self <: Complete](x: Self) {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasingFunction(value: /* time */ Double => Double): Self = StObject.set(x, "easingFunction", js.Any.fromFunction1(value))
    
    inline def setEasingFunctionUndefined: Self = StObject.set(x, "easingFunction", js.undefined)
    
    inline def setEndTransform(value: Matrix4): Self = StObject.set(x, "endTransform", value.asInstanceOf[js.Any])
    
    inline def setEndTransformUndefined: Self = StObject.set(x, "endTransform", js.undefined)
    
    inline def setFlyOverLongitude(value: Double): Self = StObject.set(x, "flyOverLongitude", value.asInstanceOf[js.Any])
    
    inline def setFlyOverLongitudeUndefined: Self = StObject.set(x, "flyOverLongitude", js.undefined)
    
    inline def setFlyOverLongitudeWeight(value: Double): Self = StObject.set(x, "flyOverLongitudeWeight", value.asInstanceOf[js.Any])
    
    inline def setFlyOverLongitudeWeightUndefined: Self = StObject.set(x, "flyOverLongitudeWeight", js.undefined)
    
    inline def setMaximumHeight(value: Double): Self = StObject.set(x, "maximumHeight", value.asInstanceOf[js.Any])
    
    inline def setMaximumHeightUndefined: Self = StObject.set(x, "maximumHeight", js.undefined)
    
    inline def setOffset(value: HeadingPitchRange): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPitchAdjustHeight(value: Double): Self = StObject.set(x, "pitchAdjustHeight", value.asInstanceOf[js.Any])
    
    inline def setPitchAdjustHeightUndefined: Self = StObject.set(x, "pitchAdjustHeight", js.undefined)
  }
}
