package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AnimateOptions extends AnimationOptions {
  /** complete - A function to call when the animation is done. */
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** queue - A boolean indicating whether to queue the animation. */
  var queue: js.UndefOr[scala.Boolean] = js.undefined
  /** step - A function to call each time the animation steps. */
  var step: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

