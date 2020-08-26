package typings.cytoscape.mod

import typings.cytoscape.mod.Css.TransitionTimingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingularAnimationOptionsRen extends SingularAnimationOptionsBase

object SingularAnimationOptionsRen {
  @scala.inline
  def apply(
    duration: Double,
    easing: TransitionTimingFunction,
    position: Position,
    renderedPosition: Position,
    style: js.Any
  ): SingularAnimationOptionsRen = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], renderedPosition = renderedPosition.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingularAnimationOptionsRen]
  }
}

