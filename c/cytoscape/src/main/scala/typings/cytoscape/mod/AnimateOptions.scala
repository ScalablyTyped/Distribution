package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimateOptions extends AnimationOptions {
  
  /** complete - A function to call when the animation is done. */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** queue - A boolean indicating whether to queue the animation. */
  var queue: js.UndefOr[Boolean] = js.native
  
  /** step - A function to call each time the animation steps. */
  var step: js.UndefOr[js.Function0[Unit]] = js.native
}
object AnimateOptions {
  
  @scala.inline
  def apply(): AnimateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimateOptions]
  }
  
  @scala.inline
  implicit class AnimateOptionsMutableBuilder[Self <: AnimateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setQueue(value: Boolean): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    
    @scala.inline
    def setStep(value: () => Unit): Self = StObject.set(x, "step", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
