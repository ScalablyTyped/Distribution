package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * http://js.cytoscape.org/#collection/animation
     */

trait ElementAnimateOptionsBase extends js.Object {
  /** A function to call when the animation is done. */
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** The duration of the animation in milliseconds. */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /** A transition-timing-function easing style string that shapes the animation progress curve. */
  var easing: js.UndefOr[cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs.TransitionTimingFunction] = js.undefined
  /** A boolean indicating whether to queue the animation. */
  var queue: js.UndefOr[scala.Boolean] = js.undefined
  /** A function to call each time the animation steps. */
  var step: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** An object containing name-value pairs of style properties to animate. */
  var style: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

