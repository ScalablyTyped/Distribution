package typings.cytoscape.mod

import typings.cytoscape.mod.Css.TransitionTimingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatedLayoutOptions extends StObject {
  
  // whether to transition the node positions
  var animate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * a function that determines whether the node should be animated.
    * All nodes animated by default on animate enabled.
    * Non-animated nodes are positioned immediately when the layout starts
    */
  var animateFilter: js.UndefOr[js.Function2[/* node */ NodeSingular, /* index */ Double, Boolean]] = js.undefined
  
  // duration of animation in ms if enabled
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  // easing of animation if enabled
  var animationEasing: js.UndefOr[TransitionTimingFunction] = js.undefined
}
object AnimatedLayoutOptions {
  
  inline def apply(): AnimatedLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimatedLayoutOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimatedLayoutOptions] (val x: Self) extends AnyVal {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateFilter(value: (/* node */ NodeSingular, /* index */ Double) => Boolean): Self = StObject.set(x, "animateFilter", js.Any.fromFunction2(value))
    
    inline def setAnimateFilterUndefined: Self = StObject.set(x, "animateFilter", js.undefined)
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setAnimationEasing(value: TransitionTimingFunction): Self = StObject.set(x, "animationEasing", value.asInstanceOf[js.Any])
    
    inline def setAnimationEasingUndefined: Self = StObject.set(x, "animationEasing", js.undefined)
  }
}
