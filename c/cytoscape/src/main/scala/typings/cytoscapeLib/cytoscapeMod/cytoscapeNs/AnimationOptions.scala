package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AnimationOptions extends js.Object {
  /** An object containing centring options from which the graph will be animated. */
  var center: js.UndefOr[CenterOptions] = js.undefined
  /** duration - The duration of the animation in milliseconds. */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /** easing - A transition-timing-function easing style string that shapes the animation progress curve. */
  var easing: js.UndefOr[cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.TransitionTimingFunction] = js.undefined
  /** An object containing fitting options from which the graph will be animated. */
  var fit: js.UndefOr[AnimationFitOptions] = js.undefined
  /** A panning position to which the graph will be animated. */
  var pan: js.UndefOr[Position] = js.undefined
  /** A relative panning position to which the graph will be animated. */
  var panBy: js.UndefOr[Position] = js.undefined
  /** A zoom level to which the graph will be animated. */
  var zoom: js.UndefOr[ZoomOptions] = js.undefined
}

