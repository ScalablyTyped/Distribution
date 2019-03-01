package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimatedLayoutOptions extends js.Object {
  // whether to transition the node positions
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  // duration of animation in ms if enabled
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  // easing of animation if enabled
  var animationEasing: js.UndefOr[scala.Boolean] = js.undefined
}

object AnimatedLayoutOptions {
  @scala.inline
  def apply(
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    animationDuration: scala.Int | scala.Double = null,
    animationEasing: js.UndefOr[scala.Boolean] = js.undefined
  ): AnimatedLayoutOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing)
    __obj.asInstanceOf[AnimatedLayoutOptions]
  }
}

