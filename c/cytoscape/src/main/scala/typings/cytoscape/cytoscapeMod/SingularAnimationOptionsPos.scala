package typings.cytoscape.cytoscapeMod

import typings.cytoscape.cytoscapeMod.Css.TransitionTimingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingularAnimationOptionsPos extends SingularAnimationOptionsBase

object SingularAnimationOptionsPos {
  @scala.inline
  def apply(
    duration: Double,
    easing: TransitionTimingFunction,
    position: Position,
    renderedPosition: Position,
    style: js.Any
  ): SingularAnimationOptionsPos = {
    val __obj = js.Dynamic.literal(duration = duration, easing = easing, position = position, renderedPosition = renderedPosition, style = style)
  
    __obj.asInstanceOf[SingularAnimationOptionsPos]
  }
}

