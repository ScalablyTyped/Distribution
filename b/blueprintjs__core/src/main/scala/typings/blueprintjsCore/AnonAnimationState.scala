package typings.blueprintjsCore

import typings.blueprintjsCore.collapseMod.AnimationStates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimationState extends js.Object {
  var animationState: AnimationStates
}

object AnonAnimationState {
  @scala.inline
  def apply(animationState: AnimationStates): AnonAnimationState = {
    val __obj = js.Dynamic.literal(animationState = animationState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAnimationState]
  }
}

