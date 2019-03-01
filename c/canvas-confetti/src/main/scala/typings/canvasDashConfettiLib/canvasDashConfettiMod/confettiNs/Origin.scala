package typings
package canvasDashConfettiLib.canvasDashConfettiMod.confettiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Origin extends js.Object {
  /**
    * The x position on the page, with 0 being the left edge and 1 being the right edge.
    * @default 0.5
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * The y position on the page, with 0 being the left edge and 1 being the right edge.
    * @default 0.5
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object Origin {
  @scala.inline
  def apply(x: scala.Int | scala.Double = null, y: scala.Int | scala.Double = null): Origin = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Origin]
  }
}

