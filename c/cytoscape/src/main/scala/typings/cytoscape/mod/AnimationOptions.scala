package typings.cytoscape.mod

import typings.cytoscape.mod.Css.TransitionTimingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationOptions extends StObject {
  
  /** An object containing centring options from which the graph will be animated. */
  var center: js.UndefOr[CenterOptions] = js.undefined
  
  /** duration - The duration of the animation in milliseconds. */
  var duration: js.UndefOr[Double] = js.undefined
  
  /** easing - A transition-timing-function easing style string that shapes the animation progress curve. */
  var easing: js.UndefOr[TransitionTimingFunction] = js.undefined
  
  /** An object containing fitting options from which the graph will be animated. */
  var fit: js.UndefOr[AnimationFitOptions] = js.undefined
  
  /** A panning position to which the graph will be animated. */
  var pan: js.UndefOr[Position] = js.undefined
  
  /** A relative panning position to which the graph will be animated. */
  var panBy: js.UndefOr[Position] = js.undefined
  
  /** A zoom level to which the graph will be animated. */
  var zoom: js.UndefOr[ZoomOptions] = js.undefined
}
object AnimationOptions {
  
  inline def apply(): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationOptions]
  }
  
  extension [Self <: AnimationOptions](x: Self) {
    
    inline def setCenter(value: CenterOptions): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: TransitionTimingFunction): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setFit(value: AnimationFitOptions): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
    
    inline def setPan(value: Position): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    inline def setPanBy(value: Position): Self = StObject.set(x, "panBy", value.asInstanceOf[js.Any])
    
    inline def setPanByUndefined: Self = StObject.set(x, "panBy", js.undefined)
    
    inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
    
    inline def setZoom(value: ZoomOptions): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
