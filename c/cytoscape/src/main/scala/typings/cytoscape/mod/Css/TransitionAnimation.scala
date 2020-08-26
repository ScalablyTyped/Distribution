package typings.cytoscape.mod.Css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#style/transition-animation
  */
@js.native
trait TransitionAnimation extends js.Object {
  /**
    * The length of the delay in seconds before the transition occurs (e.g. 250ms).
    */
  var `transition-delay`: Double = js.native
  /**
    * The length of the transition in seconds(e.g. 0.5s).
    */
  var `transition-duration`: Double = js.native
  /**
    * A comma separated list of style properties to animate in this state.
    */
  var `transition-property`: String = js.native
  /**
    * An easing function that controls the animation progress curve (a visualisation of easings serves as a reference).
    */
  var `transition-timing-function`: TransitionTimingFunction = js.native
}

object TransitionAnimation {
  @scala.inline
  def apply(
    `transition-delay`: Double,
    `transition-duration`: Double,
    `transition-property`: String,
    `transition-timing-function`: TransitionTimingFunction
  ): TransitionAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("transition-delay")(`transition-delay`.asInstanceOf[js.Any])
    __obj.updateDynamic("transition-duration")(`transition-duration`.asInstanceOf[js.Any])
    __obj.updateDynamic("transition-property")(`transition-property`.asInstanceOf[js.Any])
    __obj.updateDynamic("transition-timing-function")(`transition-timing-function`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionAnimation]
  }
  @scala.inline
  implicit class TransitionAnimationOps[Self <: TransitionAnimation] (val x: Self) extends AnyVal {
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
    def `setTransition-delay`(value: Double): Self = this.set("transition-delay", value.asInstanceOf[js.Any])
    @scala.inline
    def `setTransition-duration`(value: Double): Self = this.set("transition-duration", value.asInstanceOf[js.Any])
    @scala.inline
    def `setTransition-property`(value: String): Self = this.set("transition-property", value.asInstanceOf[js.Any])
    @scala.inline
    def `setTransition-timing-function`(value: TransitionTimingFunction): Self = this.set("transition-timing-function", value.asInstanceOf[js.Any])
  }
  
}

