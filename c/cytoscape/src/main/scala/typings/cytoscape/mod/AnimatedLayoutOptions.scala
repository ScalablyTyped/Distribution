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
  
  @scala.inline
  def apply(): AnimatedLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimatedLayoutOptions]
  }
  
  @scala.inline
  implicit class AnimatedLayoutOptionsMutableBuilder[Self <: AnimatedLayoutOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationEasing(value: Boolean): Self = StObject.set(x, "animationEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationEasingUndefined: Self = StObject.set(x, "animationEasing", js.undefined)
  }
}
