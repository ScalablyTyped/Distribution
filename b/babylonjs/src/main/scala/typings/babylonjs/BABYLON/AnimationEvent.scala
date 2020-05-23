package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationEvent extends js.Object {
  /** The frame for which the event is triggered **/
  var frame: Double
  /**
    * Specifies if the animation event is done
    */
  var isDone: Boolean
  /** Specifies if the event should be triggered only once**/
  var onlyOnce: js.UndefOr[Boolean] = js.undefined
  /** @hidden */
  def _clone(): AnimationEvent
  /** The event to perform when triggered **/
  def action(currentFrame: Double): Unit
}

object AnimationEvent {
  @scala.inline
  def apply(
    _clone: () => AnimationEvent,
    action: Double => Unit,
    frame: Double,
    isDone: Boolean,
    onlyOnce: js.UndefOr[Boolean] = js.undefined
  ): AnimationEvent = {
    val __obj = js.Dynamic.literal(_clone = js.Any.fromFunction0(_clone), action = js.Any.fromFunction1(action), frame = frame.asInstanceOf[js.Any], isDone = isDone.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyOnce)) __obj.updateDynamic("onlyOnce")(onlyOnce.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEvent]
  }
}

