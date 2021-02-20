package typings.cesium.anon

import typings.cesium.mod.Camera.FlightCancelledCallback
import typings.cesium.mod.Camera.FlightCompleteCallback
import typings.cesium.mod.Cartesian3
import typings.cesium.mod.EasingFunction
import typings.cesium.mod.Matrix4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cancel extends StObject {
  
  var cancel: js.UndefOr[FlightCancelledCallback] = js.native
  
  var complete: js.UndefOr[FlightCompleteCallback] = js.native
  
  var convert: js.UndefOr[Boolean] = js.native
  
  var destination: Cartesian3 | typings.cesium.mod.Rectangle = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var easingFunction: js.UndefOr[EasingFunction] = js.native
  
  var endTransform: js.UndefOr[Matrix4] = js.native
  
  var flyOverLongitude: js.UndefOr[Double] = js.native
  
  var flyOverLongitudeWeight: js.UndefOr[Double] = js.native
  
  var maximumHeight: js.UndefOr[Double] = js.native
  
  var orientation: js.UndefOr[Direction | Heading] = js.native
  
  var pitchAdjustHeight: js.UndefOr[Double] = js.native
}
object Cancel {
  
  @scala.inline
  def apply(destination: Cartesian3 | typings.cesium.mod.Rectangle): Cancel = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
  
  @scala.inline
  implicit class CancelMutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setConvert(value: Boolean): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
    
    @scala.inline
    def setDestination(value: Cartesian3 | typings.cesium.mod.Rectangle): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
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
    def setOrientation(value: Direction | Heading): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setPitchAdjustHeight(value: Double): Self = StObject.set(x, "pitchAdjustHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitchAdjustHeightUndefined: Self = StObject.set(x, "pitchAdjustHeight", js.undefined)
  }
}
