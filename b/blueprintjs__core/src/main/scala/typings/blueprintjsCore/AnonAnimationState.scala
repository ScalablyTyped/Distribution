package typings.blueprintjsCore

import typings.blueprintjsCore.collapseMod.AnimationStates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimationState extends js.Object {
  var animationState: AnimationStates
  var height: js.UndefOr[scala.Nothing] = js.undefined
}

object AnonAnimationState {
  @scala.inline
  def apply(animationState: AnimationStates, height: js.UndefOr[scala.Nothing] = js.undefined): AnonAnimationState = {
    val __obj = js.Dynamic.literal(animationState = animationState.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimationState]
  }
}

