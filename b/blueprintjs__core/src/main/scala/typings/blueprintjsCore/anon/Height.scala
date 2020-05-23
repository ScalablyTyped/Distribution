package typings.blueprintjsCore.anon

import typings.blueprintjsCore.collapseMod.AnimationStates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  var animationState: AnimationStates
  var height: String
}

object Height {
  @scala.inline
  def apply(animationState: AnimationStates, height: String): Height = {
    val __obj = js.Dynamic.literal(animationState = animationState.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}

