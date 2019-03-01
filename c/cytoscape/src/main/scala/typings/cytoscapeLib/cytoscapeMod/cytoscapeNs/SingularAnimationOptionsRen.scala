package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingularAnimationOptionsRen extends SingularAnimationOptionsBase

object SingularAnimationOptionsRen {
  @scala.inline
  def apply(
    duration: scala.Double,
    easing: cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.TransitionTimingFunction,
    position: Position,
    renderedPosition: Position,
    style: js.Any
  ): SingularAnimationOptionsRen = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("easing")(easing)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("renderedPosition")(renderedPosition)
    __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SingularAnimationOptionsRen]
  }
}

