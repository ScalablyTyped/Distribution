package typings.cytoscape.mod

import org.scalablytyped.runtime.StringDictionary
import typings.cytoscape.mod.Css.TransitionTimingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/animation
  */
trait ElementAnimateOptionsBase extends StObject {
  
  /** A function to call when the animation is done. */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** The duration of the animation in milliseconds. */
  var duration: js.UndefOr[Double] = js.undefined
  
  /** A transition-timing-function easing style string that shapes the animation progress curve. */
  var easing: js.UndefOr[TransitionTimingFunction] = js.undefined
  
  /** A boolean indicating whether to queue the animation. */
  var queue: js.UndefOr[Boolean] = js.undefined
  
  /** A function to call each time the animation steps. */
  var step: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** An object containing name-value pairs of style properties to animate. */
  var style: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}
object ElementAnimateOptionsBase {
  
  inline def apply(): ElementAnimateOptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementAnimateOptionsBase]
  }
  
  extension [Self <: ElementAnimateOptionsBase](x: Self) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: TransitionTimingFunction): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setQueue(value: Boolean): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    inline def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    
    inline def setStep(value: () => Unit): Self = StObject.set(x, "step", js.Any.fromFunction0(value))
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setStyle(value: StringDictionary[js.Any]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
