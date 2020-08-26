package typings.blueprintjsCore.anon

import typings.blueprintjsCore.collapseMod.AnimationStates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Height extends js.Object {
  var animationState: AnimationStates = js.native
  var height: String = js.native
}

object Height {
  @scala.inline
  def apply(animationState: AnimationStates, height: String): Height = {
    val __obj = js.Dynamic.literal(animationState = animationState.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
  @scala.inline
  implicit class HeightOps[Self <: Height] (val x: Self) extends AnyVal {
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
    def setAnimationState(value: AnimationStates): Self = this.set("animationState", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
  }
  
}

