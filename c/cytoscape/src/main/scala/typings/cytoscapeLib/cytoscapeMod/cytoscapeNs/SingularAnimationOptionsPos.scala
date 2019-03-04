package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingularAnimationOptionsPos extends SingularAnimationOptionsBase

object SingularAnimationOptionsPos {
  @scala.inline
  def apply(
    duration: scala.Double,
    easing: cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.TransitionTimingFunction,
    position: Position,
    renderedPosition: Position,
    style: js.Any
  ): SingularAnimationOptionsPos = {
    val __obj = js.Dynamic.literal(duration = duration, easing = easing, position = position, renderedPosition = renderedPosition, style = style)
  
    __obj.asInstanceOf[SingularAnimationOptionsPos]
  }
}

