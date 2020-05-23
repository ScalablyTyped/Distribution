package typings.blueprintjsCore.anon

import typings.blueprintjsCore.collapseMod.AnimationStates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationState extends js.Object {
  var animationState: AnimationStates
  var height: js.UndefOr[scala.Nothing] = js.undefined
}

object AnimationState {
  @scala.inline
  def apply(animationState: AnimationStates): AnimationState = {
    val __obj = js.Dynamic.literal(animationState = animationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationState]
  }
}

