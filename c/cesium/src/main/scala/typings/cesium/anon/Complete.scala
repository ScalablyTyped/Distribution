package typings.cesium.anon

import typings.cesium.mod.Camera.FlightCancelledCallback
import typings.cesium.mod.Camera.FlightCompleteCallback
import typings.cesium.mod.EasingFunction
import typings.cesium.mod.HeadingPitchRange
import typings.cesium.mod.Matrix4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Complete extends StObject {
  
  var cancel: js.UndefOr[FlightCancelledCallback] = js.native
  
  var complete: js.UndefOr[FlightCompleteCallback] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var easingFunction: js.UndefOr[EasingFunction] = js.native
  
  var endTransform: js.UndefOr[Matrix4] = js.native
  
  var flyOverLongitude: js.UndefOr[Double] = js.native
  
  var flyOverLongitudeWeight: js.UndefOr[Double] = js.native
  
  var maximumHeight: js.UndefOr[Double] = js.native
  
  var offset: js.UndefOr[HeadingPitchRange] = js.native
  
  var pitchAdjustHeight: js.UndefOr[Double] = js.native
}
object Complete {
  
  @scala.inline
  def apply(): Complete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Complete]
  }
  
  @scala.inline
  implicit class CompleteMutableBuilder[Self <: Complete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEasingFunction(value: EasingFunction): Self = StObject.set(x, "easingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingFunctionUndefined: Self = StObject.set(x, "easingFunction", js.undefined)
    
    @scala.inline
    def setEndTransform(value: Matrix4): Self = StObject.set(x, "endTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTransformUndefined: Self = StObject.set(x, "endTransform", js.undefined)
    
    @scala.inline
    def setFlyOverLongitude(value: Double): Self = StObject.set(x, "flyOverLongitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlyOverLongitudeUndefined: Self = StObject.set(x, "flyOverLongitude", js.undefined)
    
    @scala.inline
    def setFlyOverLongitudeWeight(value: Double): Self = StObject.set(x, "flyOverLongitudeWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlyOverLongitudeWeightUndefined: Self = StObject.set(x, "flyOverLongitudeWeight", js.undefined)
    
    @scala.inline
    def setMaximumHeight(value: Double): Self = StObject.set(x, "maximumHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumHeightUndefined: Self = StObject.set(x, "maximumHeight", js.undefined)
    
    @scala.inline
    def setOffset(value: HeadingPitchRange): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPitchAdjustHeight(value: Double): Self = StObject.set(x, "pitchAdjustHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitchAdjustHeightUndefined: Self = StObject.set(x, "pitchAdjustHeight", js.undefined)
  }
}
