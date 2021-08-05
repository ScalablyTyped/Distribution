package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimateOptions
  extends StObject
     with AnimationOptions {
  
  /** complete - A function to call when the animation is done. */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** queue - A boolean indicating whether to queue the animation. */
  var queue: js.UndefOr[Boolean] = js.undefined
  
  /** step - A function to call each time the animation steps. */
  var step: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object AnimateOptions {
  
  inline def apply(): AnimateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimateOptions]
  }
  
  extension [Self <: AnimateOptions](x: Self) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setQueue(value: Boolean): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    inline def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    
    inline def setStep(value: () => Unit): Self = StObject.set(x, "step", js.Any.fromFunction0(value))
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
