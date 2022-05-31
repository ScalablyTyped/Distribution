package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationEvent extends StObject {
  
  /** @hidden */
  def _clone(): AnimationEvent
  
  /** The event to perform when triggered **/
  def action(currentFrame: Double): Unit
  
  /** The frame for which the event is triggered **/
  var frame: Double
  
  /**
    * Specifies if the animation event is done
    */
  var isDone: Boolean
  
  /** Specifies if the event should be triggered only once**/
  var onlyOnce: js.UndefOr[Boolean] = js.undefined
}
object AnimationEvent {
  
  inline def apply(_clone: () => AnimationEvent, action: Double => Unit, frame: Double, isDone: Boolean): AnimationEvent = {
    val __obj = js.Dynamic.literal(_clone = js.Any.fromFunction0(_clone), action = js.Any.fromFunction1(action), frame = frame.asInstanceOf[js.Any], isDone = isDone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEvent]
  }
  
  extension [Self <: AnimationEvent](x: Self) {
    
    inline def setAction(value: Double => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    inline def setFrame(value: Double): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setIsDone(value: Boolean): Self = StObject.set(x, "isDone", value.asInstanceOf[js.Any])
    
    inline def setOnlyOnce(value: Boolean): Self = StObject.set(x, "onlyOnce", value.asInstanceOf[js.Any])
    
    inline def setOnlyOnceUndefined: Self = StObject.set(x, "onlyOnce", js.undefined)
    
    inline def set_clone(value: () => AnimationEvent): Self = StObject.set(x, "_clone", js.Any.fromFunction0(value))
  }
}
