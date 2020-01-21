package typings.cytoscape.mod.Css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#style/transition-animation
  */
trait TransitionAnimation extends js.Object {
  /**
    * The length of the delay in seconds before the transition occurs (e.g. 250ms).
    */
  var `transition-delay`: Double
  /**
    * The length of the transition in seconds(e.g. 0.5s).
    */
  var `transition-duration`: Double
  /**
    * A comma separated list of style properties to animate in this state.
    */
  var `transition-property`: String
  /**
    * An easing function that controls the animation progress curve (a visualisation of easings serves as a reference).
    */
  var `transition-timing-function`: TransitionTimingFunction
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
}

