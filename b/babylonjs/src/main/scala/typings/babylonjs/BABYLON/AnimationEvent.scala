package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationEvent extends StObject {
  
  /** @hidden */
  def _clone(): AnimationEvent = js.native
  
  /** The event to perform when triggered **/
  def action(currentFrame: Double): Unit = js.native
  
  /** The frame for which the event is triggered **/
  var frame: Double = js.native
  
  /**
    * Specifies if the animation event is done
    */
  var isDone: Boolean = js.native
  
  /** Specifies if the event should be triggered only once**/
  var onlyOnce: js.UndefOr[Boolean] = js.native
}
object AnimationEvent {
  
  @scala.inline
  def apply(_clone: () => AnimationEvent, action: Double => Unit, frame: Double, isDone: Boolean): AnimationEvent = {
    val __obj = js.Dynamic.literal(_clone = js.Any.fromFunction0(_clone), action = js.Any.fromFunction1(action), frame = frame.asInstanceOf[js.Any], isDone = isDone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEvent]
  }
  
  @scala.inline
  implicit class AnimationEventMutableBuilder[Self <: AnimationEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: Double => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFrame(value: Double): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDone(value: Boolean): Self = StObject.set(x, "isDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyOnce(value: Boolean): Self = StObject.set(x, "onlyOnce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyOnceUndefined: Self = StObject.set(x, "onlyOnce", js.undefined)
    
    @scala.inline
    def set_clone(value: () => AnimationEvent): Self = StObject.set(x, "_clone", js.Any.fromFunction0(value))
  }
}
