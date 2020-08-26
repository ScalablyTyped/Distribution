package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimatedLayoutOptions extends js.Object {
  // whether to transition the node positions
  var animate: js.UndefOr[Boolean] = js.native
  // duration of animation in ms if enabled
  var animationDuration: js.UndefOr[Double] = js.native
  // easing of animation if enabled
  var animationEasing: js.UndefOr[Boolean] = js.native
}

object AnimatedLayoutOptions {
  @scala.inline
  def apply(): AnimatedLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimatedLayoutOptions]
  }
  @scala.inline
  implicit class AnimatedLayoutOptionsOps[Self <: AnimatedLayoutOptions] (val x: Self) extends AnyVal {
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
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setAnimationEasing(value: Boolean): Self = this.set("animationEasing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationEasing: Self = this.set("animationEasing", js.undefined)
  }
  
}

