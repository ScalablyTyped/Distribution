package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationEvent extends js.Object {
  
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
  implicit class AnimationEventOps[Self <: AnimationEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_clone(value: () => AnimationEvent): Self = this.set("_clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAction(value: Double => Unit): Self = this.set("action", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFrame(value: Double): Self = this.set("frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDone(value: Boolean): Self = this.set("isDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyOnce(value: Boolean): Self = this.set("onlyOnce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyOnce: Self = this.set("onlyOnce", js.undefined)
  }
}
