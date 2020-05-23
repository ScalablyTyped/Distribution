package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimatedLayoutOptions extends js.Object {
  // whether to transition the node positions
  var animate: js.UndefOr[Boolean] = js.undefined
  // duration of animation in ms if enabled
  var animationDuration: js.UndefOr[Double] = js.undefined
  // easing of animation if enabled
  var animationEasing: js.UndefOr[Boolean] = js.undefined
}

object AnimatedLayoutOptions {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: js.UndefOr[Double] = js.undefined,
    animationEasing: js.UndefOr[Boolean] = js.undefined
  ): AnimatedLayoutOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedLayoutOptions]
  }
}

