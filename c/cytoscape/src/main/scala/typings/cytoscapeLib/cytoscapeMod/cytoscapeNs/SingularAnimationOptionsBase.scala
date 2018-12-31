package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingularAnimationOptionsBase extends js.Object {
  /** The duration of the animation in milliseconds. */
  var duration: scala.Double
  /** A transition-timing-function easing style string that shapes the animation progress curve. */
  var easing: cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.TransitionTimingFunction
  /** A position to which the elements will be animated. */
  var position: Position
  /** A rendered position to which the elements will be animated. */
  var renderedPosition: Position
  /** An object containing name-value pairs of style properties to animate. */
  var style: js.Any
}

