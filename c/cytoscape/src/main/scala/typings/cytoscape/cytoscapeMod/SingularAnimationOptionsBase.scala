package typings.cytoscape.cytoscapeMod

import typings.cytoscape.cytoscapeMod.Css.TransitionTimingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingularAnimationOptionsBase extends js.Object {
  /** The duration of the animation in milliseconds. */
  var duration: Double
  /** A transition-timing-function easing style string that shapes the animation progress curve. */
  var easing: TransitionTimingFunction
  /** A position to which the elements will be animated. */
  var position: Position
  /** A rendered position to which the elements will be animated. */
  var renderedPosition: Position
  /** An object containing name-value pairs of style properties to animate. */
  var style: js.Any
}

object SingularAnimationOptionsBase {
  @scala.inline
  def apply(
    duration: Double,
    easing: TransitionTimingFunction,
    position: Position,
    renderedPosition: Position,
    style: js.Any
  ): SingularAnimationOptionsBase = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], renderedPosition = renderedPosition.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SingularAnimationOptionsBase]
  }
}

