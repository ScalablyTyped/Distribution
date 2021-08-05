package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatedLayoutOptions extends StObject {
  
  // whether to transition the node positions
  var animate: js.UndefOr[Boolean] = js.undefined
  
  // duration of animation in ms if enabled
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  // easing of animation if enabled
  var animationEasing: js.UndefOr[Boolean] = js.undefined
}
object AnimatedLayoutOptions {
  
  inline def apply(): AnimatedLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimatedLayoutOptions]
  }
  
  extension [Self <: AnimatedLayoutOptions](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setAnimationEasing(value: Boolean): Self = StObject.set(x, "animationEasing", value.asInstanceOf[js.Any])
    
    inline def setAnimationEasingUndefined: Self = StObject.set(x, "animationEasing", js.undefined)
  }
}
