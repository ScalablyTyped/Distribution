package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetedAnimation extends js.Object {
  /**
    * Animation to perform
    */
  var animation: Animation
  /**
    * Target to animate
    */
  var target: js.Any
  /**
    * Serialize the object
    * @returns the JSON object representing the current entity
    */
  def serialize(): js.Any
}

object TargetedAnimation {
  @scala.inline
  def apply(animation: Animation, serialize: () => js.Any, target: js.Any): TargetedAnimation = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetedAnimation]
  }
}

