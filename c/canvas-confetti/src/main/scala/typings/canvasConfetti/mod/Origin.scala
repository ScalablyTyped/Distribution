package typings.canvasConfetti.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Origin extends js.Object {
  /**
    * The x position on the page, with 0 being the left edge and 1 being the right edge.
    * @default 0.5
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The y position on the page, with 0 being the left edge and 1 being the right edge.
    * @default 0.5
    */
  var y: js.UndefOr[Double] = js.undefined
}

object Origin {
  @scala.inline
  def apply(x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): Origin = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Origin]
  }
}

